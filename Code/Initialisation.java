import java.io.*;
import java.util.*;

public class Initialisation {
    public static List<Film> Base(String nom, int j) {
        List<Film> films;
        if (j == 1) {
            films = new ArrayList<Film>();
        } else {
            films = new LinkedList<Film>();
        }
        String ligne;
        try (BufferedReader br = new BufferedReader(new FileReader(nom))) {
            br.readLine();
            while ((ligne = br.readLine()) != null) {
                String[] elements = ligne.split("\t");
                if (!(elements.length <= 1)) {
                    Integer e3 = (Integer) null, e6 = (Integer) null, e15 = (Integer) null;
                    Float e14 = (Float) null, e19 = (Float) null, e20 = (Float) null, e21 = (Float) null;
                    String e16 = "", e17 = "", e18 = "";
                    if (!elements[3].equals("")) {
                        e3 = Integer.parseInt(elements[3]);
                    }
                    if (!elements[6].equals("")) {
                        e6 = Integer.parseInt(elements[6]);
                    }
                    if (!elements[14].equals("")) {
                        e14 = Float.parseFloat(elements[14]);
                    }
                    if (!elements[15].equals("")) {
                        e15 = Integer.parseInt(elements[15]);
                    }
                    if (!(elements.length <= 16) && !elements[16].equals("")) {
                        e16 = elements[16];
                    }
                    if (!(elements.length <= 17) && !elements[17].equals("")) {
                        e17 = elements[17];
                    }
                    if (!(elements.length <= 18) && !elements[18].equals("")) {
                        e18 = elements[18];
                    }
                    if (!(elements.length <= 19) && !elements[19].equals("")) {
                        e19 = Float.parseFloat(elements[19]);
                    }
                    if (!(elements.length <= 20) && !elements[20].equals("")) {
                        e20 = Float.parseFloat(elements[20]);
                    }
                    if (!(elements.length <= 21) && !elements[21].equals("")) {
                        e21 = Float.parseFloat(elements[21]);
                    }
                    films.add(new Film(elements[0], elements[1], elements[2], e3, elements[4], elements[5], e6,
                            elements[7], elements[8], elements[9], elements[10], elements[11], elements[12],
                            elements[13], e14, e15, e16, e17, e18, e19, e20, e21));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return films;
    }

}