/**
 * @author burcakotlu
 * @date May 15, 2014 
 * @time 9:43:28 AM
 */
package enumtypes;

/**
 * 
 */
public enum KeyOrder {
	
	DNASE_CELLLINENUMBER(1),
	TFNUMBER_CELLLINENUMBER(2),
	HISTONENUMBER_CELLLINENUMBER(3),
	KEGGPATHWAYNUMBER(4),
	TFNUMBER_KEGGPATHWAYNUMBER(5),
	TFNUMBER_CELLLINENUMBER_KEGGPATHWAYNUMBER(6);
	
	 private final int keyOrder;
		

	 /* 
    * This constructor is private.
    * Legal to declare a non-private constructor, but not legal
    * to use such a constructor outside the enum.
    * Can never use "new" with any enum, even inside the enum 
    * class itself.
    */
    private KeyOrder(int keyOrder) {
    	this.keyOrder = keyOrder;
	}
    
    
	public int getKeyOrder(){ 
		 return keyOrder; 
	}
	
	/** An added method.  */
    public boolean isDnaseCellLineNumber() {
        return  this == DNASE_CELLLINENUMBER;
    }
		
    
	/** An added method.  */
    public boolean isTfNumberCellLineNumber() {
        return  this == TFNUMBER_CELLLINENUMBER;
    }
    

	/** An added method.  */
    public boolean isHistoneNumberCellLineNumber() {
        return  this == HISTONENUMBER_CELLLINENUMBER;
    }
    
    /** An added method.  */
    public boolean isKeggPathwayNumber() {
        return  this == KEGGPATHWAYNUMBER;
    }
	
    
    /** An added method.  */
    public boolean isTfNumberKeggPathwayNumber() {
        return  this == TFNUMBER_KEGGPATHWAYNUMBER;
    }
    
    /** An added method.  */
    public boolean isTfNumberCellLineNumberKeggPathwayNumber() {
        return  this == TFNUMBER_CELLLINENUMBER_KEGGPATHWAYNUMBER;
    }
}
