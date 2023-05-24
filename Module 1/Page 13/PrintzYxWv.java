public class PrintzYxWv {

    public static void main(String[] args) {

        char ch = 'z';

        while (ch >= 'a') {
            if (ch % 2 == 0)
                System.out.print(ch + " ");
            else
                System.out.print(Character.toUpperCase(ch) + " ");
            ch--;
        }

    }
}
