public class iPhone13Smartphone implements Smartphone{

    public iPhone13Smartphone(SmartphoneSeries smartphoneSeries){
        System.out.println("This smartphone from the Apple series called " + smartphoneSeries);
    }

    @Override
    public void getInfo() {
        System.out.println("New Ultra Wide camera reveals more detail in the dark areas of your photos. " +
                "New Wide camera captures 47% more light for better photos and videos. \n" +
                "New sensor-shift optical image stabilization keeps shots steady even when you’re not");
    }
}
