package connection;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.*;

public class ConnectionTest {
    public static void main(String[] args) {
        //获取BasicDataSource并配置，开始....
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql:///test");
        source.setUsername("root");
        source.setPassword("zqd19931007");
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
//获取BasicDataSource并配置，结束......
        for (int i =0;i<1000;i++) {
            try {
                String test1 = i + "username";
                String test2 = i + "password";
                conn = source.getConnection();
                st = conn.createStatement();
                st.execute("INSERT INTO user(username,password) VALUES ('username','password')");
//                st = conn.prepareStatement("INSERT INTO user(username,password) VALUES (test1,test2)");
//                rs = ps.executeQuery();
//                while (rs.next()) {
//                    String name = rs.getString("username");
//                    System.out.println(name);
//                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        rs = null;
                    }
                }
                if (st != null) {
                    try {
                        st.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        st = null;
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        conn = null;
                    }
                }
            }
        }

    }
}
