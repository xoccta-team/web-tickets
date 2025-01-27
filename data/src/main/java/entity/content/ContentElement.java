package entity.content;

import entity.BaseEntity;
import entity.persons.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@MappedSuperclass
public class ContentElement extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "author_id")
    protected User author;

    @Column(name = "entity_deleted")
    protected Date deleted;

    @Column
    protected boolean archived = false;

    @Column
    protected String title;

}
