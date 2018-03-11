public class Singleton {
    private Singleton(){}
    private static Singleton instance = null;
    public Singleton getInstance() {
        if(instance==null) {
            return new Singleton();
        }
        return new Singleton();
    }
}
