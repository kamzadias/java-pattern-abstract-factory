public class iPhoneFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new iPhone();
    }
}
