/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author thuctap02
 */
public class HashMapToGson {

    public static void main(String[] args) {
        Gson gson = new Gson();

        Map<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("1111", Boolean.TRUE);
        map.put("2222", Boolean.FALSE);
        map.put("3333", Boolean.TRUE);
        map.put("4444", Boolean.FALSE);
        map.put("5555", Boolean.FALSE);

        int map_size = map.values().toArray().length;
        String[] key_list = new String[map_size];
        Boolean[] value_list = new Boolean[map_size];
        
        map.keySet().toArray(key_list);
        map.values().toArray(value_list);
        
        List<AgentBooleanObject> list = new ArrayList<>();
        
        for(int i = 0 ; i < map_size; i++){
            list.add(new AgentBooleanObject(key_list[i], value_list[i]));
        }
      
        System.out.println(gson.toJson(map));
        System.out.println(gson.toJson(list));

    }
}
