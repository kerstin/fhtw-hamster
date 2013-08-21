/*	hamster has one grain in its mouth and should leave it at
	the bottom field of the vertical corridor.
	its starting position is known, its orientation is not! */
	

/*	new functions:
	vornFrei()
	kornDa()
	maulLeer() */


/*	Try for 2 free fields first.
	If hamster hits a wall after 2 fields, it's already
	in the right corridor, but walking the wrong direction.
	In this case, make it turn around and walk back 6 fields,
	then have it drop the corn.
	
	If it doesn't hit a wall after 2 fields, it might either
	be in one of the corridors with 3 fields or the correct one
	(the one with 4 fields).
	
	So, try if it hits a wall after 3 fields. If it does,
	make it go back to the crossing, have it turn to
	e.g. the left and let it try again for 2 fields.
	
	If it doesn't hit a wall after 3 fields, it's already
	in the right corridor, the one with 4 fields. Let it go
	to the end and drop the grain.
	
	*/

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB03_04 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
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

/*	hamster is in corridor with 2 fields,
	so needs to turn around and go the the far end
	to drop the grain there */

/*	minimum corridor is 2 fields long, so hamster
	can always take these two steps at once from crossing */	
void tryFor2() {
	vor();
	vor();
}
	
/*	when hamster is in the 2-field corridor,
	it just needs to turn around and go to the other end */
void from2to4() {
	turnaround();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	gib();
}


/*	send hamster back to crossing when it's in a 3-field
	corridor (and make it turn left too) */
void turnBackFrom3() {
	turnaround();
	vor();
	vor();
	vor();
	left();
}

public void main() {
	vor();
	vor();
	if(vornFrei()) {
		vor(); // we might be in 3-field or 4-field corridor
		if(vornFrei()) {
			vor(); // we are in 4-field corridor
			gib();
		} else {
		/*	hamster is in 3-field corridor,
			so needs to go back and try around the corner */
			turnBackFrom3();
			tryFor2();
			/* try again for 2 or 4 */
			if (vornFrei()) { // hamster is in 4-field corridor
				vor();
				vor();
				gib();
			} else { // hamster currently in 2-field corridor
				from2to4();
			}			
		}
	} else { // right corridor but wrong end
		from2to4();
	}
}}