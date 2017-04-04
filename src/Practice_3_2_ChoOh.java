import java.io.*;

/**
 * @author cho.oh
 */
public class Practice_3_2_ChoOh {

    public static void main(String[] args) {
        String firstPersonName;
        String secondPersonName;
        int firstPersonAge;
        int secondPersonAge;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("一人目の名前を入力してください。");
            String line = reader.readLine();
            firstPersonName = line;
            System.out.println("年齢を入力してください。(整数)");
            line = reader.readLine();
            firstPersonAge = Integer.parseInt(line);
            negativeNumCheck(firstPersonAge);

            System.out.println("二人目の名前を入力してください。");
            line = reader.readLine();
            secondPersonName = line;
            System.out.println("年齢を入力してください。(整数)");
            line = reader.readLine();
            secondPersonAge = Integer.parseInt(line);
            negativeNumCheck(secondPersonAge);

            double averageAge = (firstPersonAge + secondPersonAge) / 2.0;
            System.out.println(firstPersonName + "さんと" + secondPersonName + "さんの平均年齢は " + averageAge + " 歳です");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }

    public static void negativeNumCheck(int inputAge) {
        if (inputAge < 0){
            System.out.println("正しい年齢を入力してください。");
            System.exit(0);
        }
    }
}
