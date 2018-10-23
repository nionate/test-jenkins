package com.tw.ss.servlet;

import org.apache.struts.action.ActionServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        name="actionServlet",
        urlPatterns="*.do",
        loadOnStartup=1,
        initParams={@WebInitParam(name="config", value="/WEB-INF/struts-config.xml")}
)
public class StrutsServlet extends ActionServlet {

}
