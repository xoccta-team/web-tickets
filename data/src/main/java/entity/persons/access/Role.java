package entity.persons.access;

import entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Role extends BaseEntity {

    @Column
    String name;

    @ManyToMany
    @JoinTable(name = "access_context_to_role",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = " context_id", referencedColumnName = "id"))
    Set<AccessContext> contexts;
}
