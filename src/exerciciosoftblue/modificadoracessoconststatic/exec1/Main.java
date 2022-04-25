package exerciciosoftblue.modificadoracessoconststatic.exec1;

public class Main {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar();
        System.out.println(lampada.getEstado());
    }
}
