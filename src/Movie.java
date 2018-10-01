import java.io.Serializable;
import java.time.Year;

public class Movie implements Serializable {

    private String title;
    private int production;
    private String genre;

    public Movie(String title, int production, String genre) {
        this.title = title;
        this.production = production;
        this.genre = genre;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", production=" + production +
                ", genre='" + genre + '\'' +
                '}';
    }
}
