package entity.content.gallery;

import entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class PhotosGallery {

    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "collection_id")
    GalleryCollection collection;

    @ManyToOne
    @JoinColumn(name = "photo_id")
    Photo photo;
}
