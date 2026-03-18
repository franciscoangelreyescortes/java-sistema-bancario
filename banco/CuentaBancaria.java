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
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de: $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    // Getter para el saldo (Solo lectura)
    public double getSaldo() {
        return saldo;
    }
}
