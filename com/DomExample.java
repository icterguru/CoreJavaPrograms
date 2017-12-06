package com;

import java.io.File;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.org.apache.xpath.internal.XPathAPI;
/*
Created By Anurag Bhusari Jan 10 2008
 */

public class DomExample 
{
	public static void main(String st[]) 
	{

		try {

			File file = new File("c:\\Anurag Home\\order.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);

			Element order = doc.getDocumentElement();

			System.out.println("Order arrived has order num :"+ order.getAttribute("orderNo"));
			order.setAttribute("orderDate",new Date().toString());

			//System.out.println(getXmlString(doc));

			NodeList nodes = XPathAPI.selectNodeList(((Node) order),"./OrderLines/OrderLine");

			for(int i=0;i<nodes.getLength();i++)
			{
				Element line=(Element)nodes.item(i);

				if(line.getAttribute("lineNo").equalsIgnoreCase("3"))
				{
					line.setAttribute("item", "pen");
				}
				//System.out.println(line.getAttribute("item"));
			}

			System.out.println(getXmlString(doc));

			/*
				element.setAttribute("Date",new Date().toString());

				element.setAttribute("orderNo", "7587587- ANurag");

				System.out.println("Output Xml from consolidateFlag is " +getXmlString(doc));

				NodeList nodes = XPathAPI.selectNodeList(((Node) element),"./OrderLines/OrderLine");

				for(int i=0;i<nodes.getLength();i++)
				{
					Element line=(Element)nodes.item(i);

					line.appendChild(n);

					System.out.println("Quantity for my line "+line.getAttribute("serialNo")+" is : "+line.getAttribute("quantity"));
				}
			 */
		} 
		catch (Exception exVar) 
		{
			exVar.printStackTrace();
		} 
	}

	public boolean isNotEmpty(Object obj)
	{
		if (obj != null && obj.toString().length() > 0
				&& obj.toString().trim().length() > 0)
			return true;
		else
			return false;
	}

	public static String getXmlString(Document inputDocument) throws IllegalArgumentException, Exception
	{

		//Validate input document
		if (inputDocument == null)
		{
			throw new IllegalArgumentException("Input Document cannot be null in "
					+ "XmlUtils.getXMLString method");
		}

		StringWriter stringWriter = new StringWriter();
		StreamResult output = new StreamResult(stringWriter);
		DOMSource input = new DOMSource(inputDocument);

		// transform using default text transformer
		TransformerFactory xformFactory = TransformerFactory.newInstance();
		Transformer idTransform = xformFactory.newTransformer();
		idTransform.transform(input, output);

		//Return xml string
		return stringWriter.toString();
	}
}
