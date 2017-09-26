/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.Response;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;



/**
 *
 * @author thuctap02
 */
public class FacebookDemonstation {
    public static void main(String[] args) throws InterruptedException, IOException, ExecutionException {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        AsyncHttpClient.BoundRequestBuilder r = asyncHttpClient.prepareGet("https://mpcc.mptelecom.com.vn/JspTestFBFunction/WebhookController");
        r.addQueryParam("hub.challenge", "abc_xyzsddddddddddd");
        Future<Response> f = r.execute();

        Response res = f.get();

        System.out.println(res.getStatusCode() + ": " + res.getStatusText());
        System.out.println(res.getResponseBody());
    }
}
