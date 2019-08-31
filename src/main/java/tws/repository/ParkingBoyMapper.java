package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;

import java.util.List;

@Mapper
public interface ParkingBoyMapper {

    void update(@Param("id") String id, @Param("parkingBoy") ParkingBoy parkingBoy) ;

    List<ParkingBoy> getParkingBoy();

    void insert(@Param("parkingBoy") ParkingBoy parkingBoy);

    void delete(@Param("id") String id);

    void manageLot(@Param("parkingBoyId") String parkingBoyId, @Param("parkingLotId") String parkingLotId);

    List<ParkingLot> selectOneParkingBoyAllParkingLots(@Param("id") int id);
}
