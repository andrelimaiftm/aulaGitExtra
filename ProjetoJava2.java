import java.util.Scanner;

public class ProjetoJava2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        int numero2 = entrada.nextInt();
        int total = numero1+numero2;
        System.out.println("Resultado: " + total);
        entrada.close();
    }

    
    
}
