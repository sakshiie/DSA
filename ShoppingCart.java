class ShoppingCart 
{
	private String itemName;
	private double itemPrice;
    

	ShoppingCart(String itemName, double itemPrice){
	
	this.itemName=itemName;
	this.itemPrice=itemPrice;
	}

	public String getItemName(){
		return itemName;
	}
	
    public void setItemName(String itemName){
		System.out.println("item added "+itemName);
	}
    public double getItemPrice(){
		return itemPrice;
	}
    void displayCart(){
	System.out.println("Item in Cart: "+itemName);
	System.out.println("Price of Item: "+itemPrice);
	
	}

}
