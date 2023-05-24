public class HW_PrintAAAbbCCCdd {

    public static void main(String[] args) {

        char temp;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ch % 2 == 0) {
                temp = Character.toLowerCase(ch);
                System.out.println(temp + "" + temp);
            } else {
                System.out.println(ch + "" + ch + "" + ch);
            }
        }

    }
}