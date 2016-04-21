
public class Apple implements ShoppingCartItem{
	double price = 1.00;
    public void accept(ShoppingCartVisitor visitor) {
 
        visitor.visit(this);
    }
}
