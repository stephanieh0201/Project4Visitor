
public class Bread implements ShoppingCartItem{
	double price = 3.50;
	public void accept(ShoppingCartVisitor visitor) {
    	 
        visitor.visit(this);
    }
}
