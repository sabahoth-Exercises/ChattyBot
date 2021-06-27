
import java.util.Scanner;


public class Main {

    public static void main (String[]args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Bonjour ou Bonsoir!! Cela depends de votre fuseau horaire." +
                "\nVous etes le(la) bienvenu(e) dans mon petit jeu." +
                "\n\nMon nom est Zut! Brunnotte Wasaulua est ma creatrice. Coucou, Bruna!\n" +
                "Pourriez-vous me rappeler votre nom? Soyez courtois!\n(Ecrivez votre nom puis entrez sur la touche enter!)" );

        String st = sc.nextLine();
        System.out.println( "Heureux de faire votre connaissance, " + st + "!" +
                "\n\nPour vous montrer combien suis un genie, je devinerai votre age.\nJ'ai simplement besoin de quelques indices:"
                +
                "\nDites-moi le reste de la division de votre age respectivement par 3, 5 et 7.\nSoyez sans crainte. Ma creatrice n'a pas prevu que j'enregistre votre age."
                +
                "\nEcrivez des nombres entiers, je ne comprends pas encore les nombres decimaux. Je viens a peine de naitre!\n"
                +
                "Vous l'avez surement aussi remarque, je ne comprends pas aussiles accents de la langue francaise. Supportez- moi comme ca!"
                +
                "\n\nVeuillez entre les restes de vos divisions sucessivement\n(Soit vous les separez par un espace, soit vous entrez le premier puis vous appuyez sur la touche enter, ainsi de suite):" );

        int st1 = sc.nextInt();
        int st2 = sc.nextInt();
        int st3 = sc.nextInt();

        int age = (st1 * 70 + st2 * 21 + st3 * 15) % 105;

        System.out.println( "Si jamais ma reponse est fausse, ce que vous etes nul(le) en math! Reprenez vos divisions."
                + "\n\nVous avez " + age + " ans!\nVous ne trouvez pas que la programmation est magnifique?" +
                "\nQue voulez-vous savoir d'autres?"+
                "\n1. Je peux compter de zero au nombre de votre choix,"+
                "\n2. On peux jouer aux deviettes,"+
                "\n3. Je peux arreter de vous deranger!\n"+
                "Qu'aimeriez-vous choisir?");
        int st4 = sc.nextInt();

        switch (st4) {
            case 1 -> compter();
            case 2 -> devinette();
            case 3 -> auRevoir();
            default -> System.out.println( "Erreur, mauvais chiffre choisi!!\n" +
                    "\nJe vais devoir vous laisser. Brune dois m'ajouter certaines fonctionnalites!" );
        }
    }

    private static void auRevoir() {
        System.out.println("C'est tout pour aujourd'hui!\nAu revoir!");
    }

    private static void devinette() {
        Scanner sc = new Scanner( System.in );
        System.out.println("Vous avez choisi les devinettes!\n"+
                "Je vais generer un nombre entre 0 et 100. Vous tenterez de le deviner."+
                "\nC'est parti!");
        final int min= 0;
        final int max = 100;
        int dev = (int) (Math.random() * (max - min)+ min);
        System.out.println("J'ai un nombre! A vous de le deviner!\n");
        int st6 = sc.nextInt();
        while(st6 != dev){
            if(dev > st6) {
                System.out.println( "Sorry, ce n'est pas la bonne reponse!!\nMon nombre est plus grand que ca!\nReessayez!" );
                st6 = sc.nextInt();
            }else {
                System.out.println( "Sorry, ce n'est pas la bonne reponse!!\nMon nombre est plus petit que ca!\nReessayez!" );
                st6 = sc.nextInt();
            }
        }
        if(st6 == dev){
            System.out.println("Woooow, Felicitations!!Vous etes intelligent(es)!\n");
        }
        System.out.println("\nUne fois de plus:\n1. Je peux compter de zero au nombre de votre choix,"+
                "\n2. On peux jouer aux deviettes,"+
                "\n3. Je peux arreter de vous deranger!\n"+
                "\nQu'aimeriez-vous choisir?");
        int st4 = sc.nextInt();

    }

    private static void compter() {
        Scanner sc = new Scanner( System.in );
        System.out.println("Okay, entrez n\'importe quel nombre et je vous direz s\'il est paire ou\n" +
                "impaire et aussi je compterai de 0 a ce nombre la!!"
        );
        int st5 = sc.nextInt();
        while(st5 < 0){
            System.out.println("Attention, ce nombre est negatif! Choisissez un nombre superieur a 0!");
            st5 = sc.nextInt();
        }
        if ((st5 % 2) == 0){
            System.out.println("Vous avez entre "+st5+" , il est paire!");
        }else{System.out.println("Vous avez entre "+st5+" , il est impaire!");}
        System.out.println("Maintenant je vais compter de zero 0 a "+st5+":\n");
        for(int i = 0; i <= st5; i++){
            System.out.println(i);

        }
        System.out.println("\nUne fois de plus:\n1. Je peux compter de zero au nombre de votre choix,"+
                "\n2. On peux jouer aux deviettes,"+
                "\n3. Je peux arreter de vous deranger!\n"+
                "\nQu'aimeriez-vous choisir?");
        int st4 = sc.nextInt();

    }

    }



