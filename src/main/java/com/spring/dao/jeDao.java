package com.spring.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class jeDao {

   // @Autowired
   // private JdbcTemplate jdbcTemplate;

    public void saveRow(String colName, String entry1, String entry2, String groupId, int randomNumber) {
        //String sql = "INSERT INTO data_table (col_name, uptdwith_entry1, update_with_entry2, group_id, random_number) VALUES (?, ?, ?, ?, ?)";
        String sql = "INSERT INTO feed_rule_update_col_tbl (rule_update_col_id,col_to_update,update_with,type_of_update_with) VALUES (?, ?, ?, ?, ?)";
       // jdbcTemplate.update(sql, colName, entry1, entry2, groupId, randomNumber);
    }
}
