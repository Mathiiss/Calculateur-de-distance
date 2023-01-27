public class Principal {

    private static double latitude1;
    private static double longitude1;
    private static double latitude2;
    private static double longitude2;
    private static double dist;
    private static double dist_result;

    public static void main(String[] args) {
        MyInterface frame = new MyInterface(); // création de l'interface
        frame.setVisible(true); // Met l'interface visible

        latitude1 = Double.parseDouble(args[0]); // recupère les donnée émis par la console,
        longitude1 = Double.parseDouble(args[1]);// puis transforme la chaine de caractère
        latitude2 = Double.parseDouble(args[2]); // en double puis la stock dans une varible
        longitude2 = Double.parseDouble(args[3]);

        // exécute la fonction de calcul de distance grâce à Haversine
        dist = Haversine.distance(latitude1, longitude1, latitude2, longitude2);

        // arrondi a 2 chiifre après la virgule
        dist_result = Math.round(dist * 100.0) / 100.0;

        // affiche le message
        System.out.println("Distance calculee :" + dist_result + " km");

    }
}
