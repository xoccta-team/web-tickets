package entity.content.gallery;

import entity.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class GalleryCollection extends BaseEntity {

    @Column
    String title;

    @OneToMany(mappedBy = "photosGallery", cascade = CascadeType.ALL, orphanRemoval = true)
    List<PhotosGallery> photos;
}
