import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;
    //private List<Materia> materiasAAnotarse;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
        //this.materiasAAnotarse = new ArrayList<>();
    }

    public void agregarMateriasAprobadas(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas,materias);
    }

    /*public void agregarMateriasAInscribirse(Materia ... materias) {
        Collections.addAll(this.materiasAAnotarse,materias);
    }*/

    public boolean tieneCorrelativas(List<Materia> materias) {
        for(Materia materia : materias) {
            if(!materiasAprobadas.containsAll(materia.getMateriasCorrelativas())) {
                return false;
            }
        }
        return true;
    }
}