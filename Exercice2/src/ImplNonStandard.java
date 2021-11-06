public class ImplNonStandard {
    public int [] filter3(int []data){
        String filterName="ImplNonStandard";
        int []result =filter2(filterName,data);
        return result;
    }
    public int [] filter2(String filterName, int[] data){
        System.out.println("Non standard implementation :"+filterName);
        return new int[2];
    }
}
