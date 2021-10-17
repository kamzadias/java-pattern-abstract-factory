public class iPadAirTablet implements Tablet{

    public iPadAirTablet(TabletSeries tabletSeries){
        System.out.println("This tablet from the Apple tablet series called " + tabletSeries);
    }

    @Override
    public void getInfo() {
        System.out.println("iPad Air does more than a computer in simpler, more magical ways. " +
                "And now with more features and capabilities, it’s more versatile than ever. \n" +
                "With A14 Bionic, you have the power to bring your ideas to life. " +
                "Shoot a 4K video, then edit it right on iPad Air.");
    }
}
