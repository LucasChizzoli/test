package tutorial;

public class Persona {

    String nombre;
    int edad;

    Persona() {
        nombre = "default";
    }

    Persona(String nuevoNombre) {
        System.out.println("Construyendo persona con el nombre: "+nuevoNombre);
        nombre = nuevoNombre;
    }

    void tuNombreEs(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    String decimeTuNombre() {
        return nombre;
    }

    void tuEdadEs(int nuevaEdad) {
        edad = nuevaEdad;
    }

    int cualEsTuEdad() {
        return edad;
    }
    // ##### (lo que devuelve) nombre parametros
}
