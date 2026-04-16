package structure_pattern;

// Proxy que controla el acceso a CuentaBancariaReal
public class ProxyCuentaBancaria implements CuentaBancaria {
    private final CuentaBancariaReal cuentaReal;
    private boolean usuarioAutenticado;
    private String usuarioActual;

    public ProxyCuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.cuentaReal = new CuentaBancariaReal(numeroCuenta, titular, saldoInicial);
        this.usuarioAutenticado = false;
        this.usuarioActual = null;
    }

    // Método para autenticarse
    public boolean autenticar(String usuario, String password) {
        // Validación simple (en realidad sería más compleja)
        if (usuario.equals("admin") && password.equals("1234")) {
            this.usuarioAutenticado = true;
            this.usuarioActual = usuario;
            System.out.println("[Proxy] ✓ Usuario " + usuario + " autenticado exitosamente");
            return true;
        } else {
            System.out.println("[Proxy] ✗ Autenticación fallida: credenciales inválidas");
            return false;
        }
    }

    // Método para desautenticarse
    public void desautenticar() {
        this.usuarioAutenticado = false;
        this.usuarioActual = null;
        System.out.println("[Proxy] Usuario desautenticado");
    }

    @Override
    public void depositar(double cantidad) {
        if (validarAcceso()) {
            registrarOperacion("DEPÓSITO de $" + cantidad);
            cuentaReal.depositar(cantidad);
        } else {
            System.out.println("[Proxy] ✗ Acceso denegado: usuario no autenticado");
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (validarAcceso()) {
            if (validarLimiteDiario(cantidad)) {
                registrarOperacion("RETIRO de $" + cantidad);
                cuentaReal.retirar(cantidad);
            } else {
                System.out.println("[Proxy] ✗ Límite de retiro diario excedido");
            }
        } else {
            System.out.println("[Proxy] ✗ Acceso denegado: usuario no autenticado");
        }
    }

    @Override
    public double obtenerSaldo() {
        if (validarAcceso()) {
            registrarOperacion("CONSULTA DE SALDO");
            return cuentaReal.obtenerSaldo();
        } else {
            System.out.println("[Proxy] ✗ Acceso denegado: usuario no autenticado");
            return -1;
        }
    }

    @Override
    public void transferencia(double cantidad, String cuentaDestino) {
        if (validarAcceso()) {
            if (validarTransferencia(cantidad, cuentaDestino)) {
                registrarOperacion("TRANSFERENCIA de $" + cantidad + " a " + cuentaDestino);
                cuentaReal.transferencia(cantidad, cuentaDestino);
            } else {
                System.out.println("[Proxy] ✗ Transferencia no permitida");
            }
        } else {
            System.out.println("[Proxy] ✗ Acceso denegado: usuario no autenticado");
        }
    }

    private boolean validarAcceso() {
        return usuarioAutenticado;
    }

    private boolean validarLimiteDiario(double cantidad) {
        return cantidad <= 1000;
    }

    private boolean validarTransferencia(double cantidad, String cuentaDestino) {
        return cantidad > 0 && cuentaDestino != null && !cuentaDestino.isEmpty();
    }

    private void registrarOperacion(String operacion) {
        System.out.println("[Proxy] Registrando operación: " + operacion + " - Usuario: " + usuarioActual);
    }

    public String getNumeroCuenta() {
        return cuentaReal.getNumeroCuenta();
    }

    public String getTitular() {
        return cuentaReal.getTitular();
    }
}