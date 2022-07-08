package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.List;

import java.util.stream.Collectors;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
*/
public class Kata1 {
    public static List<ImmutableMap<Integer, String>> execute() {
        List<Movie> movies = DataUtil.getMovies();

        List<ImmutableMap<Integer, String>> peliculas = movies.stream().map((pelicula) -> ImmutableMap.of
                (pelicula.getId(), pelicula.getTitle()))
                .collect(Collectors.toList());

        return peliculas;
    }
}
