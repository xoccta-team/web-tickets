package entity.content.gallery;

import entity.catalogs.PhotosCategory;
import entity.content.ContentElement;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Photo extends ContentElement {

    @Column
    String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    PhotosCategory category;

}
