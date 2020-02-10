package com.example.inclass11;

public class Photo {
    String path;
    String photoUrl;

    public Photo(){

    }

    public Photo(String path, String photoUrl) {
        this.path = path;
        this.photoUrl = photoUrl;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
