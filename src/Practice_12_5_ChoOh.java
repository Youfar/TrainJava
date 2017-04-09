/**
 * Created by youfar on 2017/4/8.
 */
public class Practice_12_5_ChoOh {
    public static void main(String[] args){
        System.out.println(new PlacedRectangle(12, 34, 123, 45));
    }

    static class PlacedRectangle {
        int x;
        int y;
        Rectangle rec = new Rectangle();

        PlacedRectangle() {
            rec.setSize(0, 0);
            setLocation(0, 0);
        }
        PlacedRectangle(int x, int y){
            rec.setSize(0, 0);
            setLocation(x, y);
        }
        PlacedRectangle(int x, int y, int width, int height) {
            rec.setSize(width, height);
            setLocation(x, y);
        }

        void setLocation(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "[ (" + x + ", " + y + ") [" + rec.width + ", " + rec.height + "]]";
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

        @Override public String toString() {
            return "[" + width + ", " + height + "]";
        }
    }
}
