/**
 * @Author cyh
 * @Date 2010/10/30
 */

package com.WHUDateOneDate.Controller;

import com.WHUDateOneDate.Service.Account.Strategy.UserContext;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@Api(
        value = "account",
        tags = "账户模块"
)
@RestController
@RequestMapping("api/account")
public class AccountController {
    @Autowired
    private UserContext userContext;
    @ApiOperation(
            value = "用户注册",
            notes = "用户注册"
    )
    @RequestMapping(
            value = "/Register",
            method = RequestMethod.POST
    )
    public String registerAccount(@RequestParam(value = "userName") String userName,
                              @RequestParam(value = "password") String password)
    {
        userContext.execute(userName,password,UserContext.UserOperation.Register);
        return userName + " register successfully";
    }


    @ApiOperation(
            value = "用户登录",
            notes = "用户登录"
    )
    @RequestMapping(
            value = "/login",
            method = RequestMethod.GET
    )
    public String loginAccount(@RequestParam(value = "userName")String userName,
                               @RequestParam(value = "password")String password)
    {
        userContext.execute(userName,password, UserContext.UserOperation.Login);
        return userName + " login successfully";
    }

    @ApiOperation(
            value = "用户登出",
            notes = "用户登出"
    )
    @RequestMapping(
            value = "/logout",
            method = RequestMethod.GET
    )
    public String logoutAccount(@RequestParam(value = "userName")String userName,
                                @RequestParam(value = "password")String password)
    {
        userContext.execute(userName,password, UserContext.UserOperation.Logout);
        return userName + " logout successfully";
    }

    @ApiOperation(
            value = "用户删除",
            notes = "用户删除"
    )
    @RequestMapping(
            value = "/delete",
            method = RequestMethod.DELETE
    )
    public String deleteAccount(@RequestParam(value = "userName")String userName,
                                @RequestParam(value = "password")String password)
    {
        userContext.execute(userName,password, UserContext.UserOperation.Delete);
        return userName + " delete successfully";
    }

}
