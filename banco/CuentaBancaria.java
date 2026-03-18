package banco;

public class CuentaBancaria {

    public String numeroCuenta;    // Visible desde cualquier lugar
    protected String titular;      // Visible en el mismo paquete y subclases
    private double saldo;          // Solo visible dentro de esta clase

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        }
    }

    // Método para retirar
    public void retirar(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception("Saldo insuficiente. Intento de retiro: $" + cantidad);
        }
        if (cantidad <= 0) {
            throw new Exception("La cantidad debe ser mayor a cero.");
        }
        saldo -= cantidad;
        System.out.println("Retiro de $" + cantidad + " exitoso.");
    }

    public double getSaldo() {
        return saldo;
    }

}
