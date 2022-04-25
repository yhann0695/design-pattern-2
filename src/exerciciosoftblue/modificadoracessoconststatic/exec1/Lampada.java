package exerciciosoftblue.modificadoracessoconststatic.exec1;

public class Lampada {

    private boolean estado;

    public Lampada(){
        estado = false;
    }

    public void ligar(){
        estado = true;
    }

    public void desligar(){
        estado = false;
    }

    public String getEstado(){
        return estado ? "Ligada" : "Desligada";
    }

}
