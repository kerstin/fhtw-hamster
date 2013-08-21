/*	let the hamster "draw" numbers with grains:
	- let it draw 4 different numbers
	- each number's width is 3 cols, its height 5 rows
	- the hamster starts in the top left corner of a number
	- hamster finishes four fields to the right from where it
	began drawing the number

/*	draw a 4 */

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB02_02 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void left() {
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

void draw4() {
	right();
	gib();
	vor();
	gib();
	vor();
	gib();
	left();
	vor();
	gib();
	vor();
	gib();
	right();
	vor();
	gib();
	vor();
	gib();
	turnaround();
	vor();
	vor();
	vor();
	gib();
	vor();
	gib();
	right();
	vor();
	vor();
}

void draw2() {
	gib();
	vor();
	gib();
	vor();
	gib();
	right();
	vor();
	gib();
	vor();
	gib();
	right();
	vor();
	gib();
	vor();
	gib();
	left();
	vor();
	gib();
	vor();
	gib();
	left();
	vor();
	gib();
	vor();
	gib();
	left();
	vor();
	vor();
	vor();
	vor();
	right();
	vor();
	vor();
}

void draw1() {
	vor();
	right();
	gib();
	vor();
	gib();
	vor();
	gib();
	vor();
	gib();
	vor();
	gib();
	turnaround();
	vor();
	vor();
	vor();
	vor();
	right();
	vor();
	vor();
	vor();
}

void draw3() {
	gib();
	vor();
	gib();
	vor();
	gib();
	right();
	vor();
	gib();
	vor();
	gib();
	right();
	vor();
	gib();
	vor();
	gib();
	turnaround();
	vor();
	vor();
	right();
	vor();
	gib();
	vor();
	gib();
	right();
	vor();
	gib();
	vor();
	gib();
	turnaround();
	vor();
	vor();
	left();
	vor();
	vor();
	vor();
	vor();
	right();
}



public void main() {
	draw4();
	draw2();
	draw1();
	draw3();
}
}