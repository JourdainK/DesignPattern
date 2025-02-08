package StatePattern.Challenge;

public class MediaPlayerPlayState implements MediaPlayerState{

    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.pause();
        mediaPlayer.setState(new MediaPlayerPauseState());
    }
}
