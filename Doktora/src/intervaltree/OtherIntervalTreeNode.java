/**
 * @author burcakotlu
 * @date May 2, 2014 
 * @time 2:34:16 PM
 */
package intervaltree;

import java.util.List;

import common.Commons;

/**
 * 
 */
public class OtherIntervalTreeNode extends IntervalTreeNode {
	
	//Added 7 March 2014
	String rsId;
	List<String> observedVariationAlleles;
	
	
	//added 11 December 2013
	int min;
	
	//added 12 December 2013
	int height;

	//Mapability
	float mapability;
	
	public String getRsId() {
		return rsId;
	}

	public void setRsId(String rsId) {
		this.rsId = rsId;
	}

	public List<String> getObservedVariationAlleles() {
		return observedVariationAlleles;
	}

	public void setObservedVariationAlleles(List<String> observedVariationAlleles) {
		this.observedVariationAlleles = observedVariationAlleles;
	}

	public float getMapability() {
		return mapability;
	}

	public void setMapability(float mapability) {
		this.mapability = mapability;
	}


		
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//CalculateMapability
	public OtherIntervalTreeNode(String chromName, int low, int high, float mapability){
		super();
		this.chromName = chromName;
		this.low = low;
		this.high = high;
		this.mapability = mapability;
		
		
		this.left = new IntervalTreeNode();
		this.right = new IntervalTreeNode();
		this.parent = new IntervalTreeNode();
		this.name = Commons.NOT_SENTINEL;
		this.numberofBases = high-low+1;
		
			
	}
	
	//7 March 2014
	//For dbSNP node
	public OtherIntervalTreeNode(String rsId, String chrNumber, int  chrPosition, List<String> observedVariationAlleles) {
		super();
		
		//no conversion here
		//since it is done in the caller class
		this.low = chrPosition;
		this.high = chrPosition;
		
		this.chromName = chrNumber;
		
		this.rsId = rsId;
		this.observedVariationAlleles = observedVariationAlleles;
		
		this.name = Commons.NOT_SENTINEL;		
	}

	
	//SENTINEL node
	public OtherIntervalTreeNode(){
		this.color = Commons.BLACK;			
		this.name = Commons.SENTINEL;
		this.numberofBases = 0;
		this.height= -1;
		
	}
}