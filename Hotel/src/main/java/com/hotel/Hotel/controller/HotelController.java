package com.hotel.Hotel.controller;

import java.util.List;

import com.hotel.Hotel.exception.ResourceNotFoundException;
import com.hotel.Hotel.model.Hotel;
import com.hotel.Hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository1;


    @GetMapping("/hotels")
    public List<Hotel> getAllHotels(){

        System.out.println(hotelRepository1.findAll());
        return hotelRepository1.findAll();
    }

    @PostMapping("/hotels")
    public Hotel createHotel(@RequestBody Hotel hotel)
    {
        return hotelRepository1.save(hotel);
    }


    @GetMapping("/hotels/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable int id){
        Hotel hotel = hotelRepository1.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel Not Exist with id : " + id));
        return ResponseEntity.ok(hotel);
    }

    @PutMapping("/hotels/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable int id,@RequestBody Hotel hotelDetails){
        Hotel hotel = hotelRepository1.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel Not Exist with id : " + id));

        hotel.setName(hotelDetails.getName());
        hotel.setAddress(hotelDetails.getAddress());
        hotel.setPh(hotelDetails.getPh());
        hotel.setEmail(hotelDetails.getEmail());
        hotel.setRating(hotelDetails.getRating());

        Hotel updatedHotel = hotelRepository1.save(hotel);
        return ResponseEntity.ok(updatedHotel);
    }
}
