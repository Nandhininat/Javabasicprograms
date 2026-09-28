package basictask;

public class Task2 {

    public static void main(String[] args) {

        String[] s = {"mat","cat","bat","cat","cat","mat","mat","bat"};

        for (int i = 0; i < s.length; i++) {

            int count = 0;

            for (int j = 0; j <= i; j++) {
                if (s[i].equals(s[j])) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(s[i]);
            } else {
                System.out.println(s[i] + " " + count);
            }
        }
    }
}