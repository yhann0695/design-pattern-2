package exerciciosoftblue.classeobject.exec4;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(new Prova(4.0, 2.5), new Prova(1.0, 7.0));
        Aluno aluno2 = new Aluno(new Prova(6.5, 3.5), new Prova(0.0, 3.0));
        Aluno aluno3 = new Aluno(new Prova(5.0, 4.0), new Prova(6.0, 1.5));
        System.out.println(new Turma(aluno1, aluno2, aluno3).toString());
    }
}
