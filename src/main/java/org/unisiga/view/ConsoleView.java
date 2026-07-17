package org.unisiga.view;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    
    public void desplegarMenu() {
        System.out.println("\n========================================");
        System.out.println("      SISTEMA DE INSCRIPCIÓN UNISIGA    ");
        System.out.println("========================================");
        System.out.println("1. Iniciar Sesión (Login)");
        System.out.println("2. Registrar Estudiante");
        System.out.println("3. Registrar Académico");
        System.out.println("4. Inscribir Sección / Asignatura");
        System.out.println("5. Registrar Nota (Académico)");
        System.out.println("6. Mostrar Estado de Inscripción");
        System.out.println("0. Salir del Sistema");
        System.out.println("========================================");
        System.out.print("Seleccione una opción: ");
    }

    
    public int leerOpcion() {
        try {
            String input = scanner.nextLine();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    
    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

   
    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("[!] Error: Debe ingresar un número entero válido.");
                System.out.print(mensaje);
            }
        }
    }

   
    public float leerFloat(String mensaje) {
        System.out.print(mensaje);
        while (true) {
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("[!] Error: Debe ingresar un número decimal válido (Ej: 5.5).");
                System.out.print(mensaje);
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarExito(String mensaje) {
        System.out.println("[OK] " + mensaje);
    }

    public void mostrarError(String mensaje) {
        System.out.println("[ERROR] " + mensaje);
    }
}
