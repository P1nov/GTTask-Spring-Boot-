package com.leiyonglin.controller.moment;

import com.leiyonglin.common.base.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moment")
public class MomentController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult momentList(){

        return null;
    }
}
