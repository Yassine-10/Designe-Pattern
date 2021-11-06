public class Liquide extends Etat{
    public Liquide(Eau eau) {
        super(eau);
    }

    @Override
    public void fusion() {
        System.out.println("l'eau est deja en etat liquide");
    }

    @Override
    public void solidification() {
        System.out.println("l'eau est passer de l'etat liquide vers l'etat solide ");
        this.eau.setEtat(new Solide(this.eau));
    }

    @Override
    public void vaporisation() {
        System.out.println("l'eau est passer de l'etat liquide vers l'etat gazeux ");
        this.eau.setEtat(new Gazeux(this.eau));
    }

    @Override
    public void liquefaction() {
        System.out.println("l'eau est deja en etat liquide");

    }

    @Override
    public void doAction() {
        System.out.println("Etat courant : liquide");

    }

}
