/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-12-07 09:18:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class breadcrumb_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1482326920000L));
    _jspx_dependants.put("/WEB-INF/tlds/c.tld", Long.valueOf(1482326920000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      try {
        _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fbundle_005f0.setParent(null);
        // /admin/layout/breadcrumb.jsp(22,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.i18n.Resources");
        int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_fmt_005fbundle_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_fmt_005fbundle_005f0.doInitBody();
          }
          do {
            out.write("\n");
            out.write("\t<table class=\"page-header-links-table\" cellspacing=\"0\">\n");
            out.write("\t\t<tr>\n");
            out.write("\t\t\t<td class=\"breadcrumbs\">\n");
            out.write("\t\t\t<table class=\"breadcrumb-table\" cellspacing=\"0\">\n");
            out.write("\t\t\t\t<tr>\t\t\t\t\t\t\t\t \n");
            out.write("\t\t\t\t    <td>\n");
            out.write("\t\t\t\t\t    <div id=\"breadcrumb-div\"></div>\n");
            out.write("                    </td>\n");
            out.write("\t\t\t\t</tr>\n");
            out.write("\n");
            out.write("\t\t\t</table>\n");
            out.write("\t\t\t</td>\n");

    String requestURI = request.getHeader("Referer");
    if (requestURI != null && requestURI.indexOf("?") > 0) {
        requestURI = requestURI.substring(0, requestURI.indexOf("?"));
    } else {
        requestURI = "";
    }
    requestURI = "blah";
    if (requestURI.endsWith("/admin/login.jsp")) { 
            out.write("\n");
            out.write("            <td class=\"page-header-help\"><a href=\"../docs/signin_userguide.html\"\n");
            out.write("\t\t\t\ttarget=\"_blank\">");
            if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a></td>\n");
 } else if (requestURI.endsWith("/admin/error.jsp")) { 
            out.write("\n");
            out.write("            <td class=\"page-header-help\"></td>\n");
 } else { 
            out.write("\n");
            out.write("\t\t\t<td class=\"page-header-help\"><a href=\"./docs/userguide.html\"\n");
            out.write("\t\t\t\ttarget=\"_blank\">");
            if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a></td>\n");
 } 
            out.write("\n");
            out.write("\t\t</tr>\n");
            out.write("\t</table>\n");
            int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
      }
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/breadcrumb.jsp(45,20) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("component.help");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/breadcrumb.jsp(50,20) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("component.help");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    }
    return false;
  }
}