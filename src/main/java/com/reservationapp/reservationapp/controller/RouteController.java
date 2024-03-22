package com.reservationapp.reservationapp.controller;

import com.reservationapp.reservationapp.entity.Route;
import com.reservationapp.reservationapp.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/route")
public class RouteController {
    @Autowired
    private RouteService routeService;
    @PostMapping("/{busId}")
    public ResponseEntity<Route> addRoute(@PathVariable long busId, @RequestBody Route route){
        Route r = routeService.createRoute(busId, route);
        return new ResponseEntity<>(r, HttpStatus.CREATED);
    }
}
