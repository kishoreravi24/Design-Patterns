public class HomeTheatre {
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheatre(){
        this.dvdPlayer = new DvdPlayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
    }

    public void watchMovie(String movie){
        System.out.println("About to play "+movie);
        dvdPlayer.on();
        projector.on();
        soundSystem.on();
        dvdPlayer.play();
        projector.play();
        soundSystem.play();
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}
