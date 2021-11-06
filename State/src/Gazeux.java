public class Gazeux extends Etat{
    public Gazeux(Eau eau) {
        super(eau);
    }

    @Override
    public void fusion() {
        System.out.println("Impossible d'executer l'operation ");
    }

    @Override
    public void solidification() {
        System.out.println("Impossible d'executer l'operation ");
    }

    @Override
    public void vaporisation() {
        System.out.println("l'eau est deja en etat gazeux");

    }

    @Override
    public void liquefaction() {
        System.out.println("l'eau est passer de l'etat gazeux vers l'etat liquide ");
        this.eau.setEtat(new Liquide(this.eau));
    }

    @Override
    public void doAction() {
        System.out.println("Etat courant : gazeux");
    }
}
