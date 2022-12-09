package Array;

import java.util.Scanner;

public class DesafioArray {
   
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);

        System.out.print("Quantas notas deseja registrar? ");
        int qtDeNotas = entry.nextInt();

        double[] notas = new double[qtDeNotas];

        for(int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entry.nextDouble();       
        }

        double media = 0;
        for(double nota: notas) {
            media += nota;
        }

        media = media / qtDeNotas;
        System.out.println("A média é " + media);

        entry.close();

    }

}

