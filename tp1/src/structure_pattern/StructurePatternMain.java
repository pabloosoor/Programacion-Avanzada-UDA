package structure_pattern;

public class StructurePatternMain {
    public static void main(String[] args) {
        System.out.println("--Patron Proxy--");

        //Crear una cuenta bancaria con proxy
        ProxyCuentaBancaria cuenta = new ProxyCuentaBancaria("123456789", "Pablo la maquina", 1000.0);
        System.out.println("Intentando acceder sin autenticación...");
        cuenta.obtenerSaldo();
        cuenta.depositar(10000);

        System.out.println("Con Autenticación incorrecta...");
        cuenta.autenticar("wronguser", "wrongpassword");

        cuenta.autenticar("admin", "1234");
        System.out.println("Acceso autenticado, realizando operaciones...");

        System.out.println("Operaciones ya autenticado: ");
        //Saldo
        double saldo = cuenta.obtenerSaldo();
        System.out.println("Saldo actual: $" + saldo);

        //Retiro
        System.out.println("Intentando retirar $500...");
        cuenta.retirar(500);

        System.out.println("Intentando retirar $2500...(Excede Limite");
        cuenta.retirar(2500);

        //transferencia
        System.out.println("Intentando transferir $300 a cuenta 987654321...");
        cuenta.transferencia(300, "987654321");

        System.out.println("Intentando transferencia a cuenta vacía");
        cuenta.transferencia(300, " ");

        System.out.println("\n--- Desautenticando usuario ---");
        cuenta.desautenticar();
        System.out.println("--- Intento sin autenticación después de desautenticarse ---");
        cuenta.obtenerSaldo();

    }
}
