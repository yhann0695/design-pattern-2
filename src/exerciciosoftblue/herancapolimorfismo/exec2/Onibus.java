package exerciciosoftblue.herancapolimorfismo.exec2;

public class Onibus extends Veiculo {

    @Override
    public void ligado() {
        super.ligado();
        System.out.println("Onibus ligado");
    }

    @Override
    public void desligado() {
        super.desligado();
        System.out.println("Onibus desligado");
    }

    @Override
    public boolean isLigado() {
        return super.isLigado();
    }
}
