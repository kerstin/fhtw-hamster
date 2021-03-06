/*	hamster sits in a rectangular area of unknown size
	without any obstacles. 	the hamster's position and
	orientation are unknown, and there is an unknown number
	of grains in the area.
	have the hamster pick up all grains in the area. */


/*	new statement:
	while(condition) {
		statement(s);
	} */


/*	add. functions:
	vornFrei()
	kornDa()
	maulLeer() */


/*	helper functions */
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB04_04 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
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

/*	have hamster start in a corner of the area.
	in this case the hamster turns left, which means
	it ends up facing a wall in front and to its right.
	have it turn left, so it's facing the area (it then
	has a wall to its right and its back).
	*/
void findCorner() {
    while(vornFrei()) {
    	vor();
    }
    left();
    while(vornFrei()) {
    	vor();
    }
    left();
}

/*	check if the hamster has a wall in front of it
	to know if the row it's on is the last row
	it has to walk along. */
void checkFront() {
	if (vornFrei()) {
	}
}


/*	pick up all grains on a field */
void pickUpAll() {
	while(kornDa()) {
		nimm();	
	}
}

/*	walk a row to the left and pick up all grains on the way.
	when hamster hits a wall, let it turn to the right so the wall
	is on its left side. */
void walkLeft() {
	left();
	pickUpAll();
	while(vornFrei()) {
		vor();
		pickUpAll();
	}
	right();
}

/*	walk a row to the right and pick up all grains on the way.
	when hamster hits a wall, let it turn to the left so the wall
	is on its right side. */
void walkRight() {
	right();
	pickUpAll();
	while(vornFrei()) {
		vor();
		pickUpAll();
	}
	left();
}


/*	from the corner, have hamster walk over all fields
	to pick up (potential) grains */
public void main() {
	findCorner();
	walkLeft();
	while(vornFrei()) {
		walkLeft();
		if(vornFrei()) {
			vor();
			walkRight();
		}
	
	}
}
}