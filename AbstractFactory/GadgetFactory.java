public interface GadgetFactory {

    Smartphone createSmartphone(Smartphone.SmartphoneSeries smartphoneSeries);

    Tablet createTablet(Tablet.TabletSeries tabletSeries);
}
