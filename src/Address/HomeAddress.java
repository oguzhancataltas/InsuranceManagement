package Address;

import Address.IAddress;

public class HomeAddress implements IAddress {
    @Override
    public String addAddress(String s) {
        String address = "Ev Adresim : " + s;
        return address;
    }
}
