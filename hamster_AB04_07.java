/*	The hamster sits in a rectangular territory of unknown
	size without any obstacles. there is a "regular"
	mountain made out of grains contained in the territory
	(regular = the sides of the mountains are the same
	diagonal lines).
	The hamster should pick up all grains from the
	outermost layer of the mountain to the innermost
	layer.	
	 */

/*	functions:
	vornFrei()
	kornDa()
	maulLeer()
	
	statements:
	if, while */

/*	helper functions */
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB04_07 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
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


/*	hamster needs to go forward until it finds
	the first grain/the mountain.
	then it needs to start picking up all grains
	from that field.
	then it needs to "climb" the mountain till the
	top (and pick up all grains on the way). when
	it has reached the top, it needs to descend the
	mountain again (and pick up all grains on the way).
	then it needs to turn around, go forward one
	field, pick up its grains and start climbing
	the (now smaller) mountain.
	*/

public void main() {

	/*	check in which direction the hamster is facing
		(either left or right) by checking where
		the ground is. */
		
	left();
	if(!vornFrei()) {	// hamster is facing left
		right();		// have it turn back to the left
		
    while(!kornDa()) { // mountain not reached yet
    	vor();
    }

    
    while(kornDa()) { // first field with grains
    	nimm();
    	
    	
   		if(!kornDa() && vornFrei()) {
   			vor(); // check if hamster has reached tip
   			if(kornDa()) {	// hasn't reached tip yet
   				right();
    			vor();
    			left();
   			} else { // tip reached, needs to descend
   				left();
   				vor();
   				right();
   			}
    	}
    }		
		
	} else {		// hamster is facing right
		right();	// have it turn back to the right
				
	}
	
	
    

}
}