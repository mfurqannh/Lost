import java.util.ArrayList;
import java.util.Scanner;

public class PilihanTambang extends Pilihan {
    //ArrayList <Resource> arrResource = new ArrayList<>();
    Planet oPlanet;
    Resource oResource;

    public PilihanTambang(String narasi){
        super(narasi);
    }

//    public void aksi(){}
    @Override
    public void aksi() {
        System.out.println("Di planet ini terdapat: "+oResource.deskripsi);
        System.out.println("Apakah ingin diambil?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilihan anda: ");
        int pilihan = sc.nextInt();

        if (pilihan == 1 ){
            oPlanet.oPlayer.tambahResource(oResource);
            oPlanet.oPlayer.bahanBakar-=5;
        }
    }

    public void tambahResource(Resource oResource) {
        this.oResource = oResource;
    }
}
