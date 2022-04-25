package exerciciosoftblue.classeobject.exec1;

public class Relogio {

    private Ponteiro ponteiroHora;
    private Ponteiro ponteiroMinuto;
    private Ponteiro ponteiroSegundo;

    public String acertarRelogio(int hora, int minuto, int segundo) {
        this.ponteiroHora = new Ponteiro(hora);
        this.ponteiroMinuto = new Ponteiro(minuto);
        this.ponteiroSegundo = new Ponteiro(segundo);

        return horario();
    }

    private String horario() {
        return "Hora: " + retornarValorMutiplicadoPor5(this.ponteiroHora.getPosicao()) +
                " Minuto: " + retornarValorMutiplicadoPor5(this.ponteiroMinuto.getPosicao()) +
                " Segundo: " + retornarValorMutiplicadoPor5(this.ponteiroSegundo.getPosicao());
    }

    public int lerHora() {
        return retornarValorMutiplicadoPor5(this.ponteiroHora.getPosicao());
    }

    public int lerMinuto() {
        return retornarValorMutiplicadoPor5(this.ponteiroMinuto.getPosicao());
    }

    public int lerSegundo() {
        return retornarValorMutiplicadoPor5(this.ponteiroSegundo.getPosicao());
    }

    public int retornarValorMutiplicadoPor5(int valor){
        return valor * 5;
    }
}
