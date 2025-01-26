package entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@MappedSuperclass
public class BaseCatalog extends BaseEntity {

    @Column
    protected String title;

    @Column(name = "short_title")
    protected String shortTitle;

    public String getTitle(boolean shortTitle) {
        if (shortTitle)
            return getShortTitle();
        return getTitle();
    }
}
