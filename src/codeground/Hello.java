/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeground;

import java.util.Scanner;

/**
 *
 * @author thuctap02
 */
public class Hello {
    static int Answer;

	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
                String h, e, l, o;
                int hL, eL, lL, oL;
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
                sc.nextLine();
		for(int test_case = 0; test_case < T; test_case++) {
                    h = e = l = o =  sc.nextLine();
                    Answer = 0;
                    hL = h.length() - h.replace("h", "").length();
                    eL = h.length() - h.replace("e", "").length();
                    lL = (h.length() - h.replace("l", "").length())/2;
                    oL = h.length() - h.replace("o", "").length();
                    
                    Answer = hL;
                    Answer = eL < Answer ? eL : Answer;
                    Answer = lL < Answer ? lL : Answer;
                    Answer = oL < Answer ? oL : Answer;
                   
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
               
          
	}
}
