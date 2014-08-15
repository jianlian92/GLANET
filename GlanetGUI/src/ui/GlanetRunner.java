package ui;

import empiricalpvalues.AnnotatePermutationsWithEnrichmentChoicesWithNumbers;
import empiricalpvalues.CollectionofPermutationsResults;
import giveninputdata.InputDataProcess;
import giveninputdata.InputDataRemoveOverlaps;
import jaxbxjctool.GenerationofSequencesandMatricesforGivenIntervals;
import rsat.RSATMatrixScanClient;
import annotate.intervals.parametric.AnnotateGivenIntervalsWithGivenParameters;
import annotate.intervals.parametric.AnnotateGivenIntervalsWithNumbers;
import augmentation.results.AugmentationofEnrichedElementswithGivenInputData;
import common.Commons;

public class GlanetRunner extends Thread{
	
	private static String args[];
	private static MainView mainView;

	@Override
	public void run(){
		
		try {
		getMainView().setCurrentProcessInfo( "InputDataProcess...");
		InputDataProcess.main(getArgs());
		
		/* In case of Enrichment remove overlaps and merge */
		/* In case of only Annotation, do not remove overlaps and do not merge*/
		if( getArgs()[4].equalsIgnoreCase(Commons.DO_ENRICH)){
			getMainView().setCurrentProcessInfo( "RemoveOverlaps...");
			InputDataRemoveOverlaps.main(getArgs());
		}
						
		getMainView().setCurrentProcessInfo( "Annotate Given Input Data...");
		AnnotateGivenIntervalsWithNumbers.main(getArgs());
		
		if( getArgs()[4].equalsIgnoreCase(Commons.DO_ENRICH)){
			
			getMainView().setCurrentProcessInfo( "Annotate Permutations for Enrichment...");
			AnnotatePermutationsWithEnrichmentChoicesWithNumbers.main(getArgs());
			
			getMainView().setCurrentProcessInfo( "Collection of Permutations Results...");
			CollectionofPermutationsResults.main(getArgs());
			
			getMainView().setCurrentProcessInfo( "Augmentation of Enriched Elements with Given Input Data...");
			AugmentationofEnrichedElementswithGivenInputData.main(getArgs());
			
			
			if( getArgs()[16].equalsIgnoreCase(Commons.DO_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT)) {
				
				getMainView().setCurrentProcessInfo( "GenerationofSequencesandMatricesforGivenIntervals...");
				GenerationofSequencesandMatricesforGivenIntervals.main(getArgs());
				getMainView().setCurrentProcessInfo( "RSATMatrixScanClient...");
				RSATMatrixScanClient.main(getArgs());
			}
		}
		
		//args[1]  already has file separator at the end
		getMainView().setCurrentProcessInfo( "GLANET execution has ended. You can reach results under " + args[1]  + "Output");
		} catch (SecurityException e) {
			
			GlanetRunner.appendLog("pressed stop");
        }
	}
	
	public static void appendLog( String log) {
		
		//getMainView().appendNewTextToLogArea( log);
	}
	
	public static void appendLog( int log) {
		
		//getMainView().appendNewTextToLogArea( log);
	}
	
	public static void appendLog( float log) {
		
		//getMainView().appendNewTextToLogArea( log);
	}

	public static MainView getMainView() {
		return mainView;
	}

	public static void setMainView(MainView mainView) {
		GlanetRunner.mainView = mainView;
	}

	public static String[] getArgs() {
		return args;
	}

	public static void setArgs(String args[]) {
		
		GlanetRunner.args = args;
	}
}
