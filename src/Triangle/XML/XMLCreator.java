/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.XML;

import Triangle.AbstractSyntaxTrees.Program;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Element;

/**
 *
 * @author zhong
 */
public class XMLCreator {
    private Program theAST;
    private XMLTree theXML;
    
    private DocumentBuilderFactory documentFactory;
    private DocumentBuilder documentBuilder;
    private Document document;
    private TransformerFactory transformerFactory;
    private Transformer transformer;
    private DOMSource domSource;
    private StreamResult streamResult;
    private String xmlFileName;
    
    private final String extension = ".xml";
    
    public XMLCreator(String path){
        try {
            documentFactory = DocumentBuilderFactory.newInstance();
            documentBuilder = documentFactory.newDocumentBuilder();
            document = documentBuilder.newDocument();
            
            Path pathFile = Paths.get(path);
            xmlFileName = pathFile.getFileName().toString();
            xmlFileName = this.getNameWithoutExtension(xmlFileName);
        } catch(ParserConfigurationException e){
            e.printStackTrace();
        }
    }
    
    public void create(Program ast){
        theAST = ast;
        XMLVisitor visitante = new XMLVisitor();
        theXML = (XMLTree) theAST.visit(visitante, null);
        this.document.appendChild(createStructure(this.document,theXML));
        this.createXML();
    }
    
    public String showTree(){
        return theXML.toString();
    }
    
    private Element createStructure(Document doc, XMLTree arbol){
        String[] tag = arbol.getCaption().split(" ");
        
        Element elem = doc.createElement(tag[0]);
        if (tag.length > 1){
            elem.setAttribute("value", tag[1]);
        }
        if (arbol.getStateChildren()){
            for (int i = 0; i<arbol.getChildren().length;i++){
                elem.appendChild(createStructure(doc,arbol.getChildren()[i]));
            }
        }
        return elem;
    }
    
    /**
     * Codigo inspirado de Yuan Kai, https://www.baeldung.com/java-filename-without-extension
     */
    private String getNameWithoutExtension(String file) {
        int dotIndex = xmlFileName.lastIndexOf('.');
        return (dotIndex == -1) ? xmlFileName : xmlFileName.substring(0, dotIndex);
    }
    
    /**
     * Crear archivo XML
     */
    private void createXML(){
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFileName+extension));

            transformer.transform(domSource,streamResult);
            
        }catch(TransformerException e){
            e.printStackTrace();
	}
        
    }
}
