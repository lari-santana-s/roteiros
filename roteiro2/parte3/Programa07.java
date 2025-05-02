/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte3;

/**
 *
 * @author tibar
 */
import java.util.Scanner;

public class Programa07{
    
    public static void main(String[] args){
        
        int nota = 0; // Variável para armazenar a nota inserida
        int somaNotas = 0;
        int quantidadeNotas = 0;
        Scanner entrada = new Scanner(System.in);
       
        while (true) { // O loop continua até o usuário digitar -1
            
            System.out.print("Informe uma nota (ou -1 para calcular a media): ");
            nota = entrada.nextInt(); // Lê a nota
            
            if (nota == -1) { // Se a flag for -1, encerra o loop
                System.out.println("Programa encerrado.");
                break;
            }
            
            somaNotas = somaNotas + nota;
            quantidadeNotas++;
            
            // Verifica se o aluno foi aprovado ou reprovado
            if (nota >= 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
        }
        if (quantidadeNotas > 0) {
            double media = (double) somaNotas / quantidadeNotas; // Cálculo correto da média
            System.out.printf("A média das notas inseridas é: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }
        entrada.close();  //sempre que abrir um scanner é preciso fechar 
    }
}

