package main;

import banco.CuentaBancaria;
import banco.Usuario;
import externo.Ladron;

public class Main {
    public static void main(String[] args) {
        // Mostrar nombre del alumno
        System.out.println("Estudiante: Reyes Cortes Francisco Angel\n");

        // 1. Crear objeto Usuario y generar cuenta
        Usuario usuario = new Usuario();
        CuentaBancaria cuentaGenerada = usuario.usarCuenta();

        // 2. Intentar un retiro con Try-Catch (Ejercicio adicional)
        System.out.println("\n--- Prueba de Retiro ---");
        try {
            cuentaGenerada.retirar(10000); 
        } catch (Exception e) {
            System.err.println("Error capturado: " + e.getMessage());
        }

        // 3. Crear objeto Ladron y pasarle la cuenta
        Ladron ladron = new Ladron();
        ladron.robarDinero(cuentaGenerada);

        System.out.println("\n--- Conclusión del ejercicio ---");
        System.out.println("Los modificadores protegen la integridad. El saldo (private)");
        System.out.println("solo se modificó mediante métodos controlados.");
    }
}
