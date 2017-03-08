package com.amit.javacode;



public class Patch
{
	// <patch tier="all" product="all" patchName="ISF Rollup" patchVersion="5"
	// patchSubVersion="2" installType="prereq" sequence="2"/>

	private String tier;

	private String product;

	private String patchName;

	private int patchVersion;

	private int patchSubVersion;

	private String installType;

	private int sequence;

	private String message;

	/**
	 * @return the tier
	 */
	public String getTier()
	{
		return tier;
	}

	/**
	 * @param tier
	 *            the tier to set
	 */
	public void setTier(String tier)
	{
		this.tier = tier;
	}

	/**
	 * @return the product
	 */
	public String getProduct()
	{
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(String product)
	{
		this.product = product;
	}

	/**
	 * @return the patchName
	 */
	public String getPatchName()
	{
		return patchName;
	}

	/**
	 * @param patchName
	 *            the patchName to set
	 */
	public void setPatchName(String patchName)
	{
		this.patchName = patchName;
	}

	/**
	 * @return the patchVersion
	 */
	public int getPatchVersion()
	{
		return patchVersion;
	}

	/**
	 * @param patchVersion
	 *            the patchVersion to set
	 */
	public void setPatchVersion(int patchVersion)
	{
		this.patchVersion = patchVersion;
	}

	/**
	 * @return the patchSubVersion
	 */
	public int getPatchSubVersion()
	{
		return patchSubVersion;
	}

	/**
	 * @param patchSubVersion
	 *            the patchSubVersion to set
	 */
	public void setPatchSubVersion(int patchSubVersion)
	{
		this.patchSubVersion = patchSubVersion;
	}

	/**
	 * @return the installType
	 */
	public String getInstallType()
	{
		return installType;
	}

	/**
	 * @param installType
	 *            the installType to set
	 */
	public void setInstallType(String installType)
	{
		this.installType = installType;
	}

	/**
	 * @return the sequence
	 */
	public int getSequence()
	{
		return sequence;
	}

	/**
	 * @param sequence
	 *            the sequence to set
	 */
	public void setSequence(int sequence)
	{
		this.sequence = sequence;
	}

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return " Install Patch " + patchName + ", patchVersion=" + patchVersion
				+ ", patchSubVersion=" + patchSubVersion + " on tier=" + tier + ",having product=" + product + ", " +
						"dependencyType="
				+ installType + ", and follow below instrunctions:\n"
				+ message ;
	}

}

