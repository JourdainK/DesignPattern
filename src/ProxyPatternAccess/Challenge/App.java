package ProxyPatternAccess.Challenge;

public class App {

    private static final MediaPlayerProxy mediaPlayerProxy = new MediaPlayerProxy();

    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        mediaPlayerProxy.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        var movieMediaPlayer = new MovieMediaPlayer();
        movieMediaPlayer.playMedia();
    }

}
