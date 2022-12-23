package com.project.pbo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    public Connection databaselink;

    public Connection getconnection() {
        String databasename = "anidoc";
        String databaseuser = "root";
        String databasepass = "";
        String url = "jdbc:mysql://localhost/" + databasename;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection(url,databaseuser,databasepass);
        }catch (Exception e){
            e.printStackTrace();
        }
        return databaselink;
    }



    }
