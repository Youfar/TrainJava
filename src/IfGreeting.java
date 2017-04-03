/**
 * Created by youfar on 2017/4/3.
 */

import java.io.*;

public class IfGreeting {
    public static void main(String[] args) {
        System.out.println("現在の時刻を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int timeNow = Integer.parseInt(line);
            if (timeNow > 0 && timeNow < 11) {
                System.out.println("おはようございます");
            } else if (timeNow == 12) {
                System.out.println("お昼です");
            } else if (timeNow > 13 && timeNow < 18) {
                System.out.println("こんにちは");
            } else if (timeNow > 19 && timeNow < 23) {
                System.out.println("こんばんは");
            } else {
                System.out.println("時刻の範囲を越えています");
            }


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
