public class AppleGadgetFactory implements GadgetFactory{
    @Override
    public Smartphone createSmartphone(Smartphone.SmartphoneSeries smartphoneSeries) {
        return new iPhone13Smartphone(smartphoneSeries);
    }

    @Override
    public Tablet createTablet(Tablet.TabletSeries tabletSeries) {
        return new iPadAirTablet(tabletSeries);
    }
}
