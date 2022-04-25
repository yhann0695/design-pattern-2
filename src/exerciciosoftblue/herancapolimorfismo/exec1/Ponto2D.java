package exerciciosoftblue.herancapolimorfismo.exec1;

public class Ponto2D {

    private double x;
    private double y;

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public String toString() {
        return "Ponto2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
