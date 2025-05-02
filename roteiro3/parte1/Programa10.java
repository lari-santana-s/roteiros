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

public class Programa10 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner (System.in);
        
        double sb, grat, imp, sr;
        
        System.out.println("Informe o Salário Base :");
        sb = entrada.nextDouble();
        grat = sb * 5/100;
        imp = sb * 7/100;
        sr = sb + grat - imp;

        System.out.println("Salário a receber : " + sr);

    }
}
