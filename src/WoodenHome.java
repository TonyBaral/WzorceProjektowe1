public class WoodenHome extends Home {
    @Override
    protected void putWindows(){
        System.out.println("Okna Drewniane");
    }
    @Override
    protected void putDoors(){
        System.out.println("Drzwi Drewniane");
    }
    @Override
    protected void buildRoof(){
        System.out.println("Dach Drewniany");
    }
    @Override
    protected void buildWallsAndFlors(){
        System.out.println("Sciany i podłoga Drewniana");
    }
    @Override
    protected void putFoundations(){
        System.out.println("Fundamenty pod dom drewniany");
    }
    @Override
    protected void digHole(){
        System.out.println("Dół pod dom drewniany");
    }
}
