package ui;

import javax.swing.JPanel;

import jaxbxjctool.*;
import ui.MainView.*;
import wholegenome.nonoverlappingbasepairs.usingintervaltree.*;
import processinputdata.*;
import rsat.*;
import ncbi.*;
import create.encode.*;
import create.ucscgenome.*;
import empiricalpvalues.*;
import annotate.intervals.parametric.*;
import augmentation.results.*;
import adhoc.*;
import common.Commons;

public class MainViewController extends ViewController implements MainViewDelegate {
	
	private MainView mainView;

	public MainViewController( JPanel contentPanel) {
		super(contentPanel);
		
		loadView();
	}

	@Override
	public void loadView() {
		
		if( mainView != null){
			contentPanel.remove(mainView);
		}
		
		mainView = new MainView();
		mainView.setDelegate( this);
		contentPanel.add(mainView);
	}

	@Override
	public void presentViewController(ViewController viewController) {

		contentPanel.removeAll();
		contentPanel.invalidate();
		viewController.loadView();
		contentPanel.revalidate();
		
	}

	@Override
	public void dismissViewController() {
		contentPanel.removeAll();
		contentPanel.add(mainView);
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
	//args[6]	--->	multiple testing parameter, enriched elements will be decided and sorted with respect to this parameter
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
	public void startRunActionsWithOptions( String inputFileName, 
			   String outputFolder,
			   String inputFileFormat,
			   String numberOfBases,
			   String enrichmentEnabled,
			   String generateRandomDataMode,
			   String multipleTestingChoice,
			   String bonferoniCorrectionSignificanceLevel,
			   String falseDiscoveryRate,
			   String numberOfPermutations,
			   String dnaseEnrichment,
			   String histoneEnrichment,
			   String tfEnrihment,
			   String keggPathwayEnrichment,
			   String tfAndKeggPathwayEnrichment,
			   String cellLineBasedTfAndKeggPathwayEnrichment,
			   String regulatorySequenceAnalysisUsingRSAT,
			   String jobName,
			   String writeGeneratedRandomDataMode,
			   String writePermutationBasedandParametricBasedAnnotationResultMode,
			   String writePermutationBasedAnnotationResultMode) {
		
		String[] args =   { inputFileName, 
				   outputFolder,
				   inputFileFormat,
				   numberOfBases,
				   enrichmentEnabled,
				   generateRandomDataMode,
				   multipleTestingChoice,
				   bonferoniCorrectionSignificanceLevel,
				   falseDiscoveryRate,
				   numberOfPermutations,
				   dnaseEnrichment,
				   histoneEnrichment,
				   tfEnrihment,
				   keggPathwayEnrichment,
				   tfAndKeggPathwayEnrichment,
				   cellLineBasedTfAndKeggPathwayEnrichment,
				   regulatorySequenceAnalysisUsingRSAT,
				   jobName,
				   writeGeneratedRandomDataMode,
				   writePermutationBasedandParametricBasedAnnotationResultMode,
				   writePermutationBasedAnnotationResultMode};		
		
		mainView.setCurrentProcessInfo( "InputDataProcess...");
		InputDataProcess.main(args);
		mainView.setCurrentProcessInfo( "RemoveOverlaps...");
		RemoveOverlaps.main(args);
		mainView.setCurrentProcessInfo( "HumanRefSeq2Gene...");
		HumanRefSeq2Gene.main(args);
		mainView.setCurrentProcessInfo( "CreateChromosomeBasedDnaseTfbsHistoneFilesUsingEncodeUsingIntervalTreeSorting...");
		CreateChromosomeBasedDnaseTfbsHistoneFilesUsingEncodeUsingIntervalTreeSorting.main(args);
		mainView.setCurrentProcessInfo( "CreateIntervalFileUsingUCSCGenomeUsingIntervalTreeSorting...");
		CreateIntervalFileUsingUCSCGenomeUsingIntervalTreeSorting.main(args);
		mainView.setCurrentProcessInfo( "WriteAllPossibleNames...");
		WriteAllPossibleNames.main(args);
		mainView.setCurrentProcessInfo( "CalculateNumberofNonOverlappingBasePairsinWholeGenomeUsingIntervalTree...");
		CalculateNumberofNonOverlappingBasePairsinWholeGenomeUsingIntervalTree.main(args);
		mainView.setCurrentProcessInfo( "AnnotateGivenIntervalsWithGivenParameters...");
		AnnotateGivenIntervalsWithGivenParameters.main(args);
		mainView.setCurrentProcessInfo( "AnnotatePermutationsUsingForkJoin_withEnrichmentChoices...");
		AnnotatePermutationsUsingForkJoin_withEnrichmentChoices.main(args);
		mainView.setCurrentProcessInfo( "CollectionofPermutationsResults...");
		CollectionofPermutationsResults.main(args);
		
		if( regulatorySequenceAnalysisUsingRSAT.equalsIgnoreCase(Commons.DO_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT)) {
			mainView.setCurrentProcessInfo( "AugmentationofEnrichedElementswithIntervals...");
			AugmentationofEnrichedElementswithIntervals.main(args);
			mainView.setCurrentProcessInfo( "GenerationofSequencesandMatricesforGivenIntervals...");
			GenerationofSequencesandMatricesforGivenIntervals.main(args);
			mainView.setCurrentProcessInfo( "RSATMatrixScanClient...");
			RSATMatrixScanClient.main(args);
		}
	}
}