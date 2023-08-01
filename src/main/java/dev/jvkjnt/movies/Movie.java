package dev.jvkjnt.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
public class Movie {

    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerlink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;


}
