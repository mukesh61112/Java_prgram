package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mukesh {
    public static void main(String [] args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306:youtube";
            String username="root";
            String password="Mysql@123";
            Connection con= DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("jskjfkjjl");
            }
            else
            {
                System.out.println("ksjkfjkjfkjj");
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
