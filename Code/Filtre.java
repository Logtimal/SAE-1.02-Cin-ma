import java.util.*;

public class Filtre {

    public static void Titre(List<Film> Films, String element) {
        long startTime = System.nanoTime();

        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).title.toLowerCase().contains(element.toLowerCase())) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");

        long endTime = System.nanoTime();
        Affichage.Couleur(liste);
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
    }

    public class FiltreDicho {

        public static void Titre(List<Film> Films, String element) {
            long startTime = System.nanoTime();

            List<Film> liste;
            if (Films.getClass() == ArrayList.class) {
                liste = new ArrayList<Film>();
            } else {
                liste = new LinkedList<Film>();
            }
            int n = 0;
            
            Collections.sort(Films);
            for (int i = 0; i < Films.size(); i++) {
                
                n++;
            }
            System.out.println(n + " éléments conservés");

            long endTime = System.nanoTime();
            Affichage.Couleur(liste);
            long timeElapsed = endTime - startTime;
            float miliseconds = timeElapsed / 1000000;
            System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        }

    }

    public static List<Film> Annee(List<Film> Films, Integer element) {
        long startTime = System.nanoTime();

        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).year == element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> AnneeAvant(List<Film> Films, Integer element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).year <= element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> AnneeApres(List<Film> Films, Integer element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).year >= element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> Genre(List<Film> Films, String element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).genre.toLowerCase().contains(element.toLowerCase())) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> Pays(List<Film> Films, String element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).country.toLowerCase().contains(element.toLowerCase())) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> Note(List<Film> Films, Float element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).avg_vote == element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> NoteAvant(List<Film> Films, Float element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).avg_vote <= element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> NoteApres(List<Film> Films, Float element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).avg_vote >= element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> Duree(List<Film> Films, Integer element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).duration == element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> DureeAvant(List<Film> Films, Integer element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).duration <= element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> DureeApres(List<Film> Films, Integer element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).duration >= element) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> Langue(List<Film> Films, String element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).language.toLowerCase().contains(element.toLowerCase())) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> Realisateur(List<Film> Films, String element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).director.toLowerCase().contains(element.toLowerCase())) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }

    public static List<Film> Scenariste(List<Film> Films, String element) {
        long startTime = System.nanoTime();
        List<Film> liste;
        if (Films.getClass() == ArrayList.class) {
            liste = new ArrayList<Film>();
        } else {
            liste = new LinkedList<Film>();
        }
        int n = 0;
        for (int i = 0; i < Films.size(); i++) {
            if (Films.get(i).writer.toLowerCase().contains(element.toLowerCase())) {
                liste.add(Films.get(i));
                n++;
            }
        }
        System.out.println(n + " éléments conservés");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        float miliseconds = timeElapsed / 1000000;
        System.out.println("Temps d'exécution en milisecondes : " + miliseconds);
        return liste;
    }
}