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

    public void gagnerPoint(String joueur) {
        throw new RuntimeException("La fonction n'est pas encore implémentée !");
    }

    // Retourne le score courant de la partie sous forme de chaîne de caractères
    public String getScore() {
        throw new RuntimeException("La fonction n'est pas encore implémentée !");
    }

}
