/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

/**
 *
 * @author thuctap02
 */
public class CompareFBIDString {
    public static void main(String[] args) {
        String x1 = "1913854578852680_1913854632186008";
        String x2 = "1913854578852680_1913854662186004";
        System.out.println(x1.compareTo(x2));
    }
}
