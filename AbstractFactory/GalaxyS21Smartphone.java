public class GalaxyS21Smartphone implements Smartphone{

    public GalaxyS21Smartphone(SmartphoneSeries smartphoneSeries){
        System.out.println("This smartphone from the Samsung smartphone series called " + smartphoneSeries);
    }

    @Override
    public void getInfo() {
        System.out.println("Super high-resolution camera and 8K video." +
                "Galaxy's fastest processor yet." +
                "All-day intelligent battery." +
                "A striking new design.");
    }
}
