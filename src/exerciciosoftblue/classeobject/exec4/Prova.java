package exerciciosoftblue.classeobject.exec4;

public class Prova implements CalcularNota {

    private double notaParte1;
    private double notaParte2;

    public Prova(double notaParte1, double notaParte2){
        this.notaParte1 = notaParte1;
        this.notaParte2 = notaParte2;
    }

    @Override
    public double calcular() {
        return (this.notaParte1 + this.notaParte2) / 2;
    }

    @Override
    public String toString() {
        return "Prova{" +
                "notaParte1=" + notaParte1 +
                ", notaParte2=" + notaParte2 +
                '}';
    }
}
