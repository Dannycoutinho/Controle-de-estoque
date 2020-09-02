package Estoque;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EntradaLeituraXml {

	public static void main(String[] args) {
	
		try {
			File arquivoXML = new File("C:\\Grupo Ornatus\\NF TRANSFERENCIA ORNNA\\NF 81832 ORNNA MATRIZ.xml");
			DocumentBuilderFactory documentBuuilderFactory = DocumentBuilderFactory.newDefaultInstance();
			DocumentBuilder documentBuilder = documentBuuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(arquivoXML);
			System.out.println("Raiz" + document.getDocumentElement().getNodeName());
			if (document.hasChildNodes()) {
				printNodeList(document.getChildNodes());
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Diretorio" + System.getProperty("user.dir"));
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
