package uaslp.objetos.figuras;

public class Cuadrado implements Figura {
    private double lado;
    private double area;
    private String name="Cuadrado";

    public Cuadrado() {
    }

    public Cuadrado(double lado) {

        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        if(lado<=0){
            throw new LadoNoProvistoException();
        }
        area = lado * lado;
        return area;
    }

    @Override
    public String getName() {
        return name;
    }
}
