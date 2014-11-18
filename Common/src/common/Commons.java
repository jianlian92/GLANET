/*
 * This program contains constants used in GLANET.
 * 
 */

package common;


public class Commons {
	
	//Main Folders
	public static final String ANNOTATION = "Annotation";
	public static final String ANNOTATION_FOR_PERMUTATIONS = "AnnotationForPermutations";
	public static final String GIVENINPUTDATA = "GivenInputData";
	public static final String ENRICHMENT = "Enrichment";	
	public static final String GENERATED_SEQUENCES_AND_MATRICES_FOR_RSAT = "forRSAT";	
	public static final String REGULATORY_SEQUENCE_ANALYSIS = "RegulatorySequenceAnalysis";
	public static final String USING_RSAT = "UsingRSAT";	
	public static final String From_ANNOTATION = "fromAnnotation";
	public static final String ALL_POSSIBLE_NAMES = "fromWriteAllPossibleNames";
	public static final String AUGMENTATION = "Augmentation";
	
	
	public static final String ENCODE_COLLABORATION = "ENCODE_Collaboration";
	public static final String ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE = "AnnotationBinaryMatrixForOnePhenotype";
	public static final String ANNOTATION_FOR_ONE_PHENOTYPE = "AnnotationForOnePhenotype";	
	public static final String ANNOTATION_WITH_RS_IDS_ENRICHMENT_SUMMARY_TABLES_FOR_ONE_PHENOTYPE = "AnnotationWithRSIDsEnrichmentForOnePhenotype";
	public static final String ENRICHMENT_BINARY_MATRIX_FOR_ALL_PHENOTYPES = "EnrichmentBinaryMatrixForAllPhenotypes";
		

	public static final String BYGLANET = "byGLANET";
			
	public static final String OUTPUT = "Output";
	public static final String DATA = "Data";
	
	//Sub Folders, Internal Folders
	public static final String RESULTS = "Results";
	
	//When there is no name given for GLANET job
	public static final String NO_NAME = "NoName";
	
	//When there is no KeggPathwayDescription provided for a KeggPathway
	//When there is no UserDefinedGeneSetDescription provided for a UserDefinedGeneSety
	public static final String NO_DESCRIPTION_AVAILABLE = "NoDescriptionAvailable";
		
	//When there is no Optional UserDefinedGeneSet Description file is provided for a UserDefinedGeneSet Enrichment
	public static final String NO_OPTIONAL_USERDEFINEDGENESET_DESCRIPTION_FILE_PROVIDED = "NO_OPTIONAL_USERDEFINEDGENESET_DESCRIPTION_FILE_PROVIDED";

	//Number of program runtime arguments without counting the command line argument
	//command line argument if exists will always be attached to the end of the existing arguments
	//and it will increase the number of program runtime arguments by 1.
	public static final Integer NUMBER_OF_PROGRAM_RUNTIME_ARGUMENTS = 30;

	
	public static final String CHR 					= "chr";
	public static final String X 					= "X";
	public static final String Y 					= "Y";
	
	//EnumType UserDefinedGeneSetInputType
	public static final String GENE_ID 					= "GENE_ID";
	public static final String RNA_NUCLEOTIDE_ACCESSION = "RNA_NUCLEOTIDE_ACCESSION";
	public static final String GENE_SYMBOL 				= "GENE_SYMBOL";

	//EnumTye AnnotationType
	public static final String DNASE_ANNOTATION 				= "DNASE_ANNOTATION";
	public static final String TF_ANNOTATION 					= "TF_ANNOTATION";
	public static final String HISTONE_ANNOTATION 				= "HISTONE_ANNOTATION";
	public static final String USER_DEFINED_GENE_SET_ANNOTATION = "USER_DEFINED_GENE_SET_ANNOTATION";
	public static final String USER_DEFINED_LIBRARY_ANNOTATION = "USER_DEFINED_LIBRARY_ANNOTATION";
	public static final String KEGG_PATHWAY_ANNOTATION 				= "KEGG_PATHWAY_ANNOTATION";
	public static final String TF_KEGG_PATHWAY_ANNOTATION 			= "TF_KEGG_PATHWAY_ANNOTATION";
	public static final String TF_CELLLINE_KEGG_PATHWAY_ANNOTATION 	= "TF_CELLLINE_KEGG_PATHWAY_ANNOTATION";
	public static final String BOTH_TF_KEGG_PATHWAY_AND_TF_CELLLINE_KEGG_PATHWAY_ANNOTATION = "BOTH_TF_KEGG_PATHWAY_AND_TF_CELLLINE_KEGG_PATHWAY_ANNOTATION";
	
	//EnumType WriteGeneratedRandomDataMode
	public static final String DO_WRITE_GENERATED_RANDOM_DATA = "DO_WRITE_GENERATED_RANDOM_DATA";
	public static final String DO_NOT_WRITE_GENERATED_RANDOM_DATA = "DO_NOT_WRITE_GENERATED_RANDOM_DATA";
	
	//EnumType WritePermutationBasedandParametricBasedAnnotationResultMode	
	public static final String DO_WRITE_PERMUTATION_BASED_AND_PARAMETRIC_BASED_ANNOTATION_RESULT = "DO_WRITE_PERMUTATION_BASED_AND_PARAMETRIC_BASED_ANNOTATION_RESULT";
	public static final String DO_NOT_WRITE_PERMUTATION_BASED_AND_PARAMETRIC_BASED_ANNOTATION_RESULT = "DO_NOT_WRITE_PERMUTATION_BASED_AND_PARAMETRIC_BASED_ANNOTATION_RESULT";
	
	//EnumType WritePermutationBasedAnnotationResultMode
	public static final String DO_WRITE_PERMUTATION_BASED_ANNOTATION_RESULT = "DO_WRITE_PERMUTATION_BASED_ANNOTATION_RESULT";
	public static final String DO_NOT_WRITE_PERMUTATION_BASED_ANNOTATION_RESULT = "DO_NOT_WRITE_PERMUTATION_BASED_ANNOTATION_RESULT";

	//Enum type GenerateRandomDataMode
	public static final String GENERATE_RANDOM_DATA_WITHOUT_MAPPABILITY_AND_GC_CONTENT = "Without GC and Mappability";
	public static final String GENERATE_RANDOM_DATA_WITH_MAPPABILITY_AND_GC_CONTENT = "With GC and Mappability";
	
	//EnumType RegulatorySequenceAnalysisType
	//RSAT PARAMETER
	public static final String DO_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT = "DO_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT";
	public static final String DO_NOT_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT = "DO_NOT_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT";

	//EnumType NodeType
	//Is an interval tree node an original node or a merged node?
	public static final String ORIGINAL_NODE = "ORIGINAL_NODE";
	public static final String MERGED_NODE = "MERGED_NODE";

	//EnumType NodeName
	public static final String SENTINEL = "SENTINEL";
	public static final String NOT_SENTINEL = "NOT_SENTINEL";

	//EnumType MultipleTestingType
	//P Value type
	public static final String BONFERRONI_CORRECTION = "Bonferroni Correction";
	public static final String EMPIRICAL_P_VALUE = "Empirical p value";
	public static final String BENJAMINI_HOCHBERG_FDR = "Benjamini Hochberg FDR";

	//EnumType Interval Name
	public static final String EXON = "EXON";
	public static final String INTRON = "INTRON";
	public static final String FIVE_P_ONE = "5P1";
	public static final String FIVE_P_TWO = "5P2";
	public static final String FIVE_D = "5D";
	public static final String THREE_P_ONE = "3P1";
	public static final String THREE_P_TWO = "3P2";
	public static final String THREE_D = "3D";

	
	//EnumType Enrichment Type
	public static final String DO_DNASE_ENRICHMENT 		= "DO_DNASE_ENRICHMENT";
	public static final String DO_NOT_DNASE_ENRICHMENT 	= "DO_NOT_DNASE_ENRICHMENT";	
	public static final String DO_HISTONE_ENRICHMENT 		= "DO_HISTONE_ENRICHMENT";
	public static final String DO_NOT_HISTONE_ENRICHMENT 	= "DO_NOT_HISTONE_ENRICHMENT";
	public static final String DO_TF_ENRICHMENT 		= "DO_TF_ENRICHMENT";
	public static final String DO_NOT_TF_ENRICHMENT 	= "DO_NOT_TF_ENRICHMENT";
	
	public static final String DO_KEGGPATHWAY_ENRICHMENT 		= "DO_KEGGPATHWAY_ENRICHMENT";
	public static final String DO_NOT_KEGGPATHWAY_ENRICHMENT 	= "DO_NOT_KEGGPATHWAY_ENRICHMENT";
	public static final String DO_TF_KEGGPATHWAY_ENRICHMENT 	= "DO_TF_KEGGPATHWAY_ENRICHMENT";
	public static final String DO_NOT_TF_KEGGPATHWAY_ENRICHMENT = "DO_NOT_TF_KEGGPATHWAY_ENRICHMENT";	
	public static final String DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT 		= "DO_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT";
	public static final String DO_NOT_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT 	= "DO_NOT_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT";
	public static final String DO_BOTH_TF_KEGGPATHWAY_AND_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT = "DO_BOTH_TF_KEGGPATHWAY_AND_TF_CELLLINE_KEGGPATHWAY_ENRICHMENT";
	
	public static final String DO_USER_DEFINED_GENESET_ENRICHMENT 		= "DO_USER_DEFINED_GENESET_ENRICHMENT";
	public static final String DO_NOT_USER_DEFINED_GENESET_ENRICHMENT 	= "DO_NOT_USER_DEFINED_GENESET_ENRICHMENT";
	public static final String DO_USER_DEFINED_LIBRARY_ENRICHMENT 		= "DO_USER_DEFINED_LIBRARY_ENRICHMENT";
	public static final String DO_NOT_USER_DEFINED_LIBRARY_ENRICHMENT 	= "DO_NOT_USER_DEFINED_LIBRARY_ENRICHMENT";
	
	
	//EnumType ChromosomeName
	public static final String CHROMOSOME1 = "chr1";
	public static final String CHROMOSOME2 = "chr2";
	public static final String CHROMOSOME3 = "chr3";
	public static final String CHROMOSOME4 = "chr4";
	public static final String CHROMOSOME5 = "chr5";
	public static final String CHROMOSOME6 = "chr6";
	public static final String CHROMOSOME7 = "chr7";
	public static final String CHROMOSOME8 = "chr8";
	public static final String CHROMOSOME9 = "chr9";
	public static final String CHROMOSOME10 = "chr10";
	public static final String CHROMOSOME11 = "chr11";
	public static final String CHROMOSOME12 = "chr12";
	public static final String CHROMOSOME13 = "chr13";
	public static final String CHROMOSOME14 = "chr14";
	public static final String CHROMOSOME15 = "chr15";
	public static final String CHROMOSOME16 = "chr16";
	public static final String CHROMOSOME17 = "chr17";
	public static final String CHROMOSOME18 = "chr18";
	public static final String CHROMOSOME19 = "chr19";
	public static final String CHROMOSOME20 = "chr20";
	public static final String CHROMOSOME21 = "chr21";
	public static final String CHROMOSOME22 = "chr22";
	public static final String CHROMOSOMEX = "chrX";
	public static final String CHROMOSOMEY = "chrY";
	public static final String CHROMOSOMEWITHDIFFERENTNAME = "chrWithDifferentName"; 
	
	//ChromosomeBased Given Input Files starts
	public static final String CHROMOSOME_BASED_GIVEN_INPUT = "_input_file.txt";
	
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR1 = "chr1_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR2 = "chr2_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR3 = "chr3_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR4 = "chr4_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR5 = "chr5_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR6 = "chr6_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR7 = "chr7_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR8 = "chr8_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR9 = "chr9_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR10 = "chr10_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR11 = "chr11_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR12 = "chr12_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR13 = "chr13_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR14 = "chr14_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR15 = "chr15_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR16 = "chr16_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR17 = "chr17_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR18 = "chr18_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR19 = "chr19_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR20 = "chr20_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR21 = "chr21_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHR22 = "chr22_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHRX = "chrX_input_file.txt";
	public static final String CHROMOSOME_BASED_GIVEN_INPUT_CHRY = "chrY_input_file.txt";
	//ChromosomeBased Given Input Files ends
	
	
	public static final String ALL_POSSIBLE_KEGGPATHWAYNAME_2_KEGGPATHWAYNUMBER_FILE = "all_possible_keggPathwayName_2_keggPathwayNumber_map.txt";
			
	public static final String RSERVE =  System.getProperty("user.home") + System.getProperty("file.separator") + "GLANET" + System.getProperty("file.separator") + "Rserve" + System.getProperty("file.separator");
	
	public static final Integer ORIGINAL_DATA_PERMUTATION_NUMBER = 0;
	public static final String PERMUTATION0 = "PERMUTATION0";
	
	public static final int HOMO_SAPIENS_TAX_ID = 9606;

	public static Integer ZERO 		= 0; 
	public static Integer ONE 		= 1; 
	public static Integer MINUS_ONE	= -1; 

//	public static int NUMBER_OF_PERMUTATIONS_IN_EACH_RUN = 2000;
	
	public static Float FLOAT_ZERO = 0.0f; 
	public static Float FLOAT_TEN_QUADRILLION = 10000000000000000f; 
	
	public static Long LONG_ZERO = (long) 0; 
	public static Long LONG_ONE = (long) 1; 
	
	public static final String GC = "GC";
	public static final String MAPABILITY = "MAPABILITY";
	
	public static final String RANDOM_DATA_GENERATION_LOG_FILE = "generate" + System.getProperty("file.separator") + "randomdata" + System.getProperty("file.separator") + "GenerateRandomDataLog.txt";
	
	//INPUT DATA PROCESS	
	public static final String TEST_INPUT_DATA_DBSNP_IDS = "TEST_INPUT_DATA" + System.getProperty("file.separator") + "Test_dbSNP_ids.txt";
	
	//GIVEN INPUT DATA
	//INPUT FILE DATA FORMAT starts
	public static final String INPUT_FILE_FORMAT_DBSNP_IDS_0_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE = "dbSNP IDs";
	public static final String INPUT_FILE_FORMAT_BED_0_BASED_COORDINATES_START_INCLUSIVE_END_EXCLUSIVE = "BED";
	public static final String INPUT_FILE_FORMAT_GFF3_1_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE = "GFF3";
	public static final String INPUT_FILE_FORMAT_0_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE = "0-based coordinates (End Inclusive)";
	public static final String INPUT_FILE_FORMAT_1_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE = "1-based coordinates (End Inclusive)";
	//INPUT FILE DATA FORMAT ends
	
	//USER DEFINED LIBRARY DATA FORMAT starts
	public static final String USERDEFINEDLIBRARY_DATAFORMAT_0_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE = "0-based coordinates (End Inclusive)";
	public static final String USERDEFINEDLIBRARY_DATAFORMAT_0_BASED_COORDINATES_START_INCLUSIVE_END_EXCLUSIVE = "0-based coordinates (End Exclusive)";
	public static final String USERDEFINEDLIBRARY_DATAFORMAT_1_BASED_COORDINATES_START_INCLUSIVE_END_INCLUSIVE = "1-based coordinates (End Inclusive)";
	public static final String USERDEFINEDLIBRARY_DATAFORMAT_1_BASED_COORDINATES_START_INCLUSIVE_END_EXCLUSIVE = "1-based coordinates (End Exclusive)";
	//USER DEFINED LIBRARY DATA FORMAT ends
	
	
	public static final String INPUT_ASSEMBLY_HG_19 = "hg19";
			
	public static final String PROCESSED_INPUT_FILE =  Commons.GIVENINPUTDATA + System.getProperty("file.separator") +"Input_Data_Processed_0_Based_hg19_coordinates.txt";
	public static final String REMOVED_OVERLAPS_INPUT_FILE =  Commons.GIVENINPUTDATA + System.getProperty("file.separator") +"Input_Data_Processed_OverlapsRemoved_0_Based_hg19_coordinates.txt";
	
	//FOR TESTING PURPOSES 
	public static final String TEST_INPUT_FILE_BED_FORMAT = "";;
	public static final String TEST_INPUT_FILE_GFF3_FORMAT = "";
	public static final String TEST_INPUT_FILE_0_BASED_COORDINATES_FORMAT = "";
	public static final String TEST_INPUT_FILE_DBSNP_IDS_FORMAT = "";
		
	//RSID to CHRNAME CHRPOSITION OBSERVEDALLELES converter
	public static final String REFSEQ_IDS_FOR_GRCH37_INPUT_FILE = "RefSeqIdsforGRCh37" + System.getProperty("file.separator") + "GCF_000001405.25.assembly.txt";
	public static final String REFSEQ_IDS_FOR_GRCH38_INPUT_FILE = "RefSeqIdsforGRCh38" + System.getProperty("file.separator") + "GCF_000001405.26.assembly.txt";
	

//dbSNP
	public static final String NUCLEOTIDE_A = "A";
	public static final String NUCLEOTIDE_C = "C";
	public static final String NUCLEOTIDE_G = "G";
	public static final String NUCLEOTIDE_T = "T";
	
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR1 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch1.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR2 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch2.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR3 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch3.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR4 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch4.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR5 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch5.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR6 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch6.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR7 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch7.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR8 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch8.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR9 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch9.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR10 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch10.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR11 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch11.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR12 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch12.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR13 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch13.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR14 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch14.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR15 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch15.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR16 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch16.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR17 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch17.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR18 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch18.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR19 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch19.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR20 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch20.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR21	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch21.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHR22 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_ch22.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHRX 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_chX.flat";
	public static final String DOKTORA_DATA_DB_SNP_DS_FLAT_FILE_FOR_CHRY 	= System.getProperty("file.separator") + "dbSNP" + System.getProperty("file.separator") + "ASN1_flat" + System.getProperty("file.separator") + "ds_flat_chY.flat";

