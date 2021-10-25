import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Context ctx=new Context(); Scanner clavier=new Scanner(System.in);
        while(true){
            System.out.print("Quelle stratégie:");
            String nomStrategy=clavier.next();
            if(nomStrategy.equals("quit")) break;
            try {

                Class c=Class.forName(nomStrategy);
                Strategy strategy=(Strategy) c.newInstance();
                ctx.setStrategy(strategy);
                ctx.appliquerStrategy();

            } catch (Exception e) {

                System.out.println("Stratégy Innexistante..");

            } }
    }}