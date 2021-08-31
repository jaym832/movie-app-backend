package com.example.demo.Movie;


import javax.persistence.*;

@Entity
@Table
public class Movie {

    @Id
    @SequenceGenerator(
            name= "movie_sequence",
            sequenceName ="movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )




    private Long id;
    private String title;
    private String description;
    private String releaseDate;
    private String poster;

    public Movie() {
    }

    public Movie(Long id, String title, String description, String releaseDate,String poster) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.poster=poster;
    }

    public Movie(String title, String description, String releaseDate,String poster) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.poster= poster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