	//Augmentation of Enriched Elements with Overlaps Output Files starts
	public static final String AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY 		= Commons.AUGMENTATION + System.getProperty("file.separator") + "EnrichedElementsWithGivenInputData" + System.getProperty("file.separator");
	
	//GRCh37 starts
	public static final String AUGMENTED_DNASE_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedDnaseResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_HISTONE_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES = Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedHistoneResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_TF_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY+ "AugmentedTranscriptionFactorResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";

	public static final String AUGMENTED_EXON_BASED_USERDEFINED_GENESET_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedExonBasedUserDefinedGeneSetResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_REGULATION_BASED_USERDEFINED_GENESET_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedRegulationBasedUserDefinedGeneSetResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_ALL_BASED_USERDEFINED_GENESET_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedAllBasedUserDefinedGeneSetResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";	
	
	
	public static final String  AUGMENTED_USERDEFINED_LIBRARY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES = Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY  ;
	public static final String  AUGMENTED_USERDEFINED_LIBRARY_RESULTS_FILENAME = "_AugmentedUserDefinedLibrary_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	
	public static final String AUGMENTED_EXON_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedExonBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_REGULATION_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedRegulationBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_ALL_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedAllBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";	
	
	public static final String AUGMENTED_TF_EXON_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfExonBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_TF_REGULATION_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfRegulationBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_TF_ALL_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 			= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfAllBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";

	public static final String AUGMENTED_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES = Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfCellLineExonBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES = Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfCellLineRegulationBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String AUGMENTED_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_RESULTS_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES = Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfCellLineAllBasedKeggPathwayResults_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	//GRCh37 ends

	// Line by Line chrName 0BasedStart 1BasedEnd GRCH37 starts
	public static final String AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY 		= Commons.AUGMENTATION + System.getProperty("file.separator") + "Remap" + System.getProperty("file.separator");
	
	public static final String LINE_BY_LINE_AUGMENTED_DNASE_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY + "REMAP_inputFile_LineByLine_AugmentedDnaseResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String LINE_BY_LINE_AUGMENTED_HISTONE_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES = Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY + "REMAP_inputFile_LineByLine_AugmentedHistoneResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String LINE_BY_LINE_AUGMENTED_TF_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedTranscriptionFactorResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	
	public static final String LINE_BY_LINE_AUGMENTED_EXON_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedExonBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String LINE_BY_LINE_AUGMENTED_REGULATION_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedRegulationBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String LINE_BY_LINE_AUGMENTED_ALL_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 			= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedAllBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	
	public static final String LINE_BY_LINE_AUGMENTED_TF_EXON_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedTFExonBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String LINE_BY_LINE_AUGMENTED_TF_REGULATION_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedTFRegulationBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String LINE_BY_LINE_AUGMENTED_TF_ALL_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedTFAllBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	
	public static final String LINE_BY_LINE_AUGMENTED_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedTFCellLineExonBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String LINE_BY_LINE_AUGMENTED_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedTFCellLineRegulationBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";
	public static final String LINE_BY_LINE_AUGMENTED_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_0BASEDSTART_1BASEDEND_GRCH37_COORDINATES 			= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "REMAP_inputFile_LineByLine_AugmentedTFCellLineAllBasedKEGGPathwayResults_chrNumber_0BasedStart_1BasedEnd_GRCh37_coordinates.txt";	
	// Line by Line chrName 0BasedStart 1BasedEnd GRCh37 ends
	
	//LINE BY LINE REMAP outputFiles starts
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_DNASE_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY + "remap_outputFile_LineByLine_Dnase_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_HISTONE_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY + "remap_outputFile_LineByLine_Histone_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_TF_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_TF_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_EXON_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_ExonBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_REGULATION_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_RegulationBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_ALL_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_AllBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_TF_EXON_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_TFExonBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_TF_REGULATION_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_TFRegulationBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_TF_ALL_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 			= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_TFAllBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_TFCellLineExonBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_TFCellLineRegulationBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String LINE_BY_LINE_REMAP_OUTPUTFILE_AUGMENTED_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_RESULTS_CHRNUMBER_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_REMAP_DIRECTORY+ "remap_outputFile_LineByLine_TFCellLineAllBasedKEGGPathway_chrNumber_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";	
	//LINE BY LINE REMAP outputFiles ends
	
	
	//GRCh38 starts
	public static final String AUGMENTED_DNASE_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedDnaseResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String AUGMENTED_HISTONE_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES = Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedHistoneResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String AUGMENTED_TF_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY+ "AugmentedTranscriptionFactorResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	
	public static final String AUGMENTED_EXON_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedExonBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String AUGMENTED_REGULATION_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedRegulationBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String AUGMENTED_ALL_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 			= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedAllBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";	
	
	public static final String AUGMENTED_TF_EXON_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 			= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfExonBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String AUGMENTED_TF_REGULATION_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfRegulationBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String AUGMENTED_TF_ALL_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 			= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfAllBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";

	public static final String AUGMENTED_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 		= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfCellLineExonBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String AUGMENTED_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfCellLineRegulationBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	public static final String AUGMENTED_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_RESULTS_1BASEDSTART_1BASEDEND_GRCH38_COORDINATES 			= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "AugmentedTfCellLineAllBasedKeggPathwayResults_1BasedStart_1BasedEnd_GRCh38_coordinates.txt";
	//GRCh38 ends

	public static final String TEST_AUGMENTED_TF_REGULATION_BASED_KEGG_PATHWAY_RESULTS 	= Commons.AUGMENTED_ENRICHED_ELEMENTS_WITH_GIVEN_INPUT_DATA_DIRECTORY + "Test_AugmentedTfRegulationBasedKeggPathwayResults.txt";
	//Augmentation of Enriched Elements with Overlaps Output Files ends
	
		
	//RSAT
	public static final String RSAT_DIRECTORY = Commons.REGULATORY_SEQUENCE_ANALYSIS + System.getProperty("file.separator");

	
	 public static final String RSAT_ORGANISM_Homo_sapiens_ensembl_74_GRCh37 = "Homo_sapiens_ensembl_74_GRCh37";
	 public static final String RSAT_BACKGROUND_upstream_noorf = "upstream-noorf";
	 public static final String RSAT_tmp_background_infile = "/home/rsat/rsat/public_html/data/genomes/Homo_sapiens_ensembl_74_GRCh37/oligo-frequencies/1nt_upstream-noorf_Homo_sapiens_ensembl_74_GRCh37-ovlp-1str.freq.gz";
	 
	 public static final String RSAT_OUTPUT_FILENAME_TF = Commons.REGULATORY_SEQUENCE_ANALYSIS + System.getProperty("file.separator") + Commons.USING_RSAT  + System.getProperty("file.separator") + "RSAT_results_TF.txt";

	 public static final String RSAT_OUTPUT_FILENAME_TF_EXONBASEDKEGGPATHWAY = Commons.REGULATORY_SEQUENCE_ANALYSIS + System.getProperty("file.separator") + Commons.USING_RSAT  + System.getProperty("file.separator") + "RSAT_results_TF_ExonBasedKEGGPathway.txt";
	 public static final String RSAT_OUTPUT_FILENAME_TF_REGULATIONBASEDKEGGPATHWAY = Commons.REGULATORY_SEQUENCE_ANALYSIS + System.getProperty("file.separator") + Commons.USING_RSAT  + System.getProperty("file.separator") + "RSAT_results_TF_RegulationBasedKEGGPathway.txt";
	 public static final String RSAT_OUTPUT_FILENAME_TF_ALLBASEDKEGGPATHWAY = Commons.REGULATORY_SEQUENCE_ANALYSIS + System.getProperty("file.separator") + Commons.USING_RSAT  + System.getProperty("file.separator") + "RSAT_results_TF_AllBasedKEGGPathway.txt";

	 public static final String RSAT_OUTPUT_FILENAME_TF_CELLLINE_EXONBASEDKEGGPATHWAY = Commons.REGULATORY_SEQUENCE_ANALYSIS + System.getProperty("file.separator") + Commons.USING_RSAT  + System.getProperty("file.separator") + "RSAT_results_TF_CellLine_ExonBasedKEGGPathway.txt";
	 public static final String RSAT_OUTPUT_FILENAME_TF_CELLLINE_REGULATIONBASEDKEGGPATHWAY = Commons.REGULATORY_SEQUENCE_ANALYSIS + System.getProperty("file.separator") + Commons.USING_RSAT  + System.getProperty("file.separator") + "RSAT_results_TF_CellLine_RegulationBasedKEGGPathway.txt";
	 public static final String RSAT_OUTPUT_FILENAME_TF_CELLLINE_ALLBASEDKEGGPATHWAY = Commons.REGULATORY_SEQUENCE_ANALYSIS + System.getProperty("file.separator") + Commons.USING_RSAT  + System.getProperty("file.separator") + "RSAT_results_TF_CellLine_AllBasedKEGGPathway.txt";

	//Rserve
//	public static final String RSERVE_OUTPUT_FOLDER = "Doktora"  + System.getProperty("file.separator") + "rserve" + System.getProperty("file.separator");
	public static final String GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER = Commons.GENERATED_SEQUENCES_AND_MATRICES_FOR_RSAT + System.getProperty("file.separator");
	
	/*************************************************************************************/
	//TF DIRECTORY BASES
	public static final String TF_RESULTS_DIRECTORY_BASE 		= GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER  + "TF" + System.getProperty("file.separator");
		
	//TF KEGGPATHWAY DIRECTORY BASES
	public static final String TF_EXON_BASED_KEGG_PATHWAY_RESULTS_DIRECTORY_BASE 		= GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER  + "TfExonBasedKEGG" + System.getProperty("file.separator");
	public static final String TF_REGULATION_BASED_KEGG_PATHWAY_RESULTS_DIRECTORY_BASE 	= GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER  + "TfRegulationBasedKEGG" + System.getProperty("file.separator");
	public static final String TF_ALL_BASED_KEGG_PATHWAY_RESULTS_DIRECTORY_BASE 		= GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER  + "TfAllBasedKEGG" + System.getProperty("file.separator");
	
	
	//TF CELLLINE KEGGPATHWAY DIRECTORY BASES
	public static final String TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_RESULTS_DIRECTORY_BASE 		= GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER + "TfCellLineExonBasedKEGG" + System.getProperty("file.separator");
	public static final String TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_RESULTS_DIRECTORY_BASE = GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER + "TfCellLineRegulationBasedKEGG" + System.getProperty("file.separator");
	public static final String TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_RESULTS_DIRECTORY_BASE 		= GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER + "TfCellLineAllBasedKEGG" + System.getProperty("file.separator");

	/*************************************************************************************/

	
	
	//Encode-motifs file
	public static final String ENCODE_MOTIFS = "encode_motifs" + System.getProperty("file.separator") + "motifs.txt";
	
	//Jaspar Core File
	public static final String JASPAR_CORE = "jaspar_core" + System.getProperty("file.separator") + "pfm_all.txt";
	
	
	public static final String JASPAR_CORE_MATRICES_FOR_LOGO = GENERATION_OF_REFERENCE_AND_ALTERED_SEQUENCES_OUTPUT_FOLDER + "jaspar_core_logo_matrices.txt";
	
	public static final int NUMBER_OF_BASES_BEFORE_SNP_POSITION= 14;
	public static final int NUMBER_OF_BASES_AFTER_SNP_POSITION= 14;
	public static final int ONE_BASED_SNP_POSITION= 15;
	
	public static final char SEQUENCE_DIRECTION_D = 'D';
	public static final char SEQUENCE_DIRECTION_R = 'R';
		
	
	//Case Study OCD_GWAS
	//Comparison of Binomial Test versus Permutation Test
	public static final String DNASE_ADJUSTED_P_VALUE_BINOMIAL_TEST = "Doktora" + System.getProperty("file.separator")  + "binomialdistribution" + System.getProperty("file.separator") + "dnase_adjusted_pvalues.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_10000_WITH_OCD_GWAS_PERMUTATION_TEST 		= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_10000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_10000_WITHOUT_OCD_GWAS_PERMUTATION_TEST 	= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_10000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_5000_WITH_OCD_GWAS_PERMUTATION_TEST 		= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_5000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_5000_WITHOUT_OCD_GWAS_PERMUTATION_TEST 	= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_5000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_1000_WITH_OCD_GWAS_PERMUTATION_TEST 		= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_1000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_1000_WITHOUT_OCD_GWAS_PERMUTATION_TEST 	= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_1000Perm.txt";
	public static final String DNASE_BINOMIAL_VERSUS_PERMUTATION_COMPARISON_OCD_GWAS = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "dnase_comparison_of_binomial_and_permutation_tests_OCD_GWAS.txt";
	
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_BINOMIAL_TEST = "Doktora" + System.getProperty("file.separator")  + "binomialdistribution" + System.getProperty("file.separator") + "tfbs_adjusted_pvalues.txt";;
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_10000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_10000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_10000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_10000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_5000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_5000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_5000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_5000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_1000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_1000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_1000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_1000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_BINOMIAL_VERSUS_PERMUTATION_COMPARISON_OCD_GWAS = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "tfbs_comparison_of_binomial_and_permutation_tests_OCD_GWAS.txt";
	
	public static final String HISTONE_ADJUSTED_P_VALUE_BINOMIAL_TEST = "Doktora" + System.getProperty("file.separator")  + "binomialdistribution" + System.getProperty("file.separator") + "histone_adjusted_pvalues.txt";;
	public static final String HISTONE_ADJUSTED_P_VALUE_10000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_10000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_10000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_10000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_5000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_5000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_5000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_5000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_1000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_1000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_1000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_1000Perm.txt";
	public static final String HISTONE_BINOMIAL_VERSUS_PERMUTATION_COMPARISON_OCD_GWAS = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "histone_comparison_of_binomial_and_permutation_tests_OCD_GWAS.txt";
	
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_BINOMIAL_TEST = "Doktora" + System.getProperty("file.separator")  + "binomialdistribution" + System.getProperty("file.separator") + "exonBased_KeggPathway_adjusted_pvalues.txt";;
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_10000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_10000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_10000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_10000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_5000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_5000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_5000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_5000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_1000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_1000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_1000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_1000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_BINOMIAL_VERSUS_PERMUTATION_COMPARISON_OCD_GWAS = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "exonBasedKeggPathway_comparison_of_binomial_and_permutation_tests_OCD_GWAS.txt";
	
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_BINOMIAL_TEST = "Doktora" + System.getProperty("file.separator")  + "binomialdistribution" + System.getProperty("file.separator") + "regulationBased_KeggPathway_adjusted_pvalues.txt";;
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_10000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_10000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_10000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_10000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_5000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_5000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_5000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_5000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_1000_WITH_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withGCMap_1Rep_1000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_1000_WITHOUT_OCD_GWAS_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_OCD_withoutGCMap_1Rep_1000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_BINOMIAL_VERSUS_PERMUTATION_COMPARISON_OCD_GWAS = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "regulationBasedKeggPathway_comparison_of_binomial_and_permutation_tests_OCD_GWAS.txt";
	
	
	
	//Case Study Positive Control K562 GATA1
	//Comparison of Permutation Tests
	public static final String DNASE_ADJUSTED_P_VALUE_10000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST 		= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_10000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_10000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST 	= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_10000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_5000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST 		= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_5000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_5000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST 	= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_5000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_1000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST 		= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_1000Perm.txt";
	public static final String DNASE_ADJUSTED_P_VALUE_1000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST 	= "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_1000Perm.txt";
	public static final String DNASE_PERMUTATION_COMPARISON_POSITIVE_CONTROL_K562_GATA1 = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "dnase_comparison_of_permutation_tests_K562_GATA1.txt";
	
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_10000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_10000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_10000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_10000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_5000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_5000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_5000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_5000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_1000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_1000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_ADJUSTED_P_VALUE_1000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_1000Perm.txt";
	public static final String TRANSCRIPTION_FACTOR_PERMUTATION_COMPARISON_POSITIVE_CONTROL_K562_GATA1 = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "tfbs_comparison_of_permutation_tests_K562_GATA1.txt";
	
