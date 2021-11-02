package mapping.onetoonebi.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Items {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
   private String itemName1;
   private String itemName2;
   @OneToOne(cascade = CascadeType.ALL)
   @JsonBackReference
   private Customer customer;

    public Items() {
    }

    public Items(int id, String itemName1, String itemName2, Customer customer) {
        this.id = id;
        this.itemName1 = itemName1;
        this.itemName2 = itemName2;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName1() {
        return itemName1;
    }

    public void setItemName1(String itemName1) {
        this.itemName1 = itemName1;
    }

    public String getItemName2() {
        return itemName2;
    }

    public void setItemName2(String itemName2) {
        this.itemName2 = itemName2;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
