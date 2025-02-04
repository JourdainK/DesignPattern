package ProxyPatternAccess.Challenge;

import javax.print.attribute.standard.Media;

public class MediaPlayerProxy implements MediaPlayer{
    private MediaPlayer mediaPlayer;

    @Override
    public void playMedia() {
        if(mediaPlayer == null){
            mediaPlayer = new MovieMediaPlayer();
        }
        mediaPlayer.playMedia();
    }
}
