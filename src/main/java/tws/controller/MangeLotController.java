package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.ParkingLot;
import tws.repository.ManageLotMapper;
import tws.repository.ParkingLotMapper;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/mangeLot")
public class MangeLotController {
    @Autowired
    private ManageLotMapper manageLotMapper;
    @GetMapping("/{id}")
    public ResponseEntity<List<ParkingLot>> getParkingLot(@PathVariable String id){
        return  ResponseEntity.ok(manageLotMapper.getParkingLot(id));

    }

    @PutMapping("/{parkingBoyId}/{parkingLotId}")
    public ResponseEntity<String> insert(@PathVariable String parkingBoyId ,@PathVariable String parkingLotId){
        //System.out.println(parkingLot.getCapacity());
        manageLotMapper.manageLot(parkingBoyId,parkingLotId);
        return ResponseEntity.ok(parkingBoyId);
    }

}
