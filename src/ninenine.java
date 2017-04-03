/**
 * Created by youfar on 2017/4/3.
 */

//TODO:commaの入力と改行
public class ninenine {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            //System.out.println(i + "*");
            for(int j = 1; j < 10; j++) {
                int k = i * j;
                System.out.println(i + "*" + j + "=" + k + ","  );
            }
        }
    }
}
