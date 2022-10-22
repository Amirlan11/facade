package com.company;

public class MediaFile {
    private String name;
    private String MediaType;

    public MediaFile(String name) {
        this.name = name;
        this.MediaType = name.substring(name.indexOf(".") + 1);
    }

    public String getMediaType() {
        return MediaType;
    }

    public String getName() {
        return name;
    }
}
