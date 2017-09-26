/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.restfb.Facebook;

/**
 *
 * @author thuctap02
 */
public class MessageResponse {
    @Facebook
    String recipient_id;
    
    @Facebook
    String message_id;
    
    @Override
    public String toString(){
        return "recipient_id: " + recipient_id + "; message_id: " + message_id;
    }

    public String getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(String recipient_id) {
        this.recipient_id = recipient_id;
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }
    
    
}
