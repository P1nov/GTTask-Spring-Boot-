package com.leiyonglin.dao.DayManagement;

import com.leiyonglin.pojo.DayManagement.DayManagement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DayManagementDao {

    List<DayManagement> getDayManagementListByUserId(Integer userId);
}
