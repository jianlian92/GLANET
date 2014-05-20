/**
 * @author Burcak Otlu
 * Feb 13, 2014
 * 1:15:47 PM
 * 2014
 *
 * 
 */
package empiricalpvalues;

import intervaltree.IntervalTree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import multipletesting.BenjaminiandHochberg;
import augmentation.keggpathway.KeggPathwayAugmentation;
import auxiliary.FileOperations;
import auxiliary.FunctionalElement;
import auxiliary.NumberofComparisons;
import auxiliary.NumberofComparisonsforBonferroniCorrectionCalculation;

import common.Commons;




public class CollectionofPermutationsResults {
	
	//How to decide enriched elements?
	//with respect to Benjamini Hochberg FDR or
	//with respect to Bonferroni Correction Significance Level
	public void writeResultstoOutputFiles(String outputFolder,String fileName,String jobName,List<FunctionalElement> list,String enrichmentType,String multipleTestingParameter,float bonferroniCorrectionSignigicanceLevel,float FDR,int numberofPermutations,int numberofComparisons) throws IOException{
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		FunctionalElement element = null;
		DecimalFormat df = new DecimalFormat("0.######E0");
		
		if(multipleTestingParameter.equals(Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE)){
			
			//sort w.r.t. Benjamini and Hochberg FDR Adjusted pValue
			Collections.sort(list,FunctionalElement.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE);
			
			//write the results to a output file starts		
			fileWriter = FileOperations.createFileWriter(outputFolder + fileName  +   "_" + jobName +Commons.ALL_WITH_RESPECT_TO_BH_FDR_ADJUSTED_P_VALUE);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			//header line in output file
			bufferedWriter.write("Element Number" + "\t" +  "Element Name" + "\t" + "OriginalNumberofOverlaps" + "\t" + "NumberofPermutationsHavingNumberofOverlapsGreaterThanorEqualTo in " + numberofPermutations + " Permutations" + "\t"+ "Number of Permutations" + "\t" + "Number of comparisons" + "\t" + "empiricalPValue" + "\t" + "BonfCorrPValue for " +  numberofComparisons  + " comparisons"  + "\t" + "BH FDR Adjusted P Value" + "\t" + "Reject Null Hypothesis for an FDR of " + FDR +System.getProperty("line.separator"));

			Iterator<FunctionalElement> itr = list.iterator();
			
			while(itr.hasNext()){
				element = itr.next();
				
				
				if(	enrichmentType.equals(Commons.DO_KEGGPATHWAY_ENRICHMENT) ||
					enrichmentType.equals(Commons.DO_TF_KEGGPATHWAY_ENRICHMENT) ||
					enrichmentType.equals(Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT)){
					
					//line per element in output file
					bufferedWriter.write(element.getTforHistoneNumberCellLineNumberKeggPathwayNumber() + "\t" + element.getTforHistoneNameCellLineNameKeggPathwayName() + "\t" +  element.getOriginalNumberofOverlaps() + "\t" + element.getNumberofPermutationsHavingOverlapsGreaterThanorEqualto() + "\t"+ numberofPermutations+ "\t" +numberofComparisons + "\t" + df.format(element.getEmpiricalPValue()) + "\t" + df.format(element.getBonferroniCorrectedEmpiricalPValue()) + "\t" + df.format(element.getBH_FDR_adjustedPValue()) + "\t" + element.isRejectNullHypothesis() +"\t");
					
					
					bufferedWriter.write(element.getKeggPathwayName()+"\t");
					
					
					if (element.getKeggPathwayGeneIdList().size()>=1){
						int i;
						//Write the gene ids of the kegg pathway
						for(i =0 ;i < element.getKeggPathwayGeneIdList().size()-1; i++){
							bufferedWriter.write(element.getKeggPathwayGeneIdList().get(i) + ", ");
						}
						bufferedWriter.write(element.getKeggPathwayGeneIdList().get(i) + "\t");
					}
					
					if(element.getKeggPathwayAlternateGeneNameList().size()>=1){
						int i;
						
						//Write the alternate gene names of the kegg pathway
						for(i =0 ;i < element.getKeggPathwayAlternateGeneNameList().size()-1; i++){
							bufferedWriter.write(element.getKeggPathwayAlternateGeneNameList().get(i) + ", ");
						}
						bufferedWriter.write(element.getKeggPathwayAlternateGeneNameList().get(i));			
					}
					
					bufferedWriter.write(System.getProperty("line.separator"));			

			
				}else{
					//line per element in output file
					bufferedWriter.write(element.getTforHistoneNumberCellLineNumberKeggPathwayNumber() + "\t" + element.getTforHistoneNameCellLineNameKeggPathwayName()+ "\t" +  element.getOriginalNumberofOverlaps() + "\t" + element.getNumberofPermutationsHavingOverlapsGreaterThanorEqualto() + "\t"+ numberofPermutations+ "\t" +numberofComparisons + "\t" + df.format(element.getEmpiricalPValue()) + "\t" + df.format(element.getBonferroniCorrectedEmpiricalPValue()) + "\t" + df.format(element.getBH_FDR_adjustedPValue()) + "\t" + element.isRejectNullHypothesis() +System.getProperty("line.separator"));
					
				}
				
			
			}//End of while
			
			//close the file
			bufferedWriter.close();
			//write the results to a output file ends

			
			
		}else if (multipleTestingParameter.equals(Commons.BONFERRONI_CORRECTED_P_VALUE)){
			
			//sort w.r.t. Bonferroni Corrected pVlaue
			Collections.sort(list,FunctionalElement.BONFERRONI_CORRECTED_P_VALUE);
			
			//write the results to a output file starts		
			fileWriter = FileOperations.createFileWriter(outputFolder + fileName  + Commons.ALL_WITH_RESPECT_TO_BONF_CORRECTED_P_VALUE);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			//header line in output file
			bufferedWriter.write("Element Number" + "\t" + "Element Name" + "\t" + "OriginalNumberofOverlaps" + "\t" + "NumberofPermutationsHavingNumberofOverlapsGreaterThanorEqualTo in " + numberofPermutations + " Permutations" + "\t"+ "Number of Permutations" + "\t" + "Number of comparisons" + "\t" + "empiricalPValue" + "\t" + "BonfCorrPValue for " +  numberofComparisons  + " comparisons" + "\t" + "BH FDR Adjusted P Value" + "\t" + "Reject Null Hypothesis for an FDR of " + FDR +System.getProperty("line.separator"));

			Iterator<FunctionalElement> itr = list.iterator();
			
			while(itr.hasNext()){
				element = itr.next();
				
				
				if(	enrichmentType.equals(Commons.DO_KEGGPATHWAY_ENRICHMENT) ||
					enrichmentType.equals(Commons.DO_TF_KEGGPATHWAY_ENRICHMENT) ||
					enrichmentType.equals(Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT)){
					
					//line per element in output file
					bufferedWriter.write(element.getTforHistoneNumberCellLineNumberKeggPathwayNumber() + "\t" + element.getTforHistoneNameCellLineNameKeggPathwayName() + "\t" +  element.getOriginalNumberofOverlaps() + "\t" + element.getNumberofPermutationsHavingOverlapsGreaterThanorEqualto() + "\t"+ numberofPermutations+ "\t" +numberofComparisons + "\t" + df.format(element.getEmpiricalPValue()) + "\t" + df.format(element.getBonferroniCorrectedEmpiricalPValue()) + "\t" + df.format(element.getBH_FDR_adjustedPValue()) + "\t" + element.isRejectNullHypothesis() +"\t");
					
					
					bufferedWriter.write(element.getKeggPathwayName()+"\t");
					
					
					if (element.getKeggPathwayGeneIdList().size()>=1){
						int i;
						//Write the gene ids of the kegg pathway
						for(i =0 ;i < element.getKeggPathwayGeneIdList().size()-1; i++){
							bufferedWriter.write(element.getKeggPathwayGeneIdList().get(i) + ", ");
						}
						bufferedWriter.write(element.getKeggPathwayGeneIdList().get(i) + "\t");
					}
					
					if(element.getKeggPathwayAlternateGeneNameList().size()>=1){
						int i;
						
						//Write the alternate gene names of the kegg pathway
						for(i =0 ;i < element.getKeggPathwayAlternateGeneNameList().size()-1; i++){
							bufferedWriter.write(element.getKeggPathwayAlternateGeneNameList().get(i) + ", ");
						}
						bufferedWriter.write(element.getKeggPathwayAlternateGeneNameList().get(i) + System.getProperty("line.separator"));			
					}	
			
				}else{
					//line per element in output file
					bufferedWriter.write(element.getTforHistoneNumberCellLineNumberKeggPathwayNumber() + "\t" + element.getTforHistoneNameCellLineNameKeggPathwayName() + "\t" +  element.getOriginalNumberofOverlaps() + "\t" + element.getNumberofPermutationsHavingOverlapsGreaterThanorEqualto() + "\t"+ numberofPermutations+ "\t" +numberofComparisons + "\t" + df.format(element.getEmpiricalPValue()) + "\t" + df.format(element.getBonferroniCorrectedEmpiricalPValue()) + "\t" + df.format(element.getBH_FDR_adjustedPValue()) + "\t" + element.isRejectNullHypothesis() +System.getProperty("line.separator"));
					
				}
				
			
			}//End of while
			
			//close the file
			bufferedWriter.close();
			//write the results to a output file ends
			
		}
		
		
	}

	
	public void fillNumberToNameMaps(Map<Integer,String> number2NameMap,String directoryName, String fileName){
		FileReader fileReader;
		BufferedReader bufferedReader;
		
		
		String strLine;
		Integer number;
		String name;
		
		int indexofFirstTab;		
		
		try {
			fileReader = FileOperations.createFileReader(directoryName +fileName);
			bufferedReader = new BufferedReader(fileReader);
			
			while ((strLine = bufferedReader.readLine())!=null){
				indexofFirstTab = strLine.indexOf('\t');
				
				number = Integer.parseInt(strLine.substring(0,indexofFirstTab));
				name = strLine.substring(indexofFirstTab+1);
				
				number2NameMap.put(number, name);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//@todo
	//question is this elementNumber
	public String convertNumberToName(long permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber,KeyOrder keyOrder, Map<Integer,String> cellLineNumber2NameMap,Map<Integer,String> tfNumber2NameMap,Map<Integer,String> histoneNumber2NameMap, Map<Integer,String> keggPathwayNumber2NameMap){
	
		int cellLineNumber;
		int tfNumber;
		int histoneNumber;
		int keggPathwayNumber;
		
		String cellLineName;
		String tfName;
		String histoneName;
		String keggPathwayName;
		
		switch(keyOrder){
			case DNASE_CELLLINENUMBER:{		cellLineNumber = IntervalTree.getCellLineNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
											cellLineName = cellLineNumber2NameMap.get(cellLineNumber);
											return cellLineName;	
										}
			case TFNUMBER_CELLLINENUMBER: {	 tfNumber = IntervalTree.getTforHistoneNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
											 tfName = tfNumber2NameMap.get(tfNumber);
											 cellLineNumber = IntervalTree.getCellLineNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
											 cellLineName = cellLineNumber2NameMap.get(cellLineNumber);
											 return tfName + "_" + cellLineName;																					
											}
												
			case	HISTONENUMBER_CELLLINENUMBER:{	 histoneNumber = IntervalTree.getTforHistoneNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
													 histoneName = histoneNumber2NameMap.get(histoneNumber);
													 cellLineNumber = IntervalTree.getCellLineNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
													 cellLineName = cellLineNumber2NameMap.get(cellLineNumber);
													 return histoneName + "_" + cellLineName;													
												}
			
			case KEGGPATHWAYNUMBER:{	keggPathwayNumber = IntervalTree.getKeggPathwayNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
									 	keggPathwayName = keggPathwayNumber2NameMap.get(keggPathwayNumber);
									 	return keggPathwayName;
									}
				
			case TFNUMBER_KEGGPATHWAYNUMBER:{		tfNumber = IntervalTree.getTforHistoneNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
													tfName = tfNumber2NameMap.get(tfNumber);
													keggPathwayNumber = IntervalTree.getKeggPathwayNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
												 	keggPathwayName = keggPathwayNumber2NameMap.get(keggPathwayNumber);
												 	return tfName  + "_" + keggPathwayName;	
											}
			case TFNUMBER_CELLLINENUMBER_KEGGPATHWAYNUMBER:{
																tfNumber = IntervalTree.getTforHistoneNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
																tfName = tfNumber2NameMap.get(tfNumber);
																cellLineNumber = IntervalTree.getCellLineNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
																cellLineName = cellLineNumber2NameMap.get(cellLineNumber);
																keggPathwayNumber = IntervalTree.getKeggPathwayNumber(permutationNumberTforHistoneNumberCellLineNumberKeggPathwayNumber);
															 	keggPathwayName = keggPathwayNumber2NameMap.get(keggPathwayNumber);
															 	return tfName + "_" + cellLineName + "_" + keggPathwayName;		 
																}
											
		}
		

		return null;
	}
	
	//@todo
	
	public void collectPermutationResults(float bonferroniCorrectionSignigicanceLevel, float FDR, String multipleTestingParameter, String dataFolder, String outputFolder,String fileName, String jobName, int numberofRuns, int numberofRemainders, int numberofComparisons, String enrichmentType,KeyOrder keyOrder){
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
			
		String strLine;
		String tempRunName;
		
		int indexofTab;
		int indexofPipe;
		int indexofFormerComma;
		int indexofLatterComma;
		
		int originalNumberofOverlaps;
		int permutationNumberofOverlaps = Integer.MAX_VALUE;
		
		int numberofPermutationsHavingOverlapsGreaterThanorEqualto;
		float empiricalPValue;
		float bonferroniCorrectedEmpiricalPValue;
		
		FunctionalElement element;
		long tforHistoneNumberCellLineNumberKeggPathwayNumber;		
		String tforHistoneNameCellLineNameKeggPathwayName;
		
		//In case of functionalElement contains kegg pathway
		int keggPathwayNumber;
		
	
		Map<Long,FunctionalElement> elementNumber2ElementMap = new  HashMap<Long,FunctionalElement>();
		
		
		int numberofPermutations;
		
		if (numberofRemainders>0){
			numberofPermutations = ((numberofRuns-1) * Commons.NUMBER_OF_PERMUTATIONS_IN_EACH_RUN) + numberofRemainders;
		}else{
			numberofPermutations = numberofRuns * Commons.NUMBER_OF_PERMUTATIONS_IN_EACH_RUN;	
		}
		
		
		//@todo
		//Fill Number to Entry/Name Maps
		Map<Integer,String> cellLineNumber2CellLineNameMap = new HashMap<Integer,String>();
		Map<Integer,String> tfNumber2TfNameMap = new HashMap<Integer,String>();
		Map<Integer,String> histoneNumber2HistoneNameMap = new HashMap<Integer,String>();
		Map<Integer,String> geneHugoSymbolNumber2GeneHugoSymbolNameMap = new HashMap<Integer,String>();
		Map<Integer,String> keggPathwayNumber2KeggPathwayEntryMap = new HashMap<Integer,String>();
		
		fillNumberToNameMaps(cellLineNumber2CellLineNameMap,dataFolder + Commons.WRITE_ALL_POSSIBLE_NAMES_OUTPUT_DIRECTORYNAME, Commons.WRITE_ALL_POSSIBLE_ENCODE_CELLLINENUMBER_2_CELLLINENAME_OUTPUT_FILENAME);
		fillNumberToNameMaps(tfNumber2TfNameMap,dataFolder + Commons.WRITE_ALL_POSSIBLE_NAMES_OUTPUT_DIRECTORYNAME, Commons.WRITE_ALL_POSSIBLE_ENCODE_TFNUMBER_2_TFNAME_OUTPUT_FILENAME);
		fillNumberToNameMaps(histoneNumber2HistoneNameMap,dataFolder + Commons.WRITE_ALL_POSSIBLE_NAMES_OUTPUT_DIRECTORYNAME, Commons.WRITE_ALL_POSSIBLE_ENCODE_HISTONENUMBER_2_HISTONENAME_OUTPUT_FILENAME);
		fillNumberToNameMaps(geneHugoSymbolNumber2GeneHugoSymbolNameMap,dataFolder + Commons.WRITE_ALL_POSSIBLE_NAMES_OUTPUT_DIRECTORYNAME, Commons.WRITE_ALL_POSSIBLE_UCSC_GENE_HUGO_SYMBOL_NUMBER_2_GENE_HUGO_SYMBOL_OUTPUT_FILENAME);
		fillNumberToNameMaps(keggPathwayNumber2KeggPathwayEntryMap,dataFolder + Commons.WRITE_ALL_POSSIBLE_NAMES_OUTPUT_DIRECTORYNAME, Commons.WRITE_ALL_POSSIBLE_KEGGPATHWAYNUMBER_2_KEGGPATHWAYNAME_OUTPUT_FILENAME);		
		//@todo
	
	
		try {
			
			
			/**********************************************************************************/		
			/***********************FOR EACH RUN STARTS****************************************/		
			for (int i=1; i<=numberofRuns; i++){
				
					tempRunName =  "_" + jobName + i;
					
					fileReader = new FileReader(outputFolder + fileName + tempRunName  + ".txt" );
					bufferedReader = new BufferedReader(fileReader);
					
					while((strLine = bufferedReader.readLine())!=null){
						
						//Initialize numberofPermutationsHavingOverlapsGreaterThanorEqualto to zero
						numberofPermutationsHavingOverlapsGreaterThanorEqualto = 0;
						
						indexofTab = strLine.indexOf('\t');
						indexofPipe = strLine.indexOf('|');
						
					    tforHistoneNumberCellLineNumberKeggPathwayNumber = Long.parseLong(strLine.substring(0,indexofTab));
						originalNumberofOverlaps = Integer.parseInt(strLine.substring(indexofTab+1,indexofPipe));
						
						indexofFormerComma = indexofPipe;
						indexofLatterComma = strLine.indexOf(',', indexofFormerComma+1);
						
						while(indexofFormerComma!= -1 && indexofLatterComma!= -1){
							permutationNumberofOverlaps = Integer.parseInt(strLine.substring(indexofFormerComma+1, indexofLatterComma));
							
							if(permutationNumberofOverlaps >= originalNumberofOverlaps){
								numberofPermutationsHavingOverlapsGreaterThanorEqualto++;
							}
							
							indexofFormerComma = indexofLatterComma;
							indexofLatterComma = strLine.indexOf(',', indexofLatterComma+1);
							
						}// Inner while loop: all permutations, number of overlaps of an element
						
						
						//write numberofPermutationsHavingOverlapsGreaterThanorEqualto to map
						if(elementNumber2ElementMap.get(tforHistoneNumberCellLineNumberKeggPathwayNumber)==null){
							element = new FunctionalElement();
							
							element.setTforHistoneNumberCellLineNumberKeggPathwayNumber(tforHistoneNumberCellLineNumberKeggPathwayNumber);
							
							tforHistoneNameCellLineNameKeggPathwayName = convertNumberToName(tforHistoneNumberCellLineNumberKeggPathwayNumber,keyOrder,cellLineNumber2CellLineNameMap,tfNumber2TfNameMap,histoneNumber2HistoneNameMap,keggPathwayNumber2KeggPathwayEntryMap);
							element.setTforHistoneNameCellLineNameKeggPathwayName(tforHistoneNameCellLineNameKeggPathwayName);
							
							//in case of element contains a KEGG PATHWAY
							if (keyOrder.isKeggPathwayNumber() || keyOrder.isTfNumberKeggPathwayNumber() || keyOrder.isTfNumberCellLineNumberKeggPathwayNumber()){
								keggPathwayNumber = IntervalTree.getKeggPathwayNumber(tforHistoneNumberCellLineNumberKeggPathwayNumber);
								element.setKeggPathwayNumber(keggPathwayNumber);
							}
							//set keggPathwayNumber
							
							
							element.setOriginalNumberofOverlaps(originalNumberofOverlaps);
							element.setNumberofPermutationsHavingOverlapsGreaterThanorEqualto(numberofPermutationsHavingOverlapsGreaterThanorEqualto);
							
							elementNumber2ElementMap.put(tforHistoneNumberCellLineNumberKeggPathwayNumber, element);
						}else{
							
							element = elementNumber2ElementMap.get(tforHistoneNumberCellLineNumberKeggPathwayNumber);
							
							element.setNumberofPermutationsHavingOverlapsGreaterThanorEqualto(element.getNumberofPermutationsHavingOverlapsGreaterThanorEqualto() + numberofPermutationsHavingOverlapsGreaterThanorEqualto );
							
						}
												
					}//Outer while loop: Read all lines of a run					
					
					//Close bufferedReader
					bufferedReader.close();
									
			}//End of for: each run
			/***********************FOR EACH RUN ENDS******************************************/		
			/**********************************************************************************/		

			
			
			/**********************************************************************************/		
			/******COMPUTE EMPIRICAL P VALUE AND BONFERRONI CORRECTED P VALUE STARTS***********/		
			//Now compute empirical pValue and Bonferroni Corrected pValue and write
			for(Map.Entry<Long, FunctionalElement> entry: elementNumber2ElementMap.entrySet()){
				
				tforHistoneNumberCellLineNumberKeggPathwayNumber = entry.getKey();
				element 	= entry.getValue();
				
				numberofPermutationsHavingOverlapsGreaterThanorEqualto = element.getNumberofPermutationsHavingOverlapsGreaterThanorEqualto();
				
				empiricalPValue = (numberofPermutationsHavingOverlapsGreaterThanorEqualto *1.0f)/numberofPermutations;
				bonferroniCorrectedEmpiricalPValue = ((numberofPermutationsHavingOverlapsGreaterThanorEqualto*1.0f)/numberofPermutations) * numberofComparisons;
				
				if (bonferroniCorrectedEmpiricalPValue>1.0f){
					bonferroniCorrectedEmpiricalPValue = 1.0f;
				}
										
				element.setEmpiricalPValue(empiricalPValue);
				element.setBonferroniCorrectedEmpiricalPValue(bonferroniCorrectedEmpiricalPValue);			
	
			}
			/******COMPUTE EMPIRICAL P VALUE AND BONFERRONI CORRECTED P VALUE ENDS************/		
			/**********************************************************************************/		

			
			
			
			/**********************************************************************************/		
			/************COMPUTE BENJAMINI HOCHBERG FDR ADJUSTED P VALUE STARTS****************/		
			//convert map.values() into a list
			//sort w.r.t. empirical p value
			//before calculating BH FDR adjusted p values
			List<FunctionalElement> list = new ArrayList<FunctionalElement>(elementNumber2ElementMap.values());
			
			Collections.sort(list,FunctionalElement.EMPIRICAL_P_VALUE);
			BenjaminiandHochberg.calculateBenjaminiHochbergFDRAdjustedPValues(list, FDR);
			//sort w.r.t. Benjamini and Hochberg FDR
			Collections.sort(list,FunctionalElement.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE);
			/************COMPUTE BENJAMINI HOCHBERG FDR ADJUSTED P VALUE ENDS******************/		
			/**********************************************************************************/		

			
			/**********************************************************************************/		
			/*****************AUGMENT WITH KEGG PATHWAY INFORMATION STARTS*********************/		
			if (enrichmentType.equals(Commons.DO_KEGGPATHWAY_ENRICHMENT)){
				
				//Augment KeggPathwayNumber with KeggPathwayEntry
				KeggPathwayAugmentation.augmentKeggPathwayNumberWithKeggPathwayEntry(keggPathwayNumber2KeggPathwayEntryMap,list);
				//Augment KeggPathwayEntry with KeggPathwayName starts
				KeggPathwayAugmentation.augmentKeggPathwayEntrywithKeggPathwayName(dataFolder,list,null,null);
				//Augment with Kegg Pathway Gene List and Alternate Gene Name List
				KeggPathwayAugmentation.augmentKeggPathwayEntrywithKeggPathwayGeneList(dataFolder,outputFolder,list,null,null);

			}else if (enrichmentType.equals(Commons.DO_TF_KEGGPATHWAY_ENRICHMENT)){
				//Augment KeggPathwayNumber with KeggPathwayEntry
				KeggPathwayAugmentation.augmentKeggPathwayNumberWithKeggPathwayEntry(keggPathwayNumber2KeggPathwayEntryMap,list);
				KeggPathwayAugmentation.augmentTfNameKeggPathwayEntrywithKeggPathwayName(dataFolder,list,null,null);
				KeggPathwayAugmentation.augmentTfNameKeggPathwayEntrywithKeggPathwayGeneList(dataFolder,outputFolder,list,null,null);

			}else if (enrichmentType.equals(Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT)){
				//Augment KeggPathwayNumber with KeggPathwayEntry
				KeggPathwayAugmentation.augmentKeggPathwayNumberWithKeggPathwayEntry(keggPathwayNumber2KeggPathwayEntryMap,list);
				KeggPathwayAugmentation.augmentTfNameCellLineNameKeggPathwayEntrywithKeggPathwayName(dataFolder,list,null,null);
				KeggPathwayAugmentation.augmentTfNameCellLineNameKeggPathwayEntrywithKeggPathwayGeneList(dataFolder,outputFolder,list,null,null);		

			}
			/*****************AUGMENT WITH KEGG PATHWAY INFORMATION ENDS**********************/		
			/**********************************************************************************/		

			
			/**********************************************************************************/		
			/******************************WRITE RESULTS STARTS********************************/		
			//How to decide enriched elements?
			//with respect to Benjamini Hochberg FDR or
			//with respect to Bonferroni Correction Significance Level
			writeResultstoOutputFiles(outputFolder,fileName,jobName,list,enrichmentType,multipleTestingParameter,bonferroniCorrectionSignigicanceLevel,FDR,numberofPermutations,numberofComparisons);
			/******************************WRITE RESULTS ENDS**********************************/		
			/**********************************************************************************/		

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}

	/**
	 * 
	 */
	public CollectionofPermutationsResults() {
		// TODO Auto-generated constructor stub
	}

	//args[0]	--->	Input File Name with folder
	//args[1]	--->	GLANET installation folder with "\\" at the end. This folder will be used for outputFolder and dataFolder.
	//args[2]	--->	Input File Format	
	//			--->	default	Commons.INPUT_FILE_FORMAT_1_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE
	//			--->			Commons.INPUT_FILE_FORMAT_0_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE
	//			--->			Commons.INPUT_FILE_FORMAT_DBSNP_IDS_0_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE
	//			--->			Commons.INPUT_FILE_FORMAT_BED_0_BASED_COORDINATES_START_INCLUSIVE_END_EXCLUSIVE
	//			--->			Commons.INPUT_FILE_FORMAT_GFF3_1_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE	
	//args[3]	--->	Annotation, overlap definition, number of bases, default 1
	//args[4]	--->	Enrichment parameter
	//			--->	default	Commons.DO_ENRICH
	//			--->			Commons.DO_NOT_ENRICH	
	//args[5]	--->	Generate Random Data Mode
	//			--->	default	Commons.GENERATE_RANDOM_DATA_WITH_MAPPABILITY_AND_GC_CONTENT
	//			--->			Commons.GENERATE_RANDOM_DATA_WITHOUT_MAPPABILITY_AND_GC_CONTENT	
	//args[6]	--->	multiple testing parameter, enriched elements will be decided and sorted with respest to this parameter
	//			--->	default Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE
	//			--->			Commons.BONFERRONI_CORRECTED_P_VALUE
	//args[7]	--->	Bonferroni Correction Significance Level, default 0.05
	//args[8]	--->	Benjamini Hochberg FDR, default 0.05
	//args[9]	--->	Number of permutations, default 5000
	//args[10]	--->	Dnase Enrichment
	//			--->	default Commons.DO_NOT_DNASE_ENRICHMENT
	//			--->	Commons.DO_DNASE_ENRICHMENT
	//args[11]	--->	Histone Enrichment
	//			--->	default	Commons.DO_NOT_HISTONE_ENRICHMENT
	//			--->			Commons.DO_HISTONE_ENRICHMENT
	//args[12]	--->	Transcription Factor(TF) Enrichment 
	//			--->	default	Commons.DO_NOT_TF_ENRICHMENT
	//			--->			Commons.DO_TF_ENRICHMENT
	//args[13]	--->	KEGG Pathway Enrichment
	//			--->	default	Commons.DO_NOT_KEGGPATHWAY_ENRICHMENT 
	//			--->			Commons.DO_KEGGPATHWAY_ENRICHMENT
	//args[14]	--->	TF and KEGG Pathway Enrichment
	//			--->	default	Commons.DO_NOT_TF_KEGGPATHWAY_ENRICHMENT 
	//			--->			Commons.DO_TF_KEGGPATHWAY_ENRICHMENT
	//args[15]	--->	TF and CellLine and KeggPathway Enrichment
	//			--->	default	Commons.DO_NOT_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT 
	//			--->			Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT
	//args[16]	--->	RSAT parameter
	//			--->	default Commons.DO_NOT_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT
	//			--->			Commons.DO_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT
	//args[17]	--->	job name example: ocd_gwas_snps 
	//args[18]	--->	writeGeneratedRandomDataMode checkBox
	//			--->	default Commons.DO_NOT_WRITE_GENERATED_RANDOM_DATA
	//			--->			Commons.WRITE_GENERATED_RANDOM_DATA
	//args[19]	--->	writePermutationBasedandParametricBasedAnnotationResultMode checkBox
	//			--->	default Commons.DO_NOT_WRITE_PERMUTATION_BASED_AND_PARAMETRIC_BASED_ANNOTATION_RESULT
	//			--->			Commons.WRITE_PERMUTATION_BASED_AND_PARAMETRIC_BASED_ANNOTATION_RESULT
	//args[20]	--->	writePermutationBasedAnnotationResultMode checkBox
	//			---> 	default	Commons.DO_NOT_WRITE_PERMUTATION_BASED_ANNOTATION_RESULT
	//			--->			Commons.WRITE_PERMUTATION_BASED_ANNOTATION_RESULT					
	public static void main(String[] args) {
		
		String glanetFolder = args[1];
		String dataFolder 	= glanetFolder + System.getProperty("file.separator") + Commons.DATA + System.getProperty("file.separator") ;
		String outputFolder = glanetFolder + System.getProperty("file.separator") + Commons.OUTPUT + System.getProperty("file.separator") ;

		CollectionofPermutationsResults collectionofPermutationsResults = new CollectionofPermutationsResults();
		
		NumberofComparisons  numberofComparisons = new NumberofComparisons();
		NumberofComparisonsforBonferroniCorrectionCalculation.getNumberofComparisonsforBonferroniCorrection(dataFolder,numberofComparisons);
				
		int numberofPermutations = Integer.parseInt(args[9]);
		
		float FDR = Float.parseFloat(args[8]);
		float bonferroniCorrectionSignificanceLevel = Float.parseFloat(args[7]); 

		String dnaseEnrichment 			= args[10];
		String histoneEnrichment  		= args[11];
		String tfEnrichment 			= args[12];
		String keggPathwayEnrichment 	= args[13];
		String tfKeggPathwayEnrichment 	= args[14];
		String tfCellLineKeggPathwayEnrichment = args[15];
		
		//Job Name
		String jobName = args[17] ;		
			
		int numberofRuns = 0;
		int numberofRemainders = 0;
		
		//Multiple Testing Parameter for selection of enriched elements
		String multipleTestingParameter = args[6];
		
		numberofRuns = numberofPermutations / Commons.NUMBER_OF_PERMUTATIONS_IN_EACH_RUN;
		numberofRemainders = numberofPermutations % Commons.NUMBER_OF_PERMUTATIONS_IN_EACH_RUN;
		
		//Increase numberofRuns by 1 for remainder permutations less than 1000
		if (numberofRemainders> 0){
			numberofRuns += 1;
		}
				
		
		if	(dnaseEnrichment.equals(Commons.DO_DNASE_ENRICHMENT)){
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_DNASE_NUMBER_OF_OVERLAPS, jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsDnase(),dnaseEnrichment,KeyOrder.DNASE_CELLLINENUMBER);
		}
		
		if (histoneEnrichment.equals(Commons.DO_HISTONE_ENRICHMENT)){
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_HISTONE_NUMBER_OF_OVERLAPS, jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsHistone(),histoneEnrichment,KeyOrder.HISTONENUMBER_CELLLINENUMBER);
		}
		

		//IF (DO_TF_KEGGPATHWAY_ENRICHMENT or DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT) will  not be done
		if (tfEnrichment.equals(Commons.DO_TF_ENRICHMENT) && !(tfKeggPathwayEnrichment.equals(Commons.DO_TF_KEGGPATHWAY_ENRICHMENT)) && !(tfCellLineKeggPathwayEnrichment.equals(Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT))){
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_NUMBER_OF_OVERLAPS, jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsHistone(),tfEnrichment,KeyOrder.TFNUMBER_CELLLINENUMBER);
		}
		
		//IF (DO_TF_KEGGPATHWAY_ENRICHMENT or DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT) will  not be done
		if (keggPathwayEnrichment.equals(Commons.DO_KEGGPATHWAY_ENRICHMENT) && !(tfKeggPathwayEnrichment.equals(Commons.DO_TF_KEGGPATHWAY_ENRICHMENT)) && !(tfCellLineKeggPathwayEnrichment.equals(Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT))){
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS, jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsHistone(),keggPathwayEnrichment,KeyOrder.KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS, jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsHistone(),keggPathwayEnrichment,KeyOrder.KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS, jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsHistone(),keggPathwayEnrichment,KeyOrder.KEGGPATHWAYNUMBER);
		}
		
		if(tfKeggPathwayEnrichment.equals(Commons.DO_TF_KEGGPATHWAY_ENRICHMENT)){
	
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_NUMBER_OF_OVERLAPS, jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsTfbs(),Commons.DO_TF_ENRICHMENT,KeyOrder.TFNUMBER_CELLLINENUMBER);

			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS, jobName, numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsExonBasedKeggPathway(),Commons.DO_KEGGPATHWAY_ENRICHMENT,KeyOrder.KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS,  jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsRegulationBasedKeggPathway(),Commons.DO_KEGGPATHWAY_ENRICHMENT,KeyOrder.KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS,  jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsAllBasedKeggPathway(),Commons.DO_KEGGPATHWAY_ENRICHMENT,KeyOrder.KEGGPATHWAYNUMBER);

			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS,  jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonTfExonBasedKeggPathway(),Commons.DO_TF_KEGGPATHWAY_ENRICHMENT,KeyOrder.TFNUMBER_KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS, jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonTfRegulationBasedKeggPathway(),Commons.DO_TF_KEGGPATHWAY_ENRICHMENT,KeyOrder.TFNUMBER_KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS,  jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonTfAllBasedKeggPathway(),Commons.DO_TF_KEGGPATHWAY_ENRICHMENT,KeyOrder.TFNUMBER_KEGGPATHWAYNUMBER);

		}
		
		if (tfCellLineKeggPathwayEnrichment.equals(Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT)){
			
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_NUMBER_OF_OVERLAPS,  jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsTfbs(),Commons.DO_TF_ENRICHMENT,KeyOrder.TFNUMBER_CELLLINENUMBER);

			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS,  jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsExonBasedKeggPathway(),Commons.DO_KEGGPATHWAY_ENRICHMENT,KeyOrder.KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS,  jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsRegulationBasedKeggPathway(),Commons.DO_KEGGPATHWAY_ENRICHMENT,KeyOrder.KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS,  jobName,numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonsAllBasedKeggPathway(),Commons.DO_KEGGPATHWAY_ENRICHMENT,KeyOrder.KEGGPATHWAYNUMBER);

			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS, jobName, numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonTfCellLineExonBasedKeggPathway(),Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT,KeyOrder.TFNUMBER_CELLLINENUMBER_KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS, jobName, numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonTfCellLineRegulationBasedKeggPathway(),Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT,KeyOrder.TFNUMBER_CELLLINENUMBER_KEGGPATHWAYNUMBER);
			collectionofPermutationsResults.collectPermutationResults(bonferroniCorrectionSignificanceLevel,FDR,multipleTestingParameter,dataFolder,outputFolder,Commons.TO_BE_COLLECTED_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS, jobName, numberofRuns,numberofRemainders,numberofComparisons.getNumberofComparisonTfCellLineAllBasedKeggPathway(),Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT,KeyOrder.TFNUMBER_CELLLINENUMBER_KEGGPATHWAYNUMBER);

		}
		
	
	}

}