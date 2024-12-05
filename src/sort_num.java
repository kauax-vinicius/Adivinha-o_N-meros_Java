import java.util.Random;
import java.util.Scanner;

public class sort_num {
    public static void main(String[] args) throws Exception {
        //fazendo as importacoes
        Random random = new Random();
        Scanner ler = new Scanner(System.in);
        //criando as variaveis
        int resposta = 0;
        int numsort = random.nextInt(50) + 1;
        //prints do inicio do jogo
        System.out.println("Olá, seja bem-vindo ao jogo de adivinhação!");
        System.out.println("Sua missão é acertar o número sorteado entre 1 a 50.");
        //while para repetir a mensagem e a entrada ate o acerto
        while (resposta != numsort) {
            System.out.println("Digite um número:");
            resposta = ler.nextInt();
        //parte logica
            if (resposta == numsort) {
                System.out.println("Parabéns, você acertou o número sorteado!");
            } else if (resposta > numsort) {
                System.out.println("O número sorteado é menor.");
            } else if (resposta < numsort) {
                System.out.println("O número sorteado é maior.");
            }
        }

    }
}
