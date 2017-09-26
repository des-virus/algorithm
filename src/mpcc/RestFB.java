/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.google.gson.Gson;
import com.restfb.Connection;
import com.restfb.DebugHeaderInfo;
import com.restfb.DefaultFacebookClient;
import com.restfb.DefaultJsonMapper;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.JsonMapper;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.WebRequestor;
import com.restfb.types.Conversation;
import com.restfb.types.GraphResponse;
import com.restfb.types.Message;
import com.restfb.types.Post;
import com.restfb.types.send.ButtonTemplatePayload;
import com.restfb.types.send.PostbackButton;
import com.restfb.types.send.SendResponse;
import com.restfb.types.send.TemplateAttachment;
import com.restfb.types.send.WebButton;
import com.restfb.types.webhook.WebhookObject;
import static java.lang.System.currentTimeMillis;
import java.util.Date;
import java.util.List;

/**
 *
 * @author thuctap02
 */
public class RestFB {

    FacebookClient facebookClient = new DefaultFacebookClient(Constants.PAGE_TOKEN, Version.LATEST);
    FacebookClient appClient = new DefaultFacebookClient(Constants.APP_TOKEN, Version.LATEST);
    Gson gson = new Gson();
    String today = new Date().toString();

    void post_bai_co_anh() {
        GraphResponse publishMessageResponse
                = facebookClient.publish("me/photos", GraphResponse.class,
                        Parameter.with("caption", "[" + today + "] " + "Post này chỉ để test :))"),
                        Parameter.with("url", Constants.IMAGE_URL));
        System.out.println("[POST--IMAGE] : " + publishMessageResponse.getPostId());
    }

    void post_bai_text() {
        GraphResponse publishMessageResponse
                = facebookClient.publish("me/feed", GraphResponse.class,
                        Parameter.with("message", "RestFB test"));
        System.out.println("[POST--TEXT] : " + publishMessageResponse.getId());
    }

    void comment_text(String parentID, String text) {
        GraphResponse publishMessageResponse
                = facebookClient.publish(parentID + "/comments", GraphResponse.class,
                        Parameter.with("message", "[" + today + "] " + text));
    }

    void comment_anh(String parentID, String text) {
        GraphResponse publishMessageResponse
                = facebookClient.publish(parentID + "/comments", GraphResponse.class,
                        Parameter.with("message", "[" + today + "] " + text),
                        Parameter.with("attachment_url", Constants.IMAGE_URL));
    }

    void tinnhan_text() {
        Message text_message = new Message();
        text_message.setMessage(today + " is good day");
        Receipent rep = new Receipent();
        MessageObject mes = new MessageObject();
//        rep.setId(Constants.RECIPIENT);
        rep.setId("1229217477201094");
       // rep.setId("1913767222197470");
        mes.setText(" Chúc bạn 1 ngày tốt lành ^^ \n[Tin nhắn này được gửi tự động]");

        SendResponse resp = facebookClient.publish("me/messages", SendResponse.class,
                Parameter.with("recipient", gson.toJson(rep)), // the id or phone recipient
                Parameter.with("message", gson.toJson(mes))); // one of the messages from above
        int a = 3;
    }

//    void tinnhan_anh() {
//        Receipent rep = new Receipent();
//        rep.setId(Constants.RECIPIENT);
//
//        MessageObject mes = new MessageObject();
//        //mes.setText(today + " is good day");
//        mes.getAttachment().setType("image");
//        mes.getAttachment().getPayload().setUrl(Constants.IMAGE_URL);
//
//        SendResponse resp = facebookClient.publish("me/messages", SendResponse.class,
//                Parameter.with("recipient", gson.toJson(rep)), // the id or phone recipient
//                Parameter.with("message", gson.toJson(mes))); // one of the messages from above
//    }
//
//    void tinnhan_file() {
//
//    }
//
//    void tinnhan_amthanh() {
//        Receipent rep = new Receipent();
//        rep.setId(Constants.RECIPIENT);
//
//        MessageObject mes = new MessageObject();
//        //mes.setText(today + " is good day");
//        mes.getAttachment().setType("audio");
//        mes.getAttachment().getPayload().setUrl(Constants.AUDIO_FILE);
//
//        SendResponse resp = facebookClient.publish("me/messages", SendResponse.class,
//                Parameter.with("recipient", gson.toJson(rep)), // the id or phone recipient
//                Parameter.with("message", gson.toJson(mes))); // one of the messages from above
//        int a = 3;
//    }
//
//    void tinnhan_video() {
//        Receipent rep = new Receipent();
//        rep.setId(Constants.RECIPIENT);
//
//        MessageObject mes = new MessageObject();
//        //mes.setText(today + " is good day");
//        mes.getAttachment().setType("video");
//        mes.getAttachment().getPayload().setUrl(Constants.VIDEO_FILE);
//
//        SendResponse resp = facebookClient.publish("me/messages", SendResponse.class,
//                Parameter.with("recipient", gson.toJson(rep)), // the id or phone recipient
//                Parameter.with("message", gson.toJson(mes))); // one of the messages from above
//        int a = 3;
//    }
//
//    void tinnhan_button() {
//        Receipent rep = new Receipent();
//        rep.setId(Constants.RECIPIENT);
//
//        Button b1 = new Button();
//        Button b2 = new Button();
//
//        b1.setType("web_url");
//        b2.setType("postback");
//        b1.setUrl(Constants.URL_BUTTON);
//        b2.setUrl(Constants.AUDIO_FILE);
//        b1.setTitle("Dai ca Phong muon nam 1");
//        b2.setTitle("Dai ca Phong muon nam 2");
//
//        MessageObject mes = new MessageObject();
//        mes.getAttachment().setType("template");
//        PayLoad pl = mes.getAttachment().getPayload();
//        pl.setText("Demo button :D :D");
//        pl.setTemplate_type("button");
//        pl.getButtons().add(b1);
//        pl.getButtons().add(b2);
//        SendResponse resp = facebookClient.publish("me/messages", SendResponse.class,
//                Parameter.with("recipient", gson.toJson(rep)), // the id or phone recipient
//                Parameter.with("message", gson.toJson(mes))); // one of the messages from above
//        int a = 3;
//    }

