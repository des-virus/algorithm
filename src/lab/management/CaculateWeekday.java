/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.management;

import java.util.Scanner;

/**
 *
 * @author thuctap02
 */
public class CaculateWeekday {

    public static void main(String[] args) {
        int wday;
        int day, month, year;
        Scanner sc = new Scanner(System.in);
        
        day = sc.nextInt(); 
        month = sc.nextInt();
        year = sc.nextInt();

        
        if (month < 3) {
            month = month + 12;
            year = year - 1;
        }
        
        wday = (day + 2 * month + (3*(month + 1)) / 5 + year + (year / 4)) % 7;
        System.out.println("wday = " + wday);
    }
}
