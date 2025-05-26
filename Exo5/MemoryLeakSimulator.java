package Exo5;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakSimulator {
    private static List<byte[]> memoryLeakList = new ArrayList<>();    
    public static void main(String[] args) {
        simulateMemoryLeak();
    }
    
    public static void simulateMemoryLeak() {
        for (int i = 0; i < 1000; i++) {
            byte[] block = new byte[1024 * 1024]; // 1 MB
            memoryLeakList.add(block); // La référence est conservée
            System.out.println("Allocated " + (i + 1) + " MB");
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }} 
}
