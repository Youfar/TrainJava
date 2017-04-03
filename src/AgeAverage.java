/**
 * Created by youfar on 2017/4/3.
 */


import java.io.*;

public class AgeAverage {
    public static void main(String[] args) {
        String NameFirst;
        String NameSecond;
        int AgeFirst = 0;
        int AgeSecond = 0;

        System.out.println("一人目の名前を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String line = reader.readLine();
            NameFirst = line;
            System.out.println("年齢を入力してください。");
            line = reader.readLine();
            AgeFirst = Integer.parseInt(line);

            System.out.println("二人目の名前を入力してください。");
            line = reader.readLine();
            NameSecond = line;
            System.out.println("年齢を入力してください。");
            line = reader.readLine();
            AgeSecond = Integer.parseInt(line);


        } catch (IOException e) {
            System.out.println(e);
        }

        double AgeAverage = (AgeFirst + AgeSecond) / 2;
        System.out.println("The average age of the people is " + AgeAverage + "歳です");
    }
}
