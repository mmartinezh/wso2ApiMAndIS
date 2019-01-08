/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2019-01-08 11:15:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.owasp.encoder.Encode;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.user.mgt.ui.UserAdminClient;
import org.wso2.carbon.user.mgt.ui.UserAdminUIConstants;
import org.wso2.carbon.utils.ServerConstants;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

public final class edit_002duser_002droles_002dfinish_002dajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private String[] addSelectedRoleLists(String[] selectedRoles, Map<String, Boolean> sessionRolesMap) {
        List<String> selectedRolesList = new ArrayList<String>();
        if (selectedRoles != null && selectedRoles.length > 0) {
            selectedRolesList = new ArrayList<String>(Arrays.asList(selectedRoles));
        }
        if (sessionRolesMap != null) {
            Set<String> keys = sessionRolesMap.keySet();
            for (String key : keys) {
                if (sessionRolesMap.get(key) == true && !selectedRolesList.contains(key)) {
                    selectedRolesList.add(key);
                }
            }
        }
        selectedRoles = selectedRolesList.toArray(new String[selectedRolesList.size()]);
        return selectedRoles;
    }

    private void addDeletedRoleLists(List<String> deletedRoles, Map<String, Boolean> sessionRolesMap) {
        if (sessionRolesMap != null) {
            Set<String> keys = sessionRolesMap.keySet();
            for (String key : keys) {
                if (sessionRolesMap.get(key) == false && !deletedRoles.contains(key)) {
                    deletedRoles.add(key);
                }
            }
        }
    }


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String httpMethod = request.getMethod();
    if (!"post".equalsIgnoreCase(httpMethod)) {
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
        return;
    }

    boolean logout = false;
    boolean finish = false;
    boolean viewUsers = false;

    String BUNDLE = "org.wso2.carbon.userstore.ui.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale());

    String username = request.getParameter("username");
    String displayName = request.getParameter("displayName");
    if (displayName == null || displayName.trim().length() == 0) {
        displayName = username;
    }
    String[] selectedRoles = request.getParameterValues("selectedRoles");
    String[] shownRoles = request.getParameterValues("shownRoles");
    String pageNumber = request.getParameter("pageNumber");

    if (request.getParameter("logout") != null) {
        logout = Boolean.parseBoolean(request.getParameter("logout"));
    }
    if (request.getParameter("finish") != null) {
        finish = Boolean.parseBoolean(request.getParameter("finish"));
    }
    if (request.getParameter("viewRoles") != null) {
        viewUsers = Boolean.parseBoolean(request.getParameter("viewRoles"));
    }

    try {
        String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
        String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        ConfigurationContext configContext =
                (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
        UserAdminClient client = new UserAdminClient(cookie, backendServerURL, configContext);
        ArrayList<String> deletedList = new ArrayList<String>();
        if (selectedRoles != null) {
            Arrays.sort(selectedRoles);
        }

        if (shownRoles != null) {
            for (String name : shownRoles) {
                if (selectedRoles != null) {
                    if (Arrays.binarySearch(selectedRoles, name) < 0) {
                        deletedList.add(name);
                    }
                } else {
                    deletedList.add(name);
                }
            }
        }
        selectedRoles =
                addSelectedRoleLists(selectedRoles, (Map<String, Boolean>) session.getAttribute("checkedRolesMap"));
        addDeletedRoleLists(deletedList, (Map<String, Boolean>) session.getAttribute("checkedRolesMap"));

        if (viewUsers) {
            client.addRemoveRolesOfUser(username, null,
                                        deletedList.toArray(new String[deletedList.size()]));
        } else {
            client.addRemoveRolesOfUser(username, selectedRoles, null);
            session.removeAttribute(UserAdminUIConstants.USER_LIST_UNASSIGNED_ROLE_CACHE);
            session.removeAttribute(UserAdminUIConstants.USER_LIST_UNASSIGNED_ROLE_CACHE_EXCEEDED);
        }

        String message =
                MessageFormat.format(resourceBundle.getString("user.update"), username);
        CarbonUIMessage.sendCarbonUIMessage(message, CarbonUIMessage.INFO, request);

        if (logout) {

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.location.href = \"../admin/logout_action.jsp\";\n");
      out.write("</script>\n");

} else if (finish) {

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    location.href = \"user-mgt.jsp?ordinal=1\";\n");
      out.write("</script>\n");

} else if (viewUsers) {

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    location.href = \"view-roles.jsp?username=");
      out.print(Encode.forJavaScriptBlock(Encode.forUriComponent(username)));
      out.write("\";\n");
      out.write("</script>\n");

} else {

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    location.href = \"edit-user-roles.jsp?username=");
      out.print(Encode.forJavaScriptBlock(Encode.forUriComponent(username)));
      out.write("\" + \"&pageNumber=");
      out.print(Encode.forJavaScriptBlock(Encode.forUriComponent(pageNumber)));
      out.write("\";\n");
      out.write("</script>\n");

    }
} catch (Exception e) {

    String decodedUserName = "";
    String encodedUserName = "";

    if (username != null) {
        decodedUserName = username;
        encodedUserName = URLEncoder.encode(username);
    }

    String message =
            MessageFormat.format(resourceBundle.getString("role.list.cannot.update"), decodedUserName, e.getMessage());
    CarbonUIMessage.sendCarbonUIMessage(message, CarbonUIMessage.ERROR, request);
    if (viewUsers) {

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    location.href = \"view-roles.jsp?username=");
      out.print(Encode.forJavaScriptBlock(encodedUserName));
      out.write("\";\n");
      out.write("</script>\n");

} else {

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    location.href = \"edit-user-roles.jsp?username=");
      out.print(Encode.forJavaScriptBlock(encodedUserName));
      out.write("\";\n");
      out.write("</script>\n");

        }
    }

      out.write('\n');
      out.write('\n');
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
}
