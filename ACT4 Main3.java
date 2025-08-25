package actv1;

public class Main3 {
    public static void main(String[] args) {
        Persona p1 = new Persona(1, "Nicolle", "Castilla", 123456789, 120.30);

        System.out.println(p1);

        p1.getCuenta().setSaldo(500);
        System.out.println("Saldo actualizado: " + p1.getCuenta().getSaldo());
    }
}
