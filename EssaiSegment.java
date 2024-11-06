public class EssaiSegment {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Veuillez fournir trois paramètres : extr1, extr2 et point.");
            return;
        }

        try {
            int extr1 = Integer.parseInt(args[0]);
            int extr2 = Integer.parseInt(args[1]);
            int point = Integer.parseInt(args[2]);

            Segment segment = new Segment(extr1, extr2);
            System.out.println(segment);
            System.out.println("Longueur du segment : " + segment.longueur());
            System.out.println("Le point " + point + (segment.contient(point) ? " appartient" : " n'appartient pas") + " au segment.");
        } catch (NumberFormatException e) {
            System.out.println("Tous les paramètres doivent être des entiers.");
        }
    }
}
