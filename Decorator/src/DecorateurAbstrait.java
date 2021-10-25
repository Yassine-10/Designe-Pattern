public abstract class DecorateurAbstrait implements ComposantAbstrait {
    protected ComposantAbstrait composantAbstrait;
    public DecorateurAbstrait(ComposantAbstrait composantAbstrait) {
        super();
        this.composantAbstrait = composantAbstrait;
    }
}