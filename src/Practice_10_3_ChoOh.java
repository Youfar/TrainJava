/**
 * @author cho.oh
 */
public class Practice_10_3_ChoOh {
    String productName;
    int productPrice;

    public Practice_10_3_ChoOh(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "[" + productName + "," + productPrice + "]";
    }
}
