package exerciciosoftblue.herancapolimorfismo.exec2;

public class Motocicleta extends Veiculo {

    @Override
    public void ligado() {
        super.ligado();
        System.out.println("Motocicleta ligada");
    }

    @Override
    public void desligado() {
        super.desligado();
        System.out.println("Motocicleta desligada");
    }

    @Override
    public boolean isLigado() {
        return super.isLigado();
    }
}
