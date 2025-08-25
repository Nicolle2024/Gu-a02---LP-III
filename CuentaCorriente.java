package actv1;

public class CuentaCorriente extends Cuenta1 {
    private int retirosGratis = 3;
    private int contadorRetiros = 0;
    private final double tarifa = 3.0;

    public CuentaCorriente(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            super.retirar(monto);
            contadorRetiros++;
            if (contadorRetiros > retirosGratis) {
                saldo -= tarifa;
                System.out.println("Se aplicó una tarifa de S/." + tarifa + " por exceso de retiros.");
            }
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    @Override
    public void consultar() {
        contadorRetiros = 0;
        System.out.println("Consultando cuenta corriente " + numeroCuenta + ". Retiros gratuitos reiniciados.");
    }
}
