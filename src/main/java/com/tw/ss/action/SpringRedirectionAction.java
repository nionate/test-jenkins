package com.tw.ss.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SpringRedirectionAction extends Action {

    private Logger logger = LoggerFactory.getLogger(SpringRedirectionAction.class);

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("SpringRedirectionAction.execute called");

        ActionForward forward = new ActionForward();
        forward.setPath(request.getRequestURI().replace(".do", ""));
        forward.setRedirect(true);

        return forward;
    }
}
