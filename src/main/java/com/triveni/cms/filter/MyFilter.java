package com.triveni.cms.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("The MyFilter is called !!!!!!");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
