public class ProduitEnSolde extends Produit {
    private int remis;

    public ProduitEnSolde(int code, double prixorigine, int remis) {
        super(code, prixorigine);
        this.remis = remis;
    }

    public int getRemis() {
        return remis;
    }

    public void setRemis(int r) throws Exception {
        if(r<=0 || r>=90){
            throw new Exception("remis doit etre entre 1 et 89 !!");
        }else {
            this.remis=r;
        }
    }

    public double prixArticle(){
        double prix=getPrixorigine();
        return prix*(remis/100);
    }

    @Override
    public String toString() {
        return super.toString() + ";remis=" + remis;
    }
}
