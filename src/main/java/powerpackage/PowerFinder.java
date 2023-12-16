package powerpackage;

public class PowerFinder {
    public static int of(int base, int pow) {
        int result = 1;
        for (int i = 0; i<pow; i++) {
            result *= base;
        }
        return result;
    }
}
