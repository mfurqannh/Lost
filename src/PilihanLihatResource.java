import java.util.ArrayList;
import java.util.Scanner;

public class PilihanLihatResource extends Pilihan{
    Planet oPlanet;

    public PilihanLihatResource(String deskripsi) {
        super(deskripsi);
    }

    @Override
    public void aksi(){
        for (int i=0;i<oPlanet.oPlayer.jumResource;i++){
            System.out.println(String.format("%d. %s",i+1,oPlanet.oPlayer.arrResource[i].deskripsi));
        }
        System.out.println(String.format("99. %s","Hanya lihat, tidak menggunakan barang"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan anda?");
        int pilihan = sc.nextInt();
        if (pilihan!=99) {
            //return(arrBarang.get(pilihan-1));
        }else {
            //return null;
        }
    }
}
