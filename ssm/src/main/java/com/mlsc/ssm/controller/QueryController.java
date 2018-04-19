	package com.mlsc.ssm.controller;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
	import org.springframework.stereotype.Controller;
	import org.springframework.util.StringUtils;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.servlet.ModelAndView;
	
	@Controller("queryController")
	public class QueryController {
	
		@Autowired
		JdbcTemplate jdbcTemplate;
		
		@RequestMapping("/query")
		public ModelAndView query(@RequestParam(required=false) String type) {
			ModelAndView m = null;
			if(StringUtils.isEmpty(type)) {
				m = new ModelAndView("error");
			}else {
				m = new ModelAndView("my");
			}
			
			return m;
		}
		
		@RequestMapping("/save")
		public void save() {
			jdbcTemplate.execute("insert into t_sys_user (userID,loginName,password) VALUES (2,'登录名','登录密码')");
		}
	}
