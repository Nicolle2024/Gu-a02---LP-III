package actv1;

public class Mago extends Personajes implements IAtaqueMagico {

    public Mago(String nombre, int salud, int nivel) {
        super(nombre, salud, nivel);
    }

    @Override
    public void usarHabilidad(Habilidad habilidad, Personajes objetivo) {
        System.out.println(nombre + " lanza hechizo " + habilidad.getNombre() + " sobre " + objetivo.nombre);
    }

    @Override
    public void atacar(Personajes objetivo) {
        System.out.println(nombre + " ataca mágicamente a " + objetivo.nombre);
    }

    @Override
    public void ataqueMagico(Personajes objetivo) {
        System.out.println(nombre + " realiza un ataque mágico a " + objetivo.nombre);
    }
}
