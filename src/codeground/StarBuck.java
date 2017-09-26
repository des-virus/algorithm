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
public class StarBuck {

    static String Answer;

    public static void main(String[] args) throws FileNotFoundException {
         Scanner sc = new Scanner(new FileInputStream("D:\\Project_folder\\UTC-Forum\\Algorithm\\src\\codeground\\sample_input.txt"));

        int N[];
        int n, m, K;
        int temp;

        int T = sc.nextInt();
        sc.nextLine();

        
        for (int test_case = 0; test_case < T; test_case++) {
            n = sc.nextInt();
            m = sc.nextInt();
            K = sc.nextInt();
           
            
            N = new int[30];
            for (int i = 0; i < n; i++) {
                temp = sc.nextInt();
                N[temp]++;
            }

            for (int i = 1; i <= m; i++) {
                K -= N[i] * sc.nextInt();
            }

            if (K >= 0) {
                Answer = "YES";
            } else {
                Answer = "NO";
            }
            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}