	public static final String HISTONE_ADJUSTED_P_VALUE_10000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_10000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_10000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_10000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_5000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_5000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_5000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_5000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_1000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_1000Perm.txt";
	public static final String HISTONE_ADJUSTED_P_VALUE_1000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_1000Perm.txt";
	public static final String HISTONE_PERMUTATION_COMPARISON_POSITIVE_CONTROL_K562_GATA1 = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "histone_comparison_of_permutation_tests_K562_GATA1.txt";
	
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_10000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_10000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_10000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_10000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_5000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_5000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_5000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_5000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_1000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_1000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_1000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_1000Perm.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_PERMUTATION_COMPARISON_POSITIVE_CONTROL_K562_GATA1 = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "exonBasedKeggPathway_comparison_of_permutation_tests_K562_GATA1.txt";
	
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_10000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_10000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_10000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_10000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_5000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_5000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_5000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_5000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_1000_WITH_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withGCMap_1Rep_1000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUE_1000_WITHOUT_POSITIVE_CONTROL_K562_GATA1_PERMUTATION_TEST = "Doktora" + System.getProperty("file.separator")  + "empiricalpvalues" + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues_K562_GATA1_withoutGCMap_1Rep_1000Perm.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_PERMUTATION_COMPARISON_POSITIVE_CONTROL_K562_GATA1 = "Doktora" + System.getProperty("file.separator")  + "comparison" + System.getProperty("file.separator") + "binomialversuspermutation" + System.getProperty("file.separator") + "regulationBasedKeggPathway_comparison_of_permutation_tests_K562_GATA1.txt";
	

	
	//Mapability and GC
	public static final String WRITE_MEAN_VALUE_OF_EACH_FILE = "WRITE_MEAN_VALUE_OF_EACH_FILE";
	public static final String WRITE_STANDARD_DEVIATION_VALUE_OF_EACH_FILE = "WRITE_STANDARD_DEVIATION_VALUE_OF_EACH_FILE";
	
	//ALL FILES
	public static final String ALL_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "all_gc_files.txt";
	public static final String ALL_DNASE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "all_dnase_gc_files.txt";
	public static final String ALL_TFBS_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "all_tfbs_gc_files.txt";
	public static final String ALL_HISTONE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "all_histone_gc_files.txt";
	
	public static final String ALL_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "all_mapability_files.txt";
	public static final String ALL_DNASE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "all_dnase_mapability_files.txt";
	public static final String ALL_TFBS_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "all_tfbs_mapability_files.txt";
	public static final String ALL_HISTONE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "all_histone_mapability_files.txt";

	
	//Ten Different Mean Files
	public static final String TEN_DIFFERENT_MEAN_DNASE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "ten_different_mean_dnase_gc_files.txt";
	public static final String TEN_DIFFERENT_MEAN_TFBS_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "ten_different_mean_tfbs_gc_files.txt";
	public static final String TEN_DIFFERENT_MEAN_HISTONE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "ten_different_mean_histone_gc_files.txt";
	
	public static final String TEN_DIFFERENT_MEAN_DNASE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "ten_different_mean_dnase_mapability_files.txt";
	public static final String TEN_DIFFERENT_MEAN_TFBS_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "ten_different_mean_tfbs_mapability_files.txt";
	public static final String TEN_DIFFERENT_MEAN_HISTONE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "ten_different_mean_histone_mapability_files.txt";
	
	//TOP TEN MOST VARYING FILES
	public static final String TOP_TEN_MOST_VARYING_DNASE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "top_ten_dnase_gc_files.txt";
	public static final String TOP_TEN_MOST_VARYING_TFBS_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "top_ten_tfbs_gc_files.txt";
	public static final String TOP_TEN_MOST_VARYING_HISTONE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "top_ten_histone_gc_files.txt";
	
	public static final String TOP_TEN_MOST_VARYING_DNASE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "top_ten_dnase_mapability_files.txt";
	public static final String TOP_TEN_MOST_VARYING_TFBS_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "top_ten_tfbs_mapability_files.txt";
	public static final String TOP_TEN_MOST_VARYING_HISTONE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "top_ten_histone_mapability_files.txt";
	
	//Data Files for R for Ten Different Mean Files
	public static final String DATA_FILE_FOR_R_TEN_DIFFERENT_MEAN_DNASE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TenDifferentMeanDnaseGCFiles.txt";
	public static final String DATA_FILE_FOR_R_TEN_DIFFERENT_MEAN_TFBS_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TenDifferentMeanTfbsGCFiles.txt";
	public static final String DATA_FILE_FOR_R_TEN_DIFFERENT_MEAN_HISTONE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TenDifferentMeanHistoneGCFiles.txt";
	
	public static final String DATA_FILE_FOR_R_TEN_DIFFERENT_MEAN_DNASE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TenDifferentMeanDnaseMAPABILITYFiles.txt";
	public static final String DATA_FILE_FOR_R_TEN_DIFFERENT_MEAN_TFBS_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TenDifferentMeanTfbsMAPABILITYFiles.txt";
	public static final String DATA_FILE_FOR_R_TEN_DIFFERENT_MEAN_HISTONE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TenDifferentMeanHistoneMAPABILITYFiles.txt";
		
	//Top Ten Most Varying Dnase Tfbs Histone Mapability and GC files for Box Plot in R
	public static final String DATA_FILE_FOR_R_TOP_TEN_MOST_VARYING_DNASE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TopTenMostVaryingDnaseGCFiles.txt";
	public static final String DATA_FILE_FOR_R_TOP_TEN_MOST_VARYING_TFBS_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TopTenMostVaryingTfbsGCFiles.txt";
	public static final String DATA_FILE_FOR_R_TOP_TEN_MOST_VARYING_HISTONE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TopTenMostVaryingHistoneGCFiles.txt";
	
	public static final String DATA_FILE_FOR_R_TOP_TEN_MOST_VARYING_DNASE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TopTenMostVaryingDnaseMapabilityFiles.txt";
	public static final String DATA_FILE_FOR_R_TOP_TEN_MOST_VARYING_TFBS_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TopTenMostVaryingTfbsMapabilityFiles.txt";
	public static final String DATA_FILE_FOR_R_TOP_TEN_MOST_VARYING_HISTONE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "TopTenMostVaryingHistoneMapabilityFiles.txt";
	
	//All Dnase Tfbs Histone Mapability and GC files for Box Plot in R
	public static final String DATA_FILE_FOR_R_ALL_DNASE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "AllDnaseGCFiles.txt";
	public static final String DATA_FILE_FOR_R_ALL_TFBS_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "AllTfbsGCFiles.txt";
	public static final String DATA_FILE_FOR_R_ALL_HISTONE_GC_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "AllHistoneGCFiles.txt";

	public static final String DATA_FILE_FOR_R_ALL_DNASE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "AllDnaseMapabilityFiles.txt";;
	public static final String DATA_FILE_FOR_R_ALL_TFBS_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "AllTfbsMapabilityFiles.txt";
	public static final String DATA_FILE_FOR_R_ALL_HISTONE_MAPABILITY_FILES = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "DataFilesForR" + System.getProperty("file.separator") + "AllHistoneMapabilityFiles.txt";

	public static final String ALL_DNASE_GC_FILES_DIRECTORY = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "Dnase" + System.getProperty("file.separator") + "Gc" + System.getProperty("file.separator");
	public static final String ALL_TFBS_GC_FILES_DIRECTORY = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "Tfbs" + System.getProperty("file.separator") + "Gc" + System.getProperty("file.separator");
	public static final String ALL_HISTONE_GC_FILES_DIRECTORY = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "Histone" + System.getProperty("file.separator") + "Gc" + System.getProperty("file.separator");
	
	public static final String ALL_DNASE_MAPABILITY_FILES_DIRECTORY = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "Dnase" + System.getProperty("file.separator") + "Mapability" + System.getProperty("file.separator");
	public static final String ALL_TFBS_MAPABILITY_FILES_DIRECTORY = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "Tfbs" + System.getProperty("file.separator") + "Mapability" + System.getProperty("file.separator");
	public static final String ALL_HISTONE_MAPABILITY_FILES_DIRECTORY = "Doktora" + System.getProperty("file.separator") + "mapabilityandgc" + System.getProperty("file.separator") + "Augmentation" + System.getProperty("file.separator") + "FunctionalElementFileBased" + System.getProperty("file.separator") + "Histone" + System.getProperty("file.separator") + "Mapability" + System.getProperty("file.separator");
	
	
	//MAPABILITY
	public static final String WG_ENCODE_CRG_MAPABILITY_ALIGN_100_MER_WIG = "MAPABILITY" + System.getProperty("file.separator") + "wgEncodeCrgMapabilityAlign100mer.wig" ;
	public static final String WG_ENCODE_CRG_MAPABILITY_ALIGN_50_MER_WIG = "MAPABILITY" + System.getProperty("file.separator") + "wgEncodeCrgMapabilityAlign50mer.wig" ;
	public static final String MAPABILITY_HG19_CHR1_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr1_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR2_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr2_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR3_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr3_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR4_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr4_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR5_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr5_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR6_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr6_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR7_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr7_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR8_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr8_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR9_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr9_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR10_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr10_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR11_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr11_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR12_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr12_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR13_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr13_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR14_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr14_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR15_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr15_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR16_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr16_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR17_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr17_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR18_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr18_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR19_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr19_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR20_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr20_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR21_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr21_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHR22_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chr22_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHRX_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chrX_hg19_mapability.txt" ;
	public static final String MAPABILITY_HG19_CHRY_FILE =  "MAPABILITY" + System.getProperty("file.separator") + "chrY_hg19_mapability.txt" ;
	
	//GC
	public static final String GC_HG19_CHR1_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr1.fa" ;
	public static final String GC_HG19_CHR2_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr2.fa" ;
	public static final String GC_HG19_CHR3_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr3.fa" ;
	public static final String GC_HG19_CHR4_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr4.fa" ;
	public static final String GC_HG19_CHR5_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr5.fa" ;
	public static final String GC_HG19_CHR6_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr6.fa" ;
	public static final String GC_HG19_CHR7_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr7.fa" ;
	public static final String GC_HG19_CHR8_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr8.fa" ;
	public static final String GC_HG19_CHR9_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr9.fa" ;
	public static final String GC_HG19_CHR10_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr10.fa" ;
	public static final String GC_HG19_CHR11_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr11.fa" ;
	public static final String GC_HG19_CHR12_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr12.fa" ;
	public static final String GC_HG19_CHR13_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr13.fa" ;
	public static final String GC_HG19_CHR14_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr14.fa" ;
	public static final String GC_HG19_CHR15_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr15.fa" ;
	public static final String GC_HG19_CHR16_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr16.fa" ;
	public static final String GC_HG19_CHR17_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr17.fa" ;
	public static final String GC_HG19_CHR18_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr18.fa" ;
	public static final String GC_HG19_CHR19_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr19.fa" ;
	public static final String GC_HG19_CHR20_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr20.fa" ;
	public static final String GC_HG19_CHR21_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr21.fa" ;
	public static final String GC_HG19_CHR22_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chr22.fa" ;
	public static final String GC_HG19_CHRX_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chrX.fa" ;
	public static final String GC_HG19_CHRY_FASTA_FILE =  "GC" + System.getProperty("file.separator") + "chrY.fa" ;
	
	public static final String GC_HG19_CHR1_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr1_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR2_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr2_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR3_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr3_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR4_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr4_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR5_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr5_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR6_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr6_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR7_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr7_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR8_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr8_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR9_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr9_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR10_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr10_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR11_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr11_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR12_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr12_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR13_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr13_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR14_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr14_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR15_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr15_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR16_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr16_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR17_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr17_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR18_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr18_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR19_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr19_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR20_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr20_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR21_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr21_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHR22_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chr22_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHRX_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chrX_GC_onezero_file.txt" ;
	public static final String GC_HG19_CHRY_ONEZERO_FILE = "Doktora" + System.getProperty("file.separator")+  "mappabilityandgc" + System.getProperty("file.separator") + "GC" + System.getProperty("file.separator") + "chrY_GC_onezero_file.txt" ;
	
	public static final char NUCLEIC_ACID_UPPER_CASE_A = 'A' ;
	public static final char NUCLEIC_ACID_LOWER_CASE_A = 'a' ;
	
	public static final char NUCLEIC_ACID_UPPER_CASE_G = 'G' ;
	public static final char NUCLEIC_ACID_LOWER_CASE_G = 'g' ;
	
	public static final char NUCLEIC_ACID_UPPER_CASE_C = 'C' ;
	public static final char NUCLEIC_ACID_LOWER_CASE_C = 'c' ;
	
	public static final char NUCLEIC_ACID_UPPER_CASE_T = 'T' ;
	public static final char NUCLEIC_ACID_LOWER_CASE_T = 't' ;
	
	public static final char NUCLEIC_ACID_UPPER_CASE_N = 'N' ;
	public static final char NUCLEIC_ACID_LOWER_CASE_N = 'n' ;
	
		
	
	//Empirical P Value	
	public static final float GC_THRESHOLD_LOWER_VALUE = (float) 0.01;
	public static final float GC_THRESHOLD_UPPER_VALUE = (float) 0.1;
	
	public static final float MAPABILITY_THRESHOLD_LOWER_VALUE = (float) 0.01;
	public static final float MAPABILITY_THRESHOLD_UPPER_VALUE = (float) 0.1;
	
	public static final float THRESHOLD_INCREASE_VALUE_0_POINT_001	= (float) 0.001;
	public static final float THRESHOLD_INCREASE_VALUE_0_POINT_002	= (float) 0.002;
	public static final float THRESHOLD_INCREASE_VALUE_0_POINT_003 	= (float) 0.003;
	public static final float THRESHOLD_INCREASE_VALUE_0_POINT_004	= (float) 0.004;
	
	public static final int NUMBER_OF_TRIAL_FIRST_LEVEL 	=	1000;
	public static final int NUMBER_OF_TRIAL_SECOND_LEVEL	=	2000;
	public static final int NUMBER_OF_TRIAL_THIRD_LEVEL		=	3000;
	public static final int NUMBER_OF_TRIAL_FOURTH_LEVEL	=	4000;
	
	public static final String ORIGINAL_INPUT_DATA_FILE = "ORIGINAL_INPUT_DATA_FILE";
		
	public static final String PERMUTATION = "PERMUTATION";
	public static final String RANDOMLY_GENERATED_DATA_FOLDER = Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator")  +  "RandomlyGeneratedData" + System.getProperty("file.separator");
	public static final String RANDOMLY_GENERATED_DATA = "RANDOMLY_GENERATED_DATA";
		
	//Input Data Prepare
	public static final String CHROMOSOME_POSITION_TYPE_ZERO_BASED = "CHROMOSOME_POSITION_TYPE_ZERO_BASED"; 
	public static final String CHROMOSOME_POSITION_TYPE_ONE_BASED = "CHROMOSOME_POSITION_TYPE_ONE_BASED"; 
	
	public static final String NOT_AVAILABLE_SNP_ID = "#N/A";
	public static final String NOT_APLICABLE = "#N/A";
	
	//OCD_GWAS_SIGNIFICANT_SNPS
	public static final String OCD_GWAS_SIGNIFICANT_SNPS_CHRNUMBER_BASEPAIRNUMBER = "OCD_GWAS_SNP" + System.getProperty("file.separator") + "ocd_gwas_snp_chrNumber_basePairNumber.txt";

	
	//HIV1 SNPS
	public static final String HIV1_SNPS_START_INCLUSIVE_END_EXCLUSIVE = "HIV1_SNP" + System.getProperty("file.separator") + "hglft_www_5c79_8ab500.bed" ;
	
	public static final String RANDOMLY_GENERATED_DATA_FILE = Commons.ANNOTATION + System.getProperty("file.separator") + "RandomlyGeneratedData" + System.getProperty("file.separator") + "PERMUTATION4_RANDOMLY_GENERATED_DATA.txt";
	
	
	//For Whole Genome Sliding Window
	public static final String ORIGINAL_READ_LINE = "ORIGINAL_READ_LINE";
	public static final String DEGENERATED_LINE = "DEGENERATED_LINE";
	
	
	public static final char RED = 'r';
	public static final char BLACK = 'b';
	
	public static final String INSERT = "INSERT";
	public static final String DELETE = "DELETE";
	public static final String chr = "chr";
	
	public static final String PROCESS_INPUT_DATA_REMOVE_OVERLAPS = "PROCESS_INPUT_DATA_REMOVE_OVERLAPS";
	
		
	public static final String ENCODE_DNASE_DIRECTORY1 	= "ENCODE" + System.getProperty("file.separator") + "dnase";
	public static final String ENCODE_DNASE_DIRECTORY2 	= "ENCODE" + System.getProperty("file.separator") + "dnase_jul2010";
	public static final String ENCODE_TFBS_DIRECTORY 	= "ENCODE" + System.getProperty("file.separator") + "transcription_factors";
	public static final String ENCODE_HISTONE_DIRECTORY = "ENCODE" + System.getProperty("file.separator") + "histone_macs";
	
	public static final String STRING_HYPHEN = "-";
	
	public static final String HYPHEN = "HYPHEN";
	public static final String TEST_LINEAR_SEARCH_VERSUS_INTERVAL_TREE_SEARCH ="Doktora" + System.getProperty("file.separator") + "testlinearsearchversusintervaltreesearch" + System.getProperty("file.separator") + "Compare.txt";
	
