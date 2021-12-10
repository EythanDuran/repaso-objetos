package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String name) {
        switch (name) {
            case "Sala A":
            case "Sala B":
            case "Sala C":
            default:
                return null;
        }
    }
}
