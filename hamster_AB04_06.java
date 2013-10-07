/*	hamster should walk along a spiral-like corridor,
	pick up one grain at the inner end of the spiral,
	then walk back to its inital position.
	the corridor is only one field wide, but the lengths
	of its individual parts and the number of turns it
	takes are unknown. */

/*	functions:
	vornFrei()
	kornDa()
	maulLeer()
	
	statements:
	if, while */

/*	helper functions */
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB04_06 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
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
	/*	We don't know which direction the hamster is facing
		in the beginning, so let's figure out, where it has
		to turn to walk forward. */
	while(!vornFrei()) {
		left();
	}
	/*	now the hamster is in the first corridor. */
	while(vornFrei()) {
		vor();
		
		/*	When the hamster hits a wall, we need to figure out
			if the spiral goes to the right or to the left
			so that it can continue correctly. */
		if(!vornFrei()) {
		
			left();
			if(!vornFrei()) { // wall to left -> spiral goes right
				turnaround();
				
				while(vornFrei()) {
					vor();
					
					/*	check if end of spiral was reached */
					if(!vornFrei()) { 
						right();
						if(!vornFrei()) { // end reached
							if(kornDa()) {
								nimm();
							}							
							// TODO: go back
						}
					}	
				}
				
			} else { // no wall to left -> spiral goes left
			
				while(vornFrei()) {
					vor();		
					/*	check if end of spiral was reached */
					if(!vornFrei()) { 
						left();
						if(!vornFrei()) { // end reached
							if(kornDa()) {
								nimm();
							}
							// TODO: go back
						}
					}
				}			
			}
		}
	}
}
}