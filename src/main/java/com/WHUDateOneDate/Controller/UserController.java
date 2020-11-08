package com.WHUDateOneDate.Controller;

/**
 * @Author cyh
 * @Date 2020/11/5
 */
import com.WHUDateOneDate.Service.InfoPlatform.Service.UserMessageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(
        value = "user",
        tags = "用户操作模块"
)
@RestController
@RequestMapping("api/user/operation")
public class UserController {
    @Autowired
    private UserMessageService userMessageService;
}
