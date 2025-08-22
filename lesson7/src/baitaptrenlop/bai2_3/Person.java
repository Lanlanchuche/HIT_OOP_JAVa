package baitaptrenlop.bai2_3;

public class Person {
    private Address address;

    public Person() {
    }

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void nhap(){
        address = new Address();
        address.nhap();

    }

    @Override
    public String toString() {
        return "Dia chi: "+ address ;
    }
}
