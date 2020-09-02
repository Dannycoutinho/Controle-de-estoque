package Cadastros;

public class Lojas {
	
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private String inscrisaoEstadual;
	private String endereco;
	private int codigoLojas;

	public Lojas() {

	}

	public Lojas (String nomeFantasia, String razaoSocial, String cnpj, String inscrisaoEstadual, String endereco, int codigoLojas){

	this.nomeFantasia = nomeFantasia;
	this.razaoSocial = razaoSocial;
	this.cnpj = cnpj;
	this.inscrisaoEstadual = inscrisaoEstadual;
	this.endereco = endereco;
	this.codigoLojas = codigoLojas;
	}
	
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscrisaoEstadual() {
		return inscrisaoEstadual;
	}

	public void setInscrisaoEstadual(String inscrisaoEstadual) {
		this.inscrisaoEstadual = inscrisaoEstadual;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCodigoLojas() {
		return codigoLojas;
	}

	public void setCodigoLojas(int codigoLojas) {
		this.codigoLojas = codigoLojas;
	}


}
