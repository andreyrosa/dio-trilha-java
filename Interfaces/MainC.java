package Interfaces;

public class MainC {
    public static void main(String[] args) {
        Computer musicPlayer = new Computer();

        runMusic(musicPlayer);
        runVideo(new Computer());

    }

    public static void runVideo(VideoPlayer videoplayer) {
        videoplayer.playVideo();
    }
    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
