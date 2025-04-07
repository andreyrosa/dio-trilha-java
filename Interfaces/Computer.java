package Interfaces;

public class Computer implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Computer is playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Computer is pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Computer is stopping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Computer is playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Computer is pausing video");

    }

    @Override
    public void stopVideo() {
        System.out.println("Computer is stopping video");

    }
}
