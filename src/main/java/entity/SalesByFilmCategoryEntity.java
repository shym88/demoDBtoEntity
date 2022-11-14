package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "sales_by_film_category", schema = "sakila", catalog = "")
public class SalesByFilmCategoryEntity {
    @Basic
    @Column(name = "category")
    private String category;
    @Basic
    @Column(name = "total_sales")
    private BigDecimal totalSales;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesByFilmCategoryEntity that = (SalesByFilmCategoryEntity) o;
        return Objects.equals(category, that.category) && Objects.equals(totalSales, that.totalSales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, totalSales);
    }
}
