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
public class MessageObject {
    String text;
    //Attachment attachment;

    public MessageObject() {
       // attachment = new Attachment();
    }
    
    

//    public Attachment getAttachment() {
//        return attachment;
//    }
//
//    public void setAttachment(Attachment attachment) {
//        this.attachment = attachment;
//    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
