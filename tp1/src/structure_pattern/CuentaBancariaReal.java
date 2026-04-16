package structure_pattern;

// Clase Real que implementa CuentaBancaria
public class CuentaBancariaReal implements CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancariaReal(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("[CuentaReal] Depósito de $" + cantidad + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("[CuentaReal] Cantidad inválida para depósito");
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("[CuentaReal] Retiro de $" + cantidad + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("[CuentaReal] Retiro inválido: fondos insuficientes o cantidad negativa");
        }
    }

    @Override
    public double obtenerSaldo() {
        System.out.println("[CuentaReal] Consultando saldo...");
        return saldo;
    }

    @Override
    public void transferencia(double cantidad, String cuentaDestino) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("[CuentaReal] Transferencia de $" + cantidad + " a cuenta " + cuentaDestino + ". Saldo: $" + saldo);
        } else {
            System.out.println("[CuentaReal] Transferencia fallida");
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }
}