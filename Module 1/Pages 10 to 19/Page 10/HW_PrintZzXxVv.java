public class HW_PrintZzXxVv {

    public static void main(String[] args) {

        for (char ch = 'Z'; ch >= 'A'; ch -= 2) {
            System.out.print(ch + " ");
            System.out.print(Character.toLowerCase(ch) + " ");
        }

    }
}