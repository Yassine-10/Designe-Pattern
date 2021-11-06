public abstract class  Etat {
    protected Eau eau;
    public Etat(Eau eau) {
        this.eau = eau;

    }
    public abstract void fusion();
    public abstract void solidification();
    public abstract void vaporisation();
    public abstract void liquefaction();
    public abstract void doAction();
}
