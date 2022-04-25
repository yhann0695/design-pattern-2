package exerciciosoftblue.abstratasinterface.exec2;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{

    protected ContaCorrente(BigDecimal saldo) {
        super(saldo);
    }

    @Override
    public BigDecimal calcularSaldo() {
        return getSaldo().subtract(BigDecimal.valueOf(0.10));
    }
}
