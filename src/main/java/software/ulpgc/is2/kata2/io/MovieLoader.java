package software.ulpgc.is2.kata2.io;

import software.ulpgc.is2.kata2.model.Movie;

import java.util.List;

public interface MovieLoader {
    List<Movie> loadAll();
}
