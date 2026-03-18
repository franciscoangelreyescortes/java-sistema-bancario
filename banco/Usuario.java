package banco;

public class Usuario {
    public CuentaBancaria usarCuenta() {
        CuentaBancaria miCuenta = new CuentaBancaria("12345-ABC", "Reyes Cortes Francisco Angel", 100.0);//tenemos 100 miseros pesos

        System.out.println("--- Acciones del Usuario (Mismo Paquete) ---");
        
        // ACCESOS DIRECTOS:
        System.out.println("Acceso a numeroCuenta (public): " + miCuenta.numeroCuenta); 
        System.out.println("Acceso a titular (protected): " + miCuenta.titular);     // OK (mismo paquete)
        
        // El siguiente acceso daría ERROR DE COMPILACIÓN si se quita el comentario:
        // System.out.println(miCuenta.saldo); // ERROR: saldo es private
        
        System.out.println("Acceso a saldo: $" + miCuenta.getSaldo());  //mediante metodo
        
        miCuenta.depositar(500);//Como ejemplo "depositaremos"" 500 pesos
        return miCuenta;
    }
}
