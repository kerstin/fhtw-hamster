import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_04 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

	/* pick up all grains
	then drop them on most north-western field */
	
	vor();
	linksUm();
	vor();
	nimm();
	nimm();
	vor();
	nimm();
	nimm();
	vor();
	nimm();
	nimm();
	vor();
	linksUm();
	vor();
	vor();
	linksUm();
	vor();
	nimm();
	nimm();
	vor();
	nimm();
	nimm();
	vor();
	nimm();
	nimm();
	vor();
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
	gib();
	gib();
	
	
    
}
}