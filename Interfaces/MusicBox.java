package Interfaces;

public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("MusicBox is playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("MusicBox is pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("MusicBox is stopping music");
    }
}
