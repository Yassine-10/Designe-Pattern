public class ApplicationDecorateur {
    public static void main(String[] args) {
        Boisson b1=new Espresso();
        System.out.println(b1.getDescription()+" € "+b1.cout());
        Boisson b2=new Colombia();
        b2=new Caramel(b2);
        b2=new Chocolat(b2);
        b2=new Chocolat(b2);
        System.out.println(b2.getDescription()+" € "+b2.cout());
    }
}