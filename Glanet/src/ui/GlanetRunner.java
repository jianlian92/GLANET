package ui;

import enrichment.Enrichment;
import enrichment.CollectionofPermutationsResults;
import giveninputdata.InputDataProcess;
import giveninputdata.InputDataRemoveOverlaps;
import giveninputdata.Preparation;
import jaxbxjctool.GenerationofSequencesandMatricesforGivenIntervals;
import rsat.RSATMatrixScanClient;
import annotation.Annotation;
import augmentation.results.AugmentationofEnrichmentWithAnnotationInGRCh37p13Coordinates;
import augmentation.results.AugmentationofEnrichmentWithAnnotationInGRCh38CoordinatesUsingRemapOutputFiles;
import augmentation.results.CreationofRemapInputAndOutputFiles;
import common.CommandLineArguments;
import common.Commons;

public class GlanetRunner implements Runnable{
	
	private static String args[];
	private static MainView mainView;

	@Override
	public void run(){
		
		/************************Preparation starts********************************************/
		if( getMainView() != null)
			GlanetRunner.appendLog( "Preparation...");
		
		if( Thread.currentThread().isInterrupted())
			return;
		Preparation.main( args);
		/************************Preparation ends**********************************************/
		
		
		/************************InputDataProcess starts***************************************/
		if( getMainView() != null)
			GlanetRunner.appendLog( "InputDataProcess...");
		
		if( Thread.currentThread().isInterrupted())
			return;
		InputDataProcess.main( args);
		/************************InputDataProcess ends*****************************************/


		/************************RemoveOverlaps starts******************************************/
		if( getMainView() != null)
			GlanetRunner.appendLog( "RemoveOverlaps...");
		
		if( Thread.currentThread().isInterrupted())
			return;
		InputDataRemoveOverlaps.main( args);
		/************************RemoveOverlaps ends********************************************/

		
//		/* In case of Enrichment remove overlaps and merge */
//		/* In case of only Annotation with Enrichment, do not remove overlaps and do not merge*/
//		if( getArgs()[4].equalsIgnoreCase(Commons.DO_ENRICH)){
//			
//			if( getMainView() != null)
//				getMainView().setCurrentProcessInfo( "RemoveOverlaps...");
//			
//			if( Thread.currentThread().isInterrupted())
//				return;
//			InputDataRemoveOverlaps.main( args);
//		}
		
		/************************Annotation starts***********************************************/
		if( getMainView() != null)
			GlanetRunner.appendLog( "Annotate Given Input Data...");
		
		if( Thread.currentThread().isInterrupted())
			return;
		Annotation.main( args);
		/************************Annotation ends*************************************************/
		
		
		
		/****************************************************************************************/
		/************************Enrichment starts***********************************************/
		/****************************************************************************************/
		if( getArgs()[4].equalsIgnoreCase(Commons.DO_ENRICH)){
			
			/************************Annotate Permutations starts****************************/
			if( getMainView() != null)
				GlanetRunner.appendLog( "Annotate Permutations for Enrichment...");
			
			if( Thread.currentThread().isInterrupted())
				return;
			Enrichment.main( args);
			/************************Annotate Permutations ends******************************/

			
			/*******************Collection of Permutations Results starts*******************/
			if( getMainView() != null)
				GlanetRunner.appendLog( "Collection of Permutations Results...");
			
			if( Thread.currentThread().isInterrupted())
				return;
			CollectionofPermutationsResults.main( args);
			/*******************Collection of Permutations Results ends*********************/

			
			/************Augmentation of Enriched Elements with Given Input Data starts in GRCh37.p13 *****/
			if( getMainView() != null)
				GlanetRunner.appendLog( "Augmentation of Enriched Elements with Annotation in GRCh37.p13 ...");
			
			if( Thread.currentThread().isInterrupted())
				return;
			AugmentationofEnrichmentWithAnnotationInGRCh37p13Coordinates.main( args);
			/************Augmentation of Enriched Elements with Given Input Data ends in GRCh37.p13 *******/
								
			
			/******************************************************************************/
			/**********************************RSAT starts*********************************/
			/******************************************************************************/
			if( getArgs()[16].equalsIgnoreCase(Commons.DO_REGULATORY_SEQUENCE_ANALYSIS_USING_RSAT)){
				
				
				/************Creation of NCBI REMAP Input files starts*************************/
				/*************************CALL NCBI REMAP API starts***************************/
				/************Creation of NCBI REMAP Output files starts************************/
				if( getMainView() != null)
					GlanetRunner.appendLog( "Creation of NCBI Remap input and output files...");
				
				if( Thread.currentThread().isInterrupted())
					return;
				CreationofRemapInputAndOutputFiles.main(args);
				/************Creation of NCBI REMAP Input files ends**************************/
				/*************************CALL NCBI REMAP API ends****************************/
				/************Creation of NCBI REMAP Output files ends*************************/
				
				
				/************Augmentation of Enriched Elements with Given Input Data starts in GRCh38*****/
				if( getMainView() != null)
					GlanetRunner.appendLog( "Creation of Augmented Enriched Elements with Annotation in GRCh38 using NCBI Remap output files...");
				
				if( Thread.currentThread().isInterrupted())
					return;
				AugmentationofEnrichmentWithAnnotationInGRCh38CoordinatesUsingRemapOutputFiles.main(args);
				/************Augmentation of Enriched Elements with Given Input Data ends in GRCh38*****/
				
				
				if( getMainView() != null)
					GlanetRunner.appendLog( "GenerationofSequencesandMatricesforGivenIntervals...");
				
				if( Thread.currentThread().isInterrupted())
					return;
				GenerationofSequencesandMatricesforGivenIntervals.main( args);
					
				if( getMainView() != null)
					GlanetRunner.appendLog( "RSATMatrixScanClient...");
				
				if( Thread.currentThread().isInterrupted())
					return;
				RSATMatrixScanClient.main( args);
			}
			/******************************************************************************/
			/**********************************RSAT ends***********************************/
			/******************************************************************************/
			
		}
		/****************************************************************************************/
		/************************Enrichment ends*************************************************/
		/****************************************************************************************/
	
		/************************GLANET execution ends*************************************************/
		//args[1]  already has file separator at the end
		if( getMainView() != null)
			GlanetRunner.appendLog( "GLANET execution has ended. You can reach results under " + CommandLineArguments.GlanetFolder  + "Output" + System.getProperty("file.separator") + CommandLineArguments.JobName + System.getProperty("file.separator"));
		if( getMainView() != null)
			getMainView().enableStartProcess( true);
		GlanetRunner.appendLog( "Execution has ended");
		/************************GLANET execution ends*************************************************/

	}
	
	public static void appendLog( String log) {
		
		if( getMainView() == null)
			System.out.println( log);
		else
			getMainView().appendNewTextToLogArea( log);
	}
	
	public static void appendLog( int log) {
		
		if( getMainView() == null)
			System.out.println( log);
		else
			getMainView().appendNewTextToLogArea( log);
	}
	
	public static void appendLog( float log) {
		
		if( getMainView() == null)
			System.out.println( log);
		else
			getMainView().appendNewTextToLogArea( log);
	}

	public static MainView getMainView() {
		
		return mainView;
	}

	public static void setMainView( MainView mainView) {
		
		GlanetRunner.mainView = mainView;
	}

	public static String[] getArgs() {
		
		return args;
	}

	public static void setArgs( String args[]) {
		
		GlanetRunner.args = new String[args.length];
		for( int i = 0; i < args.length; i++) 
			GlanetRunner.args[i] = args[i];
	}
}
