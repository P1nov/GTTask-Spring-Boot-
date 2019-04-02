package com.leiyonglin.controller.moment;

import com.leiyonglin.common.base.JsonResult;
import com.leiyonglin.pojo.moment.Moment;
import com.leiyonglin.service.moment.MomentService;
import org.jetbrains.annotations.NotNull;
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

        return null;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addNewMoment(@NotNull @RequestBody Map<String, String> resultMap, HttpServletRequest request, HttpServletResponse response){

        Moment moment = new Moment();
        String content = resultMap.get("content");
        String imageUrls = resultMap.get("imageList");

        moment.setContent(content);
        moment.setImageUrls(imageUrls);

        return momentService.addNewMoment(moment);
    }
}
