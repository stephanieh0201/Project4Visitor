
public class ShoppingCartDriver {
	public static void main(String[] args) {
        ShoppingCartItem cart = new ShoppingCart();
        cart.accept(new PrintShoppingCartVisitor());
        cart.accept(new PriceVisitor());
		
		
	}
}
