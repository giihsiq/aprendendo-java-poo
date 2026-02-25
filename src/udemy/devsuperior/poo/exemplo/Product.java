package udemy.devsuperior.poo.exemplo;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/* Sobrecarga = Criar mais de um método para a mesma classe
	*  -> adicionando ou sem incluir atributos da classe
	*/
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ "
		+ String.format("%.2f", price) 
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
		
	}
	
}
