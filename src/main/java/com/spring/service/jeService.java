package com.spring.service;

import com.spring.dao.jeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class jeService {

    @Autowired
    private jeDao dataDao;

    @Transactional
    public void saveData(List<List<Object>> data) {
        for (List<Object> row : data) {
        	System.out.println("row");
            if (row.size() >= 5) {
                String colName = (String) row.get(0);
                String entry1 = (String) row.get(1);
                String entry2 = (String) row.get(2);
                String groupId = (String) row.get(3);
                int randomNumber = (int) row.get(4);
                dataDao.saveRow(colName, entry1, entry2, groupId, randomNumber);
            }
        }
    }
}
