/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.sound.sampled.AudioFormat;

/**
 *
 * @author thuctap02
 */
public class HMACSHA256 {

    public String encode(String key, String data) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);

        byte[] mac_data = sha256_HMAC.doFinal(data.getBytes(Charset.forName("UTF-8")));
        return new String(mac_data);
    }
//
//    public static void main(String[] args) throws NoSuchAlgorithmException, Exception {
////       HMACSHA256 mac = new HMACSHA256();
////        System.out.println(mac.encode(Constants.APP_SECRET, Constants.APP_TOKEN));
////        System.out.println(Constants.HMAC_SHA256_APP_TOKEN);
//
//        String secret = "6dc08dcba435a9011acb40a39a27c1d1";
//        String message = "EAADXELz9ZAcIBAIFZBSiQsYJfIcUyadHKV208h8OLZAIBAZAOLTLbdYdV2d9mXJD96JNxNNlKaI849TKWXvgAm2v2JKL4w1QyKUVRUqJ0IQyMkCCdTQ7D3ZCLweKhvDZCNBGvaJZAKZCwLHFaibOovw3I02ndkWXU7GCRmmubYZA68wCCNQgNPRfr378BZCjOOoTKeNiZBUPrt5HwZDZD";
//        String online_result = "2da7207852ccea1b5b52e52184238df18ce4294f6aeac4123002ba358adf8c8a";
//
//        try {
//
//            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
//            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
//            sha256_HMAC.init(secret_key);
//
//            String hash = Base64.encode(sha256_HMAC.doFinal(message.getBytes("UTF-8")));
//            System.out.println(hash);
//            System.out.println("- Is equals ? : " + hash.equals(online_result));
//
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//    }
    
    
    public static void main(String[] args) {
         String secret = "6dc08dcba435a9011acb40a39a27c1d1";
        String message = "EAADXELz9ZAcIBAIFZBSiQsYJfIcUyadHKV208h8OLZAIBAZAOLTLbdYdV2d9mXJD96JNxNNlKaI849TKWXvgAm2v2JKL4w1QyKUVRUqJ0IQyMkCCdTQ7D3ZCLweKhvDZCNBGvaJZAKZCwLHFaibOovw3I02ndkWXU7GCRmmubYZA68wCCNQgNPRfr378BZCjOOoTKeNiZBUPrt5HwZDZD";
        String online_result = "2da7207852ccea1b5b52e52184238df18ce4294f6aeac4123002ba358adf8c8a";
        System.out.println(hmacSha1(secret, message));
        System.out.println(hmacSha256(secret, message));
        System.out.println(online_result);
    }

    public static String hmacSha1(String KEY, String VALUE) {
        return hmacSha(KEY, VALUE, "HmacSHA1");
    }

    public static String hmacSha256(String KEY, String VALUE) {
        return hmacSha(KEY, VALUE, "HmacSHA256");
    }

    private static String hmacSha(String KEY, String VALUE, String SHA_TYPE) {
        try {
            SecretKeySpec signingKey = new SecretKeySpec(KEY.getBytes("UTF-8"), SHA_TYPE);
            Mac mac = Mac.getInstance(SHA_TYPE);
            mac.init(signingKey);
            byte[] rawHmac = mac.doFinal(VALUE.getBytes("UTF-8"));

            byte[] hexArray = {
                    (byte)'0', (byte)'1', (byte)'2', (byte)'3',
                    (byte)'4', (byte)'5', (byte)'6', (byte)'7',
                    (byte)'8', (byte)'9', (byte)'a', (byte)'b',
                    (byte)'c', (byte)'d', (byte)'e', (byte)'f'
            };
            byte[] hexChars = new byte[rawHmac.length * 2];
            for ( int j = 0; j < rawHmac.length; j++ ) {
                int v = rawHmac[j] & 0xFF;
                hexChars[j * 2] = hexArray[v >>> 4];
                hexChars[j * 2 + 1] = hexArray[v & 0x0F];
            }
            return new String(hexChars);
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
