package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "sakila", catalog = "")
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id")
    private Object addressId;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "address2")
    private String address2;
    @Basic
    @Column(name = "district")
    private String district;
    @Basic
    @Column(name = "city_id")
    private Object cityId;
    @Basic
    @Column(name = "postal_code")
    private String postalCode;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "location")
    private Object location;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "city_id", nullable = false)
    private CityEntity cityByCityId;
    @OneToMany(mappedBy = "addressByAddressId")
    private Collection<CustomerEntity> customersByAddressId;
    @OneToMany(mappedBy = "addressByAddressId")
    private Collection<StaffEntity> staffByAddressId;
    @OneToMany(mappedBy = "addressByAddressId")
    private Collection<StoreEntity> storesByAddressId;

    public Object getAddressId() {
        return addressId;
    }

    public void setAddressId(Object addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Object getCityId() {
        return cityId;
    }

    public void setCityId(Object cityId) {
        this.cityId = cityId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
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
        AddressEntity that = (AddressEntity) o;
        return Objects.equals(addressId, that.addressId) && Objects.equals(address, that.address) && Objects.equals(address2, that.address2) && Objects.equals(district, that.district) && Objects.equals(cityId, that.cityId) && Objects.equals(postalCode, that.postalCode) && Objects.equals(phone, that.phone) && Objects.equals(location, that.location) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, address, address2, district, cityId, postalCode, phone, location, lastUpdate);
    }

    public CityEntity getCityByCityId() {
        return cityByCityId;
    }

    public void setCityByCityId(CityEntity cityByCityId) {
        this.cityByCityId = cityByCityId;
    }

    public Collection<CustomerEntity> getCustomersByAddressId() {
        return customersByAddressId;
    }

    public void setCustomersByAddressId(Collection<CustomerEntity> customersByAddressId) {
        this.customersByAddressId = customersByAddressId;
    }

    public Collection<StaffEntity> getStaffByAddressId() {
        return staffByAddressId;
    }

    public void setStaffByAddressId(Collection<StaffEntity> staffByAddressId) {
        this.staffByAddressId = staffByAddressId;
    }

    public Collection<StoreEntity> getStoresByAddressId() {
        return storesByAddressId;
    }

    public void setStoresByAddressId(Collection<StoreEntity> storesByAddressId) {
        this.storesByAddressId = storesByAddressId;
    }
}
