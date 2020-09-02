package Cadastros;

public enum Categoria {

	Bandana (1),
	Bijuteria (2),
	Bolsa (3),
	Necessarie (4),
	Carteira (5),
	Chapeu (6),
	Cinto (7),
	Elasticos (8),
	Faixa (9),
	Gorro (10),
	Lenco (11),
	Presilha (12),
	Tiara (13);
	  
	private int CodCategoria;
	
	Categoria (int codCategoria){
		this.CodCategoria = codCategoria;
	}
	
	public int getCodCategoria() {
		return this.CodCategoria;
	}
		
}

