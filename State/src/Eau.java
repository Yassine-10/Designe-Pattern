public class Eau {
    private Etat etat;
    public Eau() { etat=new Liquide(this); }
    public void solidification() { etat.solidification();}
    public void vaporisation() { etat.vaporisation(); }
    public void liquefaction() { etat.liquefaction(); }
    public void fusion() { etat.fusion(); }
    public void doAction() { etat.doAction(); }
    public Etat getEtat() { return etat; }
    public void setEtat(Etat etat) { this.etat = etat; }
}
