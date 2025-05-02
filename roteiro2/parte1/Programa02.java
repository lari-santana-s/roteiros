/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte1;

/**
 *
 * @author tibar
 */
import java.util.Scanner; 

public class Programa02 {
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o seu nome");
        String nome = entrada.nextLine();
        System.out.println ("Informe sua idade");
        int idade = entrada.nextInt();
        
        System.out.println("Nome informado : " + nome);
        System.out.println("Idade informada: " + idade);
        entrada.close();

    }
}
