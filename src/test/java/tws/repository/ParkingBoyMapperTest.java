package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.Employee;
import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingBoyMapperTest {
    @Autowired
    ParkingBoyMapper parkingBoyMapper;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @After
    public void teardown(){
        JdbcTestUtils.deleteFromTables(jdbcTemplate,"parkingboy");

    }
    @Test
    public void insertParkingBoy() {
        //given
        String id=UUID.randomUUID().toString();
        ParkingBoy parkingBoy=new ParkingBoy(id,"胡鑫",24);
        //when
        parkingBoyMapper.insert(parkingBoy);
        //then
        assertEquals(1,JdbcTestUtils.countRowsInTable(jdbcTemplate,"parkingBoy"));

    }

    @Test
    public void selectAllParkingBoys() {
        //given
        //String id=UUID.randomUUID().toString();
        jdbcTemplate.execute("insert into `parkingBoy` (`id`,`name`,`age`) values ('43','胡',12)");
        //jdbcTemplate.execute(" insert into `parkingBoy`(`id`,`name`,`age`)values (id,'崔',12)");
        //when
        List<ParkingBoy> parkingBoyList = parkingBoyMapper.getParkingBoy();
        //then
        assertEquals(1,parkingBoyList.size());
    }
@Test
    public void updateTest(){
        //given

    jdbcTemplate.execute("insert into `parkingBoy` (`id`,`name`,`age`) values ('43','胡',12)");
    ParkingBoy parkingBoy=new ParkingBoy();
    parkingBoy.setName("sd");
    //when
    parkingBoyMapper.update("43",parkingBoy);
    //then
    //assertEquals("43",parkingBoy.getEmployeeID());
    assertEquals("sd",parkingBoy.getName());
}
//    @Test
//    public void selectAllParkingDtos(){
//        //given
//        jdbcTemplate.execute("insert  into `parking_boy` (`employeeID`,`parkingBoyName`,`age`) values(2,'lunan',18)");
//        jdbcTemplate.execute("insert into `parking_lot` (`parkingLotID`,`capacity`,`availablePositionCount`,`employeeID`) values(6,1,1,2)");
//        //when
//        List<ParkingBoyDto> parkingBoyDtos = parkingBoyMapper.selectAllParkingDtos();
//        //then
//        assertEquals(1,parkingBoyDtos.size());
//    }


//    @Test
//    public void shouldAddEmployee(){
//        ParkingBoy parkingBoy=new ParkingBoy();
//        parkingBoy.setName("daae");
//        parkingBoy.setAge(1);
//        String id= UUID.randomUUID().toString();
//        parkingBoy.setEmployeeID(id);
//        //when
//        //TODO插入数据测试用例
//        int numbers= JdbcTestUtils.countRowsInTable(jdbcTemplate,"employee");
//    }

}
