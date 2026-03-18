package externo;

import banco.CuentaBancaria;

public class Ladron {
    public CuentaBancaria robarDinero(CuentaBancaria cuenta) {
        System.out.println("\n--- Intento de Acceso del Ladrón (Paquete Externo) ---");

        // Intento de acceso a numeroCuenta (public)
        System.out.println("Ladrón ve el número de cuenta: " + cuenta.numeroCuenta); // PERMITIDO

        /* * OBSERVACIONES DE ACCESO:
         * * 1. cuenta.titular -> ERROR: Es 'protected' y el Ladrón está en otro paquete 
         * y no es una subclase.
         * * 2. cuenta.saldo -> ERROR: Es 'private', inaccesible fuera de su clase.
         * * 3. Intentar modificar cuenta.numeroCuenta = "666"; -> PERMITIDO por ser public 
         * (Mala práctica de diseño, por eso el ejercicio pide analizarlo).
         */

        System.out.println("El ladrón no puede ver el titular ni el saldo directamente.");
        return cuenta;
    }
}
