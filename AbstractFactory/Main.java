import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GadgetFactory appleGadgetFactory = new AppleGadgetFactory();
        GadgetFactory samsungGadgetFactory = new SamsungGadgetFactory();

        Smartphone iPhone13 = appleGadgetFactory.createSmartphone(Smartphone.SmartphoneSeries.iPhone);
        iPhone13.getInfo();
        System.out.println("-------------------------------------");

        Smartphone galaxyS21 = samsungGadgetFactory.createSmartphone(Smartphone.SmartphoneSeries.GalaxyS);
        galaxyS21.getInfo();

        System.out.println("*****************************************************************************************");

        Tablet iPadAir = appleGadgetFactory.createTablet(Tablet.TabletSeries.iPad);
        iPadAir.getInfo();
        System.out.println("-------------------------------------");

        Tablet galaxyTabS7 = samsungGadgetFactory.createTablet(Tablet.TabletSeries.GalaxyTab);
        galaxyTabS7.getInfo();
    }
}
