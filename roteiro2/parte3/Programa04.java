/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte3;

/**
 *
 * @author tibar
 */
// usando if else 
import java.util.Scanner;

public class Programa04 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
                int cont = 0;
        while (cont < 5) {
            System.out.println("Informe uma nota ");
            int nota = entrada.nextInt();
            
            if (nota >= 7) {
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado");
            }

            cont++;
        }
    }
}
    
    

