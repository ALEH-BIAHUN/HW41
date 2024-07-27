package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer mileage;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum")
    private CarType type;
    @Column(name = "instructor_id")
    private Integer instructorId;
    @Column(name = "students_count")
    private Integer studentsCount;
    @Column(name = "all_price")
    private Integer allPrice;
    @Column(name = "price_per_trip")
    private Float pricePerTrip;
}