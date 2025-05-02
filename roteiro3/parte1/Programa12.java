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

public class Programa12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 

        double sb, grat, imp, sr;

        System.out.println("Informe o Salário Base:");
        sb = entrada.nextDouble();

        grat = calcularPercentual(sb, 5);  // 5% de gratificação
        imp = calcularPercentual(sb, 7);  // 7% de imposto
        sr = sb + grat - imp;

        System.out.println("Salário a receber: " + sr);

        entrada.close();
    }

    public static double calcularPercentual(double valorBase, double percentual) {
        return valorBase * percentual / 100;
    }
}