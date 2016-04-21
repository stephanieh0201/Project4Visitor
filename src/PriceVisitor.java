
public class PriceVisitor implements ShoppingCartVisitor{
	double totalPrice=0;    
	public void visit(Apple apple) {      
	        System.out.println("Apple costs $1.00");
	        totalPrice+=apple.price;
	    }

	    public void visit(Bread bread) {
	        System.out.println("Bread costs $3.50");
	        totalPrice+=bread.price;
	    }

	    public void visit(Milk milk) {
	        System.out.println("Milk costs $2.99");
	        totalPrice+=milk.price;
	    }
	 
	    public void visit(ShoppingCart shoppingCart) {      
	        System.out.println("Calculating total price: " + this.totalPrice);
	    }
	}


