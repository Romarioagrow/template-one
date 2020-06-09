package rio.templates.one.templateone.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "main_entity")
@NoArgsConstructor
public class MainEntity {
    @Id
    private Integer id;
}
