package exerciciosoftblue.herancapolimorfismo.exec2;

public class Veiculo {

    private boolean ligado;

    public void ligado() {
        ligado = true;
    }

    public void desligado() {
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }
}
