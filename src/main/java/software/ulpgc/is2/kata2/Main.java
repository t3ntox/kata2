package software.ulpgc.is2.kata2;

import software.ulpgc.is2.kata2.io.MovieLoader;
import software.ulpgc.is2.kata2.io.RemoteMovieLoader;
import software.ulpgc.is2.kata2.model.Movie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movieList = new RemoteMovieLoader().loadAll();
        for (Movie movie: movieList) {
            System.out.println(movie);
        }
    }
}
