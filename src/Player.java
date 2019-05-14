/*
    Menyimpan informasi tentang player seperti
    - barang yang dibawa
    - kesehatan

 */

import java.util.Scanner;

public class Player {
    int bahanBakar;
    int oksigen;
    int ketahanan;

    public Player(){
        bahanBakar = 100;
        oksigen = 100;
        ketahanan = 100;
    }

    boolean isSelesai = false;

    Planet planetAktif; //adegan tempat player berada

    /* barang yang dimiliki player*/
    Teknologi[] arrteknologi = new Teknologi[5];
    int jumTeknologi  = 0;

    Resource[] arrResource = new Resource[5];
    int jumResource = 0;


    public void tambahTeknologi(Teknologi oTeknologi) {
        arrteknologi[jumTeknologi] = oTeknologi;
        jumTeknologi++;
    }

    public void tambahResource(Resource oResource) {
        arrResource[jumResource] = oResource;
        jumResource++;
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
