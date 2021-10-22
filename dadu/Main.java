package dadu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dadu dadu = new Dadu();
        String kode;

        while (true) {
            kode = in.nextLine().toLowerCase();
            if (kode.equals("q"))
                break;
            
            int[] total = dadu.parse(kode);
            for (int i = 1; i < total.length; i++) {
                if (i+1 == total.length) 
                    System.out.print(total[i]);
                else 
                    System.out.print(total[i] + "+"); 
            }
            System.out.print("=" + total[0]);
            System.out.println("");
        }
    }
}
