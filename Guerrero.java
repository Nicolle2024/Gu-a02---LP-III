package actv1;

public class Guerrero extends Personajes implements IAtaqueFisico {

    public Guerrero(String nombre, int salud, int nivel) {
        super(nombre, salud, nivel);
    }

    @Override
    public void usarHabilidad(Habilidad habilidad, Personajes objetivo) {
        System.out.println(nombre + " usa " + habilidad.getNombre() + " sobre " + objetivo.nombre);
    }

    @Override
    public void atacar(Personajes objetivo) {
        System.out.println(nombre + " ataca físicamente a " + objetivo.nombre);
    }

    @Override
    public void ataqueFisico(Personajes objetivo) {
        System.out.println(nombre + " realiza un golpe físico a " + objetivo.nombre);
    }
}
