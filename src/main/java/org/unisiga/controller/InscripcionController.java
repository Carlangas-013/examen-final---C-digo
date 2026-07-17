package org.unisiga.controller;

import org.unisiga.model.*;
import org.unisiga.view.ConsoleView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InscripcionController {
    private ConsoleView vista;
    private List<Estudiante> estudiantes;
    private List<Academico> academicos;
    private List<Asignatura> asignaturas;
    private List<Seccion> secciones;

    public InscripcionController() {
        this.vista = new ConsoleView();
        this.estudiantes = new ArrayList<>();
        this.academicos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
        this.secciones = new ArrayList<>();
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        asignaturas.add(new Asignatura("INF-101", "Programación Orientada a Objetos", 6));
        secciones.add(new Seccion('A', 30, "Lunes y Miércoles 08:30"));
    }

    public void iniciarSesion() {
        vista.mostrarMensaje("\n--- INICIO DE SESIÓN ---");
        String correo = vista.leerTexto("Ingrese correo institucional: ");
        vista.mostrarMensaje("Autenticando credenciales...");
        vista.mostrarExito("¡Sesión iniciada con éxito para " + correo + "!");
    }

    public void registrarEstudiante() {
        vista.mostrarMensaje("\n--- REGISTRAR NUEVO ESTUDIANTE ---");
        String rut = vista.leerTexto("RUT: ");
        String nombre = vista.leerTexto("Nombre completo: ");
        String correo = vista.leerTexto("Correo Institucional: ");
        String matricula = vista.leerTexto("Número de Matrícula: ");
        int anioIngreso = vista.leerEntero("Año de Ingreso: ");
        float promedio = vista.leerFloat("Promedio Inicial: ");

        Estudiante nuevoEstudiante = new Estudiante(rut, nombre, correo, matricula, anioIngreso, promedio);
        estudiantes.add(nuevoEstudiante);
        
        nuevoEstudiante.inscribirSeccion(); 
        vista.mostrarExito("Estudiante '" + nombre + "' registrado correctamente.");
    }

    public void registrarAcademico() {
        vista.mostrarMensaje("\n--- REGISTRAR NUEVO ACADÉMICO ---");
        String rut = vista.leerTexto("RUT: ");
        String nombre = vista.leerTexto("Nombre completo: ");
        String correo = vista.leerTexto("Correo Institucional: ");
        String idEmpleado = vista.leerTexto("ID Empleado: ");
        String tipoContrato = vista.leerTexto("Tipo de Contrato (Planta/Part-time): ");

        Academico nuevoAcademico = new Academico(rut, nombre, correo, idEmpleado, tipoContrato);
        academicos.add(nuevoAcademico);
        vista.mostrarExito("Académico '" + nombre + "' registrado correctamente.");
    }

    public void inscribirSeccion() {
        vista.mostrarMensaje("\n--- INSCRIBIR ASIGNATURA ---");
        if (estudiantes.isEmpty()) {
            vista.mostrarError("No se puede inscribir de momento. Primero debe registrar al menos un Estudiante.");
            return;
        }
        String rut = vista.leerTexto("Ingrese el RUT del estudiante: ");
        vista.mostrarMensaje("Buscando asignaturas disponibles...");
        vista.mostrarExito("Asignatura '" + asignaturas.get(0).getNombre() + "' asignada al estudiante con RUT " + rut);
    }

    public void registrarNota() {
        vista.mostrarMensaje("\n--- REGISTRAR EVALUACIÓN Y NOTA ---");
        if (academicos.isEmpty()) {
            vista.mostrarError("Operación denegada. Solo un Académico puede registrar notas. Registre uno primero.");
            return;
        }
        String tituloEval = vista.leerTexto("Título de la evaluación (Ej: Certamen 1): ");
        // Aquí leemos la ponderación de forma directa y limpia
        float ponderacion = vista.leerFloat("Ponderación (0.0 a 1.0): ");
        float notaObtenida = vista.leerFloat("Nota obtenida (1.0 a 7.0): ");

        Evaluacion eval = new Evaluacion(tituloEval, ponderacion);
        Calificacion cal = new Calificacion(notaObtenida);

        vista.mostrarExito("Nota " + cal.getNota() + " registrada con éxito en la evaluación '" + eval.getTitulo() + "'.");
    }

    public void mostrarEstadoInscripcion() {
        vista.mostrarMensaje("\n========================================");
        System.out.println("       ESTADO ACTUAL DEL SISTEMA        ");
        vista.mostrarMensaje("========================================");
        vista.mostrarMensaje("Estudiantes en sistema: " + estudiantes.size());
        vista.mostrarMensaje("Académicos en sistema: " + academicos.size());
        vista.mostrarMensaje("Asignaturas base cargadas: " + asignaturas.size());
        vista.mostrarMensaje("========================================");
    }
}
