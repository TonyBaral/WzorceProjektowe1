public class BrickHome extends Home{
    @Override
    protected void putWindows(){
        System.out.println("Okna metalowe");
    }
    @Override
    protected void putDoors(){
        System.out.println("Drzwi metalowe");
    }
    @Override
    protected void buildRoof(){
        System.out.println("Dach Ceglany");
    }
    @Override
    protected void buildWallsAndFlors(){
        System.out.println("Sciany i podłoga murowana");
    }
    @Override
    protected void putFoundations(){
        System.out.println("Fundamenty pod dom murowany");
    }
    @Override
    protected void digHole(){
        System.out.println("Dół pod dom murowany");
    }
}
