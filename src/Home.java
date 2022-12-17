public abstract class Home {

 public final void build() {
  digHole();
  putFoundations();
  buildWallsAndFlors();
  buildRoof();
  putWindows();
  putDoors();
 }
    protected abstract void putWindows();
    protected abstract void putDoors();
    protected abstract void buildRoof();
    protected abstract void buildWallsAndFlors();
    protected abstract void putFoundations();
    protected abstract void digHole();
}
