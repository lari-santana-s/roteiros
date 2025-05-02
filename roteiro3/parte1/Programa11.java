/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte1;

/**
 *
 * @author tibar
 */
import java.util.Scanner;

public class Programa11 {
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in); 
       
        double sb, grat, imp, sr;
        
        System.out.println("Informe o Salário Base :");
        sb = entrada.nextDouble();
        grat = Programa11.calcGrat(sb);
        imp = Programa11.calcImp(sb);
        sr = sb + grat - imp;

        System.out.println("Salário a receber : " + sr);
    }

    public static double calcGrat(double sb)
    {
        return sb*5/100;
    }
    public static double calcImp (double sb){
            return sb * 7/100;
    }
    
}
