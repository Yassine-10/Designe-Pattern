import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ImageFramework imageFramework=new ImageFramework();
        Scanner clavier=new Scanner(System.in);
        int []data=new int[0];
        while(true){
            System.out.print("Quelle operation:");
            String nomOperation=clavier.next();
            if(nomOperation.equals("quit")) break;
            else if(nomOperation.equals("filter")){
            try {
                System.out.print("Quelle strategy:");
                String nomStrategy=clavier.next();
                if(nomStrategy.equals("quit")) break;
                Class c=Class.forName(nomStrategy);
                Strategy strategy=(Strategy) c.newInstance();
                imageFramework.setStrategy(strategy);
                imageFramework.appliquerStrategy(data);

            } catch (Exception e) {

                System.out.println("Stratégy Innexistante..");

            } }
            else if(nomOperation.equals("compresser")){
                try {
                    System.out.print("Quelle version:");
                    String nomVersion=clavier.next();
                    if(nomVersion.equals("quit")) break;
                    Class c=Class.forName(nomVersion);
                    Compresser compresser=(Compresser) c.newInstance();
                    imageFramework.setCompresser(compresser);
                    imageFramework.compresser.operationCompresser();

                } catch (Exception e) {

                    System.out.println("Version Innexistante..");

                } }


        }
        /*
        imageFramework.setStrategy(new Vers1());
        imageFramework.strategy.filter(data);
        imageFramework.setStrategy(new Vers2());
        imageFramework.strategy.filter(data);
        imageFramework.setStrategy(new adapter());
        imageFramework.strategy.filter(data);
        imageFramework.setCompresser(new CompresserV1() );
        imageFramework.compresser.operationCompresser();
        imageFramework.setCompresser(new CompresserV2() );
        imageFramework.compresser.operationCompresser();*/
    }
}
