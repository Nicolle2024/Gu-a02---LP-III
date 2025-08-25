package actv1;

public class CuentaAhorro extends Cuenta1 {
    private double tasaInteres;   
    private double saldoMinimo;   

   
    public CuentaAhorro(String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
        this.saldoMinimo = saldoInicial;
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            super.retirar(monto); 
            if (saldo < saldoMinimo) {
                saldoMinimo = saldo;
            }
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    @Override
    public void consultar() {
        double interes = saldoMinimo * tasaInteres;
        depositar(interes);  
        System.out.println("Intereses de S/." + interes + " capitalizados en la cuenta " + numeroCuenta);
        saldoMinimo = saldo; 
    }
}
