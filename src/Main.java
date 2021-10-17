public class Main {

    public static void main(String[] args) {
        PhoneFactory factory = new SamsungPhoneFactory();

        Phone phone = factory.createPhone();
        phone.make();
    }
}
