public class BinairePlus extends ExpBinaire {


    public BinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
    }

    @Override
    public String toStringInfixe() {
        return "(" + super.opGauche + " + " + super.opDroit + ")";
    }
    
}
