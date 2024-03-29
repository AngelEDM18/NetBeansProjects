package dvdRental;
// Generated 31-ene-2019 10:38:22 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rental generated by hbm2java
 */
public class Rental  implements java.io.Serializable {


     private Integer rentalId;
     private Customer customer;
     private Inventory inventory;
     private Staff staff;
     private Date rentalDate;
     private Date returnDate;
     private Date lastUpdate;
     private Set payments = new HashSet(0);

    public Rental() {
    }

	
    public Rental(Customer customer, Inventory inventory, Staff staff, Date rentalDate, Date lastUpdate) {
        this.customer = customer;
        this.inventory = inventory;
        this.staff = staff;
        this.rentalDate = rentalDate;
        this.lastUpdate = lastUpdate;
    }
    public Rental(Customer customer, Inventory inventory, Staff staff, Date rentalDate, Date returnDate, Date lastUpdate, Set payments) {
       this.customer = customer;
       this.inventory = inventory;
       this.staff = staff;
       this.rentalDate = rentalDate;
       this.returnDate = returnDate;
       this.lastUpdate = lastUpdate;
       this.payments = payments;
    }
   
    public Integer getRentalId() {
        return this.rentalId;
    }
    
    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Inventory getInventory() {
        return this.inventory;
    }
    
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    public Date getRentalDate() {
        return this.rentalDate;
    }
    
    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }
    public Date getReturnDate() {
        return this.returnDate;
    }
    
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set payments) {
        this.payments = payments;
    }




}


