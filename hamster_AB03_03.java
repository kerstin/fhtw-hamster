/*	have hamster leave and pick up grains:
	hamster is running along a corridor (of size 8) to the right.
	its starting position is known and it should leave a grain
	on each empty field on its way and pick up all grains from
	the then non-empty fields */

/*	new functions:
	vornFrei()
	kornDa()
	maulLeer() */
	

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB03_03 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void switchGrains() {
	if (!kornDa()) {
		gib();
	} else {
		nimm();
	}
	if (vornFrei()) {
		vor();		
	}
}
	

public void main() {
	switchGrains();
	switchGrains();
	switchGrains();
	switchGrains();
	switchGrains();
	switchGrains();
	switchGrains();    
	switchGrains();
}
}