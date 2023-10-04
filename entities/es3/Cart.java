package entities.es3;

public class Cart {
    private int cartCodeUser;
    private Product[] productsArr;
    private int totPrice;

    public int getCartCodeUser() {
        return cartCodeUser;
    }

    public void setCartCodeUser(int cartCodeUser) {
        this.cartCodeUser = cartCodeUser;
    }

    public Product[] getProductsArr() {
        return productsArr;
    }

    public void setProducts(Product[] productsArr) {
        this.productsArr = productsArr;
    }

    public int getTotPrice() {
        return totPrice;
    }

    public void setTotPrice(int totPrice) {
        this.totPrice = totPrice;
    }
}
