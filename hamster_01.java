import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_01 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	/* valid commands:
	vor() # one step forward
	linksUm() # turn left
	nimm() # pick up
	gib() # drop
	*/
	
	/* get hamster to pick up two grains */
	vor();
	vor();
	nimm();
	linksUm();
	vor();
	vor();
	nimm();
	
	/* get hamster to pick up four grains
	(continuation of previous code) */
	vor();
	vor();
	vor();
	vor();
	vor();
	linksUm();
	vor();
	nimm();
	vor();
	vor();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	linksUm();
	vor();
	nimm();
	
	/* get hamster to pick up all grains
	(continuation of previous code) */
	
	vor();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	linksUm();
	vor();
	vor();
	nimm();
	linksUm();
	vor();
	nimm();
	linksUm();
	vor();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	linksUm();
	vor();
	vor();
	vor();
	linksUm();
	vor();
	nimm();
	vor();
	nimm();
	vor();
	nimm();
	vor();
	nimm();
	vor();
	nimm();
	
	/* drop all grains in top left corner
	and go back to initial position (facing south)
	(continuation of previous code) */
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	gib(); // drop all 11 grains
	gib();
	gib();
	gib();
	gib();
	gib();
	gib();
	gib();
	gib();
	gib();
	gib();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
}
}