package com.company;

public class CheckSub {
    public static MediaFile  controllsubs(MediaFile file, Media media) {
        System.out.println("Checking for a subscription: checking your subscription");
        return file;
    }

    public static MediaFile subscriptiontrue(MediaFile buffer, Media media) {
        System.out.println("Checking for a subscription: Matches by your subscription");
        return buffer;
    }
}