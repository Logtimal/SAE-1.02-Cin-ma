
//import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		List<Film> films;
		int t;
		do {
			System.out.println(
					"Choisissez le type de liste souhaitée : (Entrez votre choix) \n (0)Quittez \n (1)Liste normal (Array List) \n (2)Liste chaînée (Linked List)");
			int choix_type = Clavier.lireInt();
			if (choix_type == 0) {
				System.out.println("Au revoir");
				System.exit(0);
			} else if (choix_type == 1) {
				t = 1;
				films = new ArrayList<Film>();
				break;
			} else if (choix_type == 2) {
				t = 2;
				films = new LinkedList<Film>();
				break;
			}
		} while (true);
		do {
			System.out.println("Choisissez la base de donnée souhaitée : (Entrez votre choix) ");
			System.out.println("(0) Quitter");
			System.out.println("(1) 100 films ");
			System.out.println("(2) 1000 films");
			System.out.println("(3) 10000 films");
			System.out.println("(4) 40000 films");
			System.out.println("(5) Tous les films (~80000)");

			int choix_fichier = Clavier.lireInt();

			if (choix_fichier == 0) {
				System.out.println("Au revoir");
				System.exit(0);
			} else if (choix_fichier == 1) {
				films = Initialisation.Base("Ressources/IMDbmoviesCUT100.tsv", t);
				break;
			} else if (choix_fichier == 2) {
				films = Initialisation.Base("Ressources/IMDbmoviesCUT1000.tsv", t);
				break;
			} else if (choix_fichier == 3) {
				films = Initialisation.Base("Ressources/IMDbmoviesCUT10000.tsv", t);
				break;
			} else if (choix_fichier == 4) {
				films = Initialisation.Base("Ressources/IMDbmoviesCUT40000.tsv", t);
				break;
			} else if (choix_fichier == 5) {
				films = Initialisation.Base("Ressources/IMDbmoviesFULL.tsv", t);
				break;
			}
		} while (true);
		boolean test_action = true;

		do {

			System.out.println("Choisissez l'action a effectuer : (Entrez votre choix) ");
			System.out.println("(0) Quitter");
			System.out.println("(1) Recharger les données ");
			System.out.println("(2) Afficher les données ");
			System.out.println("(3) Trier les données et afficher ");
			System.out.println("(4) Filtrer les données et les afficher");
			System.out.println("(5) Rechercher un film grace a son titre");
			System.out.println("(6) Sauvegarder une requète");

			int choix_action = Clavier.lireInt();

			if (choix_action == 0) {
				System.out.println("Au revoir");
				System.exit(0);
			} else if (choix_action == 1) {
				do {
					System.out.println("Choisissez la base de donnée souhaitée : (Entrez votre choix) ");
					System.out.println("(0) Quitter");
					System.out.println("(1) 100 films ");
					System.out.println("(2) 1000 films");
					System.out.println("(3) 10000 films");
					System.out.println("(4) 40000 films");
					System.out.println("(5) Tous les films (~80000)");

					int choix_fichier = Clavier.lireInt();

					if (choix_fichier == 0) {
						break;
					} else if (choix_fichier == 1) {
						films = Initialisation.Base("Ressources/IMDbmoviesCUT100.tsv", t);
						break;
					} else if (choix_fichier == 2) {
						break;
					} else if (choix_fichier == 3) {
						films = Initialisation.Base("Ressources/IMDbmoviesCUT10000.tsv", t);
						break;
					} else if (choix_fichier == 4) {
						films = Initialisation.Base("Ressources/IMDbmoviesCUT40000.tsv", t);
						break;
					} else if (choix_fichier == 5) {
						films = Initialisation.Base("Ressources/IMDbmoviesFULL.tsv", t);
						break;
					}
				} while (true);
			} else if (choix_action == 2) {

				while (true) {
					System.out
							.println(
									"Quel type d'affichage? \n (1)Normal \n (2)Couleur \n (3)Stylisé \n (4)Stylisé Couleur");
					int c = Clavier.lireInt();
					if (c == 1) {
						Affichage.Normal(films);
						break;
					} else if (c == 2) {
						Affichage.Couleur(films);
						break;
					} else if (c == 3) {
						Affichage.Beau(films);
						break;
					} else if (c == 4) {
						Affichage.BeauCouleur(films);
						break;
					}
				}

			} else if (choix_action == 3) {

				do {

					System.out.println("Choisissez le tri que vous souhaitez effectuer : (Entrez votre choix) ");
					System.out.println("(1) Tri par année ");
					System.out.println("(2) Tri par genre ");
					System.out.println("(3) Tri par pays de production");
					System.out.println("(4) Tri par note");
					System.out.println("(5) Tri par durée");
					System.out.println("(6) Tri par langue");
					System.out.println("(7) Tri par scénariste");
					System.out.println("(8) Tri par réalisateur");

					int choix_tri = Clavier.lireInt();

					if (choix_tri == 0) {
						break;
					} else if (choix_tri == 1) {
						System.out.println("Entrez l'année");
						// Integer annee = Clavier.lireInt();
						break;
					} else if (choix_tri == 2) {
						System.out.println("Entrez le genre");
						// clavier.lire genre
						break;
					} else if (choix_tri == 3) {
						System.out.println("Entrez le pays de production");
						// clavier.lire pays
						break;
					} else if (choix_tri == 4) {
						System.out.println("Entrez la note");
						// clavier.lire note
						break;
					} else if (choix_tri == 5) {
						System.out.println("Entrez la durée");
						// clavier.lire duree
						break;
					} else if (choix_tri == 6) {
						System.out.println("Entrez le langue");
						// clavier.lire langue
						break;
					} else if (choix_tri == 7) {
						System.out.println("Entrez le scénariste");
						// clavier.lire scénariste
						break;
					} else if (choix_tri == 8) {
						System.out.println("Entrez le réalisateur");
						// clavier.lire réalisateur
						break;
					} else {
						System.out.println("Choix invalide");
					}
				} while (true);

			} else if (choix_action == 4) {

				do {

					System.out.println("Choisissez le filtre que vous souhaitez effectuer : (Entrez votre choix) ");
					System.out.println("(0) Retour ");
					System.out.println("(1) Filtre par année ");
					System.out.println("(2) Filtre par genre ");
					System.out.println("(3) Filtre par pays de production");
					System.out.println("(4) Filtre par note");
					System.out.println("(5) Filtre par durée");
					System.out.println("(6) Filtre par langue");
					System.out.println("(7) Filtre par scénariste");
					System.out.println("(8) Filtre par réalisateur");

					int choix_filtre = Clavier.lireInt();

					if (choix_filtre == 0) {
						break;
					} else if (choix_filtre == 1) {
						System.out.println("Entrez l'année");

						Integer annee = Clavier.lireInt();

						do {

							System.out.println("Choisissez votre filtre par année : (Entrez votre choix) ");
							System.out.println("(1) Cette année");
							System.out.println("(2) Après l'année");
							System.out.println("(3) Avant l'année");

							int choix_annee = Clavier.lireInt();

							if (choix_annee == 1) {
								films = Filtre.Annee(films, annee);
								break;
							} else if (choix_annee == 2) {
								films = Filtre.AnneeApres(films, annee);
								break;
							} else if (choix_annee == 3) {
								films = Filtre.AnneeAvant(films, annee);
								break;
							} else {
								System.out.println("Choix invalide");
							}

						} while (true);
						break;
					} else if (choix_filtre == 2) {
						System.out.println("Entrez le genre");
						String genre = Clavier.lireLigne();
						films = Filtre.Genre(films, genre);

						break;
					} else if (choix_filtre == 3) {
						System.out.println("Entrez le pays de prodcution");
						String pays = Clavier.lireLigne();
						films = Filtre.Pays(films, pays);

						break;
					} else if (choix_filtre == 4) {

						System.out.println("Entrez la note");

						Float note = Clavier.lireFloat();

						do {

							System.out.println("Choisissez votre filtre par note : (Entrez votre choix) ");
							System.out.println("(1) Cette note");
							System.out.println("(2) Plus que la note");
							System.out.println("(3) Moins que la note");

							int choix_note = Clavier.lireInt();

							if (choix_note == 1) {

								films = Filtre.Note(films, note);
								break;

							} else if (choix_note == 2) {
								films = Filtre.NoteApres(films, note);
								break;
							} else if (choix_note == 3) {
								films = Filtre.NoteAvant(films, note);
								break;
							} else {
								System.out.println("Choix invalide");
							}
						} while (true);
						break;

					} else if (choix_filtre == 5) {

						System.out.println("Entrez la durée (en minutes)");

						Integer duree = Clavier.lireInt();

						do {

							System.out.println("Choisissez votre filtre par durée : (Entrez votre choix) ");
							System.out.println("(1) Cette durée");
							System.out.println("(2) Plus que la durée");
							System.out.println("(3) Moins que la durée");

							int choix_durée = Clavier.lireInt();

							if (choix_durée == 1) {

								films = Filtre.Duree(films, duree);
								break;

							} else if (choix_durée == 2) {
								films = Filtre.DureeApres(films, duree);
								break;
							} else if (choix_durée == 3) {
								films = Filtre.DureeAvant(films, duree);
								break;
							} else {
								System.out.println("Choix invalide");
							}

						} while (true);
						break;

					} else if (choix_filtre == 6) {
						System.out.println("Entrez la langue");
						String langue = Clavier.lireLigne();
						films = Filtre.Langue(films, langue);

						break;
					} else if (choix_filtre == 7) {
						System.out.println("Entrez le scénariste");
						String scenariste = Clavier.lireLigne();
						films = Filtre.Scenariste(films, scenariste);

						break;
					} else if (choix_filtre == 8) {
						System.out.println("Entrez le réalisateur");
						String realisateur = Clavier.lireLigne();
						films = Filtre.Realisateur(films, realisateur);

						break;
					} else {
						System.out.println("Choix invalide");
					}
				} while (true);
			} else if (choix_action == 5) {

				System.out.println("Entrez le titre du film (ou une partie de celui-ci) : ");
				String titre = Clavier.lireLigne();
				Filtre.Titre(films, titre);
				
			} else if (choix_action == 6) {
				// sauvegarder une requette
			
			} else {
				System.out.println("Choix invalide");
			}
		} while (true);

	}
}
