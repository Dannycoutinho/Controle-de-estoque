package Controles;

public class Cargos {
	
	public enum Cargo {
		
		Gerente (1),
		Sistema (2),
		Operadores1(3),
		Operadores2(4),
		Operadores3(5);
		
		private int CodCargo;
		
		Cargo (int codCargo){
			this.CodCargo = codCargo;
		}
		
		public int getcodCargo() {
			return this.CodCargo;
			
			
		}
			
			
	}

}
