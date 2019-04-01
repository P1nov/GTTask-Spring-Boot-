package com.leiyonglin.dao.moment;

import com.leiyonglin.pojo.moment.Moment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MomentDao {

    List<Moment> queryMomentList();
}
