import java.util.ArrayList;
import java.util.Scanner;

public class jawabanAlgoNo3UAS {

    public static void main(String[] args) {
        int jum = 4;
        UAS1D myMessage = new UAS1D();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Message ID : ");
        myMessage.setMessageID(sc.nextLine());
        System.out.print("Masukkan Message Name : ");
        myMessage.setMessageName(sc.nextLine());
        ArrayList<String> context = new ArrayList<>();
        for (int index = 0; index < jum; index++) {
            System.out.print("Tambahkan context : ");
            context.add(sc.nextLine());
        }
        myMessage.setContext(context);
        //buatlah Method FindWords dalam ClassObject
        //untuk mencari kata dalam ArrayList Context
        // dan menampilkan posisi index-nya dalam ArrayList Context
        System.out.print("Kata yang dicari : ");
        String cari = sc.nextLine();
        System.out.println(myMessage.FindWords(context, cari));// output "Index ke 0 1 "
    }
}