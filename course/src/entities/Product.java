package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) { // Construtor evita que seja instanciado o objeto sem valores
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { /*Sobrecarga é vc disponibilizar mais de uma vesão da mesma operação*/
	 	this.name = name;							
		this.price = price;
	}
	
	public double TotalValueInStock() {
		return quantity * price;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", TotalValueInStock());
	}
	
}
