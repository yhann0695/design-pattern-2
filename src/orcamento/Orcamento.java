package orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{

    private BigDecimal valor;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
    }

    public void adiconarItem(Orcavel item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }
}
