package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo {
    private String description;
    private String name="Triangulo Escaleno";

    public TrianguloEscaleno(){
        this.description="Lados diferentes";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName(){
        return name;
    }
}
