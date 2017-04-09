import java.io.*;
import java.util.*;
import java.util.regex.Matcher;

/**
 * Created by youfar on 2017/4/8.
 */
public class Practice_11_9_ChoOh {



    /**
     * null以外全て[20, 20, 20, 10]が出力されるはずのmainメソッド
     * 以下のように出力されるのが正解
     * ----------------------------
     * 左上重なり: [20,20,20,10]
     * 左上重なり(逆): [20,20,20,10]
     * 右上重なり: [20,20,20,10]
     * 右上重なり(逆): [20,20,20,10]
     * 内包: [20,20,20,10]
     * 内包(逆): [20,20,20,10]
     * 半内包: [20,20,20,10]
     * 半内包(逆): [20,20,20,10]
     * null: null
     * null(逆): null
     * ----------------------------
     */
    public static void main(String[] args) {
        Test.run();
    }
}

class Rectangle {
    // この中を実装してください
    final int INITIAL_WIDTH = 10;
    final int INITIAL_WEIGHT = 20;
    int startX;
    int startY;
    int recWidth;
    int recHeight;

    Rectangle() {
        setLocation(0, 0);
        setSize(INITIAL_WEIGHT, INITIAL_WIDTH);
    }

    Rectangle(int width, int height) {
        setLocation(0, 0);
        setSize(width, height);
    }

    Rectangle(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    void setSize(int width, int height){
        recWidth = width;
        recHeight = height;
    }

    void setLocation(int x, int y){
        startX = x;
        startY = y;
    }

    Rectangle intersect(Rectangle obj){
        //第一个左上角
        int fin1x = startX;
        int fin1y = startY;
        //第一个矩形右下角
        int fin2x = startX+recWidth;
        int fin2y = startY+recHeight;
        //第二个矩形左上角
        int fin3x = obj.startX;
        int fin3y = obj.startY;
        //第二个矩形右下角
        int fin4x = obj.startX+obj.recWidth;
        int fin4y = obj.startY+obj.recHeight;

        if(fin3x >= fin2x || fin4x <= fin1x || fin4y <= fin1y || fin3y >= fin2y){
            return null;
        } else {
            obj.startX = Math.max(fin1x, fin3x);
            obj.startY = Math.max(fin1y, fin3y);
            int k1 = Math.min(fin2x, fin4x);
            int k2 = Math.min(fin2y, fin4y);
            obj.recWidth = k1 - obj.startX;
            obj.recHeight = k2 - obj.startY;
        }
        return obj;
    }

    @Override
    public String toString() {
        return "[" + startX + "," + startY + "," + recWidth + "," + recHeight + "]";
    }
}

/**
 * テスト用クラス
 * ※ いじらないでね！
 */
class Test {

    static void run() {
        System.out.println("null以外全て[20, 20, 20, 10]が正解\n");
        // 左上重なり
        Rectangle r1 = new Rectangle(0, 0, 40, 30);
        Rectangle r2 = new Rectangle(20, 20, 40, 30);
        System.out.println("左上重なり: " + r1.intersect(r2));
        System.out.println("左上重なり(逆): " + r2.intersect(r1));

        // 右上重なり
        Rectangle r3 = new Rectangle(0, 20, 40, 30);
        Rectangle r4 = new Rectangle(20, 0, 40, 30);
        System.out.println("右上重なり: " + r3.intersect(r4));
        System.out.println("右上重なり(逆): " + r4.intersect(r3));

        // 内包
        Rectangle r5 = new Rectangle(0, 0, 60, 50);
        Rectangle r6 = new Rectangle(20, 20, 20, 10);
        System.out.println("内包: " + r5.intersect(r6));
        System.out.println("内包(逆): " + r6.intersect(r5));

        // 半内包
        Rectangle r7 = new Rectangle(0, 0, 40, 50);
        Rectangle r8 = new Rectangle(20, 20, 40, 10);
        System.out.println("半内包: " + r7.intersect(r8));
        System.out.println("半内包(逆): " + r8.intersect(r7));

        // null
        Rectangle r9 = new Rectangle(0, 0, 40, 10);
        Rectangle r10 = new Rectangle(20, 20, 40, 10);
        System.out.println("null: " + r9.intersect(r10));
        System.out.println("null(逆): " + r10.intersect(r9));
    }
}
