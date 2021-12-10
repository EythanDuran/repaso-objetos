package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {

    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones) {
        List<String> calificaciones = Arrays.asList(listaDeCalificaciones.split(","));
        List<Double> calificacion = new ArrayList<>();

        for (String califications : calificaciones) {
            calificacion.add(Double.parseDouble(califications));
        }

        return evaluadorDePromedios.evalua(calificacion);
    }
}
