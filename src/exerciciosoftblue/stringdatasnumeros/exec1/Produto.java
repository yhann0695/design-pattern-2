package exerciciosoftblue.stringdatasnumeros.exec1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Produto {

    private String nome;
    private double peso;
    private LocalDate dataValidade;

    public Produto(String nome, double peso, LocalDate dataValidade) {
        this.nome = nome;
        this.peso = peso;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public static String formatarData(LocalDate date ){
        Locale local = new Locale("pt","BR");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", local);
        return date.format(formatter);
    }

    public String formatarPeso2(double peso){
        String pesoFormatado = String.format("%.2f", peso);
        if(pesoFormatado.length() < 9){
            pesoFormatado = String.format("%09.2f", peso);
        }
        return pesoFormatado;
    }

    @Override
    public String toString() {
        return " NOME: '" + nome + '\'' +
                " PESO: " + formatarPeso2(peso) +
                " DATA: " + formatarData(dataValidade);
    }
}
