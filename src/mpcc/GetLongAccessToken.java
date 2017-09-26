/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;

/**
 *
 * @author thuctap02
 */
public class GetLongAccessToken {

    public static void main(String[] args) {
        String old_token = "EAADXELz9ZAcIBABamWUsM2vBfwvyj5kB6NzOy4G9ah02v6jFCo3ZBTpV5Koo5dFWHpzsrv7rMi5zKrlnMfCaF5t2Og7u9AyNFEIoTFTQjpE3qy3RCt4Ri7eBPRZAq1kQWZA47FV8NO1VzOgj9Sv0OYI6XFlSXuP6PpeTlTjYsaP8bxJVzW2euQBWS8voP0UVM1b0hmlgCgZDZD";
        String new_token = "";
      final String FB_APP_ID = "236466890171842";
      final String FB_APP_SECRET = "6dc08dcba435a9011acb40a39a27c1d1";

    new_token = new DefaultFacebookClient()
            .obtainExtendedAccessToken(FB_APP_ID, FB_APP_SECRET, old_token).getAccessToken();
        System.out.println(new_token);
    }
}