	public static int NUMBER_OF_CHROMOSOMES_HG19 = 24;
	
//	Calculations
	public static final String HG19_CHROMOSOME_SIZES_INPUT_FILE = "FTP" + System.getProperty("file.separator") + "HG19_CHROM_SIZES" + System.getProperty("file.separator") + "hg19.chrom.sizes.txt";
	
	
	//ANNOTATION 
	//RESULTS starts
	public static final String ANNOTATION_RESULTS_FOR_DNASE 	=  Commons.ANNOTATION + System.getProperty("file.separator") + Commons.RESULTS + System.getProperty("file.separator") + Commons.DNASE 	+ System.getProperty("file.separator") + "number_of_k_out_of_n_given_intervals_Dnase_results.txt";
	public static final String ANNOTATION_RESULTS_FOR_TF 		=  Commons.ANNOTATION + System.getProperty("file.separator") + Commons.RESULTS + System.getProperty("file.separator") + Commons.TF 		+ System.getProperty("file.separator") + "number_of_k_out_of_n_given_intervals_TF_results.txt";
	public static final String ANNOTATION_RESULTS_FOR_HISTONE 	=  Commons.ANNOTATION + System.getProperty("file.separator") + Commons.RESULTS + System.getProperty("file.separator") + Commons.HISTONE + System.getProperty("file.separator") + "number_of_k_out_of_n_given_intervals_Histone_results.txt";
	
	public static final String ANNOTATION_RESULTS_FOR_KEGGPATHWAY 	=  Commons.ANNOTATION + System.getProperty("file.separator") + Commons.RESULTS + System.getProperty("file.separator") + Commons.KEGG_PATHWAY + System.getProperty("file.separator"); 
	public static final String ANNOTATION_RESULTS_FOR_EXON_BASED_KEGGPATHWAY_FILE =  "KEGGPathway_Exon_Based_number_of_k_out_of_n_search_input_lines.txt";
	public static final String ANNOTATION_RESULTS_FOR_REGULATION_BASED_KEGGPATHWAY_FILE =  "KEGGPathway_Regulation_Based_number_of_k_out_of_n_search_input_lines.txt";
	public static final String ANNOTATION_RESULTS_FOR_ALL_BASED_KEGGPATHWAY_FILE =  "KEGGPathway_All_Based_number_of_k_out_of_n_search_input_lines.txt";
	
	
	public static final String ANNOTATION_RESULTS_FOR_USERDEFINEDGENESET_DIRECTORY =  Commons.ANNOTATION + System.getProperty("file.separator") + Commons.RESULTS + System.getProperty("file.separator") +  Commons.USER_DEFINED_GENESET + System.getProperty("file.separator");
	public static final String ANNOTATION_RESULTS_FOR_EXON_BASED_USERDEFINEDGENESET_FILE =  "_Exon_Based_number_of_k_out_of_n_search_input_lines.txt";
	public static final String ANNOTATION_RESULTS_FOR_REGULATION_BASED_USERDEFINEDGENESET_FILE =  "_Regulation_Based_number_of_k_out_of_n_search_input_lines.txt";
	public static final String ANNOTATION_RESULTS_FOR_ALL_BASED_USERDEFINEDGENESET_FILE =  "_All_Based_number_of_k_out_of_n_search_input_lines.txt";
	
	public static final String GENESET_RESULTS = "_results.txt";
	
	public static final String ANNOTATION_RESULTS_FOR_USERDEFINEDLIBRARY_DIRECTORY =  Commons.ANNOTATION + System.getProperty("file.separator") + Commons.RESULTS + System.getProperty("file.separator") +  Commons.USER_DEFINED_LIBRARY + System.getProperty("file.separator");
	public static final String ANNOTATION_RESULTS_FOR_USERDEFINEDLIBRARY_FILE =  "_number_of_k_out_of_n_search_input_lines_results.txt";

	public static final String ANNOTATION_RESULTS_FOR_TF_EXON_BASED_KEGG_PATHWAY 		=  	Commons.ANNOTATION + System.getProperty("file.separator") +	Commons.RESULTS + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + 	"number_of_k_out_of_n_search_input_lines_TF_Exon_Based_KEGG_Pathway_results.txt";
	public static final String ANNOTATION_RESULTS_FOR_TF_REGULATION_BASED_KEGG_PATHWAY 	=  	Commons.ANNOTATION + System.getProperty("file.separator") +	Commons.RESULTS + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") +	"number_of_k_out_of_n_search_input_lines_TF_Regulation_Based_KEGG_Pathway_results.txt";
	public static final String ANNOTATION_RESULTS_FOR_TF_ALL_BASED_KEGG_PATHWAY 		=  	Commons.ANNOTATION + System.getProperty("file.separator") +	Commons.RESULTS + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + 	"number_of_k_out_of_n_search_input_lines_TF_All_Based_KEGG_Pathway_results.txt";
	
	public static final String ANNOTATION_RESULTS_FOR_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY 		=  Commons.ANNOTATION + System.getProperty("file.separator") +Commons.RESULTS + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + "number_of_k_out_of_n_search_input_lines_TF_CellLine_Exon_Based_KEGG_Pathway_results.txt";
	public static final String ANNOTATION_RESULTS_FOR_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY =  Commons.ANNOTATION + System.getProperty("file.separator") +Commons.RESULTS + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + "number_of_k_out_of_n_search_input_lines_TF_CellLine_Regulation_Based_KEGG_Pathway_results.txt";
	public static final String ANNOTATION_RESULTS_FOR_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY 		=  Commons.ANNOTATION + System.getProperty("file.separator") +Commons.RESULTS + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + "number_of_k_out_of_n_search_input_lines_TF_CellLine_All_Based_KEGG_Pathway_results.txt";
	

	public static final String ANNOTATE_INTERVALS_GENE_ALTERNATE_NAME_RESULTS_GIVEN_SEARCH_INPUT =  Commons.ANNOTATION  + System.getProperty("file.separator") +Commons.RESULTS + System.getProperty("file.separator") + "number_of_k_out_of_n_search_input_lines_Gene_Alternate_Name_results.txt";
	//ANNOTATION
	//RESULTS ends

			
	//whole genome using interval tree
	public static final String DNASE_CELL_LINE_WHOLE_GENOME_USING_INTERVAL_TREE = Commons.BYGLANET + System.getProperty("file.separator") + "fromWholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_intervaltree" + System.getProperty("file.separator") + "dnaseCellLine_whole_genome_using_interval_tree_number_of_non_overlapping_base_pairs_.txt";
	public static final String DUMMY_DNASE_CELL_LINE_WHOLE_GENOME_USING_INTERVAL_TREE = Commons.BYGLANET + System.getProperty("file.separator") + "fromWholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_intervaltree" + System.getProperty("file.separator") + "dummy_dnase_cell_line_whole_genome_using_interval_tree_number_of_non_overlapping_base_pairs_.txt";
	public static final String TFBS_WHOLE_GENOME_USING_INTERVAL_TREE = Commons.BYGLANET + System.getProperty("file.separator") + "fromWholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_intervaltree" + System.getProperty("file.separator") + "tfbs_whole_genome_using_interval_tree_number_of_non_overlapping_base_pairs_.txt";
	public static final String HISTONE_WHOLE_GENOME_USING_INTERVAL_TREE = Commons.BYGLANET + System.getProperty("file.separator") + "fromWholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_intervaltree" + System.getProperty("file.separator") + "histone_whole_genome_using_interval_tree_number_of_non_overlapping_base_pairs_.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_WHOLE_GENOME_USING_INTERVAL_TREE = Commons.BYGLANET + System.getProperty("file.separator") + "fromWholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_intervaltree" + System.getProperty("file.separator") + "exon_based_kegg_pathway_whole_genome_using_interval_tree_number_of_non_overlapping_base_pairs.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_WHOLE_GENOME_USING_INTERVAL_TREE = Commons.BYGLANET + System.getProperty("file.separator") + "fromWholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_intervaltree" + System.getProperty("file.separator") + "regulation_based_kegg_pathway_whole_genome_using_interval_tree_number_of_non_overlapping_base_pairs_.txt";

	//whole genome using sliding window
	public static final String DNASE_CELL_LINE_WHOLE_GENOME_USING_SLIDING_WINDOW = "Doktora" + System.getProperty("file.separator") + "wholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_slidingwindow" + System.getProperty("file.separator") + "dnaseCellLine_whole_genome_using_sliding_window_number_of_non_overlapping_base_pairs.txt";
	public static final String TFBS_WHOLE_GENOME_USING_SLIDING_WINDOW = "Doktora" + System.getProperty("file.separator") + "wholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_slidingwindow" + System.getProperty("file.separator") + "tfbs_whole_genome_sliding_window_number_of_non_overlapping_base_pairs_.txt";		
	public static final String HISTONE_WHOLE_GENOME_USING_SLIDING_WINDOW = "Doktora" + System.getProperty("file.separator") + "wholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_slidingwindow" + System.getProperty("file.separator") + "histone_whole_genome_sliding_window_number_of_non_overlapping_base_pairs.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_WHOLE_GENOME_USING_SLIDING_WINDOW = "Doktora" + System.getProperty("file.separator") + "wholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_slidingwindow" + System.getProperty("file.separator") + "exon_based_kegg_pathway_whole_genome_sliding_window_number_of_non_overlapping_base_pairs.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_WHOLE_GENOME_USING_SLIDING_WINDOW = "Doktora" + System.getProperty("file.separator") + "wholegenome" + System.getProperty("file.separator") + "nonoverlappingbasepairs" + System.getProperty("file.separator") + "wholegenome_slidingwindow" + System.getProperty("file.separator") + "regulation_based_kegg_pathway_whole_genome_sliding_window_number_of_non_overlapping_base_pairs.txt";
	
	//empirical P values
	public static final String DNASE_CELL_LINE_NAME_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "dnase_EmpiricalPValues";
	public static final String TFBS_NAME_CELL_LINE_NAME_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfbs_EmpiricalPValues";
	public static final String HISTONE_NAME_CELL_LINE_NAME_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "histone_EmpiricalPValues";
	public static final String EXON_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "exonBasedKeggPathway_EmpiricalPValues";
	public static final String REGULATION_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "regulationBasedKeggPathway_EmpiricalPValues";
	public static final String ALL_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "allBasedKeggPathway_EmpiricalPValues";
	public static final String TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineExonBasedKeggPathway_EmpiricalPValues";
	public static final String TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineRegulationBasedKeggPathway_EmpiricalPValues";
	public static final String TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineAllBasedKeggPathway_EmpiricalPValues";
	public static final String TF_EXON_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfExonBasedKeggPathway_EmpiricalPValues";
	public static final String TF_REGULATION_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfRegulationBasedKeggPathway_EmpiricalPValues";
	public static final String TF_ALL_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfAllBasedKeggPathway_EmpiricalPValues";

	//empirical P values using Bonferroni Correction
	public static final String DNASE_CELL_LINE_NAME_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "dnase_BonfCorr_EmpiricalPValues";
	public static final String TFBS_NAME_CELL_LINE_NAME_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfbs_BonfCorr_EmpiricalPValues";
	public static final String HISTONE_NAME_CELL_LINE_NAME_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "histone_BonfCorr_EmpiricalPValues";
	public static final String EXON_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "exonBasedKeggPathway_BonfCorr_EmpiricalPValues";
	public static final String REGULATION_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "regulationBasedKeggPathway_BonfCorr_EmpiricalPValues";
	public static final String ALL_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "allBasedKeggPathway_BonfCorr_EmpiricalPValues";
	public static final String TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineExonBasedKeggPathway_BonfCorr_EmpiricalPValues";
	public static final String TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineRegulationBasedKeggPathway_BonfCorr_EmpiricalPValues";
	public static final String TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineAllBasedKeggPathway_BonfCorr_EmpiricalPValues";
	public static final String TF_EXON_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfExonBasedKeggPathway_BonfCorr_EmpiricalPValues";
	public static final String TF_REGULATION_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfRegulationBasedKeggPathway_BonfCorr_EmpiricalPValues";
	public static final String TF_ALL_BASED_KEGG_PATHWAY_EMPIRICAL_P_VALUES_USING_BONFERRONI_CORRECTION = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfAllBasedKeggPathway_BonfCorr_EmpiricalPValues";
	
	
	//Significant for FDR
	public static final String DNASE_CELL_LINE_NAME_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "dnase_BH_FDR";
	public static final String TFBS_NAME_CELL_LINE_NAME_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfbs_BH_FDR";
	public static final String HISTONE_NAME_CELL_LINE_NAME_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "histone_BH_FDR";
	public static final String EXON_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "exonBasedKeggPathway_BH_FDR";
	public static final String REGULATION_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "regulationBasedKeggPathway_BH_FDR";
	public static final String ALL_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "allBasedKeggPathway_BH_FDR";
	public static final String TF_EXON_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfExonBasedKeggPathway_BH_FDR";
	public static final String TF_REGULATION_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfRegulationBasedKeggPathway_BH_FDR";
	public static final String TF_ALL_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfAllBasedKeggPathway_BH_FDR";
	public static final String TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineExonBasedKeggPathway_BH_FDR";
	public static final String TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineRegulationBasedKeggPathway_BH_FDR";
	public static final String TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_BENJAMINI_HOCHBERG_FDR = Commons.ENRICHMENT + System.getProperty("file.separator") + "tfCellLineAllBasedKeggPathway_BH_FDR";
	
	
	

	//empirical P values 
	//Annotation of permutations starts
	public static final String ANNOTATE_PERMUTATIONS_FOR_DNASE	= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.DNASE + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_FOR_TFBS	= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.TF + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_FOR_HISTONE= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.HISTONE + System.getProperty("file.separator");
	
	public static final String ANNOTATE_PERMUTATIONS_FOR_EXON_BASED_USERDEFINED_GENESET_ANALYSIS 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.USER_DEFINED_GENESET + System.getProperty("file.separator") + Commons.EXON_BASED_USER_DEFINED_GENESET + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_FOR_REGULATION_BASED_USERDEFINED_GENESET_ANALYSIS = Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.USER_DEFINED_GENESET + System.getProperty("file.separator") + Commons.REGULATION_BASED_USER_DEFINED_GENESET + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_FOR_ALL_BASED_USERDEFINED_GENESET_ANALYSIS 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.USER_DEFINED_GENESET + System.getProperty("file.separator") + Commons.ALL_BASED_USER_DEFINED_GENESET  + System.getProperty("file.separator");
	
	
	public static final String ANNOTATE_PERMUTATIONS_FOR_USERDEFINEDLIBRARY 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.USER_DEFINED_LIBRARY + System.getProperty("file.separator");
	
