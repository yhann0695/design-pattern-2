package exerciciosoftblue.herancapolimorfismo.exec2;

public class Main {

    public static void main(String[] args) {
        Automovel a = new Automovel();
        Onibus o = new Onibus();
        Motocicleta m = new Motocicleta();

        System.out.println("Automóvel --------------- ");
        a.ligado();
        System.out.println(a.isLigado());
        a.desligado();

        System.out.println("Onibus --------------- ");
        o.ligado();
        System.out.println(o.isLigado());
        o.desligado();

        System.out.println("Motocicleta --------------- ");
        m.ligado();
        System.out.println(m.isLigado());
        m.desligado();
        System.out.println(m.isLigado());


    }
}
