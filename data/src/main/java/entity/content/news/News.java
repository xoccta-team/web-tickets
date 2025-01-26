package entity.content.news;

import entity.content.ContentElement;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class News extends ContentElement {

    @Column(name = "photo")
    String photoLink;

    @Column
    String content;

}
