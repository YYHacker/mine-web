package common.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.web.dao.Menu;

@Controller
@RequestMapping("/mainController.do")
public class MainController {
	
	@RequestMapping(params = "method=menuList")
	@ResponseBody
	public Object MenuList(){
		List menulist = new ArrayList();
		Menu m = new Menu();
		m.setFatherId(null);
		m.setMenuCode("001");
		m.setLeaf(true);
		m.setMenuName("系统管理");
		Menu m2 = new Menu();
		m2.setFatherId(null);
		m2.setMenuCode("002");
		m2.setLeaf(true);
		m2.setMenuName("用户管理");
		menulist.add(m);
		menulist.add(m2);
		return menulist;
	}
}
