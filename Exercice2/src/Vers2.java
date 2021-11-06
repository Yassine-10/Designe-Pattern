public class Vers2 implements Strategy{
    @Override
    public int[] filter(int[] data) {
        System.out.println("strategy V2:");
        return new int[0];
    }
}
