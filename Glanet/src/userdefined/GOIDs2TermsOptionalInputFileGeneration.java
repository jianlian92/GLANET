/**
 * 
 */
package userdefined;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import auxiliary.FileOperations;

/**
 * @author burcakotlu
 *
 */
public class GOIDs2TermsOptionalInputFileGeneration {

	public static void readGOIDs2TermsInputFileAndWriteGOIDs2TermsOutputFile( String inputFileName,
			String outputFileName) {

		String strLine;
		int indexofFirstTab;
		int indexofSecondTab;
	
		String GOID;
		String GOTerm;
		String ontology;

		try{
			FileReader fileReader = FileOperations.createFileReader( inputFileName);
			BufferedReader bufferedReader = new BufferedReader( fileReader);

			FileWriter fileWriter = FileOperations.createFileWriter( outputFileName);
			BufferedWriter bufferedWriter = new BufferedWriter( fileWriter);

			while( ( strLine = bufferedReader.readLine()) != null){

				// Skip comment lines
				if( !( strLine.startsWith( "!"))){

					indexofFirstTab = strLine.indexOf('\t');
					indexofSecondTab = strLine.indexOf('\t', indexofFirstTab+1);
					
					GOID = strLine.substring(0, indexofFirstTab);
					GOTerm = strLine.substring(indexofFirstTab+1, indexofSecondTab);
					ontology = strLine.substring(indexofSecondTab+1);
					
					bufferedWriter.write( GOID + "\t" + GOTerm + "\t" + ontology + System.getProperty( "line.separator"));

				}// End of IF

			}// End of WHILE

			bufferedReader.close();
			bufferedWriter.close();

		}catch( IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main( String[] args) {
		
		String GOIDs2TermsInputFileName = "G:\\GLANET_DATA\\GO\\GO.terms_and_ids";
		String GOIDs2TermsOutputFileName = "G:\\GLANET_DATA\\GO\\GO_ids2terms.txt";

		readGOIDs2TermsInputFileAndWriteGOIDs2TermsOutputFile( GOIDs2TermsInputFileName, GOIDs2TermsOutputFileName);

		//After preparation copy the output files under 
		//C:\Users\Bur�ak\Google Drive\Data\demo_input_data\UserDefinedGeneSet\GO

	}

}
