package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "film", schema = "sakila", catalog = "")
public class FilmEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private Object filmId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "release_year")
    private Object releaseYear;
    @Basic
    @Column(name = "language_id")
    private Object languageId;
    @Basic
    @Column(name = "original_language_id")
    private Object originalLanguageId;
    @Basic
    @Column(name = "rental_duration")
    private Object rentalDuration;
    @Basic
    @Column(name = "rental_rate")
    private BigDecimal rentalRate;
    @Basic
    @Column(name = "length")
    private Object length;
    @Basic
    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;
    @Basic
    @Column(name = "rating")
    private Object rating;
    @Basic
    @Column(name = "special_features")
    private Object specialFeatures;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;
    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "language_id", nullable = false)
    private LanguageEntity languageByLanguageId;
    @ManyToOne
    @JoinColumn(name = "original_language_id", referencedColumnName = "language_id")
    private LanguageEntity languageByOriginalLanguageId;
    @OneToMany(mappedBy = "filmByFilmId")
    private Collection<FilmActorEntity> filmActorsByFilmId;
    @OneToMany(mappedBy = "filmByFilmId")
    private Collection<FilmCategoryEntity> filmCategoriesByFilmId;
    @OneToMany(mappedBy = "filmByFilmId")
    private Collection<InventoryEntity> inventoriesByFilmId;

    public Object getFilmId() {
        return filmId;
    }

    public void setFilmId(Object filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Object releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Object getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Object languageId) {
        this.languageId = languageId;
    }

    public Object getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Object originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public Object getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Object rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Object getLength() {
        return length;
    }

    public void setLength(Object length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Object getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(Object specialFeatures) {
        this.specialFeatures = specialFeatures;
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
        FilmEntity that = (FilmEntity) o;
        return Objects.equals(filmId, that.filmId) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(releaseYear, that.releaseYear) && Objects.equals(languageId, that.languageId) && Objects.equals(originalLanguageId, that.originalLanguageId) && Objects.equals(rentalDuration, that.rentalDuration) && Objects.equals(rentalRate, that.rentalRate) && Objects.equals(length, that.length) && Objects.equals(replacementCost, that.replacementCost) && Objects.equals(rating, that.rating) && Objects.equals(specialFeatures, that.specialFeatures) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, title, description, releaseYear, languageId, originalLanguageId, rentalDuration, rentalRate, length, replacementCost, rating, specialFeatures, lastUpdate);
    }

    public LanguageEntity getLanguageByLanguageId() {
        return languageByLanguageId;
    }

    public void setLanguageByLanguageId(LanguageEntity languageByLanguageId) {
        this.languageByLanguageId = languageByLanguageId;
    }

    public LanguageEntity getLanguageByOriginalLanguageId() {
        return languageByOriginalLanguageId;
    }

    public void setLanguageByOriginalLanguageId(LanguageEntity languageByOriginalLanguageId) {
        this.languageByOriginalLanguageId = languageByOriginalLanguageId;
    }

    public Collection<FilmActorEntity> getFilmActorsByFilmId() {
        return filmActorsByFilmId;
    }

    public void setFilmActorsByFilmId(Collection<FilmActorEntity> filmActorsByFilmId) {
        this.filmActorsByFilmId = filmActorsByFilmId;
    }

    public Collection<FilmCategoryEntity> getFilmCategoriesByFilmId() {
        return filmCategoriesByFilmId;
    }

    public void setFilmCategoriesByFilmId(Collection<FilmCategoryEntity> filmCategoriesByFilmId) {
        this.filmCategoriesByFilmId = filmCategoriesByFilmId;
    }

    public Collection<InventoryEntity> getInventoriesByFilmId() {
        return inventoriesByFilmId;
    }

    public void setInventoriesByFilmId(Collection<InventoryEntity> inventoriesByFilmId) {
        this.inventoriesByFilmId = inventoriesByFilmId;
    }
}
