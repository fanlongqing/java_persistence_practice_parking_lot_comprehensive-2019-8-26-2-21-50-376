create table USER (
    ID VARCHAR(100),
    USERNAME VARCHAR(100),
    PASSWORD VARCHAR(100),
    PASSWORD_EXPIRED VARCHAR(100),
    ROLE VARCHAR(100),
    CREATE_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);