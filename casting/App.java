package casting;

public class App {
    public static void main(String[] args) {
        /* Casting implícito */
        char a = 'a';
        int b = 'b';
        float c = 100;
        System.out.printf("%c\n%d\n%.1f\n", a, b, c);

        /* Casting explícito */
        int d = (int) 5.987;
        float e = (float) 5.8;
        int f = (char) (a + 5);
        char g = (char) 110.5;
        System.out.printf("%d\n%.1f\n%d\n%c\n", d, e, f, g);
    }   
}
