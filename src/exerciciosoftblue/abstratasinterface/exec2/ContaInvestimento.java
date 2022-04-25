package exerciciosoftblue.abstratasinterface.exec2;

import java.math.BigDecimal;

public class ContaInvestimento extends ContaBancaria {

    protected ContaInvestimento(BigDecimal saldo) {
        super(saldo);
    }

    @Override
    public BigDecimal calcularSaldo() {
        return this.getSaldo().add(this.getSaldo().multiply(BigDecimal.valueOf(0.05)));
    }
}
