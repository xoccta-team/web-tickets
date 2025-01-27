package entity.persons.access;

import entity.BaseCatalog;
import entity.BaseEntity;
import enums.AccessType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccessContext extends BaseCatalog {

    @Column(name = "element")
    String elementName;

    @Column(name = "access_type")
    AccessType accessType;
}
