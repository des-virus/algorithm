/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thuctap02
 */
public class Backtracking {

    private List<BacktrackObj> items;
    private List<BacktrackObj> results;
    private BacktrackObj result;
    private int n, k;

   public void printResult(){
       result.printValue(k);
   }
    

    public void TRY(int index) {
        System.out.println(index);
        for(int j = index; j < n - k + index; j++){
            String new_val = items.get(j).getValue();
            
            result.values[index] = new_val;
//            result.setValue(old_val + ", " + new_val);
            if(index == k){
                printResult();
            } else {
                this.TRY(index + 1);
            }
        }
    }
    
    public void start_BT(){
        result = new  BacktrackObj();
        results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            BacktrackObj obj = new BacktrackObj();
            results.add(obj);
        }
       this.TRY(0);
    }
    
     public List<BacktrackObj> getItems() {
        return items;
    }

    public void setItems(List<BacktrackObj> items) {
        this.items = items;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
