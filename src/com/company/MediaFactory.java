package com.company;

public class MediaFactory {
    public static Media extract(MediaFile file) {
        String type = file.getMediaType();
        if (type.equals("Serial")) {
            System.out.println("MediaFactory: searching this Serial on database");
            return new SerialMedia();
        }
        else {
            System.out.println("MediaFactory: searching this Film on database");
            return new FilmMedia();
        }
    }
}
