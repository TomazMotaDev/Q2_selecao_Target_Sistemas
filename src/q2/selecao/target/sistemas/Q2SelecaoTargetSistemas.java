package q2.selecao.target.sistemas;

import java.util.Scanner;

public class Q2SelecaoTargetSistemas {

    public static void main(String[] args) {
        //variável para leitura no console
        Scanner in = new Scanner(System.in);
        
        //instaciando um vetor para o fibonacci até antes de 1000. O usuário poderá inserir até este número.
        int[] fibonacci = new int[17]; //Até 17 por ser o Fibonacci antes de 1000
        //número inserido pelo usuario
        int num;
        boolean verificacao = false;
        
        //definindo o valor do primeiro e segundo número da sequência de Fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        //Loop para preencher o vetor da sequência de Fibonacci
        for (int i = 2; i < 17; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        
        //Pedido para que o usuário insira um número até 1000
        System.out.println("Insira um número até 1000 que te direi se faz parte da sequência de Fibonacci:");
        num = in.nextInt();
        
        //Verificação para que o usuário escolha entre 0 e 1000
        while (num < 0 || num > 1000) {
            System.out.println("Favor escolher um número de 0 até 1000:");
            num = in.nextInt();
        }
        
        //Varredura no vetor e verficando se o número escolhido faz parte da sequência.
        for (int i = 0; i < 17; i++) {
            if (num == fibonacci[i]){
                verificacao = true;
            }
        }
        
        //Apresentando na tela o resultado
        if (verificacao == true){
            System.out.println("O número "+num+" faz parte da sequência de Fibonacci.");
        }else {
            System.out.println("O número "+num+" não faz parte da sequência de Fibonacci.");
        }
    }
    
}
