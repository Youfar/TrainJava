/**
 * Created by youfar on 2017/4/8.
 */

public class Practice_12_4_ChoOh {

    public static void main(String[] args){
        System.out.println(new PlacedRectangle(12, 34, 123, 45));
    }

    static class PlacedRectangle extends Rectangle {
        int x;
        int y;

        PlacedRectangle() {
            setLocation(0, 0);
        }
        PlacedRectangle(int x, int y){
            setLocation(x, y);
        }
        PlacedRectangle(int x, int y, int width, int height) {
            super(width, height);
            setLocation(x, y);
        }
        void setLocation(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "[ (" + x + ", " + y + ") [" + width + ", " + height + "]]";
        }
    }

    static class Rectangle {
        int width;
        int height;

        Rectangle() {
            setSize(0, 0);
        }

        Rectangle(int width, int height) {
            setSize(width, height);
        }

        final void setSize(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString() {
            return "[" + width + ", " + height + "]";
        }
    }
}
