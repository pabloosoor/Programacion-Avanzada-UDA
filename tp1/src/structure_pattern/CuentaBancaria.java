package structure_pattern;

public interface CuentaBancaria {

    void depositar(double cantidad);
    void retirar(double cantidad);
    double obtenerSaldo();
    void transferencia(double cantidad, String cuentaDestino);
}
