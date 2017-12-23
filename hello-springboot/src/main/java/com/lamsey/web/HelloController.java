package com.lamsey.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lamsey.domain.User;
import com.lamsey.service.UserService;

/** 
 * 类名：HelloController
 * 功能：
 * 详细：
 * 作者 :limingxian
 * 版本：1.0 
 * 创建时间：2017年12月22日 下午9:41:12
 */
@Controller
public class HelloController {
	
	@Autowired
	private UserService userService;

    @RequestMapping("/getUser/{id}")
    public String getUser(ModelMap map,@PathVariable("id") Long id) {
      
    	User user = userService.getOne(id);
    	map.addAttribute("user", user);
      
        return "welcome";
    }

    
}
