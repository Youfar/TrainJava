/**
 * @author cho.oh
 */
public class Practice_9_8_ChoOh {

    public static void main(String[] args) {
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        System.out.println("並べ替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    data = swapNum(i, j, data);
                }
            }
        }
        System.out.println("並べ替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    private static int[] swapNum(int i, int j, int[] data) {
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;

        return data;
    }
}
