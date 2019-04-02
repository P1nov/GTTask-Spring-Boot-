package com.leiyonglin.service_impl.moment;

import com.leiyonglin.common.base.JsonResult;
import com.leiyonglin.dao.moment.MomentDao;
import com.leiyonglin.pojo.moment.Moment;
import com.leiyonglin.service.moment.MomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("momentService")
public class MomentServiceImpl implements MomentService {

    @Autowired
    MomentDao momentDao;

    @Override
    public JsonResult addNewMoment(Moment moment) {

        try{

            Integer insertNum = momentDao.addNewMoment(moment);

            if(insertNum == 1){

                return JsonResult.doSuccess();
            }else{

                return JsonResult.doError(-1, "操作失败");
            }

        }catch(Exception e){

            return JsonResult.doError(500, e.getLocalizedMessage());
        }
    }
}
