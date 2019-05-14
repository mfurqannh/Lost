public class GameEngine {
    Player oPlayer;

    public GameEngine(){
        oPlayer = new Player();
        Planet.oPlayer = oPlayer;
        oPlayer.tambahTeknologi(new Teknologi("radar", "Teleskop"));
    }

    public void mulai(){
        do {
            oPlayer.planetAktif.mainkan();
        }while (!oPlayer.isSelesai);
    }

    public static void main(String[] args){
        Planet PlanetA = new Planet();
        Planet PlanetB = new Planet();

        Pilihan pilihanPlanetA = new PilihanPindahPlanet(PlanetA, "Menuju Planet A");
        Pilihan pilihanPlanetB = new PilihanPindahPlanet(PlanetB, "Menuju Planet B");

        PlanetA.narasi = "Budi seorang astronot asal Indonesia, tiba-tiba berada di antah berantah di tengah luar angkasa " +
                "yang luas, cobalah bertahan hidup dan kembali ke Bumi!";

        PlanetA.tambahPilihan(pilihanPlanetB);

        PlanetB.narasi = "Budi tiba di Planet B";
        PlanetB.tambahResource(new Resource("Fe", "Besi"));
        PlanetB.tambahPilihan(pilihanPlanetA);


        //init game engine
        GameEngine ge = new GameEngine();
        ge.oPlayer.planetAktif = PlanetA;
        ge.mulai();
    }
}
