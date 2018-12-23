package hlinfo.springboot.controller;

import hlinfo.springboot.service.CoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @Resource
    private CoreService coreService;

    public CoreService getCoreService() {
        return coreService;
    }
    public void setCoreService(CoreService coreService) {
        this.coreService = coreService;
    }

    @RequestMapping("/")
    public String welcome(HttpServletRequest request,Model model){
        String msg="Hello Word^_^";
        model.addAttribute("helloword", msg);
        return "index";
    }

    @RequestMapping({"/index","/test"})
    public String test(Model model){
        List<Map> rootlog=this.coreService.queryList("find_rootlog_list");

        model.addAttribute("helloword", "今天晚上凤姐要来查房^_^");
        model.addAttribute("rootlog", rootlog);
        return "test";
    }
}
