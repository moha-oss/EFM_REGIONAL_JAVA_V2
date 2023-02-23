public class Produit {

    private int code;
    private double prixorigine;

    public Produit(int code, double prixorigine){
        this.code=code;
        this.prixorigine=prixorigine;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixorigine() {
        return prixorigine;
    }

    public void setPrixorigine(double prixorigine) {
        this.prixorigine = prixorigine;
    }

    public String toString() {
        return "code=" + code + "; prixorigine=" + prixorigine;
    }

    public boolean equals(Produit a){
        boolean res=false;
        if(this.code==a.code){
            res=true;
        }
        return res;
    }

    public double prixArticle(){
        return this.prixorigine;
    }
}
