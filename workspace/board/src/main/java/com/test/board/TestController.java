package com.test.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.board.bean.TestBean;
import com.test.board.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService service;				//��Ʈ�ѷ��� ����� Service��  Inject��.
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)	//value = �������� �ּҰ�, method=���۹��
	public String test(Model model) throws Exception{				
										//DB�� �޾Ƽ� ���������� ��������.�޼ҵ� �Ű������� Model�� �߰�
		List<TestBean> list;
		list = service.test();			//service�� test�� �����Ű�� DB���� ����.
		model.addAttribute("list", list);	//Model�� DB���� ��� List�� �־���.
		
		return "test";					//"localhost:8080/������Ʈ/test"�� �ԷµǸ� "test.jsp"�� �̵���Ŵ.
	}
}
