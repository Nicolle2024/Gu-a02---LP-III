package actv1;

public abstract class Cuenta1 {
    protected String numeroCuenta;
    protected double saldo;

    public Cuenta1(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado. Nuevo saldo: S/." + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: S/." + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public abstract void consultar();
}
