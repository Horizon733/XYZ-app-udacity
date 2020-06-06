package com.example.xyzreader;

public class Reader {
    private int id;
    private String title;
    private String author;
    private String body;
    private String thumb;
    private String photo;
    private double aspect_ratio;
    private String published_date;

    public Reader(int id, String title, String author, String body, String thumb, String photo, double aspect_ratio, String published_date){
        this.id = id;
        this.thumb = thumb;
        this.title = title;
        this.author = author;
        this.body = body;
        this.aspect_ratio = aspect_ratio;
        this.photo = photo;
        this.published_date = published_date;
    }
    public String getTitle(){ return title;}
    public String getAuthor(){return author;}
    public String getBody(){ return body;}
    public String getThumb(){ return thumb;}
    public String getPhoto(){ return photo;}
    private String getPublished_date(){ return published_date;}
    public int getId(){ return id;}
    public double getAspect_ratio(){ return aspect_ratio;}
}
