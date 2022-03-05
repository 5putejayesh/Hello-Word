package src.model;

import java.util.Objects;

public class Customer {

    private long id;
    private String name;
    private int tier;

    public Customer(long id,String name,int tier){
        this.id=id;
        this.name=name;
        this.tier=tier;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && tier == customer.tier && name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tier);
    }
}