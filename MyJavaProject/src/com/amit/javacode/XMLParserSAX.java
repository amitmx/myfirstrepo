package com.amit.javacode;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class XMLParserSAX {

    public static void main(String[] args) {
    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
    try {
        SAXParser saxParser = saxParserFactory.newSAXParser();
        //MyHandler handler = new MyHandler();
        RepositoryHandler handler = new RepositoryHandler();
        saxParser.parse(new File("/myspace/simple.xml"), handler);
        /*//Get Employees list
        List<Employee> empList = handler.getEmpList();
        //print employee information
        for(Employee emp : empList)
            System.out.println(emp);*/
      //Get Employees list
        //List<Patch> patchList = handler.getPatchList();

        
        
        //print employee information
        /*for(Patch pth : patchList)
            System.out.println(pth);*/
        StringBuffer message = new StringBuffer();
		message.append("Follow below steps: \n");
		
		for (Entry<Integer, Object> entry : handler.getParams().entrySet())
		{
		    //System.out.println(entry.getKey() + "/" + entry.getValue());
			message.append("Step :: " + entry.getKey());
			message.append('\n');
			message.append(entry.getValue().toString());
			message.append('\n');
		}
		//setFormattedMessage(message);
		System.out.println(message);
		// THis is my new changes.
		// Shall I check if I need to change thisfile.
        
    } catch (ParserConfigurationException | SAXException | IOException e) {
        e.printStackTrace();
    }
    }

}
