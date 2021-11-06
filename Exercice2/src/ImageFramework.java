public class ImageFramework {
    protected Strategy strategy;
    protected Compresser compresser;
    public void appliquerStrategy(int []data){
        strategy.filter(data);

    }
    public void setStrategy(Strategy strategy) {

        this.strategy = strategy;

    }
    public void setCompresser(Compresser compresser) {

        this.compresser = compresser;

    }
}
