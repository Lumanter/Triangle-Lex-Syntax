/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author zhong
 */
public class XMLTree {
    
    private XMLTree parent;
    private XMLTree[] children;
    private String caption;
    
    public XMLTree(String caption){
        parent = null;
        children = null;
        this.caption = caption;
    }
    
    public void setChildren(XMLTree[] children){
        this.children = children;
        for (int i=0;i<children.length;i++){
            children[i].parent = this;
        }
    }

    @Override
    public String toString() {
        
        return "{" +  "Caption=" + caption + /*", parent=" + getParent() +*/", children=" + getChildrenMsg() + '}';
    }
    
    public String getParentMsg(){
        String msg = "";
        if (parent != null){
            msg = parent.caption;
        }
        return msg;
    }
    
    public String getChildrenMsg(){
        String message = "";
        if (children != null){
            for (int i = 0 ; i<children.length ; i++){
                if (children[i] != null){
                    message += children[i].toString();
                }

            }
        }
        return message;
    }
    
    public String getCaption(){
        return this.caption;
    }
    
    public boolean getStateChildren(){
        return (children == null) ? false : true;
    }
    
    public XMLTree[] getChildren(){
        return this.children;
    }
}
