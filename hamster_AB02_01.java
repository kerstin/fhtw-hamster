

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_15 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void right() {
	linksUm();
	linksUm();
	linksUm();
}

void turnaround() {
	linksUm();
	linksUm();
}

/*	pick up grains from alcoves:
	turn towards alcove from initial walking direction,
	pick up grain, turn to walking direction again */
void pickUp() {
	vor();
	initialPickUp();
}

void initialPickUp() {
	vor();
	right();
	vor();
	nimm();
	linksUm();	
}

/*	leave alcove again:
	back out of alcove and face into walking direction again */
void backOut() {
	linksUm();
	vor();
	right();
	}

/*	take a right turn:
	turn around a right corner after having picked up a agrain */
void rightCorner() {
	vor();
	right();
	vor();
	vor();
	}	
	
/*	pick up grain,
	go back to be ready for next pickup in same direction
void pickUpStep() {
	vor();
	right();
	vor();
	nimm();
	turnaround();
	vor();
	right();
}

/*	pick up grains from alcoves:
	take a step forward,
	pick up grain,
	go back to be ready for next pickup in same direction */

public void main() {
	
    initialPickUp();
    backOut();
    
    pickUp();
    backOut();
    pickUp();
    backOut();
    rightCorner();
    
    initialPickUp();
    backOut();
    pickUp();
    backOut();
   	rightCorner();
   	
    initialPickUp();
    backOut();
    pickUp();
    backOut();
   	rightCorner();
   	
    initialPickUp();
    backOut();  	   	

}
}