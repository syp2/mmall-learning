package com.mmall.controller.backend;

import com.mmall.common.ServerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by SunYunpeng
 */
@Controller
@RequestMapping("/manage/category")
public class CategoryManageController {

    public ServerResponse addCategory(HttpSession session, String categoryName,
                                      @RequestParam(value = "parentId", defaultValue = "0")int parentId) {

    }
}
