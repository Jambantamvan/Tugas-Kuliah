public class Lanterns {
    public static void main(String[] args) {
        // Pola 1
        atap();
        tengah();
        bawah();

        System.out.println();

        // Pola 2
        atap();
        tengah();
        bawah();
        atap();

        System.out.println();

        // Pola 3
        atap();
        dindingGanda();
        atap();
        atap();
    }

    public static void atap() {
        System.out.println("    *****    ");
        System.out.println("  *********  ");
        System.out.println("*************");
    }

    public static void tengah() {
        System.out.println("* | | | | | *");
    }

    public static void bawah() {
        System.out.println("*************");
    }

    public static void dindingGanda() {
        System.out.println("* | | | | | *");
        System.out.println("* | | | | | *");
    }
}
