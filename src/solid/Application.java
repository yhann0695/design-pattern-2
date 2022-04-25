package solid;

public class Application {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(Cargo.DESENVOLVEDOR, 3000.0);
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

        System.out.println(calculadora.calcular(funcionario));
        System.out.println(funcionario.calcularSalario());
    }
}
