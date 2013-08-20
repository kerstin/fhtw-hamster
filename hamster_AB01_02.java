import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_02 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

	/* hamster is carrying 4 grains;
	drop one grain in each corner of the territory */
	
	linksUm();
	linksUm();
	vor();
	vor();
	linksUm();
	vor();
	gib();
	linksUm();
	vor();
	vor();
	vor();	
	gib();
	linksUm();
	vor();
	vor();	
	vor();
	vor();
	vor();
	gib();
	linksUm();
	vor();
	vor();
	vor();
	gib();
	linksUm();
	vor();	
	vor();
	vor();
	vor();
	linksUm();
	vor();
	vor();
	
	
	/* let hamster pick up same four corns
	in reverse order */	
	
	linksUm();
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
	nimm();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	nimm();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	nimm();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	vor();
	nimm();
	linksUm();
	linksUm();
	linksUm();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
    
}
}