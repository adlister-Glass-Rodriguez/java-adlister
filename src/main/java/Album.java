
import lombok.*;
import java.io.Serializable;
import java.util.Date;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor

public class Album implements Serializable {
    private long id;
    private String artist_name;
    private String record_name;
    private Date release_date;
    private String genre;
    private Double sales;


    public Album() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getRecord_name() {
        return record_name;
    }

    public void setRecord_name(String record_name) {
        this.record_name = record_name;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }
}

