package com.amit.javacode;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class MyHandler extends DefaultHandler {

    //List to hold Employees object
    private List<Employee> empList = null;
    private List<Patch> patchList = null;
    private Employee emp = null;
    
    private Patch patch = null;


    //getter method for employee list
    public List<Employee> getEmpList() {
        return empList;
    }
    
    public List<Patch> getPatchList()
    {
    	return patchList;
    }

    boolean bAge = false;
    boolean bName = false;
    boolean bGender = false;
    boolean bRole = false;
    boolean bInstrucntion = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
    	if (qName.equalsIgnoreCase("Patch")) {
            //create a new Employee and put it in Map
            String tier = attributes.getValue("tier");
            //initialize Employee object and set id attribute
            String product = attributes.getValue("product");
            String patchName=attributes.getValue("patchName");
            String patchVersion = attributes.getValue("patchVersion");
            String patchSubVersion = attributes.getValue("patchSubVersion");
            String installType = attributes.getValue("installType");
            String sequence = attributes.getValue("sequence");
            patch = new Patch();
            patch.setTier(tier);
            patch.setProduct(product);
            patch.setPatchName(patchName);
            patch.setPatchVersion(Integer.parseInt(patchVersion));
            patch.setPatchSubVersion(Integer.parseInt(patchSubVersion));
            patch.setInstallType(installType);
            patch.setSequence(Integer.parseInt(sequence));
            if(patchList == null)
            {
            	patchList = new ArrayList<>();
            }
            
            
    	}
    	
    	if(qName.equalsIgnoreCase("Instruction"))
        {
        	bInstrucntion = true;
        }

        /*if (qName.equalsIgnoreCase("Employee")) {
            //create a new Employee and put it in Map
            String id = attributes.getValue("id");
            //initialize Employee object and set id attribute
            String rollNo = attributes.getValue("RollNo");
            emp = new Employee();
            emp.setId(Integer.parseInt(id));
            emp.setRollNo(Integer.parseInt(rollNo));
            //initialize list
            if (empList == null)
                empList = new ArrayList<>();
        } else if (qName.equalsIgnoreCase("name")) {
            //set boolean values for fields, will be used in setting Employee variables
            bName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            bAge = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            bGender = true;
        } else if (qName.equalsIgnoreCase("role")) {
            bRole = true;
        }*/
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        /*if (qName.equalsIgnoreCase("Employee")) {
            //add Employee object to list
            empList.add(emp);
        }*/
    	
    	if (qName.equalsIgnoreCase("patch"))
    	{
    		patchList.add(patch);
    	}
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException 
   {
    	if(bInstrucntion)
    	{
    		patch.setMessage(new String(ch, start, length));
    		bInstrucntion = false;
    	}

       /* if (bAge) {
            //age element, set Employee age
            emp.setAge(Integer.parseInt(new String(ch, start, length)));
            bAge = false;
        } else if (bName) {
            emp.setName(new String(ch, start, length));
            bName = false;
        } else if (bRole) {
            emp.setRole(new String(ch, start, length));
            bRole = false;
        } else if (bGender) {
            emp.setGender(new String(ch, start, length));
            bGender = false;
        }*/
    }
}
