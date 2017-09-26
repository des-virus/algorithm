/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeground;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author thuctap02
 */
public class Taejun_wories {

    static String Answer;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("D:\\Project_folder\\UTC-Forum\\Algorithm\\src\\codeground\\sample_input.txt"));

       
        int A, B, D;
        int temp;

        int T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 0; test_case < T; test_case++) {
            A = sc.nextInt();
            B = sc.nextInt();
            D = sc.nextInt();

            D = D - B;
            temp = D / (A - B);
            if(D % (A - B) != 0){
                temp ++;
            }

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(temp + 1);
        }
    }
}
