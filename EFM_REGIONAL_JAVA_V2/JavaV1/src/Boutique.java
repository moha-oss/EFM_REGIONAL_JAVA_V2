import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Boutique {
    private ArrayList<Produit> produit;

    public int indiceDe(int code){
        int indice=-1;
        for (Produit a : produit) {
            if (a.getCode()==code)
                indice=produit.indexOf(a);
        }
        return indice;
    }

    public void ajouter(Produit a)throws Exception{
        for (Produit ar : produit) {
            if (ar.getCode()==a.getCode())
                throw new Exception("l'article existe déja !!");
            else
                produit.add(a);
        }
    }

    public boolean suprimmer(int code){
        boolean res=false;
        for (Produit a : produit) {
            if (a.getCode()==code) {
                produit.remove(a);
                res=true;
            }
        }
        return res;
    }

    public boolean suprimmer(Produit a){
        boolean res=false;
        for (Produit ar : produit) {
            if(ar.equals(a)){
                produit.remove(a);
                res=true;
            }
        }
        return res;
    }
    public int nombreArticlesEnSolde(){
        int nombreArEnSold=0;
        for (Produit ar:produit) {
            if (ar.getPrixorigine()>ar.prixArticle()){
                nombreArEnSold++;
            }
        }
        return nombreArEnSold;

    }

    public void enregistrer(String chemain) throws IOException {
        File articles=new File(chemain);
        BufferedWriter writer = new BufferedWriter(new FileWriter(articles));
        try{
            articles.createNewFile();
            for (Produit ar:produit) {
                writer.write(ar.toString());
            }
            writer.close();
        }catch (IOException e){
            e.getMessage();
        }

    }
}
