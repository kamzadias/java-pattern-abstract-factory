public class GalaxyTabS7Tablet implements Tablet{

    public GalaxyTabS7Tablet(TabletSeries tabletSeries){
        System.out.println("This tablet from the Samsung tablet series called " + tabletSeries);
    }

    @Override
    public void getInfo() {
        System.out.println("The razor-sharp display, long-lasting battery2 " +
                "and expandable memory3 are just the beginning. " +
                "Add the redesigned S pen, which comes included, \n" +
                "and the optional keyboard4 and you've got \n" +
                "a tablet that lets you play harder and work smarter.");
    }
}
