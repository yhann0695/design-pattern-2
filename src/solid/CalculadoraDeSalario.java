package solid;

public class CalculadoraDeSalario {

    public double calcular(Funcionario funcionario) {
        if (isDesenvolvedor(funcionario))
            return Cargo.DESENVOLVEDOR.getRegra().calcular(funcionario);
        else if (isDbaOrTester(funcionario))
            return calcDbaOrTester(funcionario);
        else
            throw new RuntimeException("Função inválida");
    }

    private boolean isDesenvolvedor(Funcionario funcionario) {
        return Cargo.DESENVOLVEDOR.equals(funcionario.getCargo());
    }

    private boolean isDbaOrTester(Funcionario funcionario) {
        return Cargo.DBA.equals(funcionario.getCargo()) ||
                Cargo.TESTER.equals(funcionario.getCargo());
    }

    private double calcDbaOrTester(Funcionario funcionario) {
        if (Cargo.DBA.equals(funcionario.getCargo()))
            return Cargo.DBA.getRegra().calcular(funcionario);
        else
            return Cargo.TESTER.getRegra().calcular(funcionario);
    }
}
