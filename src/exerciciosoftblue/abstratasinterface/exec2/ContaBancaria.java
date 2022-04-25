package exerciciosoftblue.abstratasinterface.exec2;

import java.math.BigDecimal;

public abstract class ContaBancaria {

    private BigDecimal saldo;

    protected ContaBancaria(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
    }

    public void transferir(ContaBancaria conta, BigDecimal valor) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    public abstract BigDecimal calcularSaldo();
}
