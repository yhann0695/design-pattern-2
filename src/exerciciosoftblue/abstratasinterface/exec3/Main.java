package exerciciosoftblue.abstratasinterface.exec3;

public class Main {

    public static void main(String[] args) {
        // Cria uma porta e a abre
        Porta p1 = new Porta(2.1, 0.9);
        p1.abre();

        // Cria uma cópia de p1. O método clone() retorna um Object, portanto o casting
        // é necessário
        Porta p2 = (Porta) p1.clone();
    }
}
