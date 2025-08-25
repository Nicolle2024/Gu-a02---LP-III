package actv1;

import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cuenta1[] cuentas = new Cuenta1[10];

        for (int i = 0; i < 5; i++) {
            cuentas[i] = new CuentaAhorro("AH" + (i+1), 1000 + i*500, 0.02);
        }

        for (int i = 5; i < 10; i++) {
            cuentas[i] = new CuentaCorriente("CC" + (i-4), 1500 + (i-5)*500);
        }

        String opcion;
        do {
            System.out.println("\n===== MENÚ BANCO =====");
            System.out.println("D) Depositar");
            System.out.println("R) Retirar");
            System.out.println("C) Consultar");
            System.out.println("S) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextLine().toUpperCase();

            switch (opcion) {
                case "D":
                    System.out.print("Número de cuenta: ");
                    String ncDep = sc.nextLine();
                    Cuenta1 cuentaDep = buscarCuenta(cuentas, ncDep);
                    if (cuentaDep != null) {
                        System.out.print("Monto a depositar: ");
                        double montoDep = sc.nextDouble();
                        sc.nextLine();
                        cuentaDep.depositar(montoDep);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case "R":
                    System.out.print("Número de cuenta: ");
                    String ncRet = sc.nextLine();
                    Cuenta1 cuentaRet = buscarCuenta(cuentas, ncRet);
                    if (cuentaRet != null) {
                        System.out.print("Monto a retirar: ");
                        double montoRet = sc.nextDouble();
                        sc.nextLine();
                        cuentaRet.retirar(montoRet);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case "C":
                    for (Cuenta1 c : cuentas) {
                        c.consultar();
                        System.out.println("Cuenta " + c.getNumeroCuenta() + " → Saldo: S/." + c.getSaldo());
                    }
                    break;

                case "S":
                    System.out.println("Saliendo del sistema bancario...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (!opcion.equals("S"));

        sc.close();
    }

    public static Cuenta1 buscarCuenta(Cuenta1[] cuentas, String numeroCuenta) {
        for (Cuenta1 c : cuentas) {
            if (c.getNumeroCuenta().equals(numeroCuenta)) {
                return c;
            }
        }
        return null;
    }
}
