package Defanging_an_IP_Address;

public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");      // replace every instance of . with [.]
    }
}
