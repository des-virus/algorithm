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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="Test backtracking">
        List<BacktrackObj> items = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            BacktrackObj obj = new BacktrackObj();
            obj.setIndex(i);
            obj.setValue((char) (65 + i) + "");
            items.add(obj);
        }
        
        Backtracking backtrack = new Backtracking();
        backtrack.setItems(items);
        backtrack.setN(6);
        backtrack.setK(2);
        
        backtrack.start_BT();
//</editor-fold>
    }

}
