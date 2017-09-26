/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.restfb.Facebook;
import java.util.Objects;

/**
 *
 * @author thuctap02
 */
public class DataItemObject {

    @Facebook
    String id;
    
    @Facebook
    PageObject page;

    public DataItemObject() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PageObject getPage() {
        return page;
    }

    public void setPage(PageObject page) {
        this.page = page;
    }
    
    
    @Override
    public int hashCode() {
       return Objects.hash(id, page);
    }
    

}
