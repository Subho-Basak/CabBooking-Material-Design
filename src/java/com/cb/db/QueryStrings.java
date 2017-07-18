package com.cb.db;

/**
 *
 * @author Subhankar
 */
public interface QueryStrings {

    String Q_FETCH_INFO    = "SELECT * FROM test";
    String I_LOAD_INFO     = "INSERT INTO test VALUES (?, ?, ?, ?, ?, ?)";
    String U_LOAD_INFO     = "UPDATE test SET name = ?, age = ?, address = ?, status = ?, gender = ? WHERE id = ?";
    
    
    String I_USR_INFO = "INSERT INTO account VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    String I_BOOKING_INFO = "INSERT INTO booking VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    String Q_USR_INFO_PH = "SELECT * FROM account WHERE contact = ? and passwd = ?";
    String Q_USR_INFO_EM = "SELECT * FROM account WHERE email = ? and passwd = ?";
    
    String Q_FARE_INFO = "SELECT * FROM fare";
    String Q_FARE_INFO_BY_CITY = "SELECT * FROM fare WHERE city = ?";
}
