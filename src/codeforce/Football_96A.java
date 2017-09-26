package codeforce;

import java.util.Scanner;

public class Football_96A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
                if (count >= 7) {
                    break;
                }
            } else {
                count = 1;
            }

        }

        System.out.println(count >= 7 ? "YES" : "NO");
    }
}
