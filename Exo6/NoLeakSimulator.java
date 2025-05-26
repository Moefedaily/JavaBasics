package Exo6;

public class NoLeakSimulator {
    public static void main(String[] args) {
        
        for (int i = 0; i < 1000; i++) {
            byte[] block = new byte[1024 * 1024]; // 1 MB
            // Pas de stockage, le GC peut nettoyer
            System.out.println("Allocated " + (i + 1) + " MB");
             
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
