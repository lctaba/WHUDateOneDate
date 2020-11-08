package com.WHUDateOneDate.Controller;

/**
 * @Author cyh
 * @Date 2020/11/5
 */

import com.WHUDateOneDate.Service.InfoPlatform.Factory.MessageFactory;
import com.WHUDateOneDate.Service.InfoPlatform.Service.UserMessageService;
import com.WHUDateOneDate.Service.InfoPlatform.Strategy.MessageContext;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(
        value = "message",
        tags = "信息模块"
)
@RestController
@RequestMapping("api/message")
public class MessageController {
    @Autowired
    private UserMessageService userMessageService;
    @Autowired
    private MessageContext messageContext;
    @ApiOperation(
            value = "发布约跑步信息",
            notes = "发布约跑步信息"
    )
    @RequestMapping(
            value = "/post/jog",
            method = RequestMethod.POST
    )
    public String postJogMessage(@RequestParam(value = "userName")String userName,
                              @RequestParam(value = "messageContent")String content)
    {
        String res = "";
        userMessageService.post(MessageFactory.MessageType.JogMessage,content);
        res += "a jogMessage has been created \r\n";
        res += userName;
        res += " post a jogMessage, whose content is \"" ;
        res += content;
        res += "\"";
        res += "\r\na subject has been created\r\n";
        res += "a observer has been created\r\n";
        res += "subject notify all the observers that a new member has joined";
        return res;
    }



    @ApiOperation(
            value = "发布约饭信息",
            notes = "发布约饭信息"
    )
    @RequestMapping(
            value = "/post/meal",
            method = RequestMethod.POST
    )
    public String postMealMessage(@RequestParam(value = "userName")String userName,
                              @RequestParam(value = "messageContent")String content)
    {
        String res = "";
        userMessageService.post(MessageFactory.MessageType.MealMessage,content);
        res += "a mealMessage has been created \r\n";
        res += userName;
        res += " post a mealMessage, whose content is \"";
        res += content;
        res += "\"";
        res += "\r\na subject has been created\r\n";
        res += "a observer has been created\r\n";
        res += "subject notify all the observers that a new member has joined";
        return res;
    }




    @ApiOperation(
            value = "发布约学习信息",
            notes = "发布约学习信息"
    )
    @RequestMapping(
            value = "/post/study",
            method = RequestMethod.POST
    )
    public String postMessage(@RequestParam(value = "userName")String userName,
                              @RequestParam(value = "messageContent")String content)
    {
        String res = "";
        userMessageService.post(MessageFactory.MessageType.StudyMessage,content);
        res += "a studyMessage has been created \r\n";
        res += userName;
        res += " post a studyMessage, whose content is \"";
        res += content;
        res += "\"";
        res += "\r\na subject has been created\r\n";
        res += "a observer has been created\r\n";
        res += "subject notify all the observers that a new member has joined";
        return res;
    }


    @ApiOperation(
            value = "浏览信息列表",
            notes = "浏览信息列表"
    )
    @RequestMapping(
            value = "/browse",
            method = RequestMethod.GET
    )
    public String browseMessage(@RequestParam(value = "userName")String userName)
    {
        String res = "";
        userMessageService.browse();
        res += userName;
        res += " has browse all the messages";
        return res;
    }

    @ApiOperation(
            value = "接受信息",
            notes = "接受信息"
            )
    @RequestMapping(
            value = "/accept",
            method = RequestMethod.GET
    )
    public String acceptMessage(@RequestParam(value = "userName")String userName){
        String res = "";
        messageContext.execute(MessageContext.OperationType.Accept);
        res += "a observer has been created\r\n";
        res += "subject notifies all the observers that there is a new member\r\n";
        res += userName;
        res += " has accepted a message";
        return res;
    }


    @ApiOperation(
            value = "拒绝信息",
            notes = "拒绝信息"
    )
    @RequestMapping(
            value = "/reject",
            method = RequestMethod.GET
    )
    public String rejectMessage(@RequestParam(value = "userName")String userName){
        String res = "";
        messageContext.execute(MessageContext.OperationType.Reject);
        res += userName;
        res += " has rejected a message";
        return res;
    }

    @ApiOperation(
            value = "忽略信息",
            notes = "忽略信息"
    )
    @RequestMapping(
            value = "/ignore",
            method = RequestMethod.GET
    )
    public String ignoreMessage(@RequestParam(value = "userName")String userName){
        String res = "";
        messageContext.execute(MessageContext.OperationType.Ignore);
        res += userName;
        res += " has ignored a message";
        return res;
    }
}
