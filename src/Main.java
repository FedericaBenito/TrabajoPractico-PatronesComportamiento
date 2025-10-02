import ChainOfResponsibility.*;
import Command.*;
import Iterator.*;
import Meditor.*;
import Memento.*;
import Observer.*;
import State.*;
import Strategy.*;
import TemplateMethod.*;
import Visitor.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Handler asistente = new Asistente();
        Handler profesor = new Profesor();
        Handler coordinador = new Coordinador();

        System.out.println("=====EJERCICIO CHAIN OF RESPONSIBILITY=====");
        // Encadenamos
        asistente.setNext(profesor);
        profesor.setNext(coordinador);

        // Creamos solicitudes
        Solicitud s1 = new Solicitud("basica", "Necesito ayuda para registrarme en la plataforma.");
        Solicitud s2 = new Solicitud("intermedia", "Tengo dudas sobre un tema del curso.");
        Solicitud s3 = new Solicitud("avanzada", "Quiero hablar sobre un proyecto de investigación.");

        // Procesamos
        asistente.handle(s1);
        System.out.println("----");
        asistente.handle(s2);
        System.out.println("----");
        asistente.handle(s3);
        System.out.println(" ");

        //System.out.println("===========================================");
        System.out.println("=====EJERCICIO COMMAND=====");
        // Creamos un alumno
        Alumno alumno = new Alumno("Laureano");

        // Creamos el invoker
        Invoker invoker = new Invoker();

        // Creamos algunos comandos
        Command inscribir = new InscribirseCurso(alumno, "Java Básico");
        Command abandonar = new AbandonarCurso(alumno, "Java Básico");
        Command certificado = new SolicitarCertificado(alumno, "Java Básico");

        // Ejecutamos acciones
        invoker.setCommand(inscribir);
        invoker.ejecutar();

        invoker.setCommand(certificado);
        invoker.ejecutar();

        invoker.setCommand(abandonar);
        invoker.ejecutar();
      //  System.out.println("===========================================");
        System.out.println(" ");
        System.out.println("=====EJERCICIO ITERATOR=====");
        AlumnoConCursos alumnoIterator = new AlumnoConCursos("Cecilia");

        alumnoIterator.inscribirse(new Curso("Matemática"));
        alumnoIterator.inscribirse(new Curso("Programación"));
        alumnoIterator.inscribirse(new Curso("Bases de Datos"));

        System.out.println("\nRecorriendo cursos inscritos:");

        IteratorCurso iterador = alumnoIterator.getIterator();
        while (iterador.hasNext()) {
            Curso curso = iterador.next();
            System.out.println("- " + curso.getNombre());
        }

        System.out.println("\n=====EJERCICIO MEDIATOR=====");
        ChatMediador chat = new ChatRoom();

        Usuario alumno1 = new Alumni(chat, "Ana");
        Usuario alumno2 = new Alumni(chat, "Luis");
        Usuario profesor1 = new Profesorito(chat, "Carlos");

        alumno1.enviar("Hola, ¿alguien puede ayudarme con el ejercicio 3?");
        profesor1.enviar("¡Claro, Ana! Ya te explico...");

        System.out.println("\n=====EJERCICIO MEMENTO=====");
        Examen examen = new Examen();
        Cuidador cuidador = new Cuidador();

        // El alumno responde algunas preguntas
        examen.responderPregunta(1, "Respuesta A");
        examen.responderPregunta(2, "Respuesta B");

        Memento memento1 = examen.save();
        cuidador.agregarMemento(memento1);

        // El alumno responde más preguntas
        examen.responderPregunta(3, "Respuesta C");
        examen.responderPregunta(4, "Respuesta D");

        // Mostramos las respuestas actuales
        examen.mostrarRespuestas();

        // Restauramos el progreso anterior
        examen.restore(cuidador.obtenerMemento(0));

        // Mostramos las respuestas después de restaurar
        examen.mostrarRespuestas();

        System.out.println("\n=====EJERCICIO OBSERVER=====");
        CursoObservable cursoProgramacion = new CursoObservable("Programación");

        Observador alumnoObserver1 = new AlumnoObserver("Gabriel");
        Observador alumnoObserver2 = new AlumnoObserver("Pedro");

        cursoProgramacion.agregarObservador(alumnoObserver1);
        cursoProgramacion.agregarObservador(alumnoObserver1);

        cursoProgramacion.cambiarHorario("Lunes y Miércoles, 18:00 - 20:00");
        cursoProgramacion.nuevoAviso("El examen final será el próximo viernes.");

        System.out.println("\n=====EJERCICIO STATE=====");
        Inscripcion inscripcion = new Inscripcion("Juan", "Matemáticas Avanzadas");

        System.out.println("Estado inicial de la inscripción:");
        inscripcion.cambiarEstado(); // Cambia de "En espera" a "Inscrito"

                System.out.println("\nIntentando cambiar el estado de nuevo:");
        inscripcion.cambiarEstado(); // Ya está inscrito, no cambia

        // Cambiamos el estado manualmente a Cancelado para probar
        inscripcion.setEstado(new Cancelado());
        System.out.println("\nEstado actual: Cancelado");
        inscripcion.cambiarEstado();


        System.out.println("\n=====EJERCICIO STRATEGY=====");
        ArrayList<Integer> notasJuan = new ArrayList<>(Arrays.asList(7, 8, 9));
        ArrayList<Integer> notasAna = new ArrayList<>(Arrays.asList(6, 7, 8, 10)); // La última nota es el examen extra

        EstrategiaAlumno alumnoJuan = new EstrategiaAlumno("Juan", new PromedioSimple());
        EstrategiaAlumno alumnoAna = new EstrategiaAlumno("Ana", new ExamenExtr());

        System.out.println("Nota final de " + alumnoJuan.getNombre() + " (Promedio Simple): " + alumnoJuan.calcularNotaFinal(notasJuan));

        alumnoJuan.setEstrategia(new PromedioPonderado());
        System.out.println("Nota final de " + alumnoJuan.getNombre() + " (Promedio Ponderado): " + alumnoJuan.calcularNotaFinal(notasJuan));

        System.out.println("Nota final de " + alumnoAna.getNombre() + " (Con Examen Extra): " + alumnoAna.calcularNotaFinal(notasAna));

        System.out.println("\n=====EJERCICIO TEMPLATE METHOD=====");
        ReporteAcademico reporteCurso = new ReporteCurso("Programación Avanzada", 8.5);
        ReporteAcademico reporteAlumno = new ReporteAlumno("Laura", "Programación Avanzada", 9.0);

        System.out.println("\nGenerando reporte del curso:");
        reporteCurso.generarReporte();

        System.out.println("\nGenerando reporte del alumno:");
        reporteAlumno.generarReporte();

        System.out.println("\n=====EJERCICIO VISITOR=====");
        Alumnito alumnoRegular = new AlumnitoRegular("Carlos", 5000);
        Alumnito alumnoBecado = new AlumnitoBecado("Ana", 5000, 50);

        Visitante aplicarBeca = new AplicarBeca();

        System.out.println("\nAplicando beneficios:");
        alumnoRegular.aceptar(aplicarBeca);
        System.out.println("-----------------------------");
        alumnoBecado.aceptar(aplicarBeca);
    }
}
