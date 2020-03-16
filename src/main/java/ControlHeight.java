public class ControlHeight {
    public static void main(String[] args) {
        final int height = 170;
        final int normaHeight = 160;
        final boolean parents = false;

        if ((parents == true) && (height < normaHeight)) {
            System.out.println("Ребёнок на отракцион проходит");
        } else if ((parents == false) && (height < normaHeight)) {
            System.out.println("Ребёнок на отракцион не проходит");
        } else if (height > normaHeight) {
            System.out.println("Ребёнок на отракцион проходит");
        }
    }
}
