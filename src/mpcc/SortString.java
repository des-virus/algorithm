/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thuctap02
 */
public class SortString {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("m_mid.$cAAbEYCxUYCdizFuo5VcmxZeyQVQg");
        arr.add("m_mid.$cAAbEYCxUYCdizFsS-VcmxXIKTWtQ");
        arr.add("m_mid.$cAAbEYCxUYCdizFncUFcmxSSEAW-5");
        arr.add("m_mid.$cAAbEYCxUYCdizFg0alcmxLsSa78I");
        arr.add("m_mid.$cAAbEYCxUYCdizFgzIlcmxLnhI9Rz");
        arr.add("m_mid.$cAAbEYCxUYCdivZLqN1cjE2iF8bqg");
        arr.add("m_mid.$cAAbEYCxUYCdivZLpSlcjE2fJllwF");
       
        Collections.sort(arr);
        
        for(String item : arr){
            System.out.println(item);
        }
    }
}
