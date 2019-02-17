package dvdRental;
// Generated 16-ene-2019 9:57:05 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Store generated by hbm2java
 */
public class Store  implements java.io.Serializable {


     private Byte storeId;
     private Address address;
     private Staff staff;
     private Date lastUpdate;
     private String nombre;
     private Set staffs = new HashSet(0);
     private Set inventories = new HashSet(0);
     private Set customers = new HashSet(0);

    public Store() {
    }

	
    public Store(Address address, Staff staff, Date lastUpdate, String nombre) {
        this.address = address;
        this.staff = staff;
        this.lastUpdate = lastUpdate;
        this.nombre = nombre;
    }
    public Store(Address address, Staff staff, Date lastUpdate, String nombre, Set staffs, Set inventories, Set customers) {
       this.address = address;
       this.staff = staff;
       this.lastUpdate = lastUpdate;
       this.nombre = nombre;
       this.staffs = staffs;
       this.inventories = inventories;
       this.customers = customers;
    }
   
    public Byte getStoreId() {
        return this.storeId;
    }
    
    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getStaffs() {
        return this.staffs;
    }
    
    public void setStaffs(Set staffs) {
        this.staffs = staffs;
    }
    public Set getInventories() {
        return this.inventories;
    }
    
    public void setInventories(Set inventories) {
        this.inventories = inventories;
    }
    public Set getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set customers) {
        this.customers = customers;
    }




}


