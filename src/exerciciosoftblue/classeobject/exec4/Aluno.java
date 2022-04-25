package exerciciosoftblue.classeobject.exec4;

public class Aluno implements CalcularNota {

    private Prova notaProva1;
    private Prova notaProva2;

    public Aluno(Prova notaProva1, Prova notaProva2) {
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
    }

    @Override
    public double calcular() {
        return (notaProva1.calcular() + notaProva2.calcular()) / 2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "notaProva1=" + notaProva1 +
                ", notaProva2=" + notaProva2 +
                '}';
    }
}
