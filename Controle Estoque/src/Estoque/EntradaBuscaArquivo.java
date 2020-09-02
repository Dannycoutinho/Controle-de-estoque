package Estoque;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EntradaBuscaArquivo {
	
public static void main(String[] args) {
		
		JFileChooser chooser = new JFileChooser();
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Selecione apenas Xml", "xml");
		
		chooser.setFileFilter(filter);
		
		int retorno = chooser.showOpenDialog(null);
		
		if (retorno == JFileChooser.APPROVE_OPTION) {
			JOptionPane.showConfirmDialog(null, "Selecionar Arquivo?");
			
			
		
		}
	

}
	
}
	
	
