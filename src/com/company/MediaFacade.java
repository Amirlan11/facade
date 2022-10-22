package com.company;

import java.io.File;

public class MediaFacade {
    public File searchingMedia(String Name, String format) {
        System.out.println("MediaFacade: searchingMedia started.");
        MediaFile file = new MediaFile(Name);
        Media sourceMedia = MediaFactory.extract(file);//Media sourceMedia = new SerialMedia()/new FilmMedia()  зависимо от типа;
        //("MediaFactory: searching this Film on database");/("Checking for a subscription: Matches by your subscription");
        Media destinationMedia;
        if (format.equals("Serial")) {
            destinationMedia = new SerialMedia();
        } else {
            destinationMedia = new FilmMedia();
        }
        MediaFile buffer = CheckSub.controllsubs(file, sourceMedia);//MediaFile buffer=file
        //("Checking for a subscription: checking your subscription")
        MediaFile intermediateResult = CheckSub.subscriptiontrue(buffer, destinationMedia);//MediaFile intermediateResult= buffer
        //("Checking for a subscription: Matches by your subscription");
        File result = (new AudioMixer()).fix(intermediateResult);//File result=File("sql");
        //("AudioMixer: fixing audio...");
        System.out.println("searchingMedia: enjoy watching everything is ready");
        return result;
    }
}
