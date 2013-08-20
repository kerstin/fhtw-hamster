/* same as hamster_03 but with self-written additional functions */

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_03func extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void right() {
	linksUm();
	linksUm();
	linksUm();
}

void left() {
	linksUm();
}

void turnaround() {
	left();
	left();
}

void salto() {
	linksUm();
	linksUm();
	linksUm();
	linksUm();
}

/*	hamster climbs a step to the right:
	hamster is facing a step before it climbs it (i.e. facing right)
	and facing right again once it has climbed the step */
void stepUpRight() {
	left();
	vor();
	right();
	vor();
}

/*	hamster descends a step to the right:
	hamster is standing atop a step and facing right
	before it starts climbing down
	in the end, it's facing right again */
void stepDownRight() {
	vor();
	right();
	vor();
	left();
}

/*
void stepUpLeft() {
	right();
	vor();
	left();
	vor();
}

void stepDownLeft() {
	vor();
	left();
	vor();
	right();
}
*/


/*	initial step forward
	before there are any steps to climb	*/
void zumBerg() {
	vor();
}

/*	climb the stairs to the right */
void hinauf() {
	stepUpRight();
	stepUpRight();
	stepUpRight();
	stepUpRight();
}

/* descend the stairs to the right */
void hinab() {
	stepDownRight();
	stepDownRight();
	stepDownRight();
	stepDownRight();
}


public void main() {
	zumBerg();
    hinauf();
    salto();
    hinab();
}


/*	more elaborte function lets
	hamster do more elaborate things...
void main() 
	
	// start climbing stairs
	// (4 stairs in total)
	stepUpRight();
	stepUpRight();
	stepUpRight();
	stepUpRight();
	
	// descend 4 stairs
	stepDownRight();
	stepDownRight();
	stepDownRight();
	stepDownRight();
	
	// turn around
	turnaround();
	
	// climb 4 steps
	stepUpLeft();
	stepUpLeft();
	stepUpLeft();
	stepUpLeft();
	
	// do a salto
	salto();
	
	// descend 4 steps
	stepDownLeft();
	stepDownLeft();
	stepDownLeft();
	stepDownLeft();
	
	// go back to initial position
	vor();
	turnaround();
}
*/}