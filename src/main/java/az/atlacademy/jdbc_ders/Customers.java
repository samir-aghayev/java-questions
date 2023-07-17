package az.atlacademy.jdbc_ders;

import java.util.Objects;

public class Customers {
    private String first_name;
    private String last_name;
    private String address;
    private String email;

    public Customers(String first_name, String last_name, String address, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customers customers)) return false;
        return Objects.equals(getFirst_name(), customers.getFirst_name()) && Objects.equals(getLast_name(), customers.getLast_name()) && Objects.equals(getAddress(), customers.getAddress()) && Objects.equals(getEmail(), customers.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst_name(), getLast_name(), getAddress(), getEmail());
    }

    @Override
    public String toString() {
        return "Customers{first_name='%s', last_name='%s', address='%s', email='%s'}".formatted(first_name, last_name, address, email);
    }
}
