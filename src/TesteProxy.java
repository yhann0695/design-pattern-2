import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.proxy.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteProxy {

    public static void main(String[] args) {

        Orcamento antigo = new Orcamento();
        antigo.adiconarItem(new ItemOrcamento( new BigDecimal("100")));

        Orcamento novo = new Orcamento();
        novo.adiconarItem(new ItemOrcamento( new BigDecimal("200")));
        novo.adiconarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }
}
