/*	hamster is running along a corridor to the right:
	hamster is facing right but its initial position is unknown.
	let hamster run to the far right */

/*	new functions:
	vornFrei()
	kornDa()
	maulLeer() */
	
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_AB03_01 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {void boldlyGo() {
		if(vornFrei()) {
		vor();
		}
	}	

public void main() {
	boldlyGo();
	boldlyGo();
	boldlyGo();
	boldlyGo();
	boldlyGo();
	boldlyGo();
	boldlyGo();
}
}