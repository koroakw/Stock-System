package obj;
public class ProductOvercharg {
	
	public String name;
	public double price;
	public double quantity;
	public double init;
	
	public ProductOvercharg(String name, double price, int quantity) { 
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public ProductOvercharg(String name, double price,double init) {
		this.name = name;
		this.price = price;
		this.init = init; 
		quantity = init;
		
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(double quantity){
		this.quantity =+ init;
		this.quantity += quantity; // o this é usado para referenciar o quantity do atributo da classe, ele soma o
									// quantity que veio como argumento com o quantity atributo da classe
	}

	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ " , $ " 
				+ String.format("%.2f, ", price)
													
				+ quantity
				+ " units, total: $ " 
				+ String.format("%.2f ", totalValueInStock()); 
																								// sair no toString()
	}
}
