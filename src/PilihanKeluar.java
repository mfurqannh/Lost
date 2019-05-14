public class PilihanKeluar extends Pilihan{

    public PilihanKeluar(String deskripsi) {
        super(deskripsi);
    }

    @Override
    public void aksi(){
        System.out.println("Permainan dihentikan");
        System.exit(0);
    }

}
