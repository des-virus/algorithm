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
public class AgentBooleanObject {
    String name;
    boolean status;

    public AgentBooleanObject() {
    }

    public AgentBooleanObject(String name, boolean status) {
        this.name = name;
        this.status = status;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
