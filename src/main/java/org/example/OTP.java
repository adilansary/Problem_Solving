package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Q19. Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"
public class OTP {
        public static void main(String[] args) {
            String sms = "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";

            String otp = extractOTP(sms);

            System.out.println("Extracted OTP: " + otp);
        }

        public static String extractOTP(String sms) {
            String otp = "";

            Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
            Matcher matcher = pattern.matcher(sms);

            if (matcher.find()) {
                otp = matcher.group();
            }

            return otp;
        }
}
