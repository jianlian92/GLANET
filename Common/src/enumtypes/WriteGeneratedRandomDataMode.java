/**
 * @author burcakotlu
 * @date Jun 23, 2014 
 * @time 11:58:18 AM
 */
package enumtypes;

import common.Commons;

/**
 * 
 */
public enum WriteGeneratedRandomDataMode {
	
	WRITE_GENERATED_RANDOM_DATA(1),
	DO_NOT_WRITE_GENERATED_RANDOM_DATA(2);
	
	private final int writeGeneratedRandomDataMode;
	
	private WriteGeneratedRandomDataMode(int writeGeneratedRandomDataMode) {
    	this.writeGeneratedRandomDataMode = writeGeneratedRandomDataMode;
	}
	
	 public static WriteGeneratedRandomDataMode convertStringtoEnum(String writeGeneratedRandomDataMode){
	    	
	    	if (Commons.WRITE_GENERATED_RANDOM_DATA.equals(writeGeneratedRandomDataMode)){
	    		return WRITE_GENERATED_RANDOM_DATA;
	    	}else if  (Commons.DO_NOT_WRITE_GENERATED_RANDOM_DATA.equals(writeGeneratedRandomDataMode)){
	    		return DO_NOT_WRITE_GENERATED_RANDOM_DATA;
	    	}else
	    		return null;
	 }
	 
	 public String getWriteGeneratedRandomDataMode(){
	    	if (this.equals(WriteGeneratedRandomDataMode.WRITE_GENERATED_RANDOM_DATA))
	    		return Commons.WRITE_GENERATED_RANDOM_DATA;
	    	else if (this.equals(WriteGeneratedRandomDataMode.DO_NOT_WRITE_GENERATED_RANDOM_DATA))
	    		return Commons.DO_NOT_WRITE_GENERATED_RANDOM_DATA;
	    	else
	    		return null;
	    				   		
	 }
	 
	 /** An added method.  */
    public boolean isWriteGeneratedRandomDataMode() {
        return  this == WRITE_GENERATED_RANDOM_DATA;
    }
    
    //for testing purposes
    //Attention comparison between String and Enum gives no
    int main(){
    	WriteGeneratedRandomDataMode mode = WRITE_GENERATED_RANDOM_DATA;
    	if  (Commons.WRITE_GENERATED_RANDOM_DATA.equals(mode)){
    		System.out.println("no error");
    	}
    	return 0;
    
    }

}
