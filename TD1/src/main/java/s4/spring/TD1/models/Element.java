package s4.spring.TD1.models;

public class Element {

    private String nom;
    private String evaluation;

    public Element(String nom, String evaluation){
        this.nom = nom;
        this.evaluation = evaluation;
    }

    public String getNom(){
        return nom;
    }

    public String getEvaluation(){
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean equals(Element obj) {
        if(this.nom == obj.getNom() && this.evaluation == obj.getEvaluation()){
            return true;
        }else{
            return false;
        }
    }

}
