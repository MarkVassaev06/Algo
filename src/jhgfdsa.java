import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class X extends Thread {
    @Override
    public void run() {

        ArrayList<Long> integers1 = new ArrayList<>();
        ArrayList<Long> integers2 = new ArrayList<>();
        ArrayList<Long> integers3 = new ArrayList<>();
        while (true) {
            for (long aa = -1000000; aa < 112012012; aa++) {

                System.out.println(aa);
                integers1.add(aa); integers2.add(aa); integers3.add(aa);

            }
        }
    }
}

public class jhgfdsa {
    public static void main(String[] args) {
        X x = new X();
        while (true) {
            x.run();
        }
    }
}
