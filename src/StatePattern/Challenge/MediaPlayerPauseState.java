package StatePattern.Challenge;

public class MediaPlayerPauseState implements MediaPlayerState{

    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.setState(new MediaPlayerPlayState());
    }
}
