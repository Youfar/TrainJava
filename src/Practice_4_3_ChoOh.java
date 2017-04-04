import java.io.*;

/**
 * @author cho.oh
 */
public class Practice_4_3_ChoOh {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("現在の時刻を入力してください。");
            String line = reader.readLine();
            int timeNow = Integer.parseInt(line);

            if (timeNow >= 0 && timeNow <= 11) {
                System.out.println("おはようございます");
            } else if (timeNow == 12) {
                System.out.println("お昼です");
            } else if (timeNow >= 13 && timeNow <= 18) {
                System.out.println("こんにちは");
            } else if (timeNow >= 19 && timeNow <= 23) {
                System.out.println("こんばんは");
            } else {
                System.out.println("時刻の範囲を越えています");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
