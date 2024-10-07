package net.empsys.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String description;
    private Date datetime;
    private Double salary;
    private Integer highlighted;
    private String image;
}
