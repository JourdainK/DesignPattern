package ProxyPatternAccess.Challenge;

public class MovieMediaPlayer implements MediaPlayer {

    public MovieMediaPlayer(){
        loadVideo();
    }

    @Override
    public void playMedia() {
        System.out.println("Playing Video...");
    }

    private void loadVideo(){
        System.out.println("Loading up large video...");
    }
}

