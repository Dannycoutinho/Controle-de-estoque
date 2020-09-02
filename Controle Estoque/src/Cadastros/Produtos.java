package Cadastros;

public class Produtos {
	
	private String nomeProduto;
	private double preco;
	private Categoria categoria;
	private int codigoProduto;

	public Produtos (){
	}

	public Produtos (String nomeProduto, double preco, Categoria categoria, int codigoProduto){

	this.nomeProduto = nomeProduto;
	this.preco = preco;
	this.categoria = categoria;
	this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto(){
	return nomeProduto;
	}

	public void setNomeProduto (String nomeProduto){
	this.nomeProduto = nomeProduto;
	}

	public double getPreco(){
	return preco;
	}

	public void setPreco (double preco){
	this.preco = preco;
	}

	public Categoria getCategoria(){
	return categoria;
	}

	public void setCategoria (Categoria categoria){
	this.categoria = categoria;
	}

	public int getCodigoProduto(){
	return codigoProduto;
	}

	public void setCodigoProduto (int codigoProduto){
	this.codigoProduto = codigoProduto;
	}


	
	

}