	public static final String ANNOTATE_PERMUTATIONS_FOR_EXON_BASED_KEGG_PATHWAY_ANALYSIS 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.EXON_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_FOR_REGULATION_BASED_KEGG_PATHWAY_ANALYSIS = Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.REGULATION_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_FOR_ALL_BASED_KEGG_PATHWAY_ANALYSIS 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	
	public static final String ANNOTATE_PERMUTATIONS_TF_EXON_BASED_KEGG_PATHWAY_ANALYSIS 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY  + System.getProperty("file.separator") + Commons.TF_EXON_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_TF_REGULATION_BASED_KEGG_PATHWAY_ANALYSIS 	= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") +  Commons.TF_REGULATION_BASED_KEGG_PATHWAY+ System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_TF_ALL_BASED_KEGG_PATHWAY_ANALYSIS 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator");

	public static final String ANNOTATE_PERMUTATIONS_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_ANALYSIS 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_EXON_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_ANALYSIS = Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String ANNOTATE_PERMUTATIONS_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_ANALYSIS 		= Commons.ANNOTATION_FOR_PERMUTATIONS + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator");	
	//Annotation of permutations ends

	//Results to be Collected
	public static final String ENRICHMENT_DIRECTORY 	=  Commons.ENRICHMENT + System.getProperty("file.separator");
	
	
	public static final String RUN	= "run";
	public static final String RUNS_DIRECTORY 	= "runs" + System.getProperty("file.separator");
		
	public static final String ALL_WITH_RESPECT_TO_BH_FDR_ADJUSTED_P_VALUE 	=  "_wrt_BH_FDR_adjusted_pValue.txt";
	public static final String ALL_WITH_RESPECT_TO_BONF_CORRECTED_P_VALUE 	=  "_wrt_Bonf_corrected_pValue.txt";
	
	//Enrichment Results starts
	public static final String TO_BE_COLLECTED_DNASE_NUMBER_OF_OVERLAPS 	= ENRICHMENT_DIRECTORY + Commons.DNASE + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.DNASE ;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_DNASE 	= ENRICHMENT_DIRECTORY + Commons.DNASE + System.getProperty("file.separator")  + Commons.DNASE ;
	
	
	public static final String TO_BE_COLLECTED_HISTONE_NUMBER_OF_OVERLAPS 	= ENRICHMENT_DIRECTORY + Commons.HISTONE + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.HISTONE;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_HISTONE 	= ENRICHMENT_DIRECTORY + Commons.HISTONE + System.getProperty("file.separator") + Commons.HISTONE;
	
	public static final String TO_BE_COLLECTED_TF_NUMBER_OF_OVERLAPS		= ENRICHMENT_DIRECTORY + Commons.TF + System.getProperty("file.separator") + RUNS_DIRECTORY+  Commons.TF;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_TF 	= ENRICHMENT_DIRECTORY + Commons.TF + System.getProperty("file.separator") + Commons.TF;
	
	//Use these constants in Enrichment and AugmentationofEnrichedElementswithGivenInputData
	public static final String ENRICHMENT_USERDEFINED_GENESET_COMMON = ENRICHMENT_DIRECTORY + Commons.USER_DEFINED_GENESET + System.getProperty("file.separator"); 			

	//starts
	public static final String ENRICHMENT_EXONBASED_USERDEFINED_GENESET = Commons.EXON_BASED  + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.EXON_BASED_USER_DEFINED_GENESET ;
	public static final String ALL_PERMUTAIONS_NUMBER_OF_OVERLAPS_FOR_EXONBASED_USERDEFINED_GENESET = Commons.EXON_BASED  + System.getProperty("file.separator")  + Commons.EXON_BASED_USER_DEFINED_GENESET ;

	public static final String ENRICHMENT_REGULATIONBASED_USERDEFINED_GENESET = Commons.REGULATION_BASED + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.REGULATION_BASED_USER_DEFINED_GENESET ;
	public static final String ALL_PERMUTAIONS_NUMBER_OF_OVERLAPS_FOR_REGULATIONBASED_USERDEFINED_GENESET = Commons.REGULATION_BASED + System.getProperty("file.separator") + Commons.REGULATION_BASED_USER_DEFINED_GENESET ;
	
	public static final String ENRICHMENT_ALLBASED_USERDEFINED_GENESET =  Commons.ALL_BASED  +  System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.ALL_BASED_USER_DEFINED_GENESET;
	public static final String ALL_PERMUTAIONS_NUMBER_OF_OVERLAPS_FOR_ALLBASED_USERDEFINED_GENESET = Commons.ALL_BASED  +  System.getProperty("file.separator")  + Commons.ALL_BASED_USER_DEFINED_GENESET;
	//ends
	
	public static final String TO_BE_COLLECTED_USER_DEFINED_LIBRARY_NUMBER_OF_OVERLAPS =   ENRICHMENT_DIRECTORY + Commons.USER_DEFINED_LIBRARY + System.getProperty("file.separator");
	
	public static final String TO_BE_COLLECTED_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS 		= ENRICHMENT_DIRECTORY + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.EXON_BASED + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.EXON_BASED_KEGG_PATHWAY ;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_EXON_BASED_KEGG_PATHWAY 		= ENRICHMENT_DIRECTORY + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.EXON_BASED + System.getProperty("file.separator")  + Commons.EXON_BASED_KEGG_PATHWAY ;
	
	public static final String TO_BE_COLLECTED_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS = ENRICHMENT_DIRECTORY + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.REGULATION_BASED + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.REGULATION_BASED_KEGG_PATHWAY ;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_REGULATION_BASED_KEGG_PATHWAY = ENRICHMENT_DIRECTORY + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.REGULATION_BASED + System.getProperty("file.separator") + Commons.REGULATION_BASED_KEGG_PATHWAY ;
	
	public static final String TO_BE_COLLECTED_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS 		= ENRICHMENT_DIRECTORY + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.ALL_BASED + System.getProperty("file.separator") + RUNS_DIRECTORY +  Commons.ALL_BASED_KEGG_PATHWAY;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_ALL_BASED_KEGG_PATHWAY 		= ENRICHMENT_DIRECTORY + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.ALL_BASED + System.getProperty("file.separator") +  Commons.ALL_BASED_KEGG_PATHWAY;
	
	public static final String TO_BE_COLLECTED_TF_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS 		= ENRICHMENT_DIRECTORY + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_EXON_BASED_KEGG_PATHWAY  + System.getProperty("file.separator") + RUNS_DIRECTORY +Commons.TF_EXON_BASED_KEGG_PATHWAY;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_TF_EXON_BASED_KEGG_PATHWAY		= ENRICHMENT_DIRECTORY + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_EXON_BASED_KEGG_PATHWAY  + System.getProperty("file.separator")  +Commons.TF_EXON_BASED_KEGG_PATHWAY;
	
	public static final String TO_BE_COLLECTED_TF_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS 	= ENRICHMENT_DIRECTORY + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_REGULATION_BASED_KEGG_PATHWAY + System.getProperty("file.separator") + RUNS_DIRECTORY +  Commons.TF_REGULATION_BASED_KEGG_PATHWAY ;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_TF_REGULATION_BASED_KEGG_PATHWAY 	= ENRICHMENT_DIRECTORY + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_REGULATION_BASED_KEGG_PATHWAY + System.getProperty("file.separator")  +  Commons.TF_REGULATION_BASED_KEGG_PATHWAY ;
	
	public static final String TO_BE_COLLECTED_TF_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS 		= ENRICHMENT_DIRECTORY + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator") + RUNS_DIRECTORY+  Commons.TF_ALL_BASED_KEGG_PATHWAY ;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_TF_ALL_BASED_KEGG_PATHWAY 		= ENRICHMENT_DIRECTORY + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator") +  Commons.TF_ALL_BASED_KEGG_PATHWAY ;
	
	public static final String TO_BE_COLLECTED_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS 		= ENRICHMENT_DIRECTORY + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_EXON_BASED_KEGG_PATHWAY + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.TF_CELLLINE_EXON_BASED_KEGG_PATHWAY ;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_TF_CELLLINE_EXON_BASED_KEGG_PATHWAY 		= ENRICHMENT_DIRECTORY + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_EXON_BASED_KEGG_PATHWAY + System.getProperty("file.separator")  + Commons.TF_CELLLINE_EXON_BASED_KEGG_PATHWAY ;
	
	public static final String TO_BE_COLLECTED_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS = ENRICHMENT_DIRECTORY + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY ;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY = ENRICHMENT_DIRECTORY + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY + System.getProperty("file.separator")  + Commons.TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY ;
	
	public static final String TO_BE_COLLECTED_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_NUMBER_OF_OVERLAPS 		= ENRICHMENT_DIRECTORY + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator") + RUNS_DIRECTORY + Commons.TF_CELLLINE_ALL_BASED_KEGG_PATHWAY;
	public static final String ALL_PERMUTATIONS_NUMBER_OF_OVERLAPS_FOR_TF_CELLLINE_ALL_BASED_KEGG_PATHWAY 		= ENRICHMENT_DIRECTORY + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator")  + Commons.TF_CELLLINE_ALL_BASED_KEGG_PATHWAY;
	//Enrichment Results ends
	
	
	//Binomial Distribution
	public static final String DNASE_CELLLINE_NAMES_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "dnase_pvalues.txt";
	public static final String DNASE_CELLLINE_NAMES_ADJUSTED_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "dnase_adjusted_pvalues.txt";
	public static final String DNASE_CELLLINE_NAMES_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "dnase_all_values.txt";
	public static final String DNASE_CELLLINE_NAMES_ADJUSTED_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "dnase_adjusted_all_values.txt";
	
	public static final String TFBS_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "tfbs_pvalues.txt";
	public static final String TFBS_ADJUSTED_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "tfbs_adjusted_pvalues.txt";
	public static final String TFBS_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "tfbs_all_values.txt";
	public static final String TFBS_ADJUSTED_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "tfbs_adjusted_all_values.txt";
	
	public static final String HISTONE_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "histone_pvalues.txt";
	public static final String HISTONE_ADJUSTED_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "histone_adjusted_pvalues.txt";
	public static final String HISTONE_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "histone_all_values.txt";
	public static final String HISTONE_ADJUSTED_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "histone_adjusted_all_values.txt";
	
	public static final String EXON_BASED_KEGG_PATHWAY_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "exonBased_KeggPathway_pvalues.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "exonBased_KeggPathway_adjusted_pvalues.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "exonBased_KeggPathway_all_values.txt";
	public static final String EXON_BASED_KEGG_PATHWAY_ADJUSTED_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "exonBased_KeggPathway_adjusted_all_values.txt";
	
	public static final String REGULATION_BASED_KEGG_PATHWAY_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "regulationBased_KeggPathway_pvalues.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_P_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "regulationBased_KeggPathway_adjusted_pvalues.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "regulationBased_KeggPathway_all_values.txt";
	public static final String REGULATION_BASED_KEGG_PATHWAY_ADJUSTED_ALL_VALUES =  "BinomialDistribution" + System.getProperty("file.separator") + "regulationBased_KeggPathway_adjusted_all_values.txt";
	
	public static final String CALCULATE_USING_BINOMIAL_DISTRIBUTION = "CALCULATE_USING_BINOMIAL_DISTRIBUTION";
	public static final String CALCULATE_USING_BURCAK_BINOMIAL_DISTRIBUTION = "CALCULATE_USING_BURCAK_BINOMIAL_DISTRIBUTION";
	
	
	
	
	public static final String EMPTY_STRING = "";
	
		
	//Enrichment parameter
	public static final String DO_ENRICH = "DO_ENRICH";
	public static final String DO_NOT_ENRICH = "DO_NOT_ENRICH";

// @todo Enumtypes		
//	Write all possible names
	public static final String DNASE = "Dnase";
	public static final String TF = "TF";
	public static final String HISTONE = "Histone";
	
	public static final String EXON_BASED = "ExonBased";
	public static final String REGULATION_BASED = "RegulationBased";
	public static final String ALL_BASED = "AllBased";
	
	public static final String EXON_BASED_USER_DEFINED_GENESET = "ExonBased_UserDefinedGeneSet";
	public static final String REGULATION_BASED_USER_DEFINED_GENESET = "RegulationBased_UserDefinedGeneSet";
	public static final String ALL_BASED_USER_DEFINED_GENESET = "AllBased_UserDefinedGeneSet";

	public static final String EXON_BASED_KEGG_PATHWAY = "ExonBased_KEGGPathway";
	public static final String REGULATION_BASED_KEGG_PATHWAY = "RegulationBased_KEGGPathway";
	public static final String ALL_BASED_KEGG_PATHWAY = "AllBased_KEGGPathway";
	
	public static final String TF_EXON_BASED_KEGG_PATHWAY = "TFExonBasedKEGGPathway";
	public static final String TF_REGULATION_BASED_KEGG_PATHWAY = "TFRegulationBasedKEGGPathway";
	public static final String TF_ALL_BASED_KEGG_PATHWAY = "TFAllBasedKEGGPathway";
			
	public static final String TF_CELLLINE_EXON_BASED_KEGG_PATHWAY = "TFCellLineExonBasedKEGGPathway";
	public static final String TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY = "TFCellLineRegulationBasedKEGGPathway";
	public static final String TF_CELLLINE_ALL_BASED_KEGG_PATHWAY = "TFCellLineAllBasedKEGGPathway";
	
	public static final String USER_DEFINED_GENESET = "UserDefinedGeneSet";
	public static final String USER_DEFINED_LIBRARY = "UserDefinedLibrary";
	
	public static final String KEGG_PATHWAY = "KEGGPathway";
	public static final String TF_KEGGPATHWAY = "TFKEGGPathway";
	public static final String TF_CELLLINE_KEGGPATHWAY = "TFCellLineKEGGPathway";
	
	public static final String HG19_REFSEQ_GENE = "Hg19RefSeqGene";
	public static final String NCBI_GENE_ID = "NCBIGeneID";
	public static final String NCBI_RNA_NUCLEOTIDE_ACCESSION_VERSION = "NCBI_RNA_NUCLEOTIDE_ACCESSION_VERSION";
	public static final String UCSC_GENE_ALTERNATE_NAME = "UCSC_GENE_ALTERNATE_NAME";
	public static final String CELLLINE = "CELLLINE";

	public static final String FIND_ALL = "FIND_ALL";
	public static final String FIND_FIRST = "FIND_FIRST";
	
	
	//All possible names	
		
	
	public static final String WRITE_ALL_POSSIBLE_NAMES_OUTPUT_DIRECTORYNAME = Commons.BYGLANET + System.getProperty("file.separator") + Commons.ALL_POSSIBLE_NAMES + System.getProperty("file.separator");
	
	//ENCODE CELL LINE
	public static final String WRITE_ALL_POSSIBLE_ENCODE_CELL_LINE_NAMES_OUTPUT_FILENAME = "all_possible_encode_cell_lines_names.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_CELLLINENAME_2_CELLLINENUMBER_OUTPUT_FILENAME = "all_possible_encode_cellLineName_2_cellLineNumber_map.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_CELLLINENUMBER_2_CELLLINENAME_OUTPUT_FILENAME = "all_possible_encode_cellLineNumber_2_cellLineName_map.txt";
	
	//ENCODE TF
	public static final String WRITE_ALL_POSSIBLE_ENCODE_TF_NAMES_OUTPUT_FILENAME = "all_possible_encode_tf_names.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_TFNAME_2_TFNUMBER_OUTPUT_FILENAME = "all_possible_encode_tfName_2_tfNumber_map.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_TFNUMBER_2_TFNAME_OUTPUT_FILENAME = "all_possible_encode_tfNumber_2_tfName_map.txt";	
	public static final String WRITE_ALL_POSSIBLE_ENCODE_TFNUMBER_CELLLINENUMBER_2_TFNAME_CELLLINENAME_OUTPUT_FILENAME = "all_possible_encode_tfNumber_cellLineNumber_2_tfName_cellLineName_map.txt";

	//ENCODE HISTONE
	public static final String WRITE_ALL_POSSIBLE_ENCODE_HISTONE_NAMES_OUTPUT_FILENAME = "all_possible_encode_histone_names.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_HISTONENAME_2_HISTONENUMBER_OUTPUT_FILENAME = "all_possible_encode_histoneName_2_histoneNumber_map.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_HISTONENUMBER_2_HISTONENAME_OUTPUT_FILENAME = "all_possible_encode_histoneNumber_2_histoneName_map.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_HISTONENUMBER_CELLLINENUMBER_2_HISTONENAME_CELLLINENAME_OUTPUT_FILENAME = "all_possible_encode_histoneNumber_cellLineNumber_2_histoneName_cellLineName_map.txt";

	//ENCODE  FILENAME
	public static final String WRITE_ALL_ENCODE_FILE_NAMES_OUTPUT_FILENAME = "all_possible_encode_file_names.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_FILENAME_2_FILENUMBER_OUTPUT_FILENAME = "all_possible_encode_fileName_2_fileNumber_map.txt";
	public static final String WRITE_ALL_POSSIBLE_ENCODE_FILENUMBER_2_FILENAME_OUTPUT_FILENAME = "all_possible_encode_fileNumber_2_fileName_map.txt";

	
	//USER DEFINED GENESET
	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDGENESET_NAMES_OUTPUT_FILENAME = "all_possible_userDefinedGeneSet_names.txt";
	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDGENESETNAME_2_USERDEFINEDGENESETNUMBER_OUTPUT_FILENAME = "all_possible_userDefinedGeneSetName_2_userDefinedGeneSetNumber_map.txt";
	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDGENESETNUMBER_2_USERDEFINEDGENESETNAME_OUTPUT_FILENAME = "all_possible_userDefinedGeneSetNumber_2_userDefinedGeneSetName_map.txt";

	//USER DEFINED LIBRARY
	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDLIBRARY_ELEMENTTYPE_2_ELEMENTTYPENUMBER_OUTPUT_FILENAME = "all_possible_userDefinedLibrary_elementType_2_elementTypeNumber.txt";
	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDLIBRARY_ELEMENTNAME_2_ELEMENTNUMBER_OUTPUT_FILENAME = "all_possible_userDefinedLibrary_elementName_2_elementNumber.txt";
	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDLIBRARY_FILENAME_2_FILENUMBER_OUTPUT_FILENAME = "all_possible_userDefinedLibrary_fileName_2_fileNumber.txt";

	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDLIBRARY_ELEMENTTYPENUMBER_2_ELEMENTTYPE_OUTPUT_FILENAME = "all_possible_userDefinedLibrary_elementTypeNumber_2_elementType.txt";
	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDLIBRARY_ELEMENTNUMBER_2_ELEMENTNAME_OUTPUT_FILENAME = "all_possible_userDefinedLibrary_elementNumber_2_elementName.txt";
	public static final String WRITE_ALL_POSSIBLE_USERDEFINEDLIBRARY_FILENUMBER_2_FILENAME_OUTPUT_FILENAME = "all_possible_userDefinedLibrary_fileNumber_2_fileName.txt";
	
	//KEGG PATHWAY
	public static final String WRITE_ALL_POSSIBLE_KEGG_PATHWAY_NAMES_OUTPUT_FILENAME = "all_possible_kegg_pathway_names.txt";
	public static final String WRITE_ALL_POSSIBLE_KEGGPATHWAYNAME_2_KEGGPATHWAYNUMBER_OUTPUT_FILENAME = "all_possible_keggPathwayName_2_keggPathwayNumber_map.txt";
	public static final String WRITE_ALL_POSSIBLE_KEGGPATHWAYNUMBER_2_KEGGPATHWAYNAME_OUTPUT_FILENAME = "all_possible_keggPathwayNumber_2_keggPathwayName_map.txt";
	
	
	//UCSC Genome Browser RefSeq Genes
	public static final String WRITE_ALL_UCSC_REF_SEQ_GENES_ENTREZ_GENE_IDS = "all_possible_ucsc_refseq_genes_entrez_geneIds.txt";
	
	//UCSC Genome Browser RefSeq Gene Names
	public static final String WRITE_ALL_UCSC_REF_SEQ_GENE_NAMES = "all_possible_ucsc_refseq_gene_names.txt";
	public static final String WRITE_ALL_POSSIBLE_UCSC_REFSEQ_GENE_NAME_2_REFSEQ_GENE_NAME_NUMBER_OUTPUT_FILENAME = "all_possible_ucsc_refseqGeneName_2_refseqGeneNameNumber_map.txt";
	public static final String WRITE_ALL_POSSIBLE_UCSC_REFSEQ_GENE_NAME_NUMBER_2_REFSEQ_GENE_NAME_OUTPUT_FILENAME = "all_possible_ucsc_refseqGeneNameNumber_2_refseqGeneName_map.txt";
	
	//UCSC Genome Browser Gene Hugo Symbols
	public static final String WRITE_ALL_UCSC_GENE_HUGO_SYMBOLS_NAMES = "all_possible_ucsc_gene_hugo_symbols.txt";
	public static final String WRITE_ALL_POSSIBLE_UCSC_GENE_HUGO_SYMBOL_2_GENE_HUGO_SYMBOL_NUMBER_OUTPUT_FILENAME = "all_possible_ucsc_geneHugoSymbol_2_geneHugoSymbolNumber_map.txt";
	public static final String WRITE_ALL_POSSIBLE_UCSC_GENE_HUGO_SYMBOL_NUMBER_2_GENE_HUGO_SYMBOL_OUTPUT_FILENAME = "all_possible_ucsc_geneHugoSymbolNumber_2_geneHugoSymbol_map.txt";
	
	public static final String WRITE_ALL_POSSIBLE_GENE_IDS_OUTPUT_FILENAME =  "all_possible_gene_ids.txt";	
	
	public static final String WRITE_ALL_POSSIBLE_RNA_NUCLEUOTIDE_ACCESSION_VERSIONS_OUTPUT_FILENAME = "all_possible_rna_nucleotide_accession_versions.txt";	
	
	public static final String WRITE_ALL_POSSIBLE_ALTERNATE_GENE_NAMES_OUTPUT_FILENAME = "all_possible_alternate_gene_names.txt";	
	

