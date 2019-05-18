package com.deem.zkui.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author wjybxx
 * @version 1.0
 * @date 2019/5/18 0:45
 * @github - https://github.com/hl845740757
 */
@WebFilter(filterName = "filtercharset", urlPatterns = "/*")
public class CharsetFilter implements Filter {

    @Override
    public void init(FilterConfig fc) throws ServletException {
        //Do Nothing
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        fc.doFilter(req, res);
    }

    @Override
    public void destroy() {
        //Do nothing
    }

}