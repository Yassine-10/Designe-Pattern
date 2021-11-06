

public class adapter implements Strategy{
    private ImplNonStandard implNonStandard=new ImplNonStandard();
    @Override
    public int[] filter(int[] data) {
        return implNonStandard.filter3(data);

    }
}
