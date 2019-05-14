public class PilihanPindahPlanet extends Pilihan {
    Planet planetTujuan;

    public PilihanPindahPlanet(Planet PlanetTujuan, String narasi){
        super(narasi);
        this.planetTujuan = PlanetTujuan;
    }

    @Override
    public void aksi() {
        //mengganti planet aktif player dengan planet yang akan dikuncjungi
        planetTujuan.oPlayer.planetAktif = planetTujuan;
    }
}
