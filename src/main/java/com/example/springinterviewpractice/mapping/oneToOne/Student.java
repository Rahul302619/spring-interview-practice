package com.example.springinterviewpractice.mapping.oneToOne;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jpa_student")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    /*
    * 1) If we use OneToOne then it will create foreign key in the mentioned table
    *   like in this case in student table with column name office_laptop_id
    * 2) If we use OneToOne in both entity than both entity have each other foreign key column
    *    in student it will be office_laptop_id and in Laptop it will be student_id
    * 3) mappedBy -> If we don't want that both table should maintain FK then in that case we can use mappedBy
    *     and the entity in which we are using mappedBy will give ownership to other entity to maintain the FK
    *     in this case we are giving ownership to laptop entity.
    * 4) JoinColumn -> We can also provide the custom name to the column by using JoinColumn and this annotation should
    *       be used in the FK owner entity so in this case it should be inside laptop entity.
    * 5) cascade - Always use cascadeType on the ownership side in this case Laptop entity is the owner.
    * */

    @OneToOne(mappedBy = "student007")
    private Laptop officeLaptop;
}
