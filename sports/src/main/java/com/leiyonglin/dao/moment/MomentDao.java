package com.leiyonglin.dao.moment;

import com.leiyonglin.pojo.moment.Moment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
public interface MomentDao {

    List<Moment> queryMomentList();

    Integer addNewMoment(@Param(value = "moment") Moment moment);
}
