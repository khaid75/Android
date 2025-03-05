package com.example.moviedbtutorial;

public class MovieModel {
    private String Title;
    private String Runtime;
    private String Poster;

    public MovieModel(String title, String runtime, String poster) {

        Title = title;
        Runtime = runtime;
        Poster = poster;

    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String runtime) {
        Runtime = runtime;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
