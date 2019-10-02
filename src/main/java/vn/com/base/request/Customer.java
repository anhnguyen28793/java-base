package vn.com.base.request;

public class Customer {
    private long id;
    private String customerId;
    private String name;
    private String gender;

    public Customer() {
        super();
    }

    public Customer(long id, String customerId, String name, String gender) {
        this.id = id;
        this.customerId = customerId;
        this.name = name;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
