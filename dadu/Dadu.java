package dadu;

import java.util.Random;

public class Dadu {
    private final Random random;

    Dadu() {
        random = new Random();
    }

    int[] parse(String kode) {
        if (!kode.matches("[0-9]*d[0-9]+")) {
            int[] nol = {0};
            return nol;
        }
        
        String[] split = kode.split("d",2);
        if (split[0].equals("")) {
            split[0] = "1";
        }
        
        
        return d(Integer.parseInt(split[1]), Integer.parseInt(split[0]));
    }

    int[] d(int sides, int count) {
        int[] total = new int[count+1];
        for (int i = 0; i < count; i++) {
            total[i+1] = random.nextInt(sides) + 1;
            total[0] += total[i+1];
        }
        return total;
    }
}
