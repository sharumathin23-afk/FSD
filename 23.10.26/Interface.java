package Day6;

public class Interface {
    public static void main(String[] args) {
        HondaCity h = new HondaCity();
        h.BS6();
        h.DualDiscBreaks();
        h.AirBags();
    }
}
interface RTO {
    void BS6();
    void DualDiscBreaks();
    void AirBags();
}

class HondaCity implements RTO {

    void RootsHorn() {
        System.out.println("Roots Horn Method");
    }

    void SonyMediaPlayer() {
        System.out.println("Sony Media Player Method");
    }

    public void BS6() {
        System.out.println("BS6 emission Method");
    }

    public void DualDiscBreaks() {
        System.out.println("Dual Disc Brakes Method");
    }

    public void AirBags() {
        System.out.println("Airbags Method");
    }
}



