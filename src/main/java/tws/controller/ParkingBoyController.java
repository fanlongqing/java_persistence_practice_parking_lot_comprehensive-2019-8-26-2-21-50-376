package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Employee;
import tws.entity.ParkingBoy;
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

}
