/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author thuctap02
 */
public class BacktrackObj {
    private Integer index;
    private String value = "";
    public String[] values = new String[100];

    public BacktrackObj() {
        for (int i = 0; i < values.length; i++) {
            values[i] = new String();
        }
    }
    
    
    
    public void printValue(int k){
        String abc = "";
        for (int i = 0; i < k; i++) {
            abc += values[i] + ", ";
        }
        
        System.out.println(abc);
    }
    
    public void appendValue(String new_val){
        this.value += new_val;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
}
