package com.reservationapp.reservationapp.service;

import com.reservationapp.reservationapp.entity.Bus;
import com.reservationapp.reservationapp.entity.Route;
import com.reservationapp.reservationapp.exception.ResourceNotFound;
import com.reservationapp.reservationapp.repository.BusRepository;
import com.reservationapp.reservationapp.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {
    @Autowired
    private RouteRepository routeRepository;
    @Autowired
    private BusRepository busRepository;

    public Route createRoute(long busId, Route route) {
        busRepository.findById(busId).orElseThrow(
                () -> new ResourceNotFound("Bus not added")
        );

        Route r = routeRepository.findByBusId(route.getBusId());

        if(r!=null){
            throw new ResourceNotFound("Route was already added");
        }

        if(r==null){
            routeRepository.save(route);
            return route;
        }
        return null;
    }



}
