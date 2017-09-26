/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.google.appengine.repackaged.com.google.common.collect.HashBiMap;

/**
 *
 * @author thuctap02
 */
public class HashBiMapTest {
    public static void main(String[] args) {
        HashBiMap<String, String> myMap = HashBiMap.create();
        myMap.put("123", "MInh Phong 1");
        myMap.put("456", "Minh Phong 2");
        
        System.out.println(myMap.inverse().get("Minh Phong 2"));
        System.out.println(myMap.get("123"));
    }
}
