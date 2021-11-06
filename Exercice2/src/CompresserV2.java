public class CompresserV2 extends Compresser{
    @Override
    protected int operation1() {
        System.out.println("operation2 V1:");
        return 200;
    }

    @Override
    protected int operation2() {
        System.out.println("operation2 V2:");
        return 300;
    }
}
