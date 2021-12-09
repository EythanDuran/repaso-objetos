package uaslp.objetos.figuras;

public class TrianguloEquilatero extends Triangulo {
    private String description;
    private String name="Triangulo Equilatero";

    public TrianguloEquilatero(){
        this.description="Lados iguales";
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String getName(){
        return name;
    }
}
