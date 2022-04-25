package exerciciosoftblue.stringdatasnumeros.exec1;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Feijão", 2.5, LocalDate.of(2020, 10, 4));
        Produto p2 = new Produto("Café", 1.0, LocalDate.of(2022, 1, 1));
        Produto p3 = new Produto("Beterraba", 0.9, LocalDate.of(2017, 11, 12));


        System.out.println(String.format("%d) %12s %09.2f %s", 1,  p1.getNome(), p1.getPeso(), Produto.formatarData(p1.getDataValidade())));
        System.out.println(String.format("%d) %12s %09.2f %s", 2,  p2.getNome(), p2.getPeso(), Produto.formatarData(p2.getDataValidade())));
        System.out.println(String.format("%d) %12s %09.2f %s", 3,  p3.getNome(), p3.getPeso(), Produto.formatarData(p3.getDataValidade())));
    }

}