//	Kegg Pathway to Ncbi Ref Seq Gene Ids
	public static final String KEGG_PATHWAY_ENTRY_2_NAME_INPUT_FILE = "KEGG" + System.getProperty("file.separator") + "list_pathway_hsa.txt";
	public static final String KEGG_PATHWAY_2_NCBI_GENE_IDS_INPUT_FILE = "KEGG" + System.getProperty("file.separator") + "pathway_hsa.list";
	public static final String ALL_POSSIBLE_KEGG_PATHWAY_NAMES_OUTPUT_FILE = "Doktora" + System.getProperty("file.separator") + "keggpathway" + System.getProperty("file.separator") + "ncbigenes" + System.getProperty("file.separator") + "all_possible_kegg_pathway_names.txt";
	public static final String KEGG_PATHWAY_2_NCBI_GENE_IDS_OUTPUT_FILE_PATH = "Doktora" + System.getProperty("file.separator") + "keggpathway" + System.getProperty("file.separator") + "ncbigenes" + System.getProperty("file.separator");
	

	//Annotate intervals using interval tree
	public static final String TCGA_INPUT_DATA_WITH_NON_BLANKS_SNP_IDS_WITH_OVERLAPS = "FTP" + System.getProperty("file.separator") + "TCGA" + System.getProperty("file.separator") + "SearchInputTCGADataWithNonBlankSNPRows.txt";
	
	//ANNOTATION starts	
	//AnnotateGivenIntervals starts
	public static final String DNASE_ANNOTATION_DIRECTORY 	= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.DNASE + System.getProperty("file.separator");
	public static final String TF_ANNOTATION_DIRECTORY 		= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.TF + System.getProperty("file.separator");
	public static final String HISTONE_ANNOTATION_DIRECTORY = Commons.ANNOTATION + System.getProperty("file.separator") + Commons.HISTONE + System.getProperty("file.separator");
	
	public static final String NCBI_GENE_ID_ANNOTATION_DIRECTORY 	= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.NCBI_GENE_ID + System.getProperty("file.separator");
	public static final String NCBI_RNA_ANNOTATION_DIRECTORY 		= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.NCBI_RNA_NUCLEOTIDE_ACCESSION_VERSION + System.getProperty("file.separator");
	public static final String UCSC_GENE_ALTERNATE_NAME_ANNOTATION_DIRECTORY = Commons.ANNOTATION + System.getProperty("file.separator") + Commons.UCSC_GENE_ALTERNATE_NAME+ System.getProperty("file.separator");
	
	public static final String HG19_REFSEQ_GENE_ANNOTATION_DIRECTORY = Commons.ANNOTATION + System.getProperty("file.separator") + Commons.HG19_REFSEQ_GENE + System.getProperty("file.separator");

	//UserDefinedGeneSet
	public static final String USER_DEFINED_GENESET_ANNOTATION_DIRECTORY 		= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.USER_DEFINED_GENESET + System.getProperty("file.separator");
	public static final String EXONBASED_USERDEFINED_GENESET_ANNOTATION 		= Commons.EXON_BASED + System.getProperty("file.separator") + Commons.EXON_BASED;
	public static final String REGULATIONBASED_USERDEFINED_GENESET_ANNOTATION 	= Commons.REGULATION_BASED + System.getProperty("file.separator") + Commons.REGULATION_BASED;
	public static final String ALLBASED_USERDEFINED_GENESET_ANNOTATION 			= Commons.ALL_BASED + System.getProperty("file.separator") + Commons.ALL_BASED;
	
	//USER_DEFINED_LIBRARY
	public static final String USERDEFINEDLIBRARY_ANNOTATION_DIRECTORY = Commons.ANNOTATION + System.getProperty("file.separator") + Commons.USER_DEFINED_LIBRARY + System.getProperty("file.separator");
	
	
	//KEGG Pathway
	public static final String EXON_BASED_KEGG_PATHWAY_ANNOTATION 		= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.EXON_BASED + System.getProperty("file.separator") + Commons.EXON_BASED;
	public static final String REGULATION_BASED_KEGG_PATHWAY_ANNOTATION = Commons.ANNOTATION + System.getProperty("file.separator") + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.REGULATION_BASED  + System.getProperty("file.separator") + Commons.REGULATION_BASED;
	public static final String ALL_BASED_KEGG_PATHWAY_ANALYSIS 			= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.KEGG_PATHWAY + System.getProperty("file.separator") + Commons.ALL_BASED  + System.getProperty("file.separator") + Commons.ALL_BASED;
	
	//TF KEGGPATHWAY
	public static final String TF_EXON_BASED_KEGG_PATHWAY_ANNOTATION 		= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_EXON_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String TF_REGULATION_BASED_KEGG_PATHWAY_ANNOTATION 	= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_REGULATION_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String TF_ALL_BASED_KEGG_PATHWAY_ANNOTATION 		= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.TF_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator");

	public static final String TF_CELLLINE_EXON_BASED_KEGG_PATHWAY_ANNOTATION 		= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_EXON_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY_ANNOTATION = Commons.ANNOTATION + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_REGULATION_BASED_KEGG_PATHWAY + System.getProperty("file.separator");
	public static final String TF_CELLLINE_ALL_BASED_KEGG_PATHWAY_ANNOTATION 		= Commons.ANNOTATION + System.getProperty("file.separator") + Commons.TF_CELLLINE_KEGGPATHWAY + System.getProperty("file.separator") + Commons.TF_CELLLINE_ALL_BASED_KEGG_PATHWAY + System.getProperty("file.separator");	
	//AnnotateGivenIntervals ends
	//ANNOTATION ends
	
//	Search using Linear search
	public static final String SEARCH_USING_LINEAR_SEARCH_INPUT_FILE ="FTP" + System.getProperty("file.separator") + "TCGA" + System.getProperty("file.separator") + "SearchInputforTCGATestData_three_columns.txt";
	public static final String SEARCH_USING_LINEAR_SEARCH_OUTPUT_FILE = "Doktora" + System.getProperty("file.separator") + "search" + System.getProperty("file.separator") + "encodeucscgenome" + System.getProperty("file.separator") + "SearchOutput_Using_LinearSearch.txt";	
	
// 	Searching using IntervalTree 	
//	public static final String SEARCH_USING_INTERVAL_TREE_INPUT_FILE = "FTP" + System.getProperty("file.separator") + "TCGA" + System.getProperty("file.separator") + "SearchInputTCGADataWithNonBlankSNPRows.txt";
	public static final String SEARCH_USING_INTERVAL_TREE_OUTPUT_FILE = "Doktora" + System.getProperty("file.separator") + "search" + System.getProperty("file.separator") + "encodeucscgenome" + System.getProperty("file.separator") + "SearchOutput_Using_IntervalTreeSearch.txt";
	
	
	public static final String ANNOTATE_CHROMOSOME_BASED_INPUT_FILE_DIRECTORY = Commons.GIVENINPUTDATA + System.getProperty("file.separator");
	
	public static final String SEARCH_CHROMOSOME_BASED_INPUT_FILE_DIRECTORY = "Doktora" + System.getProperty("file.separator") + "search" + System.getProperty("file.separator") + "encodeucscgenome" + System.getProperty("file.separator");
	
	
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR1_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr1_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR2_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr2_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR3_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr3_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR4_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr4_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR5_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr5_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR6_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr6_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR7_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr7_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR8_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr8_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR9_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr9_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR10_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr10_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR11_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr11_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR12_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr12_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR13_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr13_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR14_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr14_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR15_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr15_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR16_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr16_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR17_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr17_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR18_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr18_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR19_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr19_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR20_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr20_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR21_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr21_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHR22_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chr22_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHRX_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chrX_ucsc_refseq_genes_interval_tree.txt";
	public static final String C_ECLIPSE_WORKSPACE_DOKTORA_CREATE_UCSCGENOME_SORTED_CHRY_UCSC_REFSEQ_GENES_INTERVAL_TREE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator") + "sorted_with_Interval_Tree_Infix_Traversal" + System.getProperty("file.separator") + "sorted_chrY_ucsc_refseq_genes_interval_tree.txt";
			
	//Downloaded from ncbi, gene2refseq.txt data
//	public static final String NCBI_GENE_TO_REF_SEQ = "FTP" + System.getProperty("file.separator") + "GENE_2_REFSEQ" + System.getProperty("file.separator") + "gene2refseq" + System.getProperty("file.separator") + "gene2refseq.txt";	
	public static final String NCBI_GENE_TO_REF_SEQ_1_OCT_2014 = "FTP" + System.getProperty("file.separator") + "GENE_2_REFSEQ" + System.getProperty("file.separator") + "gene2refseq" + System.getProperty("file.separator") + "gene2refseq_1_OCT_2014.txt";	

	public static final String NCBI_HUMAN_GENE_TO_REF_SEQ_DIRECTORYNAME = Commons.BYGLANET + System.getProperty("file.separator") + "fromNCBI" + System.getProperty("file.separator");
//	public static final String NCBI_HUMAN_GENE_TO_REF_SEQ_FILENAME ="human_gene2refseq.txt";
	public static final String NCBI_HUMAN_GENE_TO_REF_SEQ_FILENAME_1_OCT_2014 ="human_gene2refseq_1_OCT_2014.txt";

//	public static final String NCBI_RNANUCLEOTIDEACCESSION_TO_GENEID = "human_refseqRNANucleotideAccession2gene.txt";
	public static final String NCBI_RNANUCLEOTIDEACCESSION_TO_GENEID_1_OCT_2014 = "human_RNANucleotideAccession2GeneID_1_OCT_2014.txt";

//	public static final String NCBI_RNANUCLEOTIDEACCESSIONWITHVERSION_TO_GENEID = "human_refseqRNANucleotideAccessionWithVersion2gene.txt";
	public static final String NCBI_RNANUCLEOTIDEACCESSIONWITHVERSION_TO_GENEID_1_OCT_2014 = "human_RNANucleotideAccessionWithVersion2GeneID_1_OCT_2014.txt";
		
//	These files have been downloaded from ftp.ebi.ac.uk
//	They have been unzipped.
//	These files are yet unprocessed. 
//	They will be processed and will be accumated in corresponding chromosome base files first in unsorted manner then in sorted manner.
	public static final String TRANSCRIPTION_FACTOR_FILES_DIRECTORY = "C:" + System.getProperty("file.separator") + "eclipse_ganymede" + System.getProperty("file.separator") + "workspace" + System.getProperty("file.separator") + "ftp_encode" + System.getProperty("file.separator") + "transcription_factors";
	public static final String HISTONE_MARK_FILES_DIRECTORY = "C:" + System.getProperty("file.separator") + "eclipse_ganymede" + System.getProperty("file.separator") + "workspace" + System.getProperty("file.separator") + "ftp_encode" + System.getProperty("file.separator") + "histone_macs";
	public static final String DNASE_JUL2010_FILES_DIRECTORY = "C:" + System.getProperty("file.separator") + "eclipse_ganymede" + System.getProperty("file.separator") + "workspace" + System.getProperty("file.separator") + "ftp_encode" + System.getProperty("file.separator") + "dnase_jul2010";
	public static final String DNASE_FILES_DIRECTORY = "C:" + System.getProperty("file.separator") + "eclipse_ganymede" + System.getProperty("file.separator") + "workspace" + System.getProperty("file.separator") + "ftp_encode" + System.getProperty("file.separator") + "dnase";
	
	
	public static final String SEARCH_INPUT_FILE_WITH_NON_BLANK_SNP_IDS = "FTP" + System.getProperty("file.separator") + "TCGA" + System.getProperty("file.separator") + "SearchInputWithNonBlankSNPIDs.txt";
	public static final String SEARCH_INPUT_FILE_FOR_TCGA_TEST_DATA = "FTP" + System.getProperty("file.separator") + "TCGA" + System.getProperty("file.separator") + "SearchInputforTCGATestData.txt";
	public static final String SEARCH_INPUT_FILE_FOR_TCGA_DATA_WITH_NON_BLANK_SNP_ROWS = "Doktora" + System.getProperty("file.separator") + "testtcgadata" + System.getProperty("file.separator") + "SearchInputTCGADataWithNonBlankSNPRows.txt";
	public static final String SEARCH_OUTPUT_FILE_FOR_TCGA_TEST_DATA = "Doktora" + System.getProperty("file.separator") + "testtcgadata" + System.getProperty("file.separator") + "SearchOutputforTCGATestData.txt";
	
	
	public static final String SEARCH_OUTPUT_FILE = "Doktora" + System.getProperty("file.separator") + "annotate" + System.getProperty("file.separator") + "using" + System.getProperty("file.separator") + "encode" + System.getProperty("file.separator") + "SearchOutput.txt";
	
	
