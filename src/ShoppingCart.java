
public class ShoppingCart implements ShoppingCartItem{
    ShoppingCartItem[] items;
	
    public ShoppingCart(){
    	this.items=new ShoppingCartItem [] {new Apple(), new Bread(), new Milk()};
    
    }
    	public void accept(ShoppingCartVisitor visitor) {
    	for (ShoppingCartItem item : items){
    		item.accept(visitor);
    	}
        visitor.visit(this);
    }
}