    void doc_inbox_page() {
        Connection<Conversation> conversationConn = facebookClient.fetchConnection("me/conversations", Conversation.class);
        for (List<Conversation> conversationList : conversationConn) {
            for (Conversation conversation : conversationList) {
                System.out.println("-----------");
                System.out.println(conversation.getId());
                System.out.println(conversation.getSenders().get(0).getName());
                System.out.println(conversation.getMessageCount());
                //System.out.println(conversation.get);
            }
        }
    }

    void doi_lay_ASID(String id) {
        facebookClient = new DefaultFacebookClient(Constants.APP_TOKEN, Version.LATEST);
        DataObject obj = facebookClient.fetchObject(id + "/ids_for_pages", DataObject.class,
                Parameter.with("appsecret_proof", Constants.HMAC_SHA256_APP_TOKEN));
      
        System.out.println(gson.toJson(obj));
    }

    void layLimit_Banghi() {
        Date twoDayAgo = new Date(currentTimeMillis() - 1000L * 60L * 60L * 24L * 20L);
        Connection<Conversation> conn = facebookClient.fetchConnection("me/conversations", Conversation.class,
                Parameter.with("since", twoDayAgo));
        for(List<Conversation> list : conn){
            for(Conversation conv : list){
                System.out.println(conv.getParticipants().get(0).getId());
                doi_lay_ASID(conv.getParticipants().get(0).getId());
            }
        }
    }
    
    void tinnhan_text_2(){
        facebookClient.publish("t_mid.$cAAbEYQhzyTJjLYl2flc_EQscCWUI/messages", null, 
                Parameter.with("message", "Xin chào "+ today));
    }

    public static void main(String[] args) {
        RestFB rest = new RestFB();
//        rest.post_bai_co_anh();
        // rest.comment_anh(Constants.POST_ID, "Thu comment anh");
        rest.tinnhan_text();
//        rest.tinnhan_button();
//        rest.doc_inbox_page();
 //       rest.doi_lay_ASID();
 //       rest.layLimit_Banghi();

//
//        String pushedJsonAsString = "";
//        JsonMapper mapper = new DefaultJsonMapper();
//        WebhookObject webhookObject
//                = mapper.toJavaObject(pushedJsonAsString, WebhookObject.class);
        // Message simpleTextMessage = new Message("Just a simple text");
        // Comment 1 post
//        GraphResponse publishMessageResponse
//                = facebookClient.publish("1863210517250420_1886294251608713/comments", GraphResponse.class,
//                        Parameter.with("message", "Dai ca Phong muon nam"),
//                        Parameter.with("attachment_url", Constants.IMAGE_URL));
//
//        System.out.println("Published message string: " + publishMessageResponse.getPostId());
    }
}
