import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] deskripsi = new String[10], kodeMK = new String[10], matkul = new String[10], dosen = new String[10], deadline = new String[10], keterangan = new String[10], status = new String[10];
        int[] tingkatKesulitan = new int[10], hariDeadline = new int[10];
        double[] prioritas = new double[10];

        i = 0;
        while (true) {
            Perintah = input.nextLine();
            if (Perintah == "---") {
            }
            if (Perintah == "Add task") {
                deskripsi = input.nextLine();
                kodeMK = input.nextLine();
                matkul = input.nextLine();
                dosen = input.nextLine();
                deadline = input.nextLine();
                keterangan = input.nextLine();
                tingkatKesulitan = Integer.parseInt(input.nextLine());
                hariDeadline = Integer.parseInt(input.nextLine());
                status = input.nextLine();
                prioritas[i] = tingkatKesulitan[i] * 2 + 10 - hariDeadline[i];
                i = i + 1;
            }
        }
    }
}
