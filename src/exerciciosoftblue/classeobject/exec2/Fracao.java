package exerciciosoftblue.classeobject.exec2;

public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public String multiplicarFracao(Fracao fracao){
        int numerador = this.numerador * fracao.numerador;
        int denominador = this.denominador * fracao.denominador;
        return numerador  + "/" +  denominador ;

    }
}
