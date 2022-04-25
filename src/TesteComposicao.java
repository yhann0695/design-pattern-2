import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adiconarItem(new ItemOrcamento( new BigDecimal("100")));

        Orcamento novo = new Orcamento();
        novo.adiconarItem(new ItemOrcamento( new BigDecimal("200")));
        novo.adiconarItem(antigo);

        System.out.println(novo.getValor());
    }
}
