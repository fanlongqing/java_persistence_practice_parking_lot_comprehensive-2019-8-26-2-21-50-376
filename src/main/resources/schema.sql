CREATE TABLE parkingBoy (
 id varchar(36) PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);
CREATE TABLE parkingLot (
 parkingLotID varchar(36) PRIMARY KEY,
  capacity   int(11) NOT NULL,
  parkingBoyId varchar(36),
  availablePositionCount int(11) NOT NULL
--  FOREIGN KEY(parkingBoyId) REFERENCES parkingBoy(id)
);
