import org.junit.Assert;
import org.junit.Test;

public class MateriasTest {
    @Test
    public void alumnoCumpleCorrelativas() {
        /* MATERIAS */
        Materia discreta = new Materia("Matematica Discreta");
        Materia algoritmos = new Materia("Algoritmos");

        Materia pdep = new Materia("Paradigmas de Programacion");
        pdep.agregarCorrelativas(discreta,algoritmos);

        /* ALUMNOS */

        Alumno alumno = new Alumno("Micaela");
        alumno.agregarMateriasAprobadas(algoritmos,discreta);
        //alumno.agregarMateriasAInscribirse(discreta,pdep);

        /* INSCRIPCION */
        Inscripcion inscripcion = new Inscripcion(alumno,pdep);

        /* */
        Assert.assertEquals(true,inscripcion.aprobada());
    }
    @Test
    public void alumnoNoCumpleCorrelativas() {
        /* MATERIAS */
        Materia discreta = new Materia("Matematica Discreta");
        Materia algoritmos = new Materia("Algoritmos");
        Materia arquitectura = new Materia("Arquitectura de Computadoras");
        Materia syo = new Materia("Sistemas y Organizaciones");

        Materia ads = new Materia("Analisis de Sistemas");
        ads.agregarCorrelativas(syo,algoritmos);

        Materia operativos = new Materia("Sistemas Operativos");
        operativos.agregarCorrelativas(arquitectura,algoritmos,discreta);
        Materia economia = new Materia("Economia");
        economia.agregarCorrelativas(ads);

        /* ALUMNOS */

        Alumno alumno = new Alumno("Gabriel");
        alumno.agregarMateriasAprobadas(algoritmos,arquitectura,syo,ads);
        //alumno.agregarMateriasAInscribirse(operativos,economia);

        /* INSCRIPCION */
        Inscripcion inscripcion = new Inscripcion(alumno,operativos,economia);

        /* */
        Assert.assertEquals(false,inscripcion.aprobada());
    }
}
