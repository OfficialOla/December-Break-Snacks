package Base64Encoder;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BasicEncoderDecoder {
    public static void main(String[] args) {
//        Java Base64 Basic Encoding and Decoding
        Base64.Encoder encoder = Base64.getEncoder();
        String str = encoder.encodeToString("Semicolon".getBytes());
        System.out.println("Encoded string::" +str);

        Base64.Decoder decoder = Base64.getDecoder();
        String dstr = new String(decoder.decode(str));
        System.out.println("Decoded string::" +dstr);

//Java Base64 URL Encoding and Decoding
        Base64.Encoder urlencoder = Base64.getUrlEncoder();
        String urlstr = urlencoder.encodeToString("www.semicolon.com/africa".getBytes());
        System.out.println("Encoded url::" +urlstr);

        Base64.Decoder urldecoder = Base64.getUrlDecoder();
        String urlDecoder = new String(urldecoder.decode(urlstr));
        System.out.println("Decoded URL::" +urlDecoder);

    }
}
