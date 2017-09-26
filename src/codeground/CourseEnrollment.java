/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeground;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author thuctap02
 */
public class CourseEnrollment {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("D:\\Project_folder\\UTC-Forum\\Algorithm\\src\\codeground\\sample_input.txt"));

       
        int N, M;
        ArrayList<Integer> arr = new ArrayList<>();
        
        int T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 0; test_case < T; test_case++) {
           N = sc.nextInt();
           M = sc.nextInt();
           
           for(int i = 0; i < N; i++){
               arr.add(sc.nextInt());
           }
           
           Collections.sort(arr);
//           for(int i = N - 1; i > 0; i--){
//               if()
//           }

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(1);
        }
    }
}
