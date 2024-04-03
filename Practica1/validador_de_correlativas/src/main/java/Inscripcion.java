import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    // Las inscripciones pueden involucrar varias asignaturas
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno, Materia ... materias) {
        this.alumno = alumno;
        this.materiasAInscribirse = new ArrayList<>();
        Collections.addAll(this.materiasAInscribirse,materias);
    }

    public boolean aprobada() {
        return (alumno.tieneCorrelativas(this.materiasAInscribirse));
    }
}