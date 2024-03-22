package com.reservationapp.reservationapp.controller;

import com.reservationapp.reservationapp.entity.Bus;
import com.reservationapp.reservationapp.entity.Route;
import com.reservationapp.reservationapp.payload.BusDto;
import com.reservationapp.reservationapp.repository.BusRepository;
import com.reservationapp.reservationapp.repository.RouteRepository;
import com.reservationapp.reservationapp.service.BusService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {
    @Autowired
    private BusService busService;

    @Autowired
    private EntityManager entityManager;

    private BusRepository busRepository;
    @Autowired
    private RouteRepository routeRepository;


    //http:localhost:8080/api/v1/bus/add
    @PostMapping("/add")
    public ResponseEntity<String> addBus(@RequestBody BusDto busDto) throws ParseException {



        busService.addBus(busDto);
         return new ResponseEntity<>("Bus details added", HttpStatus.CREATED);


    }




}