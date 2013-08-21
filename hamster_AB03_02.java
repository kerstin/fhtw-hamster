/*	have hamster pick up all grains:
	hamster is running along a corridor (of size 8) to the right.
	its starting position is known and it should pick up all the
	grains on its way (which lie on random fields) */

/*	new functions:
	vornFrei()
	kornDa()
	maulLeer() */

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB03_02 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void pickupALLTheGrains() {
	if (kornDa()) {
		nimm();
	}
	if (vornFrei()) {
		vor();
	}
}


public void main() {
	pickupALLTheGrains();
	pickupALLTheGrains();
	pickupALLTheGrains();
	pickupALLTheGrains();
	pickupALLTheGrains();
	pickupALLTheGrains();
	pickupALLTheGrains();
}
}