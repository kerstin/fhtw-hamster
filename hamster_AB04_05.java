/*	have the hamster climb and descend a mountain.
	the height and width of the mountain is not known,
	but it looks the same on both sides (it always
	ascends and descends by one field).
	in the beginning, the hamster is standing at the bottom
	of the mountain, facing it. */

/*	new statement:
	while(condition) {
		statement(s);
	} */

/*	add. functions:
	vornFrei()
	kornDa()
	maulLeer() */

/*	helper functions */
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB04_05 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
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
 
/*	Check if the hamster is facing left or right by checking
	if it faces a wall when it turns to one side. (That wall
	would be the ground.)
	Then let it walk forward until it hits a wall (= the
	beginning of the mountain). Depending on which direction
	the hamster is facing, have it start climbing the mountain
	(either to the left or right).
	Have the hamster climb the mountain until there are no
	further steps (because then it has reached the top of the
	mountain). Then, have the hamster descend until
	there are no more steps (meaning it has reached the valley
	on the other side of the mountain). */


void plateauLeft() {
	left();
}
void climbLeft() {
	right();
	vor();
	left();
	vor();
}
void climbRight() {
	left();
	vor();
	right();
	vor();
}
void descendRight() {
	vor();
	right();
	if(vornFrei()){
		vor();
		left();
	}
}
void descendLeft() {
	vor();
	left();
	if(vornFrei()) {
		vor();
		right();
	}
}

public void main() {
	/*	check in which direction the hamster is facing
		(either left or right) */
	left();
	if(!vornFrei()) {	// hamster is facing left
		right();		// have it turn back to the left
		
		/*	let it walk forward until it hits a wall
			then start climbing the mountain to the right */
		while(vornFrei()) {
			vor();
		}
		while(!vornFrei()){
			climbLeft();		
		}
		
		while(vornFrei()) {
			descendLeft();
		}
		
	} else {		// hamster is facing right
		right();	// have it turn back to the right
		
		while(vornFrei()) {
			vor();
		}
		while(!vornFrei()) {
			climbRight();		
		}
		
		/*	hamster has reached the top of the mountain
			and is facing to the right */
		while(vornFrei()) {
			descendRight();
		}		
	}
}}