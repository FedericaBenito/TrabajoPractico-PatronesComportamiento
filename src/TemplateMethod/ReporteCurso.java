package TemplateMethod;

public class ReporteCurso extends ReporteAcademico{
    private String nombreCurso;
    private double promedioGeneral;

    public ReporteCurso(String nombreCurso, double promedioGeneral) {
        this.nombreCurso = nombreCurso;
        this.promedioGeneral = promedioGeneral;
    }

    @Override
    protected void contenido() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Promedio general del curso: " + promedioGeneral);
        System.out.println("Detalles del desempeño:");
        System.out.println("- Participación: Buena");
        System.out.println("- Asistencias: 95%");
        System.out.println("- Evaluaciones: Promedio basado en exámenes y trabajos prácticos");
    }
}
