
public interface ShoppingCartVisitor {
    void visit(Apple apple);
    void visit(Bread bread);
    void visit(Milk milk);
    void visit(ShoppingCart shoppingCart);
}
