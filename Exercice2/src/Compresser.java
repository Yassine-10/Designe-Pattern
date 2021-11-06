public abstract class Compresser {
    public int operationCompresser(){
        int a=operation1();
        int somme=0;
        for(int i=0;i<a;i++){
            somme+=operation2();
        }
        return somme;
    }
    protected abstract int operation1();
    protected abstract int operation2();
}
