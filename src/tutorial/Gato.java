package tutorial;

public class Gato extends Animal {

    String colorPelo;

    Gato() {
        this("negro");
    }

    Gato(String colorPelo) {
        super(4, 2);
        this.colorPelo = colorPelo;
    }

}
