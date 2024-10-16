package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        redRemote.turnOn();
        System.out.println("TV is on");
        blackRemote.turnOn();
        System.out.println("TV is on");

        redRemote.channelUp();
        System.out.println("One channel up");
        blackRemote.channelUp();
        System.out.println("One channel up");


        redRemote.channelDown();
        System.out.println("One channel down");
        blackRemote.channelDown();
        System.out.println("One channel down");

        redRemote.channelDown();
        if (redRemote.channel == 0) {
            System.out.println("You can't change the channel");
        }
        blackRemote.channelDown();
        if (blackRemote.channel == 0) {
            System.out.println("You can't change the channel");
        }

        redRemote.volumeUp();
        System.out.println("Volume up");
        blackRemote.volumeUp();
        System.out.println(("Volume up"));

        redRemote.volumeDown();
        System.out.println("Volume down");
        blackRemote.volumeDown();
        System.out.println("Volume down");

        redRemote.volumeDown();
        if (redRemote.volume == 0) {
            System.out.println("You can't set volume on 0");
        }
        blackRemote.volumeDown();
        if (blackRemote.volume == 0) {
            System.out.println("You can't set volume on 0");
        }

        redRemote.getColor();
        System.out.println("Color is: " + redRemote.color);
        blackRemote.getColor();
        System.out.println("Color is: " + blackRemote.color);

        redRemote.turnOff();
        System.out.println("TV is off");
        blackRemote.turnOff();
        System.out.println("TV is off");
    }

}
