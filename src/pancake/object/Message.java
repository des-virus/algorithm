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
public class Message {
    List<Attachment> attachments;
    boolean can_comment;
    boolean can_hide;
    boolean can_like;
    boolean can_remove;
    boolean can_reply_privately;
    boolean comment_count;
    
    List<History> edit_history;
    Sender from;
    boolean has_phone;
    String id;
    String inserted_at;
    boolean is_hidden;
    boolean is_parent;
    boolean is_parent_hidden;
    boolean is_removed;
    int like_count;
    
    
    
}
