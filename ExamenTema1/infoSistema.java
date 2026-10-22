public class infoSistema {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long mb = 1024 * 1024;
        System.out.println("Nucleos: " + rt.availableProcessors());
        System.out.println("Max, JVM: " + rt.maxMemory() / mb + "MB");
        System.out.println("Reservada: " + rt.totalMemory() / mb + "MB");
        System.out.println("Libre: " + rt.freeMemory() / mb + "MB");

    }
}