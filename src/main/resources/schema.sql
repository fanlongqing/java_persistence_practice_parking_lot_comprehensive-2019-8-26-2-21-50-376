CREATE TABLE parkingBoy (
 id varchar(36) PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);

CREATE TABLE parkingLot (
 parkingLotID varchar(36) PRIMARY KEY,
  capacity   int(4) NOT NULL
);
