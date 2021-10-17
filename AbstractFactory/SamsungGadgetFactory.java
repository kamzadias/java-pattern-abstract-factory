public class SamsungGadgetFactory implements GadgetFactory{

    @Override
    public Smartphone createSmartphone(Smartphone.SmartphoneSeries smartphoneSeries) {
        return new GalaxyS21Smartphone(smartphoneSeries);
    }

    @Override
    public Tablet createTablet(Tablet.TabletSeries tabletSeries) {
        return new GalaxyTabS7Tablet(tabletSeries);
    }
}
