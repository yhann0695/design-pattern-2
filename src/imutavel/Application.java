package imutavel;

public class Application {

    public static void main(String[] args) {
        Complex complexo = new Complex(1, 2);
        Complex multiply = complexo.multiply(new Complex(2, 3));
        System.out.println(complexo);
        System.out.println(multiply);
    }
}
