import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.imposto.CalculadoraDeImpostos;
import orcamento.imposto.ICMS;
import orcamento.imposto.ISS;

import java.math.BigDecimal;

public class TesteDecorator {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.setValor(new BigDecimal("100"));
        orcamento.adiconarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
