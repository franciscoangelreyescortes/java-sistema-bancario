package main;

import banco.CuentaBancaria;
import banco.Usuario;
import externo.Ladron;

public class Main {
    public static void main(String[] args) {
        // Mostrar nombre del alumno
        System.out.println("Estudiante: Reyes Cortes Francisco Angel\n");

        // 1. Crear usuario y su cuenta
        Usuario usuario = new Usuario();
        CuentaBancaria cuentaGenerada = usuario.usarCuenta();

        // 2. Crear ladrón e intentar el robo
        Ladron ladron = new Ladron();
        ladron.robarDinero(cuentaGenerada);

        System.out.println("\n--- ejercicio ---");
        System.out.println("Los modificadores protegen la integridad. El saldo (private) " +
                           "solo se alteró mediante métodos autorizados.");
    }
}
