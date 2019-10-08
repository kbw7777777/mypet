
package com.example.demo.ToDoItem;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Getter @Setter
@ToString
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ToDoItem")
public class ToDoItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(length = 20, nullable = false)
    private String title;
    private boolean done;

    
	
}
