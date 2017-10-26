/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.mining;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thuctap02
 */
public class CaculateOmega {

    public static void main(String[] args) {
        float sum = 0, avg = 0, element_num;
        float sumsq = 0;

        DecimalFormat df = new DecimalFormat("#.####");

        String arr = "1.2,2.5666,3.47895,4,5,6";
        List<Float> list = new ArrayList<>();
        // Split string to arr
        for (String item : arr.split(",")) {
            list.add(Float.parseFloat(item));
        }

        element_num = list.size();

        // Caculate sum
        for (Float item : list) {
            sum += item;
            sumsq += item * item;
        }

        avg = sum / element_num;

        System.out.println(Math.sqrt(sumsq / element_num - avg * avg) );

    }
}
