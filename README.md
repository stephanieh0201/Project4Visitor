### Project4Visitor
Henry Remache

Stephanie Verlingo

COMP 473

#Problem Solved by the Visitor Pattern
The visitor pattern allows developers to separate certain operations from objects. This is useful when those objects
are of different types and can be grouped into a collection of objects.

For our project, we implemented the visitor pattern using a shopping cart example. A shopping car is filled with 
an apple, milk, and bread. We want to calculate the total price of the shopping cart, but each object in the cart is its 
own concerte class and has a different price.  So we've separated the method to check the price into a visitor. The visitor
can then visit each item to check the price.

This is useful as it also allows for addition of new functions without having to modify each separate ShoppingCartItem object.
ShoppingCartItems will probably not change much, however we could have new operations to add to these items. 
Since we have used the visitor pattern, we can add new visitors easily. We could create a new method class with new 
functionalities, such as checking the weight of each object, finding the brand of each item, or checking the sale status of an item. 

Overall the visior pattern allows us to create a flexible program that can be modified without changing existing 
classes, rather by adding new visitors. The only issue we would run into is if there is a new item added to the store, then 
we would have to modify all visitor implementations to visit the new item.
