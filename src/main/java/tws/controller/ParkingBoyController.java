package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Employee;
import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.repository.EmployeeMapper;
import tws.repository.ParkingBoyMapper;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/parkingBoy")
public class ParkingBoyController {

    @Autowired
    private ParkingBoyMapper parkingBoyMapper;

    @GetMapping("")
    public ResponseEntity<List<ParkingBoy>> getParkingBoyAll() {

        return ResponseEntity.ok(parkingBoyMapper.getParkingBoy());
    }
    @PostMapping("")
    public ResponseEntity<Employee> insert(@RequestBody ParkingBoy parkingBoy) {
       // return ResponseEntity.created(URI.create("/employees/" + parkingBoy.getEmployeeID())).body(parkingBoy);
        String id= UUID.randomUUID().toString();
        parkingBoy.setEmployeeID(id);
        parkingBoyMapper.insert(parkingBoy);
        return ResponseEntity.created(URI.create("/parkingBoy/"+id)).build();
    }
    @PatchMapping("/{id}")
    public ResponseEntity<ParkingBoy> updateParkingBoy(@PathVariable String id,@RequestBody ParkingBoy parkingBoy){
        parkingBoyMapper.update(id,parkingBoy);
        return ResponseEntity.ok(parkingBoy);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ParkingBoy> delete(@PathVariable String id){
        parkingBoyMapper.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{parkingBoyId}/{parkingLotId}")
    public ResponseEntity<String> insert(@PathVariable String parkingBoyId ,@PathVariable String parkingLotId){
        //System.out.println(parkingLot.getCapacity());
        parkingBoyMapper.manageLot(parkingBoyId,parkingLotId);
        return ResponseEntity.ok(parkingBoyId);
    }

    @GetMapping("/{id}/parkinglots")
    public ResponseEntity<List<ParkingLot>> getOneParkingBoyAllParkingLots(@PathVariable int id) {
        return ResponseEntity.ok(parkingBoyMapper.selectOneParkingBoyAllParkingLots(id));
    }



}
