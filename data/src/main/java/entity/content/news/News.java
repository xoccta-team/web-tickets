package entity.content.news;

import entity.content.ContentElement;
import entity.catalogs.NewsCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@NoArgsConstructor @AllArgsConstructor
public class News extends ContentElement {

    @Column
    String content;

    @ManyToOne
    @JoinColumn(name = "news_category_id")
    NewsCategory category;

}
