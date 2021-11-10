public class UnaireCos extends ExpUnaire {

    public UnaireCos(ExpAbstraite operateur) {
        super(operateur);
    }

    @Override
    public String toStringInfixe() {
        return "cos(" + super.operateur + ")"; 
    }
    
}
