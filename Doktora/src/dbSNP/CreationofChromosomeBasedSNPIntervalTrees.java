/**
 * @author Burcak Otlu
 * Mar 7, 2014
 * 9:16:52 AM
 * 2014
 *
 * 
 */
package dbSNP;


import intervaltree.IntervalTree;
import intervaltree.IntervalTreeNode;
import intervaltree.OtherIntervalTreeNode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ui.GlanetRunner;
import common.Commons;
import enumtypes.ChromosomeName;

public class CreationofChromosomeBasedSNPIntervalTrees {

	/**
	 * 
	 */
	public CreationofChromosomeBasedSNPIntervalTrees() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void getObservedVariationAlleles(String alleles, List<String> observedVariationAlleles){
		//possible alleles
		//		'C/T'
		//		'-/AT'
		//		'-/A'
		//		'C/T'
		//		'-/AAAAAAA'
		//		'A/C/G/T'
		//		'-/C/CAGT'

		int indexofFormerSlash;
		int indexofLatterSlash;
		int indexofFirstSingleQuote;
		int indexofLastSingleQuote;
		
		String allele;

		indexofFormerSlash = alleles.indexOf('/');
		indexofLatterSlash = alleles.indexOf('/',indexofFormerSlash+1);
		indexofFirstSingleQuote = alleles.indexOf('\'');
		indexofLastSingleQuote = alleles.indexOf('\'',indexofFirstSingleQuote+1);
		
		if (indexofFormerSlash!=-1 && indexofFirstSingleQuote!=-1){
				
			
			allele = alleles.substring(indexofFirstSingleQuote+1,indexofFormerSlash);	
			observedVariationAlleles.add(allele);
			
			while (indexofLatterSlash!=-1){
				allele = alleles.substring(indexofFormerSlash+1,indexofLatterSlash);
				observedVariationAlleles.add(allele);
				
				indexofFormerSlash = indexofLatterSlash;
				indexofLatterSlash = alleles.indexOf('/',indexofFormerSlash+1);
				
			}//end of while
			
			allele = alleles.substring(indexofFormerSlash+1,indexofLastSingleQuote);
			observedVariationAlleles.add(allele);
		
				
//			allelesObservedNucleotide1 = alleles.charAt(indexofSlash-1);
//			allelesObservedNucleotide2 = alleles.charAt(indexofSlash+1);
//			
//			complementAllelesObservedNucleotide1 = takeComplement(allelesObservedNucleotide1);
//			complementAllelesObservedNucleotide2 = takeComplement(allelesObservedNucleotide2);
	
		}		
	}

	public static void  takeComplement(List<String> observedVariationAlleles,List<String> complementedReducedObservedVariationAlleles){
		
		for (String allele: observedVariationAlleles){
			if (allele.length() == 1 && allele.charAt(0)!='-'){
				
				
					switch(allele.charAt(0)){
					
					case 'A':	
					case 'a':{	complementedReducedObservedVariationAlleles.add(Commons.NUCLEOTIDE_T);
								break;
					}
					
					case 'C': 	
					case 'c':{	complementedReducedObservedVariationAlleles.add(Commons.NUCLEOTIDE_G);
								break;
					}
					
					case 'G': 	
					case 'g':{ 	complementedReducedObservedVariationAlleles.add(Commons.NUCLEOTIDE_C);
								break;
					}
					
					case 'T':	
					case 't':{	complementedReducedObservedVariationAlleles.add(Commons.NUCLEOTIDE_A);
								break;
					}
					
						
								
				
				}//End of switch
			}
		}
		
		
		
	}
	
