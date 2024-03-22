package com.reservationapp.reservationapp.service;
import com.reservationapp.reservationapp.entity.Bus;
import com.reservationapp.reservationapp.entity.Route;
import com.reservationapp.reservationapp.entity.SubRoute;
import com.reservationapp.reservationapp.payload.BusDto;
import com.reservationapp.reservationapp.payload.RouteDto;
import com.reservationapp.reservationapp.payload.SubRouteDto;
import com.reservationapp.reservationapp.repository.BusRepository;
import com.reservationapp.reservationapp.repository.RouteRepository;
import com.reservationapp.reservationapp.repository.SubRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BusService {

    @Autowired
    private BusRepository busRepository;


    public void addBus(BusDto busDto) {

        // Create Bus Entity
        Bus bus = new Bus();
        bus.setBusNumber(busDto.getBusNumber());
        bus.setBusType(busDto.getBusType());
        bus.setPrice(busDto.getPrice());
        bus.setTotalSeats(busDto.getTotalSeats());
        bus.setAvailableSeats(busDto.getAvailableSeats());



        Bus savedBus = busRepository.save(bus);

        }
    }


