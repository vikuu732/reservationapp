package com.reservationapp.reservationapp.entity;

import lombok.*;
import jakarta.persistence.*;


@Entity
@Data
@Table(name="routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", referencedColumnName = "id")
    private Bus bus;
    @Column(name="from_location")
    private String fromLocation;
    @Column(name="to_location")
    private String toLocation;
    @Column(name="from_date")
    private String fromDate;
    @Column(name="to_date")
    private String toDate;
    @Column(name="total_duration")
    private String totalDuration;
    @Column(name="from_time")
    private String fromTime;
    @Column(name="to_time")
    private String toTime;

    @Column(name="bus_id")
    private Long busId;

    //@OneToMany(mappedBy = "route", fetch = FetchType.LAZY)
    //private List<SubRoute> subRoutes;

    }