	public static IntervalTree readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(String dataFolder,String inputFileName,String chrName){
		//pilot example
		FileReader  fileReader = null;
		BufferedReader bufferedReader = null;
		String strLine;
		
		int indexofFirstPipe;
		int indexofSecondPipe;
		int indexofThirdPipe;
		int indexofFourthPipe;
		int indexofFifthPipe;
		int indexofSixthPipe;
		int indexofSeventhPipe;
		int indexofEighthPipe;
		
		int indexofEqualSign;
			
		
		String rsId = "Unknown";
		String alleles;
		String  alleleswithEqualSign;
		String subString;
		
		int count = 0;
		
		String assembly;
		String chrNumberwithEqualSign;
		String chrNumber;
		String chrPositionwithEqualSign;
		String chrPositionString;
		int chrPositionOneBased = -1;
		int chrPositionZeroBased = -1;
		char orient;
		String orientwithEqualSign;
		
		
		IntervalTree dbSNPIntervalTree = new IntervalTree();
		
		List<String> observedVariationAlleles = null;
		
		try {
			fileReader = new FileReader(dataFolder + inputFileName);
			bufferedReader = new BufferedReader(fileReader);
			
			while((strLine = bufferedReader.readLine())!=null){
				indexofFirstPipe = strLine.indexOf('|');
				
				if(indexofFirstPipe!=-1){
					subString = strLine.substring(0, indexofFirstPipe);
					
//					*************************
//					 rs520810 
//					 alleles='C/T' 
//					 assembly=GRCh37.p10 	chr=1 	 chr-pos=143665220 	 	
//					 assembly=GRCh37.p10 	chr=1 	 chr-pos=147852732 	 	
//					 assembly=GRCh37.p10 	chr=1 	 chr-pos=? 	 	
//					 assembly=HuRef 	 	chr=1 	 chr-pos=118991777 	 	
//					 assembly=CHM1_1.0 	 	chr=1 	 chr-pos=154854038 	 	
//					 assembly=CHM1_1.0 	 	chr=1 	 chr-pos=144890008 	 	
//					*************************

					
					
//					rs171 | human | 9606 | snp | genotype=YES | submitterlink=YES | updated 2012-11-29 09:30					
//					rs	1. Rs.attlist.rsId
//		            	2. ExchangeSet.sourceDatabase.attlist.organism  (common name for species used as part of database name)
//		            	3. ExchangeSet.sourceDatabase.attlist.taxId     (NCBI taxonomy ID for variation)
//		            	4. Rs.attlist.snpClass                          (snp; in-del; heterozygous; microsatellite; named-locus; no-variation; mixed; multinucleotide-
					if (subString.startsWith("rs")){
						rsId = subString;
						count++;
						
//						GlanetRunner.appendLog("*************************");
//						GlanetRunner.appendLog(rsId);
					}
					
//					SNP     1. Rs.sequence.observed                         (observed variation alleles)
//		            		2. Rs.het.attlist.value                         (Estimated average heterozygosity from allele frequencies)
//		            		3. Rs.het.attlist.stdError                      (Standard error of heterozygosity estimate)
//		            		4. Rs.AlleleOrigin                              (unknown; germline; somatic; inherited; paternal; maternal; de-novo; bipaternal; unipaternal; not-tested; tested-inconclusive)

					//SNP | alleles='C/T' | het=0.23353 | se(het)=0.249457
					else if (subString.startsWith("SNP")){
						
						observedVariationAlleles = new ArrayList<String>();
						
						indexofSecondPipe = strLine.indexOf('|',indexofFirstPipe+1);
				
						alleleswithEqualSign = strLine.substring(indexofFirstPipe+1, indexofSecondPipe).trim();
						indexofEqualSign = alleleswithEqualSign.indexOf('=');
						alleles = alleleswithEqualSign.substring(indexofEqualSign+1);
					
//						GlanetRunner.appendLog(alleles);
						getObservedVariationAlleles(alleles,observedVariationAlleles);
						
						
					}
					
//					GMAF	1. Rs.Frequency.allele                          (frequency reporting allele)
//		            		2. Rs.Frequency.sampleSize                      (number of chromosomes)
//		            		3. Rs.Frequency.freq                            (allele frequency)

					//GMAF | allele=T | count=2178 | MAF=0.134986
					else if(subString.startsWith("GMAF")){
						//skip 
					}
					
					
//					KEYWORD        docsum.asn field                  (Value(s) or definition(s))
//					CTG         1. Assembly.attlist.groupLabel       (High-level classification of the assembly)
//					            2. Component.attlist.chromosome      (Organism specific chromosome)
//					            3. MapLoc.attlist.physmapInt         (Chromosome position)
//					            4. Component.attlist.accession       (Accession.version for the sequence component)						
//					            5. MapLoc.attlist.asnFrom            (Starting map location in contig coordinates)
//					            6. MapLoc.attlist.asnTo              (Ending map location in contig oordinates)
//					            7. MapLoc.attlist.loctype            (1=insertion; 2=exact;3=deletion;4=range-insertion;5=range-exact;6=range-deletion)
//					            8. MapLoc.attlist.orient             (+ =forward, - =reverse)

					//CTG | assembly=GRCh37.p10 | chr=1 | chr-pos=175261679 | NT_004487.19 | ctg-start=26750321 | ctg-end=26750321 | loctype=2 | orient=-
					//CTG | assembly=HuRef | chr=7 | chr-pos=24923427 | NW_001839003.1 | ctg-start=18766652 | ctg-end=18766652 | loctype=2 | orient=+
					else if(subString.startsWith("CTG")){
						indexofSecondPipe = strLine.indexOf('|',indexofFirstPipe+1);
						indexofThirdPipe = strLine.indexOf('|',indexofSecondPipe+1);
						indexofFourthPipe = strLine.indexOf('|',indexofThirdPipe+1);
						indexofFifthPipe = strLine.indexOf('|',indexofFourthPipe+1);
						indexofSixthPipe = strLine.indexOf('|',indexofFifthPipe+1);
						indexofSeventhPipe = strLine.indexOf('|',indexofSixthPipe+1);
						indexofEighthPipe = strLine.indexOf('|',indexofSeventhPipe+1);
						
						assembly = strLine.substring(indexofFirstPipe+1, indexofSecondPipe);
						
						chrNumberwithEqualSign = strLine.substring(indexofSecondPipe+1, indexofThirdPipe).trim();
						indexofEqualSign = chrNumberwithEqualSign.indexOf('=');				
						chrNumber = "chr" + chrNumberwithEqualSign.substring(indexofEqualSign+1);
						
						chrPositionwithEqualSign = strLine.substring(indexofThirdPipe+1, indexofFourthPipe).trim();
						indexofEqualSign = chrPositionwithEqualSign.indexOf('=');		
						chrPositionString =chrPositionwithEqualSign.substring(indexofEqualSign+1);
						
						if(assembly.contains("GRCh37.p10") && chrNumber.equals(chrName) && !chrPositionString.startsWith("?")){
							
							chrPositionOneBased = Integer.parseInt(chrPositionString);
							
							//dbSNP flat files contain 1-based coordinates
							//Convert 1-based coordinate to 0-based coordinate
							chrPositionZeroBased= chrPositionOneBased-1;
							
							IntervalTreeNode node = new OtherIntervalTreeNode(rsId, ChromosomeName.convertStringtoEnum(chrNumber), chrPositionZeroBased, observedVariationAlleles);
							dbSNPIntervalTree.intervalTreeInsert(dbSNPIntervalTree,node);
							
						}
								
						orientwithEqualSign = strLine.substring(indexofEighthPipe+1).trim();
						indexofEqualSign = orientwithEqualSign.indexOf('=');	
						orient = orientwithEqualSign.substring(indexofEqualSign+1).charAt(0);
											
						
//						GlanetRunner.appendLog(assembly + "\t" + chrNumber + "\t" + chrPosition + "\t" + orient + "\t");
						
						
					}
				}//End of if indexofFirstPipe is not -1

			}
			
			GlanetRunner.appendLog("number of snps is: " + count);
			//Close bufferedReader
			bufferedReader.close();
			
			return dbSNPIntervalTree;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
		
	
	public static IntervalTree readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTreeforGivenChromosome(String dataFolder,String chrName){
		
		switch(chrName){
		
			case Commons.CHROMOSOME1 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR1,Commons.CHROMOSOME1); 
			case Commons.CHROMOSOME2 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR2,Commons.CHROMOSOME2); 
			case Commons.CHROMOSOME3 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR3,Commons.CHROMOSOME3); 
			case Commons.CHROMOSOME4 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR4,Commons.CHROMOSOME4); 
			case Commons.CHROMOSOME5 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR5,Commons.CHROMOSOME5); 
			case Commons.CHROMOSOME6 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR6,Commons.CHROMOSOME6); 
			case Commons.CHROMOSOME7 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR7,Commons.CHROMOSOME7); 
			case Commons.CHROMOSOME8 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR8,Commons.CHROMOSOME8); 
			case Commons.CHROMOSOME9 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR9,Commons.CHROMOSOME9); 
			case Commons.CHROMOSOME10 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR10,Commons.CHROMOSOME10); 
			case Commons.CHROMOSOME11 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR11,Commons.CHROMOSOME11); 
			case Commons.CHROMOSOME12 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR12,Commons.CHROMOSOME12); 
			case Commons.CHROMOSOME13 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR13,Commons.CHROMOSOME13); 
			case Commons.CHROMOSOME14 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR14,Commons.CHROMOSOME14); 
			case Commons.CHROMOSOME15 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR15,Commons.CHROMOSOME15); 
			case Commons.CHROMOSOME16 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR16,Commons.CHROMOSOME16); 
			case Commons.CHROMOSOME17 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR17,Commons.CHROMOSOME17); 
			case Commons.CHROMOSOME18 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR18,Commons.CHROMOSOME18); 
			case Commons.CHROMOSOME19 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR19,Commons.CHROMOSOME19); 
			case Commons.CHROMOSOME20 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR20,Commons.CHROMOSOME20); 
			case Commons.CHROMOSOME21 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR21,Commons.CHROMOSOME21); 
			case Commons.CHROMOSOME22 : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR22,Commons.CHROMOSOME22); 
			case Commons.CHROMOSOMEX  : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHRX,Commons.CHROMOSOMEX); 
			case Commons.CHROMOSOMEY : return readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHRY,Commons.CHROMOSOMEY); 
		
		}
		
		return null;
	}
	
	public static void readDBSNPFlatFilesandCreateChromosomeBasedSNPIntervalTrees(String dataFolder){
		
		IntervalTree dbSNPIntervalTreeChr1 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR1,Commons.CHROMOSOME1);
		IntervalTree dbSNPIntervalTreeChr2 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR2,Commons.CHROMOSOME2);
		IntervalTree dbSNPIntervalTreeChr3 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR3,Commons.CHROMOSOME3);
		IntervalTree dbSNPIntervalTreeChr4 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR4,Commons.CHROMOSOME4);
		IntervalTree dbSNPIntervalTreeChr5 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR5,Commons.CHROMOSOME5);
		IntervalTree dbSNPIntervalTreeChr6 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR6,Commons.CHROMOSOME6);
		IntervalTree dbSNPIntervalTreeChr7 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR7,Commons.CHROMOSOME7);
		IntervalTree dbSNPIntervalTreeChr8 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR8,Commons.CHROMOSOME8);
		IntervalTree dbSNPIntervalTreeChr9 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR9,Commons.CHROMOSOME9);
		IntervalTree dbSNPIntervalTreeChr10 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR10,Commons.CHROMOSOME10);
		IntervalTree dbSNPIntervalTreeChr11 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR11,Commons.CHROMOSOME11);
		IntervalTree dbSNPIntervalTreeChr12 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR12,Commons.CHROMOSOME12);
		IntervalTree dbSNPIntervalTreeChr13 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR13,Commons.CHROMOSOME13);
		IntervalTree dbSNPIntervalTreeChr14 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR14,Commons.CHROMOSOME14);
		IntervalTree dbSNPIntervalTreeChr15 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR15,Commons.CHROMOSOME15);
		IntervalTree dbSNPIntervalTreeChr16 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR16,Commons.CHROMOSOME16);
		IntervalTree dbSNPIntervalTreeChr17 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR17,Commons.CHROMOSOME17);
		IntervalTree dbSNPIntervalTreeChr18 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR18,Commons.CHROMOSOME18);
		IntervalTree dbSNPIntervalTreeChr19 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR19,Commons.CHROMOSOME19);
		IntervalTree dbSNPIntervalTreeChr20 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR20,Commons.CHROMOSOME20);
		IntervalTree dbSNPIntervalTreeChr21 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR21,Commons.CHROMOSOME21);
		IntervalTree dbSNPIntervalTreeChr22 = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR22,Commons.CHROMOSOME22);
		IntervalTree dbSNPIntervalTreeChrX = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHRX,Commons.CHROMOSOMEX);
		IntervalTree dbSNPIntervalTreeChrY  = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTree(dataFolder,Commons.DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHRY,Commons.CHROMOSOMEY);
		
	
	}

	//args[0] must have input file name with folder
	//args[1] must have GLANET installation folder with "\\" at the end. This folder will be used for outputFolder and dataFolder.
	//args[2] must have Input File Format		
	//args[3] must have Number of Permutations	
	//args[4] must have False Discovery Rate (ex: 0.05)
	//args[5] must have Generate Random Data Mode (with GC and Mapability/without GC and Mapability)
	//args[6] must have writeGeneratedRandomDataMode checkBox
	//args[7] must have writePermutationBasedandParametricBasedAnnotationResultMode checkBox
	//args[8] must have writePermutationBasedAnnotationResultMode checkBox
	//args[9] must have Dnase Enrichment example: DO_DNASE_ENRICHMENT or DO_NOT_DNASE_ENRICHMENT
	//args[10] must have Histone Enrichment example : DO_HISTONE_ENRICHMENT or DO_NOT_HISTONE_ENRICHMENT
	//args[11] must have Tf and KeggPathway Enrichment example: DO_TF_KEGGPATHWAY_ENRICHMENT or DO_NOT_TF_KEGGPATHWAY_ENRICHMENT
	//args[12] must have Tf and CellLine and KeggPathway Enrichment example: DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT or DO_NOT_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT
	//args[13] must have a job name exampe: any_string 
	public static void main(String[] args) {
		
		String glanetFolder = args[1];
		String dataFolder 	= glanetFolder + System.getProperty("file.separator") + Commons.DATA + System.getProperty("file.separator") ;
	
		
		//Read dbSNP flat file and create chromosome based SNP interval tree
//		reaDbSNPFlatFilesandCreateChromosomeBasedSNPIntervalTrees();
		
		//example usage
		IntervalTree dbSNPIntervalTree = readDBSNPFlatFileandCreateChromosomeBasedSNPIntervalTreeforGivenChromosome(dataFolder,Commons.CHROMOSOME1);
		
	}

}
