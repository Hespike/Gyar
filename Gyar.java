import java.util.Arrays;

public class Gyar {

    static int[] ures10ElemuTomb() {
        return new int[10];
    }

    static int[] uresXElemuTomb(int x) {
        return new int[x];
    }

    static int[] novekvoXElemuTomb(int x) {
        int[] tomb = new int[x];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = i;
        }

        return tomb;
    }

    static String[] jatekmaciXElemuTomb(int x) {
        String[] tomb = new String[x];
        Arrays.fill(tomb, "jatekmaci");
        return tomb;
    }

    static String[] vegyesjatekXElemuTomb(String paros, String paratlan, int darab) {
        String[] tomb = new String[darab];
        for (int i = 0; i < tomb.length; i++) {
            if (i % 2 == 0) {
                tomb[i] = paros;
            } else {
                tomb[i] = paratlan;
            }
        }

        return tomb;
    }

}
