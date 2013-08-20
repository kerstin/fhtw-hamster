import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class hamster_05 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

    /* hamster has 6 grains
    drop one on each field
    return to original position */
    
    gib();
    vor();
    gib();
    vor();
    gib();
    linksUm();
    linksUm();
    vor();
    linksUm();
    vor();
    gib();
    linksUm();
    linksUm();
    linksUm();
    vor();
    gib();
    linksUm();
    vor();
    gib();
    linksUm();
    linksUm();
    vor();
    vor();
    linksUm();
    linksUm();
    linksUm();
        
}
}