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

        if (joueur.equals(j1)) {
            nbPointsJ1++;
        } else {
            nbPointsJ2++;
        }
    }

    // Retourne le score courant de la partie sous forme de chaîne de caractères
    // Cette fonction interprète le score actuel sous forme d'un texte respectant la nomenclature d'un jeu de tennis
    public String getScore() {
        String score = "0 : 0";

        if (nbPointsJ1 == 1) {
            score = "15 : 0";
        }

        if (nbPointsJ2 == 1) {
            score = "15 : 15";
        }
        if (nbPointsJ2 == 3 && nbPointsJ1 == 0) {
            score = "0 : 40";
        }

        if (nbPointsJ1 >= 4 && nbPointsJ1 >= nbPointsJ2 + 2) {
            score = j1 + " gagne";
        }

        if (nbPointsJ2 >= 4 && nbPointsJ2 >= nbPointsJ1 + 2) {
            score = j2 + " gagne";
        }

        if (nbPointsJ1 >= 3 && nbPointsJ1 == nbPointsJ2) {
            score = "Égalité";
        }

        if (nbPointsJ1 >= 4 && nbPointsJ2 == nbPointsJ1 - 1) {
            score = "Avantage " + j1;
        }
        if (nbPointsJ2 >= 4 && nbPointsJ1 == nbPointsJ2 - 1) {
            score = "Avantage " + j2;
        }

        return score;
    }
}

//test commit

