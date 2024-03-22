package com.reservationapp.reservationapp.entity;
import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@Table(name = "bus")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="bus_number")
    private String busNumber;
    @Column(name="bus_type")
    private String busType;
    @Column(name="price")
    private double price;
    @Column(name="total_seats")
    private int totalSeats;
    @Column(name = "available_seats")
    private int availableSeats;

    //@OneToOne(mappedBy = "bus", fetch = FetchType.LAZY)
    private Route route;

}

