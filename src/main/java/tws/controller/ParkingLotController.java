package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/parkingLot")
public class ParkingLotController {
    @Autowired
    private ParkingLotMapper parkingLotMapper;
    @GetMapping("")
    public ResponseEntity<List<ParkingLot>> getParkingLot(){
        return  ResponseEntity.ok(parkingLotMapper.getParkingLot());

    }
    @PostMapping
    public ResponseEntity<ParkingLot> inset(ParkingLot parkingLot){
        String id= UUID.randomUUID().toString();
        parkingLot.setParkingLotID(id);
        //System.out.println(parkingLot.getCapacity());
        parkingLotMapper.insert(parkingLot);
        return ResponseEntity.created(URI.create("/parkingLot/"+id)).build();


    }
}
