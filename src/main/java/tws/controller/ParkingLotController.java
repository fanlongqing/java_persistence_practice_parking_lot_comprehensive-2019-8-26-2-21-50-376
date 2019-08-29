package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity<ParkingLot> insert(@RequestBody ParkingLot parkingLot){
        String id= UUID.randomUUID().toString();
        parkingLot.setParkingLotID(id);
        //System.out.println(parkingLot.getCapacity());
        parkingLotMapper.insert(parkingLot);
        return ResponseEntity.created(URI.create("/parkingLot/"+id)).build();
    }

}
