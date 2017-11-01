package com.ren.qq.controller;


import com.ren.qq.pojo.ResponseCode;
import com.ren.qq.pojo.Result;
import com.ren.qq.pojo.SearchInfo;
import com.ren.qq.pojo.User;
import com.ren.qq.service.UserService;
import com.ren.qq.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class UserController {


    @Autowired
    private UserService userService;

    /**
     *
     * **/
    @RequestMapping("addUser")
    public @ResponseBody Result addUser(User user) {
        User userByName = userService.findUserByName(user.getName());
        if (userByName != null) {
            return Result.BuildFailResult(ResponseCode.SC_BAD_REQUEST, "此用户已经注册");
        }
        boolean result = userService.addUser(user);
        if (!result) {
            return Result.BuildFailResult(ResponseCode.SC_BAD_REQUEST, "注册失败");
        }
        return Result.BuildSuccessResult(result);
    }

    @RequestMapping("delectUser")
    public @ResponseBody  Result delectUser(User user) {
        boolean b = userService.delectUser(user);
        if(b){
            return Result.BuildSuccessResult("删除成功！");
        }else {
            return Result.BuildSuccessResult("删除失败！");
        }
    }
    @RequestMapping("searchUser")
    public @ResponseBody  Result searchUser(SearchInfo searchInfo) {
        List<User> users = userService.searchUser(searchInfo);
        if(users==null){
            return Result.BuildSuccessResult("{}");
        }else {
            return Result.BuildSuccessResult(users);
        }
    }
}
