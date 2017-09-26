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
public class PickingOutNumbers {

    static int Answer;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("D:\\Project_folder\\UTC-Forum\\Algorithm\\src\\codeground\\sample_input.txt"));
        int N;
        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {
            Answer = 0;
            N = sc.nextInt();
            for(int i = 0; i < N; i++){
                Answer ^= sc.nextInt();
            }
            

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}
