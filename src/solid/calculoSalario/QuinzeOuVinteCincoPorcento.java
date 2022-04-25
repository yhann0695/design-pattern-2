package solid.calculoSalario;

import solid.Funcionario;

public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo {

    @Override
    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0)
            return funcionario.getSalarioBase() * 0.75;

        return funcionario.getSalarioBase() * 0.85;
    }
}
