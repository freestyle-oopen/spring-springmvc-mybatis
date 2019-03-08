package com.ren.qq.controller;


import com.ren.qq.pojo.ResponseCode;
import com.ren.qq.pojo.Result;
import com.ren.qq.pojo.SearchInfo;
import com.ren.qq.pojo.User;
import com.ren.qq.service.YouTubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class YouTubeController {


    @Autowired
    private YouTubeService youTubeService;
    @RequestMapping(value = "/addyoutube",method = RequestMethod.GET)
    public String addyoutube(HttpServletResponse response){
        User user = youTubeService.findUserByName("name");
        System.out.println("============="+youTubeService);
     return "index";
    }


    @RequestMapping("searchUser")
    public @ResponseBody  Result searchUser(SearchInfo searchInfo) {
        List<User> users = youTubeService.searchUser(searchInfo);
        if(users==null){
            return Result.BuildSuccessResult("{}");
        }else {
            return Result.BuildSuccessResult(users);
        }
    }
}
