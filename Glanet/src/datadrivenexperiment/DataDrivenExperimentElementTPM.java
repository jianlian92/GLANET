/**
 * 
 */
package datadrivenexperiment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import enumtypes.DataDrivenExperimentElementNameType;
import enumtypes.DataDrivenExperimentElementType;
import enumtypes.DataDrivenExperimentTPMType;

/**
 * @author Bur�ak Otlu
 * @date Oct 11, 2015
 * @project Glanet 
 *
 */
public class DataDrivenExperimentElementTPM {
	
	//For Element
	DataDrivenExperimentElementNameType elementNameType;
	DataDrivenExperimentElementType elementType;
	Float typeOneError;
	Float typeTwoError;
	Float power;
	
	//For TPM
	DataDrivenExperimentTPMType tpmType;
	Float tpmValue;
	int numberofEnrichment;
	
	
	
	public int getNumberofEnrichment() {
		return numberofEnrichment;
	}
	public void setNumberofEnrichment(int numberofEnrichment) {
		this.numberofEnrichment = numberofEnrichment;
	}

	
	public DataDrivenExperimentElementNameType getElementNameType() {
		return elementNameType;
	}
	public void setElementNameType(DataDrivenExperimentElementNameType elementNameType) {
		this.elementNameType = elementNameType;
	}
	
	public DataDrivenExperimentElementType getElementType() {
		return elementType;
	}
	public void setElementType(DataDrivenExperimentElementType elementType) {
		this.elementType = elementType;
	}
	public Float getTypeOneError() {
		return typeOneError;
	}
	public void setTypeOneError(Float typeOneError) {
		this.typeOneError = typeOneError;
	}
	public Float getTypeTwoError() {
		return typeTwoError;
	}
	public void setTypeTwoError(Float typeTwoError) {
		this.typeTwoError = typeTwoError;
	}
	public Float getPower() {
		return power;
	}
	public void setPower(Float power) {
		this.power = power;
	}
	

	
	public DataDrivenExperimentTPMType getTpmType() {
		return tpmType;
	}
	public void setTpmType(DataDrivenExperimentTPMType tpmType) {
		this.tpmType = tpmType;
	}
	public Float getTpmValue() {
		return tpmValue;
	}
	public void setTpmValue(Float tpmValue) {
		this.tpmValue = tpmValue;
	}


	
	/**
	 * This is a chained comparator that is used to sort a list by multiple
	 * attributes by chaining a sequence of comparators of individual fields
	 * together.

	 *
	 */
	public static class DDEElementTPMChainedComparator implements Comparator<DataDrivenExperimentElementTPM> {
	 
	    private List<Comparator<DataDrivenExperimentElementTPM>> listComparators;
	 
	    @SafeVarargs
	    public DDEElementTPMChainedComparator(Comparator<DataDrivenExperimentElementTPM>... comparators) {
	        this.listComparators = Arrays.asList(comparators);
	    }
	 
	    @Override
	    public int compare(DataDrivenExperimentElementTPM e1, DataDrivenExperimentElementTPM e2) {
	        for (Comparator<DataDrivenExperimentElementTPM> comparator : listComparators) {
	            int result = comparator.compare(e1, e2);
	            if (result != 0) {
	                return result;
	            }
	        }
	        return 0;
	    }
	}
	
	//Comparator
	public static class ElementNameTypeComparator implements Comparator<DataDrivenExperimentElementTPM> {
		 
	    @Override
	    public int compare(DataDrivenExperimentElementTPM e1, DataDrivenExperimentElementTPM e2) {
	        return e1.getElementNameType().compareTo(e2.getElementNameType());
	    }
	}


	//Comparator
	public static class TPMTypeComparator implements Comparator<DataDrivenExperimentElementTPM> {
		 
	    @Override
	    public int compare(DataDrivenExperimentElementTPM e1, DataDrivenExperimentElementTPM e2) {
	        return e1.getTpmType().compareTo(e2.getTpmType());
	    }
	}

}