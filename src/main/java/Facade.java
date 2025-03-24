// Subsistema: Amplifier
class Amplifier {
    public void on() {
        System.out.println("Amplificador ligado.");
    }
}

// Subsistema: DVDPlayer
class DVDPlayer {
    public void on() {
        System.out.println("DVD player ligado.");
    }

    public void play(String movie) {
        System.out.println("Reproduzindo o filme: " + movie);
    }
}

// Subsistema: Projector
class Projector {
    public void on() {
        System.out.println("Projetor ligado.");
    }
}

// Facade: HomeTheaterFacade
class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparando para assistir ao filme...");
        amp.on();
        dvd.on();
        projector.on();
        dvd.play(movie);
    }
}

// Classe principal com método main
public class Facade {
    public static void main(String[] args) {
        // Cria os componentes do subsistema
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();

        // Cria o Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);

        // Usa o Facade para assistir a um filme
        homeTheater.watchMovie("O Poderoso Chefão");
    }
}
