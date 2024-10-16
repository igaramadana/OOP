package UTS_3;

public class FormatOutput {
    public static void printHeader(String header) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println(" " + header);
        System.out.println("=".repeat(50));
    }

    public static void printSubHeader(String subHeader) {
        System.out.println("\n" + "-".repeat(40));
        System.out.println(" " + subHeader);
        System.out.println("-".repeat(40));
    }

    public static void printInfo(String info) {
        System.out.println("  • " + info);
    }

    public static void printSuccess(String message) {
        System.out.println("  ✓ " + message);
    }

    public static void printError(String message) {
        System.out.println("  ✗ " + message);
    }
}
