public class PrintaBcD {

    public static void main(String[] args) {

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch % 2 == 0)
                System.out.println(Character.toUpperCase(ch));
            else
                System.out.println(ch);
        }

    }
}