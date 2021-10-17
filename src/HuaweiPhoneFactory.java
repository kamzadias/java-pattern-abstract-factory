public class HuaweiPhoneFactory implements PhoneFactory{

    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}
