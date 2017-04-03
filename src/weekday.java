import java.io.*;

/**
 * Created by youfar on 2017/4/3.
 */
//TODO: 数字以外の
public class weekday {
    public static void main(String[] args) {
        System.out.println("現在の時刻を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            int day = Integer.parseInt(line);
            switch (day){
                case 0:
                    System.out.println("日曜日");
                    break;
                case 1:
                    System.out.println("月曜日");
                    break;
                case 2:
                    System.out.println("火曜日");
                    break;
                case 3:
                    System.out.println("水曜日");
                    break;
                case 4:
                    System.out.println("木曜日");
                    break;
                case 5:
                    System.out.println("金曜日");
                    break;
                case 6:
                    System.out.println("土曜日");
                    break;
                default:
                    System.out.println("0~6の範囲で入力してください");
                    break;
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
