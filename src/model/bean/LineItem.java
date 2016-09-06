package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public class LineItem {
    private  Product product;
    private int productCount;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public LineItem(Product product, int productCount) {
        this.product = product;
        this.productCount = productCount;
    }
}
