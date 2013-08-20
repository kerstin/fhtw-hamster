import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_03 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

	/* make hamster climb stairs */
	
	/* climb one step */
	vor();
	linksUm();
	vor();
	linksUm();
	linksUm();
	linksUm();
	
	/* climb rest of steps */
	vor();
	linksUm();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	linksUm();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	linksUm();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();	
	
	/* make hamster descend stairs to the right
	(continuation of previous code) */
	
	/* descend one step */
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	linksUm();
	
	/* descend rest of steps */
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	linksUm();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();
	linksUm();
	vor();
	linksUm();
	linksUm();
	linksUm();
	vor();

	/* make hamster climb stairs, do a 'salto'
	at the top and let it descend on the other side
	(continuation of previous code) */	
    
    /* turn around */
    linksUm();
    linksUm();
    
    /* climb one step */
    vor();
    linksUm();
    vor();
    linksUm();
    linksUm();
    linksUm();
    
    /* climb other steps */
    vor();
    linksUm();
    vor();
    linksUm();
    linksUm();
    linksUm();
    
    vor();
    linksUm();
    vor();
    linksUm();
    linksUm();
    linksUm();
    vor();
    linksUm();
    vor();
    
    /* do a salto */
    linksUm();
    linksUm();
    linksUm();
    linksUm();
    
    /* descend stairs */
    vor();
    linksUm();
    vor();
    linksUm();
    linksUm();
    linksUm();
    
    vor();
    linksUm();
    vor();
    linksUm();
    linksUm();
    linksUm();
    vor();
    linksUm();
    vor();
    linksUm();
    linksUm();
    linksUm();
    vor();
    linksUm();
    vor();
    linksUm();
    linksUm();
    linksUm();
    
    /* back to initial position */
    vor();
    linksUm();
    linksUm();              
    
}
}