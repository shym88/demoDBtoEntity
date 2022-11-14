package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "store", schema = "sakila", catalog = "")
public class StoreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "store_id")
    private Object storeId;
    @Basic
    @Column(name = "manager_staff_id")
    private Object managerStaffId;
    @Basic
    @Column(name = "address_id")
    private Object addressId;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "storeByStoreId")
    private Collection<CustomerEntity> customersByStoreId;
    @OneToMany(mappedBy = "storeByStoreId")
    private Collection<InventoryEntity> inventoriesByStoreId;
    @OneToMany(mappedBy = "storeByStoreId")
    private Collection<StaffEntity> staffByStoreId;
    @ManyToOne
    @JoinColumn(name = "manager_staff_id", referencedColumnName = "staff_id", nullable = false)
    private StaffEntity staffByManagerStaffId;
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id", nullable = false)
    private AddressEntity addressByAddressId;

    public Object getStoreId() {
        return storeId;
    }

    public void setStoreId(Object storeId) {
        this.storeId = storeId;
    }

    public Object getManagerStaffId() {
        return managerStaffId;
    }

    public void setManagerStaffId(Object managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Object getAddressId() {
        return addressId;
    }

    public void setAddressId(Object addressId) {
        this.addressId = addressId;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreEntity that = (StoreEntity) o;
        return Objects.equals(storeId, that.storeId) && Objects.equals(managerStaffId, that.managerStaffId) && Objects.equals(addressId, that.addressId) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, managerStaffId, addressId, lastUpdate);
    }

    public Collection<CustomerEntity> getCustomersByStoreId() {
        return customersByStoreId;
    }

    public void setCustomersByStoreId(Collection<CustomerEntity> customersByStoreId) {
        this.customersByStoreId = customersByStoreId;
    }

    public Collection<InventoryEntity> getInventoriesByStoreId() {
        return inventoriesByStoreId;
    }

    public void setInventoriesByStoreId(Collection<InventoryEntity> inventoriesByStoreId) {
        this.inventoriesByStoreId = inventoriesByStoreId;
    }

    public Collection<StaffEntity> getStaffByStoreId() {
        return staffByStoreId;
    }

    public void setStaffByStoreId(Collection<StaffEntity> staffByStoreId) {
        this.staffByStoreId = staffByStoreId;
    }

    public StaffEntity getStaffByManagerStaffId() {
        return staffByManagerStaffId;
    }

    public void setStaffByManagerStaffId(StaffEntity staffByManagerStaffId) {
        this.staffByManagerStaffId = staffByManagerStaffId;
    }

    public AddressEntity getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(AddressEntity addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }
}
