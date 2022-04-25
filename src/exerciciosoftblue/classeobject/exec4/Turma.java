package exerciciosoftblue.classeobject.exec4;

public class Turma implements CalcularNota {

    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    public Turma(Aluno aluno1, Aluno aluno2, Aluno aluno3) {
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }

    @Override
    public double calcular() {
        return (aluno1.calcular() + aluno2.calcular() + aluno3.calcular()) / 3;
    }

    public String toString(){
        return "Aluno 1: " + aluno1.toString() + "\n"
                + "Aluno 2: " + aluno2.toString() + "\n"
                + "Aluno 3: " + aluno3.toString() + "\n"
                + "Media: " + calcular();
    }
}
