import java.util.ArrayList;
import java.util.Scanner;

public class Planet {

    public static Player oPlayer;
    String narasi;

    PilihanKeluar oPilihanKeluar;
    PilihanTambang oPilihanTambang;
    //PilihanLihatResource oPilihanLihatResource;
    PilihanLihatCargo oPilihanLihatKargo;
    //PilihanLihatCargo oPilihanLihatKargo;

    ArrayList <Pilihan> arrPilihan = new ArrayList<>();
    Resource oResource;

    public Planet(){
        oPilihanTambang = new PilihanTambang("Tambang resource");
        tambahPilihan(oPilihanTambang);
        /*oPilihanLihatResource = new PilihanLihatResource("Lihat resource");
        tambahPilihan(oPilihanLihatResource);*/
        oPilihanLihatKargo = new PilihanLihatCargo("Lihat Kargo");
        tambahPilihan(oPilihanLihatKargo);
        oPilihanKeluar = new PilihanKeluar("Keluar game");
        tambahPilihan(oPilihanKeluar);
    }

    public void tambahPilihan(Pilihan oPilihan){
        arrPilihan.add(oPilihan);
    }

    public void tambahResource(Resource oResource){ oPilihanTambang.tambahResource(oResource);}

    public void tambang(Resource oResource){

    }

    public void mainkan() {
        //print narasi dan pilihan
        System.out.println("Bahan Bakar: "+oPlayer.bahanBakar);
        System.out.println("Oksigen: "+oPlayer.oksigen);
        System.out.println("Ketahanan: "+oPlayer.ketahanan);
        //System.out.println();
        System.out.println(""); //spasi
        System.out.println(narasi);

        int i = 0;
        for (Pilihan pil : arrPilihan) {
            System.out.print(String.format("%d. %s \n", i + 1, pil.deskripsi));
            i++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Pilihan anda:");
        int pilihan = sc.nextInt();
        System.out.println(""); //spasi

        //eksekusi pilihan yang dipilih user
        arrPilihan.get(pilihan - 1).aksi();
    }


    public static void main(String[] args){
        Resource Fe = new Resource("Fe", "Besi");
        Planet p = new Planet();
        p.tambahResource(Fe);
        System.out.println(p.oResource.deskripsi);
    }
}
