/**
 * @author Burcak Otlu
 * Sep 17, 2013
 * 3:15:11 PM
 * 2013
 *
 * 
 */
package mapabilityandgclegacy;

import java.util.Comparator;
import java.util.Map;

public class MeanComparator implements Comparator<Object> {

	Map<String, MeanandStandardDeviation> mapToBeSorted;

	/**
	 * 
	 */
	public MeanComparator( Map<String, MeanandStandardDeviation> mapToBeSorted) {

		this.mapToBeSorted = mapToBeSorted;
	}

	// In ascending order
	@Override
	public int compare( Object key1, Object key2) {

		MeanandStandardDeviation val1 = ( MeanandStandardDeviation)mapToBeSorted.get( key1);
		MeanandStandardDeviation val2 = ( MeanandStandardDeviation)mapToBeSorted.get( key2);
		if( val1.getMean() > val2.getMean()){
			return +1;
		}else if( val1.getMean() < val2.getMean()){
			return -1;
		}else{
			return 0;
		}
	}

}
