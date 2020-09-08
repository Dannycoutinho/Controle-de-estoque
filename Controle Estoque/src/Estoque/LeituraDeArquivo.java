package Estoque;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LeituraDeArquivo {

	public static void main(String[] args) {

		JFileChooser escolheArquivo = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter("Selecione apenas Xml", "xml");
		
		escolheArquivo.setFileFilter(filter);
		
		String arquivoEscolhido = "";
		String nomeArquivo = "";
		int retorno;
		
		retorno = escolheArquivo.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			try{
				arquivoEscolhido = escolheArquivo.getSelectedFile().getAbsolutePath();
				nomeArquivo = arquivoEscolhido;
				File nomeArquivo1 = new File(nomeArquivo);
				DocumentBuilderFactory documentBuuilderFactory = DocumentBuilderFactory.newDefaultInstance();
				DocumentBuilder documentBuilder = documentBuuilderFactory.newDocumentBuilder();
				Document document = documentBuilder.parse(nomeArquivo1);
				System.out.println("Raiz" + document.getDocumentElement().getNodeName());
				if (document.hasChildNodes()) {
					printNodeList(document.getChildNodes());
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Diretorio" + System.getProperty("user.dir"));
			}	
		}
	}	
		
	private static void printNodeList(NodeList nodeList) {
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node elemNode = nodeList.item(count);
			if (elemNode.getNodeType() == Node.ELEMENT_NODE) {

				System.out.println("\nNode Name =" + elemNode.getNodeName() + " [OPEN]");
				System.out.println("Node Content =" + elemNode.getTextContent());
				if (elemNode.hasAttributes()) {
					NamedNodeMap nodeMap = elemNode.getAttributes();
					for (int i = 0; i < nodeMap.getLength(); i++) {
						Node node = nodeMap.item(i);
						System.out.println("attr name : " + node.getNodeName());
						System.out.println("attr value : " + node.getNodeValue());
					}
				}
				if (elemNode.hasChildNodes()) {

					printNodeList(elemNode.getChildNodes());
				}
				System.out.println("Node Name =" + elemNode.getNodeName() + " [CLOSE]");
			}
		}
	}

}
