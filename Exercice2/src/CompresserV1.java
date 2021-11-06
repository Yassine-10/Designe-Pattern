public class CompresserV1 extends Compresser{
    @Override
    protected int operation1() {
        System.out.println("operation1 V1:");
        return 10;
    }

    @Override
    protected int operation2() {
        System.out.println("operation1 V2:");
        return 12;
    }
}
