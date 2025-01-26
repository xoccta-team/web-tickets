package entity.persons;

import entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class PersonalData extends BaseEntity {

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "middle_name")
    String middleName;

    @Column
    String phone;

    @Column(name = "email")
    String mail;

    public String getFullName(boolean initials) {
        List<String> result = new ArrayList<>();
        if (StringUtils.isNotBlank(getLastName()))
            result.add(getLastName());
        if (StringUtils.isNotBlank(getFirstName()))
            result.add(getFirstName());
        if (StringUtils.isNotBlank(getMiddleName()))
            result.add(getMiddleName());
        if (initials)
            return result.stream()
                    .map(t -> String.valueOf(t.charAt(0)))
                    .collect(Collectors.joining(" "));
        return String.join(" ", result);
    }
}
