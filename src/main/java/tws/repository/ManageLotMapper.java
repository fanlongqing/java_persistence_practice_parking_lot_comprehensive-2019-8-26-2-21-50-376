package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.ParkingLot;

import java.util.List;

@Mapper
public interface ManageLotMapper {

    void manageLot(@Param("parkingBoyId") String parkingBoyId, @Param("parkingLotId") String parkingLotId);

    List<ParkingLot> getParkingLot(@Param("id") String id);
}
