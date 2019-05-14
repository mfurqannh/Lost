/*
    Menyimpan informasi tentang player seperti
    - barang yang dibawa
    - kesehatan

 */

import java.util.Scanner;

public class Player {
    int bahanBakar = 100;
    int oksigen = 100;
    int ketahanan = 100;

    boolean isSelesai = false;
    Planet adeganAktif; //adegan tempat player berada

    /* barang yang dimiliki player*/
    Teknologi[] arrteknologi = new Teknologi[10];
    int jumTeknologi  = 0;


//    //jika dipanggil akan lengkapi dengan nim, nama dan tulisan saya berjanji tdk akan dst..
//    public void printIdentitas() {
//        System.out.println("Identitas");
//        System.out.println("Azizah Nurul Khoirunnisa"+
//                "\n1604125" +
//                "\nSaya bernjanji tidak berlaku curang dan/atau membantu orang lain berbuat curang ");
//    }


    public void tambahTeknologi(Teknologi oTeknologi) {
        arrteknologi[jumTeknologi] = oTeknologi;
        jumTeknologi++;
    }

    /*
        cetak isi barang yang dimiliki player
        return adalah objek barang yang dipilih user untuk digunakan
        jika user tidak jadi memilih maka akan return null
        hati-hati dapat menyebabkan NullPointer exception jadi selalu cek return
     */

    public Teknologi pilihBarang() {
        System.out.println("Teknologi yang sudah dimiliki");
        for (int i=0;i<jumTeknologi;i++) {
            System.out.println(String.format("%d. %s",i+1,arrteknologi[i].deskripsi));
        }
        System.out.println(String.format("99. %s","Hanya lihat, tidak menggunakan barang"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan anda?");
        int pilihan = sc.nextInt();
        if (pilihan!=99)
            return(arrteknologi[pilihan-1]);
        else
            return null;
    }

    public static void main(String[] args) {
        //untuk test
        Teknologi permen = new Teknologi("p_kopiko","Permen Kopiko");
        Teknologi bolpen = new Teknologi("bolpen","Bolpen");
        Player p = new Player();
        p.tambahTeknologi(permen);
        p.tambahTeknologi(bolpen);
        Teknologi barangPilih = p.pilihBarang(); //
        if (barangPilih!=null) {
            System.out.println(barangPilih.deskripsi);
        }
    }
}
