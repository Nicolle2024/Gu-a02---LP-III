/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


public class EjemploCoche {
    public static void main(String[] args) {
        // Crear objetos coche
        Coche cocheDeportivo = new Coche("Ferrari", "488", 2022, 250000);
        Coche cocheTodoTerreno = new Coche("Toyota", "Land Cruiser", 2008, 45000);
        
        // Aplicar descuentos
        boolean descuento1 = cocheDeportivo.aplicarDescuento(15);
        boolean descuento2 = cocheTodoTerreno.aplicarDescuento(15);
        
        // Mostrar resultados
        System.out.println("Descuento aplicado en deportivo: " + descuento1);
        System.out.println("Descuento aplicado en todo terreno: " + descuento2);
        System.out.println("Precio final deportivo: $" + cocheDeportivo.getPrecio());
        System.out.println("Precio final todo terreno: $" + cocheTodoTerreno.getPrecio());
    }
}