//	public static final String FTP_HG19_REFSEQ_GENES = "FTP" + System.getProperty("file.separator") + "HG19_REFSEQ_GENES" + System.getProperty("file.separator") + "hg19_refseq_genes.txt"; 
	public static final String FTP_HG19_REFSEQ_GENES_DOWNLOADED_1_OCT_2014 = "FTP" + System.getProperty("file.separator") + "HG19_REFSEQ_GENES" + System.getProperty("file.separator") + "hg19_refseq_genes_1_OCT_2014.txt"; 
	
	public static final String ANNOTATE_UCSC_ANALYZE_HG19_REFSEQ_GENES_DIRECTORYNAME = Commons.BYGLANET + System.getProperty("file.separator") + "fromCreate" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator");
	public static final String ANNOTATE_UCSC_ANALYZE_HG19_REFSEQ_GENES_FILENAME = "analyze_hg19_refseq_genes.txt";
	
	
	
	
	//Create ucsc refseq genes directory
	public static final String CREATE_UCSCGENOME_REFSEQ_GENES_DIRECTORYNAME = Commons.BYGLANET + System.getProperty("file.separator") + "fromCreate" + System.getProperty("file.separator") + "ucscgenome" + System.getProperty("file.separator");
	
	
	//Unsorted Chromosome Base RefSeq Gene Files
	public static final String UNSORTED_CHR1_REFSEQ_GENES = "unsorted_chr1_refseq_genes.txt";
	public static final String UNSORTED_CHR2_REFSEQ_GENES = "unsorted_chr2_refseq_genes.txt";
	public static final String UNSORTED_CHR3_REFSEQ_GENES = "unsorted_chr3_refseq_genes.txt";
	public static final String UNSORTED_CHR4_REFSEQ_GENES = "unsorted_chr4_refseq_genes.txt";
	public static final String UNSORTED_CHR5_REFSEQ_GENES = "unsorted_chr5_refseq_genes.txt";
	public static final String UNSORTED_CHR6_REFSEQ_GENES = "unsorted_chr6_refseq_genes.txt";
	public static final String UNSORTED_CHR7_REFSEQ_GENES = "unsorted_chr7_refseq_genes.txt";
	public static final String UNSORTED_CHR8_REFSEQ_GENES = "unsorted_chr8_refseq_genes.txt";
	public static final String UNSORTED_CHR9_REFSEQ_GENES = "unsorted_chr9_refseq_genes.txt";
	public static final String UNSORTED_CHR10_REFSEQ_GENES = "unsorted_ch10_refseq_genes.txt";
	public static final String UNSORTED_CHR11_REFSEQ_GENES = "unsorted_chr11_refseq_genes.txt";
	public static final String UNSORTED_CHR12_REFSEQ_GENES = "unsorted_chr12_refseq_genes.txt";
	public static final String UNSORTED_CHR13_REFSEQ_GENES = "unsorted_chr13_refseq_genes.txt";
	public static final String UNSORTED_CHR14_REFSEQ_GENES = "unsorted_chr14_refseq_genes.txt";
	public static final String UNSORTED_CHR15_REFSEQ_GENES = "unsorted_chr15_refseq_genes.txt";
	public static final String UNSORTED_CHR16_REFSEQ_GENES = "unsorted_chr16_refseq_genes.txt";
	public static final String UNSORTED_CHR17_REFSEQ_GENES = "unsorted_chr17_refseq_genes.txt";
	public static final String UNSORTED_CHR18_REFSEQ_GENES = "unsorted_chr18_refseq_genes.txt";
	public static final String UNSORTED_CHR19_REFSEQ_GENES = "unsorted_chr19_refseq_genes.txt";
	public static final String UNSORTED_CHR20_REFSEQ_GENES = "unsorted_chr20_refseq_genes.txt";
	public static final String UNSORTED_CHR21_REFSEQ_GENES = "unsorted_chr21_refseq_genes.txt";
	public static final String UNSORTED_CHR22_REFSEQ_GENES = "unsorted_chr22_refseq_genes.txt";
	public static final String UNSORTED_CHRX_REFSEQ_GENES = "unsorted_chrX_refseq_genes.txt";
	public static final String UNSORTED_CHRY_REFSEQ_GENES =  "unsorted_chrY_refseq_genes.txt";
	
	//@todo
	//Unsorted Chromosome Base RefSeq Gene Files with Numbers
	public static final String UNSORTED_CHR1_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr1_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR2_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr2_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR3_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr3_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR4_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr4_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR5_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr5_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR6_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr6_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR7_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr7_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR8_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr8_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR9_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr9_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR10_REFSEQ_GENES_WITH_NUMBERS = "unsorted_ch10_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR11_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr11_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR12_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr12_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR13_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr13_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR14_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr14_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR15_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr15_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR16_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr16_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR17_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr17_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR18_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr18_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR19_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr19_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR20_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr20_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR21_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr21_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHR22_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chr22_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHRX_REFSEQ_GENES_WITH_NUMBERS = "unsorted_chrX_refseq_genes_with_numbers.txt";
	public static final String UNSORTED_CHRY_REFSEQ_GENES_WITH_NUMBERS =  "unsorted_chrY_refseq_genes_with_numbers.txt";
	//@todo
	
	//Sorted Chromosome Base RefSeq Gene Files
	public static final String SORTED_CHR1_REFSEQ_GENES = "sorted_chr1_refseq_genes.txt";
	public static final String SORTED_CHR2_REFSEQ_GENES = "sorted_chr2_refseq_genes.txt";
	public static final String SORTED_CHR3_REFSEQ_GENES = "sorted_chr3_refseq_genes.txt";
	public static final String SORTED_CHR4_REFSEQ_GENES = "sorted_chr4_refseq_genes.txt";
	public static final String SORTED_CHR5_REFSEQ_GENES = "sorted_chr5_refseq_genes.txt";
	public static final String SORTED_CHR6_REFSEQ_GENES = "sorted_chr6_refseq_genes.txt";
	public static final String SORTED_CHR7_REFSEQ_GENES = "sorted_chr7_refseq_genes.txt";
	public static final String SORTED_CHR8_REFSEQ_GENES = "sorted_chr8_refseq_genes.txt";
	public static final String SORTED_CHR9_REFSEQ_GENES = "sorted_chr9_refseq_genes.txt";
	public static final String SORTED_CHR10_REFSEQ_GENES = "sorted_chr10_refseq_genes.txt";
	public static final String SORTED_CHR11_REFSEQ_GENES = "sorted_chr11_refseq_genes.txt";
	public static final String SORTED_CHR12_REFSEQ_GENES = "sorted_chr12_refseq_genes.txt";
	public static final String SORTED_CHR13_REFSEQ_GENES = "sorted_chr13_refseq_genes.txt";
	public static final String SORTED_CHR14_REFSEQ_GENES = "sorted_chr14_refseq_genes.txt";
	public static final String SORTED_CHR15_REFSEQ_GENES = "sorted_chr15_refseq_genes.txt";
	public static final String SORTED_CHR16_REFSEQ_GENES = "sorted_chr16_refseq_genes.txt";
	public static final String SORTED_CHR17_REFSEQ_GENES = "sorted_chr17_refseq_genes.txt";
	public static final String SORTED_CHR18_REFSEQ_GENES = "sorted_chr18_refseq_genes.txt";
	public static final String SORTED_CHR19_REFSEQ_GENES = "sorted_chr19_refseq_genes.txt";
	public static final String SORTED_CHR20_REFSEQ_GENES = "sorted_chr20_refseq_genes.txt";
	public static final String SORTED_CHR21_REFSEQ_GENES = "sorted_chr21_refseq_genes.txt";
	public static final String SORTED_CHR22_REFSEQ_GENES = "sorted_chr22_refseq_genes.txt";
	public static final String SORTED_CHRX_REFSEQ_GENES = "sorted_chrX_refseq_genes.txt";
	public static final String SORTED_CHRY_REFSEQ_GENES = "sorted_chrY_refseq_genes.txt";
	
	
	//Create Encode DNASE Directory
	public static final String CREATE_ENCODE_DNASE_DIRECTORY = Commons.BYGLANET + System.getProperty("file.separator") + "fromCreate" + System.getProperty("file.separator") + "encode" + System.getProperty("file.separator") + "dnase" + System.getProperty("file.separator");
		
	//Create Encode Unsorted Chromosome Based DNASE Filenames
	public static final String UNSORTED_CHR1_DNASE_FILENAME = "unsorted_chr1_dnase.txt";
	public static final String UNSORTED_CHR2_DNASE_FILENAME = "unsorted_chr2_dnase.txt";
	public static final String UNSORTED_CHR3_DNASE_FILENAME = "unsorted_chr3_dnase.txt";
	public static final String UNSORTED_CHR4_DNASE_FILENAME = "unsorted_chr4_dnase.txt";
	public static final String UNSORTED_CHR5_DNASE_FILENAME = "unsorted_chr5_dnase.txt";
	public static final String UNSORTED_CHR6_DNASE_FILENAME = "unsorted_chr6_dnase.txt";
	public static final String UNSORTED_CHR7_DNASE_FILENAME = "unsorted_chr7_dnase.txt";
	public static final String UNSORTED_CHR8_DNASE_FILENAME = "unsorted_chr8_dnase.txt";
	public static final String UNSORTED_CHR9_DNASE_FILENAME = "unsorted_chr9_dnase.txt";
	public static final String UNSORTED_CHR10_DNASE_FILENAME = "unsorted_chr10_dnase.txt";
	public static final String UNSORTED_CHR11_DNASE_FILENAME = "unsorted_chr11_dnase.txt";
	public static final String UNSORTED_CHR12_DNASE_FILENAME = "unsorted_chr12_dnase.txt";
	public static final String UNSORTED_CHR13_DNASE_FILENAME = "unsorted_chr13_dnase.txt";
	public static final String UNSORTED_CHR14_DNASE_FILENAME = "unsorted_chr14_dnase.txt";
	public static final String UNSORTED_CHR15_DNASE_FILENAME = "unsorted_chr15_dnase.txt";
	public static final String UNSORTED_CHR16_DNASE_FILENAME = "unsorted_chr16_dnase.txt";
	public static final String UNSORTED_CHR17_DNASE_FILENAME = "unsorted_chr17_dnase.txt";
	public static final String UNSORTED_CHR18_DNASE_FILENAME = "unsorted_chr18_dnase.txt";
	public static final String UNSORTED_CHR19_DNASE_FILENAME = "unsorted_chr19_dnase.txt";
	public static final String UNSORTED_CHR20_DNASE_FILENAME = "unsorted_chr20_dnase.txt";
	public static final String UNSORTED_CHR21_DNASE_FILENAME = "unsorted_chr21_dnase.txt";
	public static final String UNSORTED_CHR22_DNASE_FILENAME = "unsorted_chr22_dnase.txt";
	public static final String UNSORTED_CHRX_DNASE_FILENAME = "unsorted_chrX_dnase.txt";
	public static final String UNSORTED_CHRY_DNASE_FILENAME = "unsorted_chrY_dnase.txt";
	
	
	//Create Encode Unsorted Chromosome Based DNASE Filenames
	public static final String UNSORTED_CHR1_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr1_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR2_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr2_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR3_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr3_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR4_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr4_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR5_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr5_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR6_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr6_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR7_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr7_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR8_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr8_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR9_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr9_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR10_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr10_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR11_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr11_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR12_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr12_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR13_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr13_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR14_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr14_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR15_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr15_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR16_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr16_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR17_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr17_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR18_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr18_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR19_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr19_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR20_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr20_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR21_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr21_dnase_with_numbers.txt";
	public static final String UNSORTED_CHR22_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chr22_dnase_with_numbers.txt";
	public static final String UNSORTED_CHRX_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chrX_dnase_with_numbers.txt";
	public static final String UNSORTED_CHRY_DNASE_FILENAME_WITH_NUMBERS = "unsorted_chrY_dnase_with_numbers.txt";
	
	
	
	//Sorted Chromosome Based DNASE File names
	public static final String SORTED_CHR1_DNASE_FILENAME = "sorted_chr1_dnase.txt";
	public static final String SORTED_CHR2_DNASE_FILENAME = "sorted_chr2_dnase.txt";
	public static final String SORTED_CHR3_DNASE_FILENAME = "sorted_chr3_dnase.txt";
	public static final String SORTED_CHR4_DNASE_FILENAME = "sorted_chr4_dnase.txt";
	public static final String SORTED_CHR5_DNASE_FILENAME = "sorted_chr5_dnase.txt";
	public static final String SORTED_CHR6_DNASE_FILENAME = "sorted_chr6_dnase.txt";
	public static final String SORTED_CHR7_DNASE_FILENAME = "sorted_chr7_dnase.txt";
	public static final String SORTED_CHR8_DNASE_FILENAME = "sorted_chr8_dnase.txt";
	public static final String SORTED_CHR9_DNASE_FILENAME = "sorted_chr9_dnase.txt";
	public static final String SORTED_CHR10_DNASE_FILENAME = "sorted_chr10_dnase.txt";
	public static final String SORTED_CHR11_DNASE_FILENAME = "sorted_chr11_dnase.txt";
	public static final String SORTED_CHR12_DNASE_FILENAME = "sorted_chr12_dnase.txt";
	public static final String SORTED_CHR13_DNASE_FILENAME = "sorted_chr13_dnase.txt";
	public static final String SORTED_CHR14_DNASE_FILENAME = "sorted_chr14_dnase.txt";
	public static final String SORTED_CHR15_DNASE_FILENAME = "sorted_chr15_dnase.txt";
	public static final String SORTED_CHR16_DNASE_FILENAME = "sorted_chr16_dnase.txt";
	public static final String SORTED_CHR17_DNASE_FILENAME = "sorted_chr17_dnase.txt";
	public static final String SORTED_CHR18_DNASE_FILENAME = "sorted_chr18_dnase.txt";
	public static final String SORTED_CHR19_DNASE_FILENAME = "sorted_chr19_dnase.txt";
	public static final String SORTED_CHR20_DNASE_FILENAME = "sorted_chr20_dnase.txt";
	public static final String SORTED_CHR21_DNASE_FILENAME = "sorted_chr21_dnase.txt";
	public static final String SORTED_CHR22_DNASE_FILENAME = "sorted_chr22_dnase.txt";
	public static final String SORTED_CHRX_DNASE_FILENAME = "sorted_chrX_dnase.txt";
	public static final String SORTED_CHRY_DNASE_FILENAME = "sorted_chrY_dnase.txt";
	
	
	//for debug sliding window versus interval tree
	public static final String BURCAK_DEBUG_ENCODE_SORTED_CHR1_HISTONE = "Doktora" + System.getProperty("file.separator") + "create" + System.getProperty("file.separator") + "encode" + System.getProperty("file.separator") + "histone" + System.getProperty("file.separator") + "burcak_debug_sorted_chr1_histone.txt";
		
	//CREATE ENCODE HISTONE directory
	public static final String CREATE_ENCODE_HISTONE_DIRECTORY = Commons.BYGLANET + System.getProperty("file.separator") + "fromCreate" + System.getProperty("file.separator") + "encode" + System.getProperty("file.separator") + "histone" + System.getProperty("file.separator");
	
	 //Unsorted Chromosome Based HISTONE File names
	 public static final String UNSORTED_CHR1_HISTONE_FILENAME = "unsorted_chr1_histone.txt";
	 public static final String UNSORTED_CHR2_HISTONE_FILENAME = "unsorted_chr2_histone.txt";
	 public static final String UNSORTED_CHR3_HISTONE_FILENAME = "unsorted_chr3_histone.txt";
	 public static final String UNSORTED_CHR4_HISTONE_FILENAME = "unsorted_chr4_histone.txt";
	 public static final String UNSORTED_CHR5_HISTONE_FILENAME = "unsorted_chr5_histone.txt";
	 public static final String UNSORTED_CHR6_HISTONE_FILENAME = "unsorted_chr6_histone.txt";
	 public static final String UNSORTED_CHR7_HISTONE_FILENAME = "unsorted_chr7_histone.txt";
	 public static final String UNSORTED_CHR8_HISTONE_FILENAME = "unsorted_chr8_histone.txt";
	 public static final String UNSORTED_CHR9_HISTONE_FILENAME = "unsorted_chr9_histone.txt";
	 public static final String UNSORTED_CHR10_HISTONE_FILENAME = "unsorted_chr10_histone.txt";
	 public static final String UNSORTED_CHR11_HISTONE_FILENAME = "unsorted_chr11_histone.txt";
	 public static final String UNSORTED_CHR12_HISTONE_FILENAME = "unsorted_chr12_histone.txt";
	 public static final String UNSORTED_CHR13_HISTONE_FILENAME = "unsorted_chr13_histone.txt";
	 public static final String UNSORTED_CHR14_HISTONE_FILENAME = "unsorted_chr14_histone.txt";
	 public static final String UNSORTED_CHR15_HISTONE_FILENAME = "unsorted_chr15_histone.txt";
	 public static final String UNSORTED_CHR16_HISTONE_FILENAME = "unsorted_chr16_histone.txt";
	 public static final String UNSORTED_CHR17_HISTONE_FILENAME = "unsorted_chr17_histone.txt";
	 public static final String UNSORTED_CHR18_HISTONE_FILENAME = "unsorted_chr18_histone.txt";
	 public static final String UNSORTED_CHR19_HISTONE_FILENAME = "unsorted_chr19_histone.txt";
	 public static final String UNSORTED_CHR20_HISTONE_FILENAME = "unsorted_chr20_histone.txt";
	 public static final String UNSORTED_CHR21_HISTONE_FILENAME = "unsorted_chr21_histone.txt";
	 public static final String UNSORTED_CHR22_HISTONE_FILENAME = "unsorted_chr22_histone.txt";
	 public static final String UNSORTED_CHRX_HISTONE_FILENAME = "unsorted_chrX_histone.txt";
	 public static final String UNSORTED_CHRY_HISTONE_FILENAME = "unsorted_chrY_histone.txt";
	 
	 
	//Unsorted Chromosome Based HISTONE File names with numbers 
	 public static final String UNSORTED_CHR1_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr1_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR2_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr2_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR3_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr3_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR4_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr4_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR5_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr5_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR6_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr6_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR7_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr7_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR8_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr8_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR9_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr9_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR10_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr10_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR11_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr11_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR12_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr12_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR13_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr13_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR14_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr14_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR15_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr15_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR16_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr16_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR17_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr17_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR18_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr18_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR19_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr19_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR20_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr20_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR21_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr21_histone_with_numbers.txt";
	 public static final String UNSORTED_CHR22_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chr22_histone_with_numbers.txt";
	 public static final String UNSORTED_CHRX_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chrX_histone_with_numbers.txt";
	 public static final String UNSORTED_CHRY_HISTONE_FILENAME_WITH_NUMBERS = "unsorted_chrY_histone_with_numbers.txt";
		
	//Sorted Chromosome Base HISTONE File names
	public static final String SORTED_CHR1_HISTONE_FILENAME = "sorted_chr1_histone.txt";
	public static final String SORTED_CHR2_HISTONE_FILENAME = "sorted_chr2_histone.txt";
	public static final String SORTED_CHR3_HISTONE_FILENAME = "sorted_chr3_histone.txt";
	public static final String SORTED_CHR4_HISTONE_FILENAME = "sorted_chr4_histone.txt";
	public static final String SORTED_CHR5_HISTONE_FILENAME = "sorted_chr5_histone.txt";
	public static final String SORTED_CHR6_HISTONE_FILENAME = "sorted_chr6_histone.txt";
	public static final String SORTED_CHR7_HISTONE_FILENAME = "sorted_chr7_histone.txt";
	public static final String SORTED_CHR8_HISTONE_FILENAME = "sorted_chr8_histone.txt";
	public static final String SORTED_CHR9_HISTONE_FILENAME = "sorted_chr9_histone.txt";
	public static final String SORTED_CHR10_HISTONE_FILENAME = "sorted_chr10_histone.txt";
	public static final String SORTED_CHR11_HISTONE_FILENAME = "sorted_chr11_histone.txt";
	public static final String SORTED_CHR12_HISTONE_FILENAME = "sorted_chr12_histone.txt";
	public static final String SORTED_CHR13_HISTONE_FILENAME = "sorted_chr13_histone.txt";
	public static final String SORTED_CHR14_HISTONE_FILENAME = "sorted_chr14_histone.txt";
	public static final String SORTED_CHR15_HISTONE_FILENAME = "sorted_chr15_histone.txt";
	public static final String SORTED_CHR16_HISTONE_FILENAME = "sorted_chr16_histone.txt";
	public static final String SORTED_CHR17_HISTONE_FILENAME = "sorted_chr17_histone.txt";
	public static final String SORTED_CHR18_HISTONE_FILENAME = "sorted_chr18_histone.txt";
	public static final String SORTED_CHR19_HISTONE_FILENAME = "sorted_chr19_histone.txt";
	public static final String SORTED_CHR20_HISTONE_FILENAME = "sorted_chr20_histone.txt";
	public static final String SORTED_CHR21_HISTONE_FILENAME = "sorted_chr21_histone.txt";
	public static final String SORTED_CHR22_HISTONE_FILENAME = "sorted_chr22_histone.txt";
	public static final String SORTED_CHRX_HISTONE_FILENAME = "sorted_chrX_histone.txt";
	public static final String SORTED_CHRY_HISTONE_FILENAME = "sorted_chrY_histone.txt";
		
			
	//CREATE ENCODE TFBS directory
	public static final String CREATE_ENCODE_TFBS_DIRECTORY = Commons.BYGLANET + System.getProperty("file.separator") + "fromCreate" + System.getProperty("file.separator") + "encode" + System.getProperty("file.separator") + "tfbs" + System.getProperty("file.separator");
	
	//Unsorted Chromosome Based TFBS filenames
	public static final String UNSORTED_CHR1_TFBS_FILENAME = "unsorted_chr1_tfbs.txt";
	public static final String UNSORTED_CHR2_TFBS_FILENAME = "unsorted_chr2_tfbs.txt";
	public static final String UNSORTED_CHR3_TFBS_FILENAME = "unsorted_chr3_tfbs.txt";
	public static final String UNSORTED_CHR4_TFBS_FILENAME = "unsorted_chr4_tfbs.txt";
	public static final String UNSORTED_CHR5_TFBS_FILENAME = "unsorted_chr5_tfbs.txt";
	public static final String UNSORTED_CHR6_TFBS_FILENAME = "unsorted_chr6_tfbs.txt";
	public static final String UNSORTED_CHR7_TFBS_FILENAME = "unsorted_chr7_tfbs.txt";
	public static final String UNSORTED_CHR8_TFBS_FILENAME = "unsorted_chr8_tfbs.txt";
	public static final String UNSORTED_CHR9_TFBS_FILENAME = "unsorted_chr9_tfbs.txt";
	public static final String UNSORTED_CHR10_TFBS_FILENAME = "unsorted_chr10_tfbs.txt";
	public static final String UNSORTED_CHR11_TFBS_FILENAME = "unsorted_chr11_tfbs.txt";
	public static final String UNSORTED_CHR12_TFBS_FILENAME = "unsorted_chr12_tfbs.txt";
	public static final String UNSORTED_CHR13_TFBS_FILENAME = "unsorted_chr13_tfbs.txt";
	public static final String UNSORTED_CHR14_TFBS_FILENAME = "unsorted_chr14_tfbs.txt";
	public static final String UNSORTED_CHR15_TFBS_FILENAME = "unsorted_chr15_tfbs.txt";
	public static final String UNSORTED_CHR16_TFBS_FILENAME = "unsorted_chr16_tfbs.txt";
	public static final String UNSORTED_CHR17_TFBS_FILENAME = "unsorted_chr17_tfbs.txt";
	public static final String UNSORTED_CHR18_TFBS_FILENAME = "unsorted_chr18_tfbs.txt";
	public static final String UNSORTED_CHR19_TFBS_FILENAME = "unsorted_chr19_tfbs.txt";
	public static final String UNSORTED_CHR20_TFBS_FILENAME = "unsorted_chr20_tfbs.txt";
	public static final String UNSORTED_CHR21_TFBS_FILENAME = "unsorted_chr21_tfbs.txt";
	public static final String UNSORTED_CHR22_TFBS_FILENAME = "unsorted_chr22_tfbs.txt";
	public static final String UNSORTED_CHRX_TFBS_FILENAME = "unsorted_chrX_tfbs.txt";
	public static final String UNSORTED_CHRY_TFBS_FILENAME = "unsorted_chrY_tfbs.txt";
	
	
	//Unsorted Chromosome Based TFBS filenames with numbers
	public static final String UNSORTED_CHR1_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr1_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR2_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr2_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR3_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr3_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR4_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr4_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR5_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr5_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR6_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr6_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR7_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr7_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR8_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr8_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR9_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr9_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR10_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr10_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR11_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr11_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR12_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr12_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR13_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr13_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR14_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr14_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR15_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr15_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR16_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr16_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR17_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr17_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR18_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr18_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR19_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr19_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR20_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr20_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR21_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr21_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHR22_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chr22_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHRX_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chrX_tfbs_with_numbers.txt";
	public static final String UNSORTED_CHRY_TFBS_FILENAME_WITH_NUMBERS = "unsorted_chrY_tfbs_with_numbers.txt";
	
	// Sorted Chromosome Base TFBS File names
	public static final String SORTED_CHR1_TFBS_FILENAME = "sorted_chr1_tfbs.txt";
	public static final String SORTED_CHR2_TFBS_FILENAME = "sorted_chr2_tfbs.txt";
	public static final String SORTED_CHR3_TFBS_FILENAME = "sorted_chr3_tfbs.txt";
	public static final String SORTED_CHR4_TFBS_FILENAME = "sorted_chr4_tfbs.txt";
	public static final String SORTED_CHR5_TFBS_FILENAME = "sorted_chr5_tfbs.txt";
	public static final String SORTED_CHR6_TFBS_FILENAME = "sorted_chr6_tfbs.txt";
	public static final String SORTED_CHR7_TFBS_FILENAME = "sorted_chr7_tfbs.txt";
	public static final String SORTED_CHR8_TFBS_FILENAME = "sorted_chr8_tfbs.txt";
	public static final String SORTED_CHR9_TFBS_FILENAME = "sorted_chr9_tfbs.txt";
	public static final String SORTED_CHR10_TFBS_FILENAME = "sorted_chr10_tfbs.txt";
	public static final String SORTED_CHR11_TFBS_FILENAME = "sorted_chr11_tfbs.txt";
	public static final String SORTED_CHR12_TFBS_FILENAME = "sorted_chr12_tfbs.txt";
	public static final String SORTED_CHR13_TFBS_FILENAME = "sorted_chr13_tfbs.txt";
	public static final String SORTED_CHR14_TFBS_FILENAME = "sorted_chr14_tfbs.txt";
	public static final String SORTED_CHR15_TFBS_FILENAME = "sorted_chr15_tfbs.txt";
	public static final String SORTED_CHR16_TFBS_FILENAME = "sorted_chr16_tfbs.txt";
	public static final String SORTED_CHR17_TFBS_FILENAME = "sorted_chr17_tfbs.txt";
	public static final String SORTED_CHR18_TFBS_FILENAME = "sorted_chr18_tfbs.txt";
	public static final String SORTED_CHR19_TFBS_FILENAME = "sorted_chr19_tfbs.txt";
	public static final String SORTED_CHR20_TFBS_FILENAME = "sorted_chr20_tfbs.txt";
	public static final String SORTED_CHR21_TFBS_FILENAME = "sorted_chr21_tfbs.txt";
	public static final String SORTED_CHR22_TFBS_FILENAME = "sorted_chr22_tfbs.txt";
	public static final String SORTED_CHRX_TFBS_FILENAME = "sorted_chrX_tfbs.txt";
	public static final String SORTED_CHRY_TFBS_FILENAME = "sorted_chrY_tfbs.txt";
	
	
	/*************************UNSORTED CHROMOSOME BASED USER DEFINED LIBRARY FILES WITH NUMBERS STARTS***********************************/
	public static final String UNSORTED_USERDEFINEDLIBRARY_FILE_WITH_NUMBERS = "_unsorted_userDefinedLibrary_file_with_numbers.txt";
	/*************************UNSORTED CHROMOSOME BASED USER DEFINED LIBRARY FILES WITH NUMBERS ENDS*************************************/
	
	
	
	//all_possible_encode_cell_lines_names
	public static final String ALL_POSSIBLE_ENCODE_CELL_LINES_NAMES = Commons.DATA + System.getProperty("file.separator") + Commons.BYGLANET + System.getProperty("file.separator") + "fromWriteAllPossibleNames" + System.getProperty("file.separator") + "all_possible_encode_cell_lines_names.txt";
	
	
	/******************************HINTS****************************************/
	public static final String GUI_HINT_INPUT_FILE_NAME = "Input Data File";
	public static final String GUI_HINT_JOB_NAME = "Job name is mandatory to create a specific output folder. Please choose a shorter job name for your convenience.";
	public static final String GUI_HINT_INPUT_FORMAT = "Input Data Format";
	public static final String GUI_HINT_ASSEMBLY_FORMAT = "Supported assemblies";
	public static final String GUI_HINT_GLANET_FOLDER = "GLANET FOLDER";
	public static final String GUI_HINT_NUMBER_OF_BASES = "Number of bases required for overlap definition";
	public static final String GUI_HINT_GENERATE_RANDOM_DATA_MODE = "Generate Random Data Mode";
	public static final String GUI_HINT_MULTIPLE_TESTING = "Multiple Testing";
	public static final String GUI_HINT_FDR = "False Discovery Rate";
	public static final String GUI_HINT_BONFERONI_CORRECTION_SIGNIFICANCE_CRITERIA = "Bonferroni Correction Significance Criteria";
	public static final String GUI_HINT_NUMBER_OF_PERMUTATIONS = "Number of Permutations that will be carried out for Enrichment";
	public static final String GUI_HINT_CELLLINE_BASED_DNASE_ANNOTATION = "DNase Annotation (Cell Line Based)";
	public static final String GUI_HINT_CELLLINE_BASED_HISTONE_ANNOTATION = "Histone Annotation (Cell Line Based)";
	public static final String GUI_HINT_CELLLINE_BASED_TF_ANNOTATION = "Transcription Factor Annotation (Cell Line Based)";
	public static final String GUI_HINT_KEGG_PATHWAY_ANNOTATION = "KEGG Pathway Annotation";
	public static final String GUI_HINT_TF_AND_KEGG_PATHWAY_ANNOTATION = "Transcription Factor and KEGG Pathway Annotation";
	public static final String GUI_HINT_CELLLINE_BASED_TF_AND_KEGG_PATHWAY_ANNOTATION = "Transcription Factor (Cell Line Based) and KEGG Pathway Annotation)";
	public static final String GUI_HINT_USER_DEFINED_GENESET_ANNOTATION = "User Defined GeneSet Annotation";
	public static final String GUI_HINT_USER_DEFINED_GENESET_GENEINFORMATIONTYPE = "Gene Information Type";
	public static final String GUI_HINT_USER_DEFINED_GENESET_INPUTFILE = "Input File";
	public static final String GUI_HINT_USER_DEFINED_GENESET_NAME = "User Defined GeneSet Name";
	public static final String GUI_HINT_USER_DEFINED_GENESET_DESCRIPTION_FILE = "User Defined GeneSet Description File (Optional)";
	public static final String GUI_HINT_USER_DEFINED_LIBRARY_INPUTFILE = "Input File";
	public static final String GUI_HINT_USER_DEFINED_LIBRARY_ANNOTATION = "User Defined Library Annotation";
	public static final String GUI_HINT_USER_DEFINED_LIBRARY_DATA_FORMAT = "Please Indicate User Defined Library Input File Data Format";
	public static final String GUI_HINT_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT = "Regulatory Sequence Analysis using RSAT";
	
	
	//Annotation Binary Matrices
	public static final String ANNOTATIONBINARYMATRIX_DNASE = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "DnaseAnnotationBinaryMatrix.txt";
	public static final String ANNOTATIONBINARYMATRIX_TF = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "TFAnnotationBinaryMatrix.txt";
	public static final String ANNOTATIONBINARYMATRIX_HISTONE = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "HistoneAnnotationBinaryMatrix.txt";

	public static final String ANNOTATIONBINARYMATRIX_EXONBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "ExonBasedKEGGPathwayAnnotationBinaryMatrix.txt";
	public static final String ANNOTATIONBINARYMATRIX_REGULATIONBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "RegulationBasedKEGGPathwayAnnotationBinaryMatrix.txt";
	public static final String ANNOTATIONBINARYMATRIX_ALLBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "AllBasedKEGGPathwayAnnotationBinaryMatrix.txt";

	
	public static final String ANNOTATIONBINARYMATRIX_TFEXONBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "TFExonBasedKEGGPathwayAnnotationBinaryMatrix.txt";
	public static final String ANNOTATIONBINARYMATRIX_TFREGULATIONBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "TFRegulationBasedKEGGPathwayAnnotationBinaryMatrix.txt";
	public static final String ANNOTATIONBINARYMATRIX_TFALLBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "TFAllBasedKEGGPathwayAnnotationBinaryMatrix.txt";

	public static final String ANNOTATIONBINARYMATRIX_TFCELLLINEEXONBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "TFCellLineExonBasedKEGGPathwayAnnotationBinaryMatrix.txt";
	public static final String ANNOTATIONBINARYMATRIX_TFCELLLINEREGULATIONBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "TFCellLineRegulationBasedKEGGPathwayAnnotationBinaryMatrix.txt";
	public static final String ANNOTATIONBINARYMATRIX_TFCELLLINEALLBASEDKEGG = ANNOTATION_BINARY_MATRIX_FOR_ONE_PHENOTYPE + System.getProperty("file.separator") + "TFCellLineAllBasedKEGGPathwayAnnotationBinaryMatrix.txt";
	
	//dbSNP orient
	public static final String REVERSE = "reverse";
	public static final String FORWARD = "forward";
	
	//command line arguments
	public static final String ARG_IS_COMMAND_LINE_ENABLED = "-c";
	
	public static final String ARG_INPUT_FILE = "-i";
	public static final String ARG_GLANET_FOLDER = "-g";
	public static final String ARG_INPUT_FORMAT_1_BASED = "-f1";
	public static final String ARG_INPUT_FORMAT_0_BASED = "-f0";
	public static final String ARG_INPUT_FORMAT_BED = "-fbad";
	public static final String ARG_INPUT_FORMAT_GFF = "-fgff";
	public static final String ARG_NUMBER_OF_BASES = "-b";
	public static final String ARG_PERFORM_ENRICHMENT = "-e";
	public static final String ARG_GENERATE_RANDOM_DATA_WITH_GC_AND_MAP = "-rdgcm";
	public static final String ARG_GENERATE_RANDOM_DATA_WITHOUT_GC_AND_MAP = "-rd";
	public static final String ARG_MULTIPLE_TESTING_BENJAMINI = "-mtbenjamini";
	public static final String ARG_MULTIPLE_TESTING_BONFERRONI = "-mtbonferroni";
	public static final String ARG_FALSE_DISCOVERY_RATE = "-fdr";
	public static final String ARG_SIGNIFICANCE_CRITERIA = "-sc";
	public static final String ARG_NUMBER_OF_PERMUTATIONS = "-p";
	public static final String ARG_NUMBER_OF_PERMUTATIONS_IN_EACH_RUN = "-pe";
	public static final String ARG_DNASE_ANNOTATION = "-dnase";
	public static final String ARG_HISTONE_ANNOTATIONS = "-histone";
	public static final String ARG_TF_ANNOTATION = "-tf";
	public static final String ARG_KEGG_ANNOTATION = "-kegg";
	public static final String ARG_TF_AND_KEGG_ANNOTATION = "-tfkegg";
	public static final String ARG_CELL_TF_AND_KEGG_ANNOTATION = "-celltfkegg";
	public static final String ARG_USER_DEFINED_GENESET_ANNOTATION = "-udgeneset";
	public static final String ARG_USER_DEFINED_LIBRARY_ANNOTATION = "-udlibrary";
	public static final String ARG_JOB_NAME = "-j";
	public static final String ARG_RSAT = "-rsat";
	
	
}
