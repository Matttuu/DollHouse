public class DollHouseSingleton {

  private String navn;
  private static DollHouseSingleton instance;

  private DollHouseSingleton() {
    this.navn = "Dukkehuset i Århus";
  }

  public static DollHouseSingleton getInstance() {
    if (instance==null) {
      DollHouseSingleton instance = new DollHouseSingleton();
    }
  return instance;
  }
}