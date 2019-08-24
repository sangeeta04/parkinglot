package com.skillenza.parkinglotjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class ParkingLotController {

	private final Logger log = LoggerFactory.getLogger(ParkingLotController.class);
			
	private static final String ENTITY_NAME = "parkinglots";

    private final ParkingLotRepository parkingLotRepository;
    
    public ParkingLotController(ParkingLotRepository parkingLotRepository)
    {
    	this.parkingLotRepository = parkingLotRepository;
    }
    
    @PostMapping("/parkings")
    public ResponseEntity<ParkingLot> createParkinglots(@RequestBody ParkingLot parkinglot) throws URISyntaxException {
        log.debug("REST request to save Parkinglots : {}", parkinglot);
        
        ParkingLot result = parkingLotRepository.save(parkinglot);
        return ResponseEntity.created(new URI("/api/parkings/" + result.getId()))
            .body(result);
    }
    
    @GetMapping("/parkings")
    public List<ParkingLot> getAllParkinglots() {
        log.debug("REST request to get all Parkinglots");
        return parkingLotRepository.findAll();
        }
}

