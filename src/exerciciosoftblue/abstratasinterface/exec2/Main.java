package exerciciosoftblue.abstratasinterface.exec2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(new BigDecimal("2800.00"));
        System.out.println(contaCorrente.calcularSaldo());

        ContaInvestimento contaInvestimento = new ContaInvestimento(new BigDecimal("2800.00"));
        System.out.println(contaInvestimento.calcularSaldo());
    }
}
