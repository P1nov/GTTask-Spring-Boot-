package com.leiyonglin.controller.moment;

import com.leiyonglin.base.JsonResult;
import com.leiyonglin.pojo.moment.Moment;
import com.leiyonglin.service.moment.MomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/moment")
public class MomentController {

    @Autowired
    MomentService momentService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult momentList(){

        JsonResult json = momentService.momentList();

        return json;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addNewMoment(@RequestBody Map<String, String> resultMap, HttpServletRequest request, HttpServletResponse response){

        Moment moment = new Moment();
        String content = resultMap.get("content");
        String imageUrls = resultMap.get("imageUrls");

        moment.setContent(content);
        moment.setImageUrls(imageUrls);

        JsonResult json = momentService.addNewMoment(moment);

        return json;
    }
}
