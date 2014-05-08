/**
 * @author Burcak Otlu
 * Jan 16, 2014
 * 4:28:36 PM
 * 2014
 *
 * 
 */
package augmentation.results;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import auxiliary.FileOperations;

import common.Commons;


public class AugmentationofEnrichedElementswithIntervals {

	/**
	 * 
	 */
	public AugmentationofEnrichedElementswithIntervals() {
	}
	
	//Read C:\Users\burcakotlu\GLANET\Output\Doktora\empiricalpvalues\toBeCollected\Histone
	//Augment it with C:\Users\burcakotlu\GLANET\Output\Doktora\annotate\intervals\parametric\original\histone overlaps
	//Write augmented results
	//For Histone
	public static void	readHistoneAllFileAugmentWrite(String outputFolder,String multipleTestingParameter,Float FDR, Float bonfCorrectionSignificanceLevel,String inputFileName, String outputFileName){
		String strLine1;
		String strLine2;
		
		int indexofFirstTab;
		int indexofSecondTab;
		int indexofThirdTab;
		int indexofFourthTab;
		int indexofFifthTab;
		int indexofSixthTab;
		int indexofSeventhTab;
		int indexofEigthTab; 
	
		String histoneNameCellLineName;
		
		Float bonfCorrectedPValue; 
		Float bhFDRAdjustedPValue;
		
		FileReader inputFileReader = null;
		BufferedReader bufferedReader = null;
		
		FileWriter outputFileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		FileReader histoneOriginalOverlapsFileReader = null;
		BufferedReader histoneOriginalOverlapsBufferedReader = null;
				
		List<String> enrichedHistoneElements = new ArrayList<String>();
				
		try {
			inputFileReader = new FileReader(outputFolder + inputFileName);
			bufferedReader 	= new BufferedReader(inputFileReader);
			
			outputFileWriter 	= FileOperations.createFileWriter(outputFolder + outputFileName);
			bufferedWriter 		= new BufferedWriter(outputFileWriter);

			//skip headerLine
			//Element	OriginalNumberofOverlaps	NumberofPermutationsHavingNumberofOverlapsGreaterThanorEqualTo in 10 Permutations	Number of Permutations	Number of comparisons	empiricalPValue	BonfCorrPVlaue: numberOfComparisons 82	BH FDR Adjusted P Value	Reject Null Hypothesis for an FDR of 0.05
			strLine1= bufferedReader.readLine();
			
			while ((strLine1= bufferedReader.readLine())!=null ){
				
				//example line
				//H2AZ_K562	129	0	10	162	0.00E+00	0.00E+00	0.00E+00	TRUE
	
				indexofFirstTab 	= strLine1.indexOf('\t');
				indexofSecondTab 	= strLine1.indexOf('\t',indexofFirstTab+1);
				indexofThirdTab 	= strLine1.indexOf('\t',indexofSecondTab+1);
				indexofFourthTab 	= strLine1.indexOf('\t',indexofThirdTab+1);
				indexofFifthTab 	= strLine1.indexOf('\t',indexofFourthTab+1);
				indexofSixthTab 	= strLine1.indexOf('\t',indexofFifthTab+1);
				indexofSeventhTab	= strLine1.indexOf('\t',indexofSixthTab+1);
				indexofEigthTab 	= strLine1.indexOf('\t',indexofSeventhTab+1);
						
				histoneNameCellLineName = strLine1.substring(0, indexofFirstTab);
							
				//Pay attention to the order
				bonfCorrectedPValue= Float.parseFloat(strLine1.substring(indexofSixthTab+1, indexofSeventhTab));
				bhFDRAdjustedPValue = Float.parseFloat(strLine1.substring(indexofSeventhTab+1, indexofEigthTab));
											
							
				if(multipleTestingParameter.equals(Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE)){					
					if (bhFDRAdjustedPValue <= FDR){					
						enrichedHistoneElements.add(histoneNameCellLineName);	
					}					
				}else if(multipleTestingParameter.equals(Commons.BONFERRONI_CORRECTED_P_VALUE)){					
					if (bonfCorrectedPValue <= bonfCorrectionSignificanceLevel){					
						enrichedHistoneElements.add(histoneNameCellLineName);	
					}					
				}					
			}//end of while : reading enriched dnase elements file line by line.
			
			
			
			//starts
			for(String histoneElementName: enrichedHistoneElements){
				
				bufferedWriter.write("**************" + "\t" + histoneElementName + "\t" + "**************" +  System.getProperty("line.separator"));
												
					histoneOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_HISTONE + "_" + histoneElementName + ".txt");						
					histoneOriginalOverlapsBufferedReader = new BufferedReader(histoneOriginalOverlapsFileReader);
							
					//Get all the lines of the original data annotation for the enriched Histone elements 
					//Write them to the file
					while((strLine2 = histoneOriginalOverlapsBufferedReader.readLine())!=null){
						bufferedWriter.write(histoneElementName + "\t" +strLine2 + System.getProperty("line.separator"));
					}
					
				
			}//End of for	
			//ends
						
			bufferedWriter.close();
			bufferedReader.close();
			
			if(histoneOriginalOverlapsBufferedReader!=null){
				histoneOriginalOverlapsBufferedReader.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	//Read C:\Users\burcakotlu\GLANET\Output\Doktora\empiricalpvalues\toBeCollected\Dnase\Dnase_all.txt
	//Augment it with annotate\\intervals\\parametric\\original\\dnase overlaps
	//Write augmented results
	//For Dnase
	public static void readDnaseAllFileAugmentWrite(String outputFolder,String multipleTestingParameter,Float FDR, Float bonfCorrectionSignificanceLevel,String inputFileName, String outputFileName){
	
		String strLine1;
		String strLine2;
		
		int indexofFirstTab;
		int indexofSecondTab;
		int indexofThirdTab;
		int indexofFourthTab;
		int indexofFifthTab;
		int indexofSixthTab;
		int indexofSeventhTab;
		int indexofEigthTab; 
	
		String dnaseElementName;
		
		Float bonfCorrectedPValue; 
		Float bhFDRAdjustedPValue;
		
		FileReader inputFileReader = null;
		BufferedReader bufferedReader = null;
		
		FileWriter outputFileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		FileReader dnaseOriginalOverlapFileReader = null;
		BufferedReader dnaseOriginalOverlapBufferedReader = null;
				
		List<String> enrichedDnaseElements = new ArrayList<String>();
				
		try {
			inputFileReader = new FileReader(outputFolder + inputFileName);
			bufferedReader = new BufferedReader(inputFileReader);
			
			outputFileWriter = FileOperations.createFileWriter(outputFolder + outputFileName);
			bufferedWriter = new BufferedWriter(outputFileWriter);

			//skip headerLine
			//Element	OriginalNumberofOverlaps	NumberofPermutationsHavingNumberofOverlapsGreaterThanorEqualTo in 10 Permutations	Number of Permutations	Number of comparisons	empiricalPValue	BonfCorrPVlaue: numberOfComparisons 82	BH FDR Adjusted P Value	Reject Null Hypothesis for an FDR of 0.05
			strLine1= bufferedReader.readLine();
			
			while ((strLine1= bufferedReader.readLine())!=null ){
				
//				Element	OriginalNumberofOverlaps	NumberofPermutationsHavingNumberofOverlapsGreaterThanorEqualTo in 8 Permutations	Number of Permutations	Number of comparisons	empiricalPValue	BonfCorrPValue for 82 comparisons	BH FDR Adjusted P Value	Reject Null Hypothesis for an FDR of 0.05
//				NHDF_NEO	51	0	8	82	0.00E+00	0.00E+00	0.00E+00	TRUE
				
				indexofFirstTab 	= strLine1.indexOf('\t');
				indexofSecondTab 	= strLine1.indexOf('\t',indexofFirstTab+1);
				indexofThirdTab 	= strLine1.indexOf('\t',indexofSecondTab+1);
				indexofFourthTab 	= strLine1.indexOf('\t',indexofThirdTab+1);
				indexofFifthTab 	= strLine1.indexOf('\t',indexofFourthTab+1);
				indexofSixthTab 	= strLine1.indexOf('\t',indexofFifthTab+1);
				indexofSeventhTab	= strLine1.indexOf('\t',indexofSixthTab+1);
				indexofEigthTab 	= strLine1.indexOf('\t',indexofSeventhTab+1);
						
				dnaseElementName = strLine1.substring(0, indexofFirstTab);
							
				//Pay attention to the order
				bonfCorrectedPValue= Float.parseFloat(strLine1.substring(indexofSixthTab+1, indexofSeventhTab));
				bhFDRAdjustedPValue = Float.parseFloat(strLine1.substring(indexofSeventhTab+1, indexofEigthTab));
				
				if(multipleTestingParameter.equals(Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE)){
					
					if (bhFDRAdjustedPValue <= FDR){					
						enrichedDnaseElements.add(dnaseElementName);	
					}
					
				}else if(multipleTestingParameter.equals(Commons.BONFERRONI_CORRECTED_P_VALUE)){
					
					if (bonfCorrectedPValue <= bonfCorrectionSignificanceLevel){					
						enrichedDnaseElements.add(dnaseElementName);	
					}
					
				}
										
			}//end of while : reading enriched dnase elements file line by line.
			
			
			
			//starts
			for(String dnaseName: enrichedDnaseElements){
				
				bufferedWriter.write("**************" + "\t" + dnaseName + "\t" + "**************" +  System.getProperty("line.separator"));
												
					dnaseOriginalOverlapFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_DNASE + "_" + dnaseName + ".txt");						
					dnaseOriginalOverlapBufferedReader = new BufferedReader(dnaseOriginalOverlapFileReader);
							
					//Get all the lines of the original data annotation for the enriched Dnase
					//Write them to the file
					while((strLine2 = dnaseOriginalOverlapBufferedReader.readLine())!=null){
						bufferedWriter.write(dnaseName + "\t" +strLine2 + System.getProperty("line.separator"));
					}
					
				
			}//End of for	
			//ends
			
			
			bufferedWriter.close();
			bufferedReader.close();
			
			if (dnaseOriginalOverlapBufferedReader!=null) {
				dnaseOriginalOverlapBufferedReader.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	
	//Read the empiricalpvalues\\output\\tobeCollected\\TfKeggPathway\\  
	//and
	//Augment it with annotate\\intervals\\parametric\\original\\tfKeggPathway overlapped intervals
	//Write augmented results
	//For Tf KeggPathway
	public static void readTfKeggPathwayAllAugmentWrite(String outputFolder,String multipleTestingParameter, Float FDR, Float bonfCorrectionSignificanceLevel, String inputFileName, String outputFileName, String type){
		String strLine1;
		String strLine2;
		
		int indexofFirstTab;
		int indexofSecondTab;
		int indexofThirdTab;
		int indexofFourthTab;
		int indexofFifthTab;
		int indexofSixthTab;
		int indexofSeventhTab;
		int indexofEigthTab;
		int indexofNinethTab;
		int indexofTenthTab;
			
		int indexofFirstUnderscore;
		
		String tfName_keggPathwayName;
		String keggPathwayName;
		String keggPathwayDescription;
		Float bonfCorrectedPValue; 
		String keggPathwayNameandDescription;
		
		Float bhFDRAdjustedPValue ;
		
		FileReader tfandKeggPathwayOriginalOverlapsFileReader = null;
		BufferedReader tfandKeggPathwayOriginalOverlapsBufferedReader = null;
		
		Map<String,List<String>> enrichedKeggPathways = new HashMap<String,List<String>>();
		List<String> lines;
				
		try {
			FileReader inputFileReader  = new FileReader(outputFolder + inputFileName);
			BufferedReader bufferedReader = new BufferedReader(inputFileReader);
			
			FileWriter outputFileWriter = FileOperations.createFileWriter(outputFolder + outputFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(outputFileWriter);
			
			//skip headerLine
			//Name	OriginalNumberofOverlaps	AccumulatedNumberofOverlaps	NumberofPermutations	NumberofComparisons	BonfCorrEmpiricalPValue	EmpiricalPValue
			strLine1= bufferedReader.readLine();
			
			while ((strLine1= bufferedReader.readLine())!=null ){
			

//				new example line
//				JUND_hsa05164	4	0	10000	40081	0.00E+00	0.00E+00	0.00E+00	TRUE
				
				indexofFirstTab 	= strLine1.indexOf('\t');
				indexofSecondTab 	= strLine1.indexOf('\t',indexofFirstTab+1);
				indexofThirdTab 	= strLine1.indexOf('\t',indexofSecondTab+1);
				indexofFourthTab 	= strLine1.indexOf('\t',indexofThirdTab+1);
				indexofFifthTab 	= strLine1.indexOf('\t',indexofFourthTab+1);
				indexofSixthTab 	= strLine1.indexOf('\t',indexofFifthTab+1);
				indexofSeventhTab	= strLine1.indexOf('\t',indexofSixthTab+1);
				indexofEigthTab 	= strLine1.indexOf('\t',indexofSeventhTab+1);
				indexofNinethTab 	= strLine1.indexOf('\t',indexofEigthTab+1);
				indexofTenthTab 	= strLine1.indexOf('\t',indexofNinethTab+1);
					
				tfName_keggPathwayName = strLine1.substring(0, indexofFirstTab);
				
				indexofFirstUnderscore = tfName_keggPathwayName.indexOf('_');
				keggPathwayName = tfName_keggPathwayName.substring(indexofFirstUnderscore+1,indexofFirstTab);
				
				
				//Pay attention to the order
				bonfCorrectedPValue= Float.parseFloat(strLine1.substring(indexofSixthTab+1, indexofSeventhTab));
				bhFDRAdjustedPValue = Float.parseFloat(strLine1.substring(indexofSeventhTab+1, indexofEigthTab));
				
				keggPathwayDescription = strLine1.substring(indexofNinethTab+1, indexofTenthTab);
				
				if(multipleTestingParameter.equals(Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE)){					
					if (bhFDRAdjustedPValue <= FDR){											
						lines = enrichedKeggPathways.get(keggPathwayName + "\t" + keggPathwayDescription);		
						if (lines==null){
							lines = new ArrayList<String>();
							lines.add(strLine1);
							enrichedKeggPathways.put(keggPathwayName+ "\t" +keggPathwayDescription, lines);
						}else{
							lines.add(strLine1);
						}			
					}					
				}else if(multipleTestingParameter.equals(Commons.BONFERRONI_CORRECTED_P_VALUE)){					
					if (bonfCorrectedPValue <= bonfCorrectionSignificanceLevel){											
						lines = enrichedKeggPathways.get(keggPathwayName + "\t" + keggPathwayDescription);		
						if (lines==null){
							lines = new ArrayList<String>();
							lines.add(strLine1);
							enrichedKeggPathways.put(keggPathwayName+ "\t" +keggPathwayDescription, lines);
						}else{
							lines.add(strLine1);
						}			
					}					
				}
								
					
			}//end of while : reading enriched tf and kegg Pathway file line by line.
			
			//for debug purposes start
			int numberofEnrichedTfExonBasedKeggPathwayElements = 0;
			//for debug purposes end
			
			for(Map.Entry<String,List<String>> entry: enrichedKeggPathways.entrySet()){
				keggPathwayNameandDescription = entry.getKey();
				indexofFirstTab = keggPathwayNameandDescription.indexOf("\t");
				keggPathwayDescription = keggPathwayNameandDescription.substring(indexofFirstTab+1);
				
				lines = entry.getValue();
				
				numberofEnrichedTfExonBasedKeggPathwayElements += lines.size();
				
				bufferedWriter.write("**************\t" + keggPathwayNameandDescription + "\t**************" + System.getProperty("line.separator"));
							
				for(String strLine: lines){
					indexofFirstTab = strLine.indexOf('\t');
					tfName_keggPathwayName = strLine.substring(0,indexofFirstTab);
					
					if(Commons.TF_EXON_BASED_KEGG_PATHWAY.equals(type)){
						tfandKeggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_TF_EXON_BASED_KEGG_PATHWAY + "_" + tfName_keggPathwayName + ".txt");						
					}else if (Commons.TF_REGULATION_BASED_KEGG_PATHWAY.equals(type)){
						tfandKeggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_TF_REGULATION_BASED_KEGG_PATHWAY + "_" + tfName_keggPathwayName + ".txt");						
					}else if (Commons.TF_ALL_BASED_KEGG_PATHWAY.equals(type)){
						tfandKeggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_TF_ALL_BASED_KEGG_PATHWAY + "_" + tfName_keggPathwayName + ".txt");					
					}
					
					tfandKeggPathwayOriginalOverlapsBufferedReader = new BufferedReader(tfandKeggPathwayOriginalOverlapsFileReader);
							
					//Get all the lines of the original data annotation for the enriched Tf and KeggPathway 
					//Write them to the file
					while((strLine2 = tfandKeggPathwayOriginalOverlapsBufferedReader.readLine())!=null){
						bufferedWriter.write(tfName_keggPathwayName + "\t" +strLine2 +  "\t" + keggPathwayDescription + System.getProperty("line.separator"));
					}
					
				} //End of for each enriched tf element with that enriched kegg pathway element  
			}//End of for each enriched Kegg Pathway element	
			
			//for debug purposes start
			System.out.println("numberofEnrichedTfExonBasedKeggPathwayElements " + numberofEnrichedTfExonBasedKeggPathwayElements);
			//for debug purposes end
			
			bufferedReader.close();
			bufferedWriter.close();
			
			if (tfandKeggPathwayOriginalOverlapsBufferedReader!=null) {
				tfandKeggPathwayOriginalOverlapsBufferedReader.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Read the empiricalpvalues\\toBeCollected\\TfCellLineKeggPathway
	//Augment it with annotate\\intervals\\parametric\\original\\TfCellLineKeggPathway overlapped intervals
	//Write augmented results
	//For Tf CellLine KeggPathway
	
	//ExampleLine
	//POL24H8_HCT116_hsa05020	0.00E+00	Prion diseases - Homo sapiens (human)	100506742, 10963, 1958, 2002, 2534, 3303, 3309, 3552, 3553, 3569, 3915, 4684, 4685, 4851, 5566, 5567, 5568, 5594, 5595, 5604, 5605, 5613, 5621, 581, 6352, 6647, 712, 713, 714, 727, 729, 730, 731, 732, 733, 735	CASP12, STIP1, EGR1, ELK1, FYN, HSPA1A, HSPA5, IL1A, IL1B, IL6, LAMC1, NCAM1, NCAM2, NOTCH1, PRKACA, PRKACB, PRKACG, MAPK1, MAPK3, MAP2K1, MAP2K2, PRKX, PRNP, BAX, CCL5, SOD1, C1QA, C1QB, C1QC, C5, C6, C7, C8A, C8B, C8G, C9
	public static void readTfCellLineKeggPathwayAllFileAugmentWrite(String outputFolder,String multipleTestingParameter,Float FDR, Float bonfCorrectionSignificanceLevel, String inputFileName, String outputFileName, String type){
		String strLine1;
		String strLine2;
		
		int indexofFirstTab;
		int indexofSecondTab;
		int indexofThirdTab;
		int indexofFourthTab;
		int indexofFifthTab;
		int indexofSixthTab;
		int indexofSeventhTab;
		int indexofEigthTab;
		int indexofNinethTab;
		int indexofTenthTab;
				
		int indexofFirstUnderscore;
		int indexofSecondUnderscore;
		
		String tfName_cellLineName_keggPathwayName;
		String keggPathwayName;
		Float bonfCorrectedPValue; 
		Float bhFDRAdjustedPValue;
		String keggPathwayDescription;
		String keggPathwayNameandDescription;
		
		FileReader tfCellLineKeggPathwayOriginalOverlapsFileReader = null;
		BufferedReader tfCellLineKeggPathwayOriginalOverlapsBufferedReader = null;
		
		Map<String,List<String>> enrichedKeggPathways = new HashMap<String,List<String>>();
		List<String> lines;
		
		try {
			FileReader inputFileReader  = new FileReader(outputFolder + inputFileName);
			BufferedReader bufferedReader = new BufferedReader(inputFileReader);
			
			FileWriter outputFileWriter = FileOperations.createFileWriter(outputFolder + outputFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(outputFileWriter);
			
			//Skip header line
			//Name	OriginalNumberofOverlaps	AccumulatedNumberofOverlaps	NumberofPermutations	NumberofComparisons	BonfCorrEmpiricalPValue	EmpiricalPValue
			strLine1= bufferedReader.readLine();
			
			while ((strLine1= bufferedReader.readLine())!=null ){
			
				//example line
				//AP2GAMMA_HELAS3_hsa00532	1	4	10000	109214	1E0	4E-4	Glycosaminoglycan biosynthesis - chondroitin sulfate / dermatan sulfate - Homo sapiens (human)	10090, 11285, 113189, 126792, 166012, 22856, 26229, 29940, 337876, 50515, 51363, 54480, 55454, 55501, 55790, 56548, 64131, 64132, 79586, 9469	UST, B4GALT7, CHST14, B3GALT6, CHST13, CHSY1, B3GAT3, DSE, CHSY3, CHST11, CHST15, CHPF2, CSGALNACT2, CHST12, CSGALNACT1, CHST7, XYLT1, XYLT2, CHPF, CHST3
				
//				new example line			
//				HEY1_K562_hsa05166	5	0	10000	109214	0.00E+00	0.00E+00	0.00E+00	TRUE

				indexofFirstTab = strLine1.indexOf('\t');
				indexofSecondTab = strLine1.indexOf('\t', indexofFirstTab+1);
				indexofThirdTab = strLine1.indexOf('\t',indexofSecondTab+1);
				indexofFourthTab 	= strLine1.indexOf('\t',indexofThirdTab+1);
				indexofFifthTab 	= strLine1.indexOf('\t',indexofFourthTab+1);
				indexofSixthTab 	= strLine1.indexOf('\t',indexofFifthTab+1);
				indexofSeventhTab	= strLine1.indexOf('\t',indexofSixthTab+1);
				indexofEigthTab 	= strLine1.indexOf('\t',indexofSeventhTab+1);
				indexofNinethTab 	= strLine1.indexOf('\t',indexofEigthTab+1);
				indexofTenthTab 	= strLine1.indexOf('\t',indexofNinethTab+1);
				
				
				tfName_cellLineName_keggPathwayName = strLine1.substring(0, indexofFirstTab);
				
				indexofFirstUnderscore = tfName_cellLineName_keggPathwayName.indexOf('_');
				indexofSecondUnderscore = tfName_cellLineName_keggPathwayName.indexOf('_',indexofFirstUnderscore+1);
				keggPathwayName = tfName_cellLineName_keggPathwayName.substring(indexofSecondUnderscore+1,indexofFirstTab);
				
				//Pay attention order is important
				bonfCorrectedPValue= Float.parseFloat(strLine1.substring(indexofSixthTab+1, indexofSeventhTab));
				bhFDRAdjustedPValue = Float.parseFloat(strLine1.substring(indexofSeventhTab+1, indexofEigthTab));
				
				keggPathwayDescription = strLine1.substring(indexofNinethTab+1, indexofTenthTab);
					
				if(multipleTestingParameter.equals(Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE)){
					
					if (bhFDRAdjustedPValue <= FDR){					
						
						lines = enrichedKeggPathways.get(keggPathwayName + "\t" + keggPathwayDescription);
						
						if (lines==null){
							lines = new ArrayList<String>();
							lines.add(strLine1);
							enrichedKeggPathways.put(keggPathwayName+ "\t" +keggPathwayDescription, lines);
						}else{
							lines.add(strLine1);
						}
					}
					
				}else if(multipleTestingParameter.equals(Commons.BONFERRONI_CORRECTED_P_VALUE)){
					
					if (bonfCorrectedPValue <= bonfCorrectionSignificanceLevel){					
						
						lines = enrichedKeggPathways.get(keggPathwayName + "\t" + keggPathwayDescription);
						
						if (lines==null){
							lines = new ArrayList<String>();
							lines.add(strLine1);
							enrichedKeggPathways.put(keggPathwayName+ "\t" +keggPathwayDescription, lines);
						}else{
							lines.add(strLine1);
						}
					}
					
				}
					
			}//End of while : reading Tf CellLine KeggPathway input file line by line
			
			
			
			for(Map.Entry<String,List<String>> entry: enrichedKeggPathways.entrySet()){
				
				keggPathwayNameandDescription = entry.getKey();
				indexofFirstTab = keggPathwayNameandDescription.indexOf("\t");
				keggPathwayDescription = keggPathwayNameandDescription.substring(indexofFirstTab+1);
										
				lines = entry.getValue();
								
				bufferedWriter.write("**************\t" + keggPathwayNameandDescription + "\t**************" + System.getProperty("line.separator"));
								
				for(String strLine: lines){
					indexofFirstTab = strLine.indexOf('\t');
					tfName_cellLineName_keggPathwayName = strLine.substring(0,indexofFirstTab);
					
					//Get the original data annotation results
					if(Commons.TF_CELLLINE_EXON_BASED_KEGG_PATHWAY.equals(type)){
						tfCellLineKeggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY + "_" + tfName_cellLineName_keggPathwayName + ".txt");
						
					}else if (Commons.TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY.equals(type)){
						tfCellLineKeggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY + "_" + tfName_cellLineName_keggPathwayName + ".txt");
						
					}else if (Commons.TF_CELLLINE_ALL_BASED_KEGG_PATHWAY.equals(type)){
						tfCellLineKeggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY + "_" + tfName_cellLineName_keggPathwayName + ".txt");
						
					}
					
					tfCellLineKeggPathwayOriginalOverlapsBufferedReader = new BufferedReader(tfCellLineKeggPathwayOriginalOverlapsFileReader);
					
					//Add the original data annotation results
					//Get all the lines of the original data annotation for the enriched cellline based Tf and KeggPathway 
					//Write them to the file
					while((strLine2 = tfCellLineKeggPathwayOriginalOverlapsBufferedReader.readLine())!=null){
						bufferedWriter.write(tfName_cellLineName_keggPathwayName + "\t" +strLine2 + "\t" + keggPathwayDescription + System.getProperty("line.separator"));	
					}
					
				}
			}	
				
		
			bufferedReader.close();
			bufferedWriter.close();
			
			if (tfCellLineKeggPathwayOriginalOverlapsBufferedReader!=null){
				tfCellLineKeggPathwayOriginalOverlapsBufferedReader.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	//read KeggPathwayall File
	//Augment EnrichedKeggPathwayElements with  original Overlapped Intervals and Write
	public static void readKeggPathwayAllFileAugmentWrite(String outputFolder,String multipleTestingParameter,Float FDR, Float bonfCorrectionSignificanceLevel,String inputFileName, String outputFileName,String type){
		String strLine1;
		String strLine2;
		
		int indexofFirstTab;
		int indexofSecondTab;
		int indexofThirdTab;
		int indexofFourthTab;
		int indexofFifthTab;
		int indexofSixthTab;
		int indexofSeventhTab;
		int indexofEigthTab;
		int indexofNinethTab;
		int indexofTenthTab;
		
		int indexofUnderscore;
						
		String keggPathwayName;
		String keggPathwayDescription;

		Float bonfCorrectedPValue; 
		Float bhFDRAdjustedPValue ;
		
		FileReader keggPathwayOriginalOverlapsFileReader = null;
		BufferedReader keggPathwayOriginalOverlapsBufferedReader = null;
		
		List<String> enrichedKeggPathways = new ArrayList<String>();
				
		try {
			FileReader inputFileReader  = new FileReader(outputFolder + inputFileName);
			BufferedReader bufferedReader = new BufferedReader(inputFileReader);
			
			FileWriter outputFileWriter = FileOperations.createFileWriter(outputFolder + outputFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(outputFileWriter);
			
			//skip headerLine
//			Element	OriginalNumberofOverlaps	NumberofPermutationsHavingNumberofOverlapsGreaterThanorEqualTo in 8 Permutations	Number of Permutations	Number of comparisons	empiricalPValue	BonfCorrPValue for 269 comparisons	BH FDR Adjusted P Value	Reject Null Hypothesis for an FDR of 0.05			
			strLine1= bufferedReader.readLine();
			
			while ((strLine1= bufferedReader.readLine())!=null ){
			
//				Element	OriginalNumberofOverlaps	NumberofPermutationsHavingNumberofOverlapsGreaterThanorEqualTo in 8 Permutations	Number of Permutations	Number of comparisons	empiricalPValue	BonfCorrPValue for 269 comparisons	BH FDR Adjusted P Value	Reject Null Hypothesis for an FDR of 0.05			
//				hsa04960	13	0	8	269	0.00E+00	0.00E+00	0.00E+00	TRUE	Aldosterone-regulated sodium reabsorption - Homo sapiens (human)	23327, 23439, 23533, 2810, 3291, 3479, 3630, 3643, 3667, 3758, 3845, 4306, 476, 477, 478, 480, 481, 482, 483, 486, 5170, 5290, 5291, 5293, 5294, 5295, 5296, 53828, 5578, 5579, 5582, 5594, 5595, 6337, 6338, 6340, 6446, 8503, 9351	NEDD4L, ATP1B4, PIK3R5, SFN, HSD11B2, IGF1, INS, INSR, IRS1, KCNJ1, KRAS, NR3C2, ATP1A1, ATP1A2, ATP1A3, ATP1A4, ATP1B1, ATP1B2, ATP1B3, FXYD2, PDPK1, PIK3CA, PIK3CB, PIK3CD, PIK3CG, PIK3R1, PIK3R2, FXYD4, PRKCA, PRKCB, PRKCG, MAPK1, MAPK3, SCNN1A, SCNN1B, SCNN1G, SGK1, PIK3R3, SLC9A3R2
				
				indexofFirstTab 	= strLine1.indexOf('\t');
				indexofSecondTab 	= strLine1.indexOf('\t',indexofFirstTab+1);
				indexofThirdTab 	= strLine1.indexOf('\t',indexofSecondTab+1);
				indexofFourthTab 	= strLine1.indexOf('\t',indexofThirdTab+1);
				indexofFifthTab 	= strLine1.indexOf('\t',indexofFourthTab+1);
				indexofSixthTab 	= strLine1.indexOf('\t',indexofFifthTab+1);
				indexofSeventhTab	= strLine1.indexOf('\t',indexofSixthTab+1);
				indexofEigthTab 	= strLine1.indexOf('\t',indexofSeventhTab+1);
				indexofNinethTab 	= strLine1.indexOf('\t',indexofEigthTab+1);
				indexofTenthTab 	= strLine1.indexOf('\t',indexofNinethTab+1);
					
				keggPathwayName = strLine1.substring(0, indexofFirstTab);
									
				
				//Pay attention to the order
				bonfCorrectedPValue= Float.parseFloat(strLine1.substring(indexofSixthTab+1, indexofSeventhTab));
				bhFDRAdjustedPValue = Float.parseFloat(strLine1.substring(indexofSeventhTab+1, indexofEigthTab));
				
				keggPathwayDescription = strLine1.substring(indexofNinethTab+1, indexofTenthTab);
				
				if(multipleTestingParameter.equals(Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE)){
					if (bhFDRAdjustedPValue <= FDR){											
						enrichedKeggPathways.add(keggPathwayName + "_" + keggPathwayDescription);
					}					
				}else if(multipleTestingParameter.equals(Commons.BONFERRONI_CORRECTED_P_VALUE)){					
					if (bonfCorrectedPValue <= bonfCorrectionSignificanceLevel){					
						enrichedKeggPathways.add(keggPathwayName + "_" + keggPathwayDescription);																
					}					
				}												
			}//end of while : reading enriched kegg Pathway file line by line.
			
			//starts
			for(String enrichedKeggPathwayNameandDescription: enrichedKeggPathways){
				
				bufferedWriter.write("**************" + "\t" + enrichedKeggPathwayNameandDescription + "\t" + "**************" +  System.getProperty("line.separator"));
				
				indexofUnderscore = enrichedKeggPathwayNameandDescription.indexOf('_');
				keggPathwayName = enrichedKeggPathwayNameandDescription.substring(0,indexofUnderscore);
				
				if (type.equals(Commons.EXON_BASED_KEGG_PATHWAY)){
					keggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_EXON_BASED_KEGG_PATHWAY_ANALYSIS + "_exonBased_" + keggPathwayName + ".txt");						
					
				}else if (type.equals(Commons.REGULATION_BASED_KEGG_PATHWAY)){
					keggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_REGULATION_BASED_KEGG_PATHWAY_ANALYSIS + "_regulationBased_" + keggPathwayName + ".txt");						
					
				}else if (type.equals(Commons.ALL_BASED_KEGG_PATHWAY)){
					keggPathwayOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_ALL_BASED_KEGG_PATHWAY_ANALYSIS + "_allBased_" + keggPathwayName + ".txt");						
					
				}
				
				keggPathwayOriginalOverlapsBufferedReader = new BufferedReader(keggPathwayOriginalOverlapsFileReader);
				
										
				//Get all the lines of the original data annotation for the enriched Kegg Pathway Elements
				//Write them to the file
				while((strLine2 = keggPathwayOriginalOverlapsBufferedReader.readLine())!=null){
					bufferedWriter.write(enrichedKeggPathwayNameandDescription + "\t" +strLine2 + System.getProperty("line.separator"));
				}					
				
			}//End of for	
			//ends
			
				
		
			bufferedReader.close();
			bufferedWriter.close();
			
			if (keggPathwayOriginalOverlapsBufferedReader!=null){
				keggPathwayOriginalOverlapsBufferedReader.close();
				
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readTfAllFileAugmentWrite(String outputFolder,String multipleTestingParameter,Float FDR, Float bonfCorrectionSignificanceLevel,String inputFileName, String outputFileName){
		String strLine1;
		String strLine2;
		
		int indexofFirstTab;
		int indexofSecondTab;
		int indexofThirdTab;
		int indexofFourthTab;
		int indexofFifthTab;
		int indexofSixthTab;
		int indexofSeventhTab;
		int indexofEigthTab; 
	
		String tfNameCellLineName;
		
		Float bonfCorrectedPValue; 
		Float bhFDRAdjustedPValue;
		
		FileReader inputFileReader = null;
		BufferedReader bufferedReader = null;
		
		FileWriter outputFileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		FileReader tfOriginalOverlapsFileReader = null;
		BufferedReader tfOriginalOverlapsBufferedReader = null;
				
		List<String> enrichedTfElements = new ArrayList<String>();
				
		try {
			inputFileReader = new FileReader(outputFolder + inputFileName);
			bufferedReader = new BufferedReader(inputFileReader);
			
			outputFileWriter = FileOperations.createFileWriter(outputFolder + outputFileName);
			bufferedWriter = new BufferedWriter(outputFileWriter);

			//skip headerLine
			//Element	OriginalNumberofOverlaps	NumberofPermutationsHavingNumberofOverlapsGreaterThanorEqualTo in 10 Permutations	Number of Permutations	Number of comparisons	empiricalPValue	BonfCorrPVlaue: numberOfComparisons 82	BH FDR Adjusted P Value	Reject Null Hypothesis for an FDR of 0.05
			strLine1= bufferedReader.readLine();
			
			while ((strLine1= bufferedReader.readLine())!=null ){
				
				//example line
				//H2AZ_K562	129	0	10	162	0.00E+00	0.00E+00	0.00E+00	TRUE
	
				indexofFirstTab 	= strLine1.indexOf('\t');
				indexofSecondTab 	= strLine1.indexOf('\t',indexofFirstTab+1);
				indexofThirdTab 	= strLine1.indexOf('\t',indexofSecondTab+1);
				indexofFourthTab 	= strLine1.indexOf('\t',indexofThirdTab+1);
				indexofFifthTab 	= strLine1.indexOf('\t',indexofFourthTab+1);
				indexofSixthTab 	= strLine1.indexOf('\t',indexofFifthTab+1);
				indexofSeventhTab	= strLine1.indexOf('\t',indexofSixthTab+1);
				indexofEigthTab 	= strLine1.indexOf('\t',indexofSeventhTab+1);
						
				tfNameCellLineName = strLine1.substring(0, indexofFirstTab);
							
				//Pay attention to the order
				bonfCorrectedPValue= Float.parseFloat(strLine1.substring(indexofSixthTab+1, indexofSeventhTab));
				bhFDRAdjustedPValue = Float.parseFloat(strLine1.substring(indexofSeventhTab+1, indexofEigthTab));
											
							
				if(multipleTestingParameter.equals(Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE)){				
					if (bhFDRAdjustedPValue <= FDR){					
						enrichedTfElements.add(tfNameCellLineName);	
					}					
				}else if(multipleTestingParameter.equals(Commons.BONFERRONI_CORRECTED_P_VALUE)){					
					if (bonfCorrectedPValue <= bonfCorrectionSignificanceLevel){					
						enrichedTfElements.add(tfNameCellLineName);	
					}					
				}					
			}//end of while : reading enriched dnase elements file line by line.
			
						
			//starts
			for(String tfElementName: enrichedTfElements){
				
				bufferedWriter.write("**************" + "\t" + tfElementName + "\t" + "**************" +  System.getProperty("line.separator"));
												
					tfOriginalOverlapsFileReader = new FileReader(outputFolder + Commons.ANNOTATE_INTERVALS_USING_INTERVAL_TREE_OUTPUT_FILE_PATH_FOR_TFBS + "_" + tfElementName + ".txt");						
					tfOriginalOverlapsBufferedReader = new BufferedReader(tfOriginalOverlapsFileReader);
							
					//Get all the lines of the original data annotation for the enriched Tf elements
					//Write them to the file
					while((strLine2 = tfOriginalOverlapsBufferedReader.readLine())!=null){
						bufferedWriter.write(tfElementName + "\t" +strLine2 + System.getProperty("line.separator"));
					}					
				
			}//End of for	
			//ends
						
			bufferedWriter.close();
			bufferedReader.close();
			
			if(tfOriginalOverlapsBufferedReader!=null){
				tfOriginalOverlapsBufferedReader.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	public static void readandWriteFiles(String outputFolder,String multipleTestingParameter,Float FDR, Float bonfCorrectionSignificanceLevel,String dnaseEnrichment, String histoneEnrichment, String tfEnrichment, String keggPathwayEnrichment,String tfKeggPathwayEnrichment, String tfCellLineKeggPathwayEnrichment){
		String withRespectToFileName = null;
		
		//set the file end String
		if (multipleTestingParameter.equals(Commons.BENJAMINI_HOCHBERG_FDR_ADJUSTED_P_VALUE)){
			withRespectToFileName = Commons.ALL_WITH_RESPECT_TO_BH_FDR_ADJUSTED_P_VALUE;
		}else if (multipleTestingParameter.equals(Commons.BONFERRONI_CORRECTED_P_VALUE)){
			withRespectToFileName = Commons.ALL_WITH_RESPECT_TO_BONF_CORRECTED_P_VALUE;
		}
		
		 if (dnaseEnrichment.equals(Commons.DO_DNASE_ENRICHMENT)){
			 readDnaseAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_DNASE_NUMBER_OF_OVERLAPS  + withRespectToFileName, Commons.AUGMENTED_DNASE_RESULTS);	
		 }
		 
		 if (histoneEnrichment.equals(Commons.DO_HISTONE_ENRICHMENT)){
			 readHistoneAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_HISTONE_NUMBER_OF_OVERLAPS  + withRespectToFileName, Commons.AUGMENTED_HISTONE_RESULTS);	
		 }
		 
		 if (tfEnrichment.equals(Commons.DO_TF_ENRICHMENT)){
			 readTfAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_TF_NUMBER_OF_OVERLAPS + withRespectToFileName, Commons.AUGMENTED_TF_RESULTS);
		 }
		 
		 if (keggPathwayEnrichment.equals(Commons.DO_KEGGPATHWAY_ENRICHMENT)){
			 readKeggPathwayAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel, Commons.TO_BE_COLLECTED_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS  + withRespectToFileName, Commons.AUGMENTED_EXON_BASED_KEGG_PATHWAY_RESULTS, Commons.EXON_BASED_KEGG_PATHWAY);
			 readKeggPathwayAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel, Commons.TO_BE_COLLECTED_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS  + withRespectToFileName, Commons.AUGMENTED_REGULATION_BASED_KEGG_PATHWAY_RESULTS,Commons.REGULATION_BASED_KEGG_PATHWAY);
			 readKeggPathwayAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel, Commons.TO_BE_COLLECTED_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS  + withRespectToFileName, Commons.AUGMENTED_ALL_BASED_KEGG_PATHWAY_RESULTS,Commons.ALL_BASED_KEGG_PATHWAY);
		 }
		
	     if (tfKeggPathwayEnrichment.equals(Commons.DO_TF_KEGGPATHWAY_ENRICHMENT)){	    	 
	    	 readTfKeggPathwayAllAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_TF_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS  + withRespectToFileName, Commons.AUGMENTED_TF_EXON_BASED_KEGG_PATHWAY_RESULTS, Commons.TF_EXON_BASED_KEGG_PATHWAY);
	    	 readTfKeggPathwayAllAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_TF_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS + withRespectToFileName, Commons.AUGMENTED_TF_REGULATION_BASED_KEGG_PATHWAY_RESULTS, Commons.TF_REGULATION_BASED_KEGG_PATHWAY);
	    	 readTfKeggPathwayAllAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_TF_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS + withRespectToFileName, Commons.AUGMENTED_TF_ALL_BASED_KEGG_PATHWAY_RESULTS, Commons.TF_ALL_BASED_KEGG_PATHWAY);			
	     }
		
	     if (tfCellLineKeggPathwayEnrichment.equals(Commons.DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT)){
	    	 readTfCellLineKeggPathwayAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS + withRespectToFileName, Commons.AUGMENTED_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_RESULTS, Commons.TF_CELLLINE_EXON_BASED_KEGG_PATHWAY);
	    	 readTfCellLineKeggPathwayAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS + withRespectToFileName, Commons.AUGMENTED_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_RESULTS, Commons.TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY);
	    	 readTfCellLineKeggPathwayAllFileAugmentWrite(outputFolder,multipleTestingParameter,FDR,bonfCorrectionSignificanceLevel,Commons.TO_BE_COLLECTED_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS+ withRespectToFileName, Commons.AUGMENTED_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_RESULTS, Commons.TF_CELLLINE_ALL_BASED_KEGG_PATHWAY);
	     }

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
//		String dataFolder 	= glanetFolder + System.getProperty("file.separator") + Commons.DATA + System.getProperty("file.separator") ;
		String outputFolder = glanetFolder + System.getProperty("file.separator") + Commons.OUTPUT + System.getProperty("file.separator") ;
		
		String multipleTestingParameter = args[6];
		Float FDR = Float.parseFloat(args[8]);
		Float bonfCorrectionSignificanceLevel = Float.parseFloat(args[7]);

		String dnaseEnrichment = args[10];
		String histoneEnrichment  = args[11];
		String tfEnrichment = args[12];
		String keggPathwayEnrichment  = args[13];
		String tfKeggPathwayEnrichment = args[14];
		String tfCellLineKeggPathwayEnrichment = args[15];
	
		
		//delete old files starts 
		FileOperations.deleteDirectoriesandFilesUnderThisDirectory(outputFolder + Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_ORIGINAL_INTERVALS_RESULTS_DIRECTORY);
		//delete old files ends
			
		
		AugmentationofEnrichedElementswithIntervals.readandWriteFiles(outputFolder,multipleTestingParameter,FDR, bonfCorrectionSignificanceLevel,dnaseEnrichment,histoneEnrichment,tfEnrichment,keggPathwayEnrichment,tfKeggPathwayEnrichment,tfCellLineKeggPathwayEnrichment);
		

	}

}
//