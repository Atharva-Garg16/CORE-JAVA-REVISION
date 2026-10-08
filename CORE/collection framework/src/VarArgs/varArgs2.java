package VarArgs;

public class varArgs2 {
    static String concat(String... arg){
        return String.join(" ", arg);
    }
    public static void main(String[] args) {

        System.out.println( concat("Atharva","is","great"));

    }
}
