package com.leiyonglin.service.moment;

import com.leiyonglin.base.JsonResult;
import com.leiyonglin.pojo.moment.Moment;

public interface MomentService {

    JsonResult momentList();

    JsonResult addNewMoment(Moment moment);
}
