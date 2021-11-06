public class Vers1 implements Strategy{
    @Override
    public int[] filter(int[] data) {
        System.out.println("strategy V1:");
        return new int[0];
    }
}
