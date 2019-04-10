package com.leiyonglin.service_impl.DayManagement;

import com.leiyonglin.base.JsonResult;
import com.leiyonglin.dao.DayManagement.DayManagementDao;
import com.leiyonglin.pojo.DayManagement.DayManagement;
import com.leiyonglin.service.DayManagement.DayManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dayManagementService")
public class DayManagementServiceImpl implements DayManagementService {

    @Autowired
    private DayManagementDao dayManagementDao;

    @Override
    public JsonResult dayManagementList(Integer userId) {

        try{
            List<DayManagement> list = dayManagementDao.getDayManagementListByUserId(userId);

            if(list != null){

                JsonResult json = new JsonResult();
                json.setCode(0);
                json.setContent(list);
                json.setMessage("获取数据成功！");
                return json;
            }else return JsonResult.doError(101, "暂时没有查询到数据～");

        }catch(Exception e){

            return JsonResult.doError(-1, e.getLocalizedMessage());

        }


    }
}
