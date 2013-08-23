/*	hamster sits in a rectangular area of unknown size w/o obstacles.
	the hamster's position and orientation are unknown,
	and there is an unknown number of grains in the area.
	have the hamster run into one corner of the area. */


/*	new statement:
	while(condition) {
		statement(s);
	} */


/*	add. functions:
	vornFrei()
	kornDa()
	maulLeer() */


/*	helper functions */
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB04_03 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
	linksUm();
}
void right() {
	linksUm();
	linksUm();
	linksUm();
}
void turnaround() {
	linksUm();
	linksUm();
}


public void main() {
    while(vornFrei()) {
    	vor();
    }
    left();
    while(vornFrei()) {
    	vor();
    }    
}
}