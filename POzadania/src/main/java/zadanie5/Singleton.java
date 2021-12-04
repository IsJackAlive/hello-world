package zadanie5;

public class Singleton {
    
    private static Singleton Singleton = null;
    
    public static final Singleton instance = new Singleton();
    public ClubMember founder = ClubMember.founder;
    
    private Singleton(){
    }
}
