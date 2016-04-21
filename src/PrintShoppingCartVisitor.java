
public class PrintShoppingCartVisitor implements ShoppingCartVisitor{
	
	    public void visit(Apple apple) {      
	        System.out.println("Cart has an apple");
	    }

	    public void visit(Bread bread) {
	        System.out.println("Cart has bread");
	    }

	    public void visit(Milk milk) {
	        System.out.println("Cart has milk");
	    }
	 
	    public void visit(ShoppingCart shoppingCart) {      
	        System.out.println("This is a shopping cart");
	    }
	}


