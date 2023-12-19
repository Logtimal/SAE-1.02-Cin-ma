import java.util.*;

public class Affichage {
    public static void Normal(List<Film> films) {
        for (int i = 0; i < films.size(); i++) {
            Film film = (Film) films.get(i);
            System.out.println("Film " + (i + 1) + " :  " + film.title + "  Année: " + film.year + "  Genre: "
                    + film.genre + "  Durée: " + film.duration + " minutes" + "  Pays de production: " + film.country
                    + "  Langue: " + film.language + "  Réalisateur: " + film.director + "  Scénariste: " + film.writer
                    + "  Acteurs: " + film.actors + "  Description: " + film.description
                    + "  Nombre de votes de spectateurs: " + film.votes + "  Moyenne des votes: " + film.avg_vote);
        }
    }

    public static void Couleur(List<Film> films) {
        String Vert = "\u001B[32m", Rouge = "\u001B[31m", Jaune = "\u001B[33m", Violet = "\u001B[35m",
                Bleu = "\u001B[34m", Cyan = "\u001B[36m", Reset = "\u001B[0m";
        for (int i = 0; i < films.size(); i++) {
            Film film = (Film) films.get(i);
            System.out.println(Bleu + "Film " + (i + 1) + " :  " + Reset + film.title + Vert + "  Année: " + Reset
                    + film.year + Violet + "  Genre: " + Reset + film.genre + Cyan + "  Durée: " + Reset + film.duration
                    + " minutes" + Rouge + "  Pays de production: " + Reset + film.country + Jaune + "  Langue: "
                    + Reset + film.language + Bleu + "  Réalisateur: " + Reset + film.director + Vert + "  Scénariste: "
                    + Reset + film.writer + Violet + "  Acteurs: " + Reset + film.actors + Cyan + "  Description: "
                    + Reset + film.description + Rouge + "  Nombre de votes de spectateurs: " + Reset + film.votes
                    + Jaune + "  Moyenne des votes: " + Reset + film.avg_vote);
        }
    }

    public static void Beau(List<Film> films) {
        for (int i = 0; i < films.size(); i++) {
            Film film = (Film) films.get(i);
            System.out.println("Film " + (i + 1) + " :  " + film.title + "\nAnnée: "
                    + film.year
                    + "\nGenre: "
                    + film.genre + "\nDurée: "
                    + film.duration + " minutes"
                    + "\nPays de production: " + film.country
                    + "\nLangue: " + film.language + "\nRéalisateur: "
                    + film.director
                    + "\nScénariste: "
                    + film.writer
                    + "\nActeurs: " + film.actors + "\nDescription: "
                    + film.description
                    + "\nNombre de votes de spectateurs: " + film.votes
                    + "\nMoyenne des votes: " + film.avg_vote + "\n");
        }
    }

    public static void BeauCouleur(List<Film> films) {
        String Vert = "\u001B[32m", Rouge = "\u001B[31m", Jaune = "\u001B[33m", Violet = "\u001B[35m",
                Bleu = "\u001B[34m", Cyan = "\u001B[36m", Reset = "\u001B[0m";
        for (int i = 0; i < films.size(); i++) {
            Film film = (Film) films.get(i);
            System.out.println(Bleu + "Film " + (i + 1) + " :  " + Reset + film.title + Vert + "\nAnnée: " + Reset
                    + film.year + Violet + "\nGenre: " + Reset + film.genre + Cyan + "\nDurée: " + Reset + film.duration
                    + " minutes" + Rouge + "\nPays de production: " + Reset + film.country + Jaune + "\nLangue: "
                    + Reset + film.language + Bleu + "\nRéalisateur: " + Reset + film.director + Vert + "\nScénariste: "
                    + Reset + film.writer + Violet + "\nActeurs: " + Reset + film.actors + Cyan + "\nDescription: "
                    + Reset + film.description + Rouge + "\nNombre de votes de spectateurs: " + Reset + film.votes
                    + Jaune + "\nMoyenne des votes: " + Reset + film.avg_vote + "\n");
        }
    }
}