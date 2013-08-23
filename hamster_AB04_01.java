/*	hamster sits in a corridor of unknown length and width of 1.
	the hamster's position and orientation are unknown.
	let it run to the far end of the corridor and then turn around
	to face the corridor. */


/*	new statement:
	while(condition) {
		statement(s);
	} */


/*	add. functions:
	vornFrei()
	kornDa()
	maulLeer() */


/*	helper functions */
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB04_01 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
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
	if (!vornFrei()) {
		left();
		while(vornFrei()) {
			vor();
		}		
	} else {
		while(vornFrei()) {
			vor();
		}
	}
	turnaround();
}}