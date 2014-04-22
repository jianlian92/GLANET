/**
 * @author burcakotlu
 * @date Apr 22, 2014 
 * @time 10:21:01 AM
 */
package jaxbxjctool;

import java.util.List;

/**
 * 
 */
public class TfCellLineGivenInterval {
	
	
	String chromNamewithoutPreceedingChr;
	int startZeroBased;
	int endZeroBased;
	
	List<String> snpKeyList;
	List<String> tfCellLineBasedTfIntervalKeyList;
	
	//will be generated from the peaks in this given interval
	String extendedPeakSequence;
	
	String givenIntervalName;
	String tfNameCellLineName;
	
	
	public String getChromNamewithoutPreceedingChr() {
		return chromNamewithoutPreceedingChr;
	}
	public void setChromNamewithoutPreceedingChr(
			String chromNamewithoutPreceedingChr) {
		this.chromNamewithoutPreceedingChr = chromNamewithoutPreceedingChr;
	}
	public int getStartZeroBased() {
		return startZeroBased;
	}
	public void setStartZeroBased(int startZeroBased) {
		this.startZeroBased = startZeroBased;
	}
	public int getEndZeroBased() {
		return endZeroBased;
	}
	public void setEndZeroBased(int endZeroBased) {
		this.endZeroBased = endZeroBased;
	}
	public List<String> getSnpKeyList() {
		return snpKeyList;
	}
	public void setSnpKeyList(List<String> snpKeyList) {
		this.snpKeyList = snpKeyList;
	}
	public List<String> getTfCellLineBasedTfIntervalKeyList() {
		return tfCellLineBasedTfIntervalKeyList;
	}
	public void setTfCellLineBasedTfIntervalKeyList(
			List<String> tfCellLineBasedTfIntervalKeyList) {
		this.tfCellLineBasedTfIntervalKeyList = tfCellLineBasedTfIntervalKeyList;
	}
	public String getExtendedPeakSequence() {
		return extendedPeakSequence;
	}
	public void setExtendedPeakSequence(String extendedPeakSequence) {
		this.extendedPeakSequence = extendedPeakSequence;
	}
	public String getGivenIntervalName() {
		return givenIntervalName;
	}
	public void setGivenIntervalName(String givenIntervalName) {
		this.givenIntervalName = givenIntervalName;
	}
	public String getTfNameCellLineName() {
		return tfNameCellLineName;
	}
	public void setTfNameCellLineName(String tfNameCellLineName) {
		this.tfNameCellLineName = tfNameCellLineName;
	}
	
	
	


}
