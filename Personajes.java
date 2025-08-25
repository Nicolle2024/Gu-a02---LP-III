package actv1;

public abstract class Personajes {
    protected String nombre;
    protected int salud;
    protected int nivel;

    protected static int contadorPersonajes = 0;
    protected static final int LIMITE_NIVEL = 100;

    public static final int SALUD_MAXIMA = 100;

    public Personajes(String nombre, int salud, int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
        contadorPersonajes++;
    }

    public abstract void usarHabilidad(Habilidad habilidad, Personajes objetivo);
    public abstract void atacar(Personajes objetivo);

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        if (salud <= SALUD_MAXIMA) {
            this.salud = salud;
        } else {
            this.salud = SALUD_MAXIMA;
        }
    }
}

