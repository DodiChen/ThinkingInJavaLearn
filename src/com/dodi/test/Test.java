package com.dodi.test;

import java.security.MessageDigest;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.10.199:3306/zqread?zeroDateTimeBehavior=convertToNull&autoReconnect=true";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "rnd";
    static final String PASS = "P1WD#xyoP";

    public static String pwd(){

        String[] strs = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z a b c d e f g h i j k l m n o p q r s t u v w x y z 1 2 3 4 5 6 7 8 9 0 ! @ # *".split(" ");
        String[] numbers = "1 2 3 4 5 6 7 8 9 0".split(" ");
        String[] chars = "! @ # *".split(" ");
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            int seed1 = rand.nextInt(66);
            sb.append(strs[seed1]);
        }
        return sb.toString();

    }

    public   static  String MD5(String inStr) {
        MessageDigest md5 = null ;
        try  {
            md5 = MessageDigest.getInstance("MD5" );
        } catch  (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return   "" ;
        }
        char [] charArray = inStr.toCharArray();
        byte [] byteArray =  new   byte [charArray.length];

        for  ( int  i =  0 ; i < charArray.length; i++)
            byteArray[i] = (byte ) charArray[i];

        byte [] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new  StringBuffer();

        for  ( int  i =  0 ; i < md5Bytes.length; i++) {
            int  val = (( int ) md5Bytes[i]) &  0xff ;
            if  (val <  16 )
                hexValue.append("0" );
            hexValue.append(Integer.toHexString(val));
        }

        return  hexValue.toString();
    }


    public static void main(String[] args) {

        List<String> sqlList = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body><table><tr><th>al_id</th><th>al_account_id</th><th>al_name</th><th>al_pwd</th><th>al_type</th><th>new_pswd</th><th>new_pswd_md5</th></tr>");
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "select al_id, al_account_id, al_name, al_pwd, al_type, al_create, al_modify, al_last_login_date from b_account_login";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                int al_id  = rs.getInt("al_id");
                int al_account_id = rs.getInt("al_account_id");
                String newPwd = Test.pwd();
                String newPwdMds = Test.MD5(newPwd);

                String newSQL = "update b_account_login set al_pwd = '" + newPwdMds + "' where al_id = " + al_id + " and al_account_id = " + al_account_id + ";";
                System.out.println(newSQL);
                sqlList.add(newSQL);
                String html = "<tr><th>" + al_id + "</td>" + "<th>" + al_account_id + "</th><th>" + rs.getString("al_name") + "</th><th>" +
                        rs.getString("al_pwd") + "</th><th>" + rs.getInt("al_type")
                        + "</th><th>" + newPwd + "</th><th>" + newPwdMds + "</th></tr>";
                sb.append(html);
            }
            sb.append("</table></body></html>");
            System.out.println(sb.toString());
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
