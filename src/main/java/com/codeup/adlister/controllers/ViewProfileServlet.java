package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Ads;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllers.ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }


        User user = (User) request.getSession().getAttribute("user");

        // Retrieve the user's ads from the database
        Ads adsDao = DaoFactory.getAdsDao();
        List<Ad> userAds = adsDao.findByUserId(user.getId());

        // Set the user's ads as an attribute in the request
        request.setAttribute("userAds", userAds);

        // Forward the request to the profile.jsp page
        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
    }


    // let users create an ad and post it to their profile page
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User loggedInUser = (User) request.getSession().getAttribute("user");
        Ad ad = new Ad(
                loggedInUser.getId(),
                request.getParameter("title"),
                request.getParameter("description")
        );
        DaoFactory.getAdsDao().insert(ad);
        response.sendRedirect("/profile");

    }


}