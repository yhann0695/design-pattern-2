package exerciciosoftblue.herancapolimorfismo.exec2;

public class Automovel extends Veiculo {

    @Override
    public void ligado() {
        super.ligado();
        System.out.println("Automovel ligado");
    }

    @Override
    public void desligado() {
        super.desligado();
        System.out.println("Automovel desligado");
    }

    @Override
    public boolean isLigado() {
        return super.isLigado();
    }
}
