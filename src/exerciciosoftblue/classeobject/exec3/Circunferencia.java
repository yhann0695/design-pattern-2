package exerciciosoftblue.classeobject.exec3;

public class Circunferencia implements FiguraGeometrica{


    private double raio;

    public Circunferencia(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return raio * raio * Math.PI;
    }
}
