package entity.persons;

import entity.BaseEntity;
import entity.persons.access.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class User extends BaseEntity {

    @Column
    String username;

    @Column
    String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role;
}
