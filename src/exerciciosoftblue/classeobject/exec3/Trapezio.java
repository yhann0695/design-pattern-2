package exerciciosoftblue.classeobject.exec3;

public class Trapezio implements FiguraGeometrica{

    private double baseMaior;
    private double baseMenor;
    private double altura;


    public Trapezio(double baseMaior, double baseMenor, double altura){
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) / 2) * altura;
    }
}
