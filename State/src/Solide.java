public class Solide extends Etat{
    public Solide(Eau eau) {
        super(eau);
    }

    @Override
    public void fusion() {
        System.out.println("l'eau est passer de l'etat solide vers l'etat liquide ");
        this.eau.setEtat(new Liquide(this.eau));
    }

    @Override
    public void solidification() {
        System.out.println("l'eau est deja en etat solide");

    }

    @Override
    public void vaporisation() {
        System.out.println("Impossible d'executer l'operation ");
    }

    @Override
    public void liquefaction() {
        System.out.println("Impossible d'executer l'operation ");
    }

    @Override
    public void doAction() {
        System.out.println("Etat courant : solide");
    }
}
