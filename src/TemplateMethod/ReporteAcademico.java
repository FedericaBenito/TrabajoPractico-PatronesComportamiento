package TemplateMethod;

public abstract class ReporteAcademico {
    public final void generarReporte() {
        encabezado();
        contenido();
        pie();
    }

    // Métodos comunes
    private void encabezado() {
        System.out.println("=== INSTITUTO TECNOLÓGICO ===");
        System.out.println("Reporte de Desempeño Académico");
        System.out.println("-----------------------------");
    }

    private void pie() {
        System.out.println("-----------------------------");
        System.out.println("Fin del reporte");
        System.out.println("© Instituto Tecnológico 2025");
    }

    // Metodo abstracto que será implementado por las subclases
    protected abstract void contenido();
}
