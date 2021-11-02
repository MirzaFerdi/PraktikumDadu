package dadu;

import java.util.Random;

public class Dadu {
    private final Random random;

    Dadu() {
        random = new Random();
    }
    
    int parse(String kode) {
        String[] split = kode.split("[d|\\+]");
        String a;
        String b;
        String c;

        int hasil = 0;

        if (split.length <= 2) {
            if (kode.matches("(.*)d(.*)")) {
                if (split[0].equals("")) {
                    a = "1";
                    b = split[1];
                } else {
                    a = split[0];
                    b = split[1];
                }
                hasil = d(Integer.parseInt(b), Integer.parseInt(a));

            } else {
                hasil = 0;
            }
        } else if (kode.matches("(.*)d(.*)\\+(.*)")) {
            if (split[0].equals("")) {
                
                a = "1";
                b = split[1];
                c = split[2];
            } else {
                
                a = split[0];
                b = split[1];
                c = split[2];
            }

            hasil = e(Integer.parseInt(b), Integer.parseInt(a), Integer.parseInt(c));
        } else {
            hasil = 0;
        }

        return hasil;

    }

    int d(int sides, int count) {
        int total = 0;

        for (int i = 0; i < count; i++) {
            int angkaacak = random.nextInt(sides) + 1;
            total += angkaacak;
            System.out.print(angkaacak);
            if (i < count - 1) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = ");
        return total;
    }

    int e(int sides, int count, int tambahan) {
        int total = 0;
        int lemparan = 0;
        lemparan = count + tambahan;

        for (int i = 0; i < lemparan; i++) {
            int angkaacak = random.nextInt(sides) + 1;
            total += angkaacak;
            System.out.print(angkaacak);
            if (i < lemparan - 1) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = ");
        return total;
    }
}