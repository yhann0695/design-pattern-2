package exerciciosoftblue.abstratasinterface.exec1;

public class Quadrado implements AreaCalculavel {

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
