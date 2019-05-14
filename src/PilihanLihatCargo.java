import java.util.Scanner;

public class PilihanLihatCargo extends Pilihan{
    Planet oPlanet;

    public PilihanLihatCargo(String deskripsi){
        super(deskripsi);
    }

    @Override
    public void aksi(){
        lihatResource();
        System.out.println();
        lihatTeknologi();
        System.out.println();
        System.out.println("Pilihan tersedia");
        System.out.println("1. Manage Cargo");
        System.out.println("2. Kembali");
        System.out.print("Pilihan anda: ");
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();
        if (pilihan == 1){

        }else{
            return;
        }
    }

    public void lihatResource(){
        System.out.println("Resource");
        if (oPlanet.oPlayer.jumResource>0){
            for (int i=0;i<oPlanet.oPlayer.jumResource;i++){
                System.out.println(String.format("%d. %s",i+1,oPlanet.oPlayer.arrResource[i].deskripsi));
            }
        }else{
            System.out.println("Belum ada resource");
        }

    }

    public void lihatTeknologi(){
        System.out.println("Teknologi");
        if (oPlanet.oPlayer.jumTeknologi>0){
            for (int i=0;i<oPlanet.oPlayer.jumTeknologi;i++){
                System.out.println(String.format("%d. %s",i+1,oPlanet.oPlayer.arrteknologi[i].deskripsi));
            }
        }else{
            System.out.println("Pesawat belum terpasang teknologi");
        }

    }
}
