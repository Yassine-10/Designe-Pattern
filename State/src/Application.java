public class Application {
    public static void main(String[] args) {

        Eau obj=new Eau(); obj.doAction();
        System.out.println("-------------");

        obj.vaporisation(); obj.doAction();System.out.println("-------------");
        obj.solidification(); obj.doAction();System.out.println("-------------");
        obj.liquefaction(); obj.doAction();System.out.println("-------------");
        obj.solidification(); obj.doAction();System.out.println("-------------");
        obj.fusion(); obj.doAction();System.out.println("-------------");
    }
}
