package TemplateMethod;

public class ReporteAlumno extends ReporteAcademico{
    private String nombreAlumno;
    private String curso;
    private double notaFinal;

    public ReporteAlumno(String nombreAlumno, String curso, double notaFinal) {
        this.nombreAlumno = nombreAlumno;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }

    @Override
    protected void contenido() {
        System.out.println("Alumno: " + nombreAlumno);
        System.out.println("Curso: " + curso);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Detalles del desempeño:");
        if (notaFinal >= 7) {
            System.out.println("- Estado: Aprobado");
        } else {
            System.out.println("- Estado: Desaprobado");
        }
        System.out.println("- Observaciones: Se recomienda repasar los temas con menor desempeño.");
    }
}
