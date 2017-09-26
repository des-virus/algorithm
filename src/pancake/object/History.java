/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pancake.object;

import java.util.List;

/**
 *
 * @author thuctap02
 */
public class History {
    String change_at;
    String message;
    List<MessageTag> message_tag;

    public History() {
    }

    public List<MessageTag> getMessage_tag() {
        return message_tag;
    }

    public void setMessage_tag(List<MessageTag> message_tag) {
        this.message_tag = message_tag;
    }

    
    public String getChange_at() {
        return change_at;
    }

    public void setChange_at(String change_at) {
        this.change_at = change_at;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
