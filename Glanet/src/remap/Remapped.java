/**
 * 
 */
package remap;

import enumtypes.AssemblySource;
import enumtypes.ChromosomeName;

/**
 * @author Bur�ak Otlu
 * @date Nov 28, 2014
 * @project Glanet
 *
 */
public class Remapped {

	int mappedInt;
	int mappedStart;
	int mappedEnd;
	ChromosomeName mappedChrName;
	AssemblySource mappedAssembly;

	public int getMappedInt() {

		return mappedInt;
	}

	public void setMappedInt( int mappedInt) {

		this.mappedInt = mappedInt;
	}

	public int getMappedStart() {

		return mappedStart;
	}

	public void setMappedStart( int mappedStart) {

		this.mappedStart = mappedStart;
	}

	public int getMappedEnd() {

		return mappedEnd;
	}

	public void setMappedEnd( int mappedEnd) {

		this.mappedEnd = mappedEnd;
	}

	public ChromosomeName getMappedChrName() {

		return mappedChrName;
	}

	public void setMappedChrName( ChromosomeName mappedChrName) {

		this.mappedChrName = mappedChrName;
	}

	public AssemblySource getMappedAssembly() {

		return mappedAssembly;
	}

	public void setMappedAssembly( AssemblySource mappedAssembly) {

		this.mappedAssembly = mappedAssembly;
	}

	public Remapped( int mappedInt, int mappedStart, int mappedEnd, ChromosomeName mappedChrName,
			AssemblySource mappedAssembly) {

		super();
		this.mappedInt = mappedInt;
		this.mappedStart = mappedStart;
		this.mappedEnd = mappedEnd;
		this.mappedChrName = mappedChrName;
		this.mappedAssembly = mappedAssembly;
	}

}
