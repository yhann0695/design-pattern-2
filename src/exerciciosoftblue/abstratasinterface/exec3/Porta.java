package exerciciosoftblue.abstratasinterface.exec3;

public class Porta implements Cloneable {

    private boolean aberta;
    private double altura;
    private double largura;

    public Porta(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
        this.aberta = false;
    }

    public void abre(){
        this.aberta = true;
    }

    public void fecha(){
        this.aberta = false;
    }

    public boolean estaAberta(){
        return this.aberta;
    }

    @Override
    public Porta clone() {
        try {
            return (Porta) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + aberta +
                ", altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
