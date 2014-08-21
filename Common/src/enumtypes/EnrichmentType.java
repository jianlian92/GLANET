package enumtypes;

import common.Commons;

public enum EnrichmentType {
	
	DO_DNASE_ENRICHMENT(1),
	DO_NOT_DNASE_ENRICHMENT(2),
	
	DO_TF_ENRICHMENT(3),
	DO_NOT_TF_ENRICHMENT(4),
	
	DO_HISTONE_ENRICHMENT(5),
	DO_NOT_HISTONE_ENRICHMENT(6),
	
	DO_GENESET_ENRICHMENT(7),
	DO_NOT_GENESET_ENRICHMENT(8),
	
	DO_TF_GENESET_ENRICHMENT(9),
	DO_NOT_TF_GENESET_ENRICHMENT(10),
	
	DO_TF_CELLLINE_GENESET_ENRICHMENT(11),
	DO_NOT_TF_CELLLINE_GENESET_ENRICHMENT(12),
	
	BOTH_DO_TF_GENESET_AND_TF_CELLLINE_GENESET_ENRICHMENT(13);
	
	
	private final int enrichmentType;
	
	/* 
    * This constructor is private.
    * Legal to declare a non-private constructor, but not legal
    * to use such a constructor outside the enum.
    * Can never use "new" with any enum, even inside the enum 
    * class itself.
    */
    private EnrichmentType(int enrichmentType) {
    	this.enrichmentType = enrichmentType;
	}
	
    
    public static EnrichmentType convertStringtoEnum(String enrichmentType){
    	
    	if (Commons.DO_DNASE_ENRICHMENT.equals(enrichmentType)){
    		return DO_DNASE_ENRICHMENT;
    	}else if  (Commons.DO_NOT_DNASE_ENRICHMENT.equals(enrichmentType)){
    		return DO_NOT_DNASE_ENRICHMENT;
    	}else if  (Commons.DO_TF_ENRICHMENT.equals(enrichmentType)){
    		return DO_TF_ENRICHMENT;
    	}else if  (Commons.DO_NOT_TF_ENRICHMENT.equals(enrichmentType)){
    		return DO_NOT_TF_ENRICHMENT; 		
    	}else if  (Commons.DO_HISTONE_ENRICHMENT.equals(enrichmentType)){
    		return DO_HISTONE_ENRICHMENT;
    	}else if  (Commons.DO_NOT_HISTONE_ENRICHMENT.equals(enrichmentType)){
    		return DO_NOT_HISTONE_ENRICHMENT;
    	}else if  (Commons.DO_GENESET_ENRICHMENT.equals(enrichmentType)){
    		return DO_GENESET_ENRICHMENT;
    	}else if  (Commons.DO_NOT_GENESET_ENRICHMENT.equals(enrichmentType)){
    		return DO_NOT_GENESET_ENRICHMENT;
    	}else if  (Commons.DO_TF_GENESET_ENRICHMENT.equals(enrichmentType)){
    		return DO_TF_GENESET_ENRICHMENT;
    	}else if  (Commons.DO_NOT_TF_GENESET_ENRICHMENT.equals(enrichmentType)){
    		return DO_NOT_TF_GENESET_ENRICHMENT;
    	}else if  (Commons.DO_TF_CELLLINE_GENESET_ENRICHMENT.equals(enrichmentType)){
    		return DO_TF_CELLLINE_GENESET_ENRICHMENT;
    	}else if  (Commons.DO_NOT_TF_CELLLINE_GENESET_ENRICHMENT.equals(enrichmentType)){
    		return DO_NOT_TF_CELLLINE_GENESET_ENRICHMENT;
    	}else if (Commons.BOTH_DO_TF_GENESET_AND_TF_CELLLINE_GENESET_ENRICHMENT.equals(enrichmentType)){
    		return BOTH_DO_TF_GENESET_AND_TF_CELLLINE_GENESET_ENRICHMENT;
    	}
    	else
    		return null;
    }
    
    public String getEnrichmentType(){
    	if (this.equals(EnrichmentType.DO_DNASE_ENRICHMENT))
    		return Commons.DO_DNASE_ENRICHMENT;
    	else if (this.equals(EnrichmentType.DO_NOT_DNASE_ENRICHMENT))
    		return Commons.DO_NOT_DNASE_ENRICHMENT;
    	
    	else if (this.equals(EnrichmentType.DO_HISTONE_ENRICHMENT))
    		return Commons.DO_HISTONE_ENRICHMENT;
    	else if (this.equals(EnrichmentType.DO_NOT_HISTONE_ENRICHMENT))
    		return Commons.DO_NOT_HISTONE_ENRICHMENT;
    	
    	else if (this.equals(EnrichmentType.DO_TF_ENRICHMENT))
    		return Commons.DO_TF_ENRICHMENT;
    	else if (this.equals(EnrichmentType.DO_NOT_TF_ENRICHMENT))
    		return Commons.DO_NOT_TF_ENRICHMENT;
    	
    	else if (this.equals(EnrichmentType.DO_GENESET_ENRICHMENT))
    		return Commons.DO_GENESET_ENRICHMENT;
    	else if (this.equals(EnrichmentType.DO_NOT_GENESET_ENRICHMENT))
    		return Commons.DO_NOT_GENESET_ENRICHMENT;
    	
    	else if (this.equals(EnrichmentType.DO_TF_GENESET_ENRICHMENT))
    		return Commons.DO_TF_GENESET_ENRICHMENT;
    	else if (this.equals(EnrichmentType.DO_NOT_TF_GENESET_ENRICHMENT))
    		return Commons.DO_NOT_TF_GENESET_ENRICHMENT;
    	
    	else if (this.equals(EnrichmentType.DO_TF_CELLLINE_GENESET_ENRICHMENT))
    		return Commons.DO_TF_CELLLINE_GENESET_ENRICHMENT;
    	else if (this.equals(EnrichmentType.DO_NOT_TF_CELLLINE_GENESET_ENRICHMENT))
    		return Commons.DO_NOT_TF_CELLLINE_GENESET_ENRICHMENT;
    	
    	else if (this.equals(EnrichmentType.BOTH_DO_TF_GENESET_AND_TF_CELLLINE_GENESET_ENRICHMENT))
    		return Commons.BOTH_DO_TF_GENESET_AND_TF_CELLLINE_GENESET_ENRICHMENT;
    	else
    		return null;
    				
    		
    }
    
    /** An added method.  */
    public boolean isDnaseEnrichment() {
        return  this == DO_DNASE_ENRICHMENT;
    }
		
    /** An added method.  */
    public boolean isTfEnrichment() {
        return  this == DO_TF_ENRICHMENT;
    }
	
    
    /** An added method.  */
    public boolean isHistoneEnrichment() {
        return  this == DO_HISTONE_ENRICHMENT;
    }
    
    /** An added method.  */
    public boolean isGeneSetEnrichment() {
        return  this == DO_GENESET_ENRICHMENT;
    }
    
    /** An added method.  */
    public boolean isTfGeneSetEnrichment() {
        return  this == DO_TF_GENESET_ENRICHMENT;
    }
    
    /** An added method.  */
    public boolean isTfCellLineGeneSetEnrichment() {
        return  this == DO_TF_CELLLINE_GENESET_ENRICHMENT;
    }
    
    /** An added method.  */
    public boolean isBothTfGeneSetAndTfCellLineGeneSetEnrichment() {
        return  this == BOTH_DO_TF_GENESET_AND_TF_CELLLINE_GENESET_ENRICHMENT;
    }
    

}