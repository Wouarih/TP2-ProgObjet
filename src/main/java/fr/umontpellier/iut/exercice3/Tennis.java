package fr.umontpellier.iut.exercice3;

public class Tennis {
    private final String j1;
    private final String j2;
    private int nbPointsJ1;
    private int nbPointsJ2;

    public Tennis(String joueur1, String joueur2) {
        j1 = joueur1;
        j2 = joueur2;
    }

    // incrémente les points du joueur correspondant
    public void gagnerPoint(String joueur) {
        if (joueur == j1){
            nbPointsJ1++;
        } else {
            nbPointsJ2++;
        }
    }

    // Retourne le score courant de la partie sous forme de chaîne de caractères
    // Cette fonction interprète le score actuel sous forme d'un texte respectant la nomenclature d'un jeu de tennis
    public String getScore() {

        if(nbPointsJ1 == 4 && nbPointsJ2 ==3){
            return "Avantage Federer";
        }
        if(nbPointsJ1 >= 4 || nbPointsJ2 == nbPointsJ1 -2 && nbPointsJ2 >=3) {
            return "Federer gagne";
        }

        if(nbPointsJ1 == 3 && nbPointsJ2 ==4){
            return "Avantage Nadal";
        }
        if(nbPointsJ1 >= 3 && nbPointsJ2 >= 3){
            return "Égalité";
        }

        if(nbPointsJ2 ==4){
            return "Nadal gagne";
        }
        if(nbPointsJ1 == 0 && nbPointsJ2 == 3){
            return "0 : 40";
        }
        if(nbPointsJ1 == 1 && nbPointsJ2 == 1){
            return "15 : 15";
        } else if(nbPointsJ1 == 1){
            return "15 : 0";
        }
        return "0 : 0";
    }

}
