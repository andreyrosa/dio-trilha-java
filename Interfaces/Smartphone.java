package Interfaces;

public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Smartphone is playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Smartphone is pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone is stopping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Smartphone is playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Smartphone is pausing video");

    }

    @Override
    public void stopVideo() {
        System.out.println("Smartphone is stopping video");

    }
}
