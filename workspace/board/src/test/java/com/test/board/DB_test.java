package com.test.board;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class DB_test {
@Test
public void test() throws Exception {
    Class.forName("org.mariadb.jdbc.Driver"); // ������DB
    Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/testdb", "root","1111");// ������DB
   
    System.out.println(con);
    }
}
