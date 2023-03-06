package Address;

import Address.IAddress;

public class BusinessAddress implements IAddress {
    @Override
    public String addAddress(String s) {
        String address = "İş Adresim : " + s;
        return address;
    }
}
