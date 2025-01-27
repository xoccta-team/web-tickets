package entity.catalogs;

import entity.BaseCatalog;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class PhotosCategory extends BaseCatalog {
}
