/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



public class ContadorTest {
    public static void main(String[] args) {
        System.out.println("Contadores creados: " + Contador.getNContadores());
        System.out.println("Último contador: " + Contador.getUltimoContador());
        
        Contador c1 = new Contador(5);
        Contador c2 = new Contador();
        Contador c3 = new Contador(8);
        
        System.out.println("Contadores creados: " + Contador.getNContadores());
        System.out.println("Último contador: " + Contador.getUltimoContador());
        System.out.println("Acumulador total: " + Contador.acumulador);
    }
}

