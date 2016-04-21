
public class Milk implements ShoppingCartItem{
	double price = 2.99;
	public void accept(ShoppingCartVisitor visitor) {
    	 
        visitor.visit(this);
    }
}
