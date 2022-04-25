package exerciciosoftblue.abstratasinterface.exec1;

public class Main {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5);
        System.out.println(q1.calculaArea());

        Retangulo r1 = new Retangulo(5, 10);
        System.out.println(r1.calculaArea());


    }
}
