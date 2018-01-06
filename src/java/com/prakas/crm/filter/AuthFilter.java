/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.crm.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Prakas
 */
@WebFilter(displayName = "auth",urlPatterns = {"/admin/*"})
public class AuthFilter implements javax.servlet.Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)req;
         HttpServletResponse response=(HttpServletResponse)resp;
         
         HttpSession session=request.getSession(false);
         if(session!=null && session.getAttribute("loggedId")!=null){
             chain.doFilter(request, response);
         }else{
             response.sendRedirect(request.getContextPath()+"/login");
         }
         
    }

    @Override
    public void destroy() {
        
    }
    
    
}
