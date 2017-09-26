/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.restfb.Facebook;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thuctap02
 */
public class DataObject {
    
    @Facebook
    List<DataItemObject> data;

    public DataObject() {
    }

    public List<DataItemObject> getData() {
        return data;
    }

    public void setData(List<DataItemObject> data) {
        this.data = data;
    }
    
    
    
}
