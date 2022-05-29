import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
        // Class Buffered menjadi variabel baru bernama kata
        int a;
        System.out.println("Jumlah Nama Yang Di Inputkan : ");
        a = Integer.parseInt(kata.readLine());

        String[] Array;
        Array = new String[a];
        String temp;
        Scanner input = new Scanner(System.in);

        // Penginputan nama
        for(int i=0; i<a; i++){
            System.out.println("Nama " + (i+1) + " adalah : ");
            Array[i]=input.next();
        }

        // Proses penyortingan
        for(int x=1;x<a;x++){
            for(int y=0;y<a;y++){
                if(Array[y].compareTo(Array[y+1])>0){
                    temp = Array[y];
                    Array[y]=Array[y+1];
                    Array[y+1] = temp;
                }
            }
        }

        // Output pengurutan nama
        for(String s : Arrays.asList("", "Urutannya : ")){
            System.out.println(s);
        }

        for(int i=0;i<a;i++){
            System.out.println((i+1)+". "+ Array[i]);
        }

        //Output dari jumlah siswa
        System.out.println("Jumlah Siswa : " + a);
        System.out.println("Nama 2 terbawah : " + Array[a-2]);
        System.out.println("Nama 2 teratas : " + Array[1]);
    }
}
