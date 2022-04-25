package exerciciosoftblue.classeobject.exec3;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        System.out.println("Quadrado: "+ quadrado.calcularArea());

        Triangulo triangulo = new Triangulo(5, 10);
        System.out.println("Triangulo: "+ triangulo.calcularArea());

        Circunferencia circunferencia = new Circunferencia(5);
        System.out.println("Circunferencia: "+ circunferencia.calcularArea());

        Trapezio trapezio = new Trapezio(5, 10, 15);
        System.out.println("Trapezio: "+ trapezio.calcularArea());
    }
}
