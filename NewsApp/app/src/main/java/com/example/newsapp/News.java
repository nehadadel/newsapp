package com.example.newsapp;

public class News {
    /**
     * Title of the article
     */
    private String mTitle;

    /**
     * Section name of the article
     */
    private String mSection;


    /**
     * Web publication date of the article
     */
    private String mDate;

    /**
     * Author name
     */
    private String mAuthor;

    /**
     * Website URL of the article
     */
    private String mUrl;


    /**
     * Constructs a new {@link News} object.
     *
     * @param title   is the title of the article
     * @param section is the section name of the article
     * @param date    is the web publication date of the article
     * @param url     is the website URL to find more details about the article
     * @param author  is the name of the author
     */
    public News(String title, String section, String date, String author, String url) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mAuthor = author;
        mUrl = url;

    }

    /**
     * Returns the title of the article
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section name of the article.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the web publication date of the article.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the title of the article
     */
    public String getAuthor() {
        return mAuthor;
    }


    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }


}
