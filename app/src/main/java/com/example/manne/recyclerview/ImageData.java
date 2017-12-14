package com.example.manne.recyclerview;

/**
 * Created by manne on 14.12.2017.
 */

public class ImageData{
    public String previewHeight;
    public String likes;
    public String favorites;
    public String tags;
    public String views;
    public String weformatHeight;
    public String weformatWidth;
    public String pageURL;
    public String previewURL;
    public String userImageURL;

    public ImageData(){

    }

    public ImageData(String previewURL) {
        this.previewURL = previewURL;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getLikes() {
        return likes;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    public String getPreviewHeight() {
        return previewHeight;
    }

    public void setPreviewHeight(String previewHeight) {
        this.previewHeight = previewHeight;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    public String getWeformatHeight() {
        return weformatHeight;
    }

    public void setWeformatHeight(String weformatHeight) {
        this.weformatHeight = weformatHeight;
    }

    public String getWeformatWidth() {
        return weformatWidth;
    }

    public void setWeformatWidth(String weformatWidth) {
        this.weformatWidth = weformatWidth;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getViews() {
        return views;
    }
}
