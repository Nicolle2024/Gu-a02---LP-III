package actv1;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta; 

    public Persona(int id, String nombre, String apellido, int numCuenta, double saldoInicial) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(numCuenta, saldoInicial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "Persona [ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Cuenta: " + cuenta + "]";
    }
}
