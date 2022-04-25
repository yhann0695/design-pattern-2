import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = leitor.nextDouble();
        double N2 = leitor.nextDouble();
        double N3 = leitor.nextDouble();
        double N4 = leitor.nextDouble();
        double notaExame = 0;

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        String result = "";
        if(media > 7) {
            result = "Aluno aprovado.";
        } else if (media < 5) {
            result = "Aluno reprovado.";
        } else if (media >= 5 || media <= 6.9) {
            result = "Aluno em exame.";
            notaExame = leitor.nextDouble();
        }


        double mediaFinal = (media + notaExame) / 2;
        String resultMediaFinal = "";
        if (mediaFinal > 5)
            resultMediaFinal = "Aluno aprovado.";


        System.out.println("Media: " + df.format(media));
        System.out.println(result);

        if(result.equals("Aluno em exame."))
            System.out.println("Nota do exame: " + df.format(notaExame));

        System.out.println(resultMediaFinal);

        if(notaExame > 0)
            System.out.println("Media final: " + df.format(mediaFinal));

    }
}