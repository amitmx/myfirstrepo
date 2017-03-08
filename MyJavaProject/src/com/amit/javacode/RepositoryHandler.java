package com.amit.javacode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.xml.parsers.SAXParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
//

public class RepositoryHandler extends DefaultHandler
{
	//SAXParser parser = new SAXParser();

	//Stack path = new Stack();

	private Map<Integer, Object> params = new HashMap<Integer, Object>();

	boolean bInstruction = false;

	private Patch patches = null;
	//private Technote technotes = null;

	/**
	 * A list of patches to be installed
	 */
	private ArrayList<Patch> _patches = new ArrayList();

	/**
	 * A list of technotes required for this patch
	 */
	//private ArrayList<Technote> _technotes = new ArrayList();

	/**
	 * A list of manualSteps deployed on this tier
	 */
	private ArrayList _manualSteps = new ArrayList();

	public RepositoryHandler()
	{
		// Nothing to initialize here
	}

	/*public RepositoryHandler(String strXml) throws SAXException, IOException
	{
		//FileInputStream fis = new FileInputStream(strXml);		
	}*/

	public void startElement(String uri, String localName, String qName,Attributes attributes) throws SAXException
	{

		if (qName.equalsIgnoreCase("patch"))
		{
			patches = new Patch();
			patches.setSequence(Integer.parseInt(attributes.getValue("sequence")));
			patches.setInstallType(attributes.getValue("installType"));
			patches.setTier(attributes.getValue("tier"));
			patches.setProduct(attributes.getValue("product"));
			patches.setPatchName(attributes.getValue("patchName"));
			patches.setPatchVersion(Integer.parseInt(attributes
					.getValue("patchVersion")));
			patches.setPatchSubVersion(Integer.parseInt(attributes
					.getValue("patchSubVersion")));
			
		}
		/*else if (qName.equalsIgnoreCase("Technote"))
		{
			technotes = new Technote();
			technotes.setSequence(Integer.getInteger(attributes
					.getValue("sequence")));
			technotes.setInstallType(attributes.getValue("installType"));
			technotes.setTier(attributes.getValue("tier"));
			technotes.setProduct(attributes.getValue("product"));
			technotes.setURL(attributes.getValue("URL"));
		}*/
		/*
		 * else if(qName.equalsIgnoreCase("patch")) { }
		 */
		else if (qName.equalsIgnoreCase("Instruction"))
		{
			bInstruction = true;
		}

	}

	public void endElement(java.lang.String uri, java.lang.String localName,
			java.lang.String qName) throws SAXException
	{
		//if(patches !=null)
		//System.out.println("1 "+ patches.getMessage());
		
		if (qName.equalsIgnoreCase("patch"))
		{
			//System.out.println("1 " + patches.getMessage());
			//System.out.println(patches.getSequence() + " Number "+ patches.getMessage()) ;
			params.put(patches.getSequence(), patches);
		}
		/*else if (qName.equalsIgnoreCase("Technote"))
		{
			params.put(technotes.getSequence(), technotes);
		}*/
		
		//patches = null;
		//technotes = null;
	}

	public void characters(char ch[], int start, int length)
			throws SAXException
	{

		if (bInstruction)
		{
			// Add a code to get message for given patch or technote etc.
			if (patches != null)
			{
				patches.setMessage(new String(ch, start, length));
				bInstruction = false;
			}
			/*else if (technotes != null)
			{
				technotes.setMessage(new String(ch, start, length));
			}*/
		}
	}

	/**
	 * @return the patches
	 */
	public ArrayList<Patch> getPatches()
	{
		return _patches;
	}

	/**
	 * @return the params
	 */
	public Map<Integer, Object> getParams()
	{
		return params;
	}

}
