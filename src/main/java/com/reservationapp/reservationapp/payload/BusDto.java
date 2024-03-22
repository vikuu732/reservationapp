package com.reservationapp.reservationapp.payload;

import com.reservationapp.reservationapp.entity.Driver;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {

        private String busNumber;
        private String busType;
        private double price;
        private int totalSeats;
        private int availableSeats;

}
