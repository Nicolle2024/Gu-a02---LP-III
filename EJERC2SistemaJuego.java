package actv1;

public class SistemaJuego {
    public void subirNivel(Personajes personaje) {
        if (personaje.nivel < Personajes.LIMITE_NIVEL) {
            personaje.nivel++;
            System.out.println(personaje.nombre + " subió al nivel " + personaje.nivel);
        }
    }
}
