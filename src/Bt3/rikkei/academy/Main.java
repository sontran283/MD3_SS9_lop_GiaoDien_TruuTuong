package Bt3.rikkei.academy;

public class Main {
    public static void main(String[] args) {
        IPlayable audioPlayer = new AudioPlayer();
        IPlayable videoPlayer = new VideoPlayer();

        audioPlayer.play();
        videoPlayer.play();
    }
}
