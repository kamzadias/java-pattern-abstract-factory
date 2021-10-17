public class SamsungPhoneFactory implements PhoneFactory{

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }
}
