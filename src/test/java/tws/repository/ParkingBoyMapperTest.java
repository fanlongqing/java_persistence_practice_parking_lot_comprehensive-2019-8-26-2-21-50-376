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

import java.util.UUID;

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
    public void shouldAddEmployee(){
        ParkingBoy parkingBoy=new ParkingBoy();
        parkingBoy.setName("daae");
        parkingBoy.setAge(1);
        String id= UUID.randomUUID().toString();
        parkingBoy.setEmployeeID(id);
        //when
        //TODO插入数据测试用例
        int numbers= JdbcTestUtils.countRowsInTable(jdbcTemplate,"employee");
    }

}
