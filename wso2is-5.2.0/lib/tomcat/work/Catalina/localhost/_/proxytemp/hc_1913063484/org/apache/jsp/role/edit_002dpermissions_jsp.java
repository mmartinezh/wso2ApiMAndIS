/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2019-01-08 11:13:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.owasp.encoder.Encode;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.user.mgt.stub.types.carbon.UIPermissionNode;
import org.wso2.carbon.user.mgt.ui.UserAdminClient;
import org.wso2.carbon.utils.ServerConstants;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public final class edit_002dpermissions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private void printNodesOfTree(UIPermissionNode parentNode, String parentNodeName,
                                  int count, JspWriter out) throws IOException {
        if (parentNode == null) {
            return;
        }
        try {
            UIPermissionNode[] children = parentNode.getNodeList();
            String displayName = parentNode.getDisplayName();
            String path = parentNode.getResourcePath();
            String thisNodeName = "tempNode" + count;
            out.write("var " + thisNodeName + " = new YAHOO.widget.TaskNode({label:\""
                      + displayName + "\",labelData:\"" + path + "\"}, " + parentNodeName + ", true, "
                      + parentNode.getSelected() + ");");
            if (children != null) {
                for (UIPermissionNode child : children) {
                    count++;
                    printNodesOfTree(child, thisNodeName, count, out);

                }
            }
        } catch (IOException e) {
            throw e;
        }
    }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tlds/carbontags.tld", Long.valueOf(1472217474000L));
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1472217474000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody;
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
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"../admin/js/main.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../yui/build/treeview/assets/skins/sam/treeview.css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"js/yuiloader-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/event-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/dom-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/logger-min.js\"></script>\n");
      out.write("<!--script type=\"text/javascript\" src=\"http://yui.yahooapis.com/2.7.0/build/treeview/treeview-min.js\"></script> this does not work. Only the debug version works -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/treeview-debug.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/element-min.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    .ygtvcheck0 {\n");
      out.write("        background: url(images/check0.gif) 0 0 no-repeat;\n");
      out.write("        width: 16px;\n");
      out.write("        cursor: pointer\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .ygtvcheck1 {\n");
      out.write("        background: url(images/check1.gif) 0 0 no-repeat;\n");
      out.write("        width: 16px;\n");
      out.write("        cursor: pointer\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .ygtvcheck2 {\n");
      out.write("        background: url(images/check2.gif) 0 0 no-repeat;\n");
      out.write("        width: 16px;\n");
      out.write("        cursor: pointer\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .ygtvlabel {\n");
      out.write("        color: #477ea5;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #expandcontractdiv {\n");
      out.write("        background-color: #ededed;\n");
      out.write("        padding: 5px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');


    String BUNDLE = "org.wso2.carbon.userstore.ui.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale());

    String prevPage = request.getParameter("prevPage");
    String prevUser = request.getParameter("prevUser");
    String prevPageNumber = request.getParameter("prevPageNumber");

    UIPermissionNode rootNode = null;
    String roleName = request.getParameter("roleName");

    try {
        String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
        String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        ConfigurationContext configContext =
                (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
        UserAdminClient client = new UserAdminClient(cookie, backendServerURL, configContext);
        rootNode = client.getRolePermissions(roleName);
    } catch (Exception e) {
        String message = MessageFormat.format(resourceBundle.getString("error.while.loading.ui.permission"),
                                              e.getMessage());

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    jQuery(document).ready(function () {\n");
      out.write("        CARBON.showErrorDialog('");
      out.print(Encode.forJavaScript(Encode.forHtml(message)));
      out.write("', function () {\n");
      out.write("            location.href = \"role-mgt.jsp\";\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");

    }

      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fbundle_005f0.setParent(null);
      // /role/edit-permissions.jsp(135,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.userstore.ui.i18n.Resources");
      int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
      if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_005fbundle_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_005fbundle_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_005fbreadcrumb_005f0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_005fbreadcrumb_005f0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_005fbreadcrumb_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
          // /role/edit-permissions.jsp(136,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setLabel("add.remove.permissions");
          // /role/edit-permissions.jsp(136,4) name = resourceBundle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setResourceBundle("org.wso2.carbon.userstore.ui.i18n.Resources");
          // /role/edit-permissions.jsp(136,4) name = topPage type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setTopPage(false);
          // /role/edit-permissions.jsp(136,4) name = request type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setRequest(request);
          int _jspx_eval_carbon_005fbreadcrumb_005f0 = _jspx_th_carbon_005fbreadcrumb_005f0.doStartTag();
          if (_jspx_th_carbon_005fbreadcrumb_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.reuse(_jspx_th_carbon_005fbreadcrumb_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.reuse(_jspx_th_carbon_005fbreadcrumb_005f0);
          out.write("\n");
          out.write("\n");
          out.write("    <div id=\"middle\">\n");
          out.write("        <h2>");
          if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write(' ');
          out.print(Encode.forHtmlContent(roleName));
          out.write("\n");
          out.write("        </h2>\n");
          out.write("\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("\n");
          out.write("            <div class=\"yui-skin-sam\">\n");
          out.write("\n");
          out.write("                <!-- markup for expand/contract links -->\n");
          out.write("                <div id=\"expandcontractdiv\" style=\"margin-bottom:10px;\">\n");
          out.write("                    <a id=\"expand\" href=\"#\"><img src=\"images/expandall.gif\" align=\"top\"/> Expand all</a>\n");
          out.write("                    <a id=\"collapse\" href=\"#\" style=\"margin-left:20px\"><img src=\"images/contractall.gif\" align=\"top\"/>\n");
          out.write("                        Collapse all</a>\n");
          out.write("                </div>\n");
          out.write("\n");
          out.write("                <div id=\"treeDiv1\"></div>\n");
          out.write("            </div>\n");
          out.write("            <form name=\"permissionForm\" method=\"post\" action=\"edit-permissions-finish-ajaxprocessor.jsp\"\n");
          out.write("                  onsubmit=\"setFieldsOnSubmit()\">\n");
          out.write("                <span id=\"permissions\"></span>\n");
          out.write("                <table>\n");
          out.write("                    <tr>\n");
          out.write("                        <td class=\"buttonRow\">\n");
          out.write("                            <input type=\"hidden\" value=\"");
          out.print(Encode.forHtmlAttribute(prevUser));
          out.write("\" name=\"prevUser\"/>\n");
          out.write("                            <input type=\"hidden\" value=\"");
          out.print(Encode.forHtmlAttribute(prevPage));
          out.write("\" name=\"prevPage\"/>\n");
          out.write("                            <input type=\"hidden\" value=\"");
          out.print(Encode.forHtmlAttribute(roleName));
          out.write("\" name=\"roleName\"/>\n");
          out.write("                            <input type=\"hidden\" value=\"");
          out.print(Encode.forHtmlAttribute(prevPageNumber));
          out.write("\"\n");
          out.write("                                   name=\"prevPageNumber\"/>\n");
          out.write("                            <input class=\"button\" type=\"submit\" value=\"");
          if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write("\"/>\n");
          out.write("                            <input class=\"button\" type=\"button\" value=\"");
          if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write("\"\n");
          out.write("                                   onclick=\"history.back()\"/>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                </table>\n");
          out.write("            </form>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("\n");
          out.write("    <script type=\"text/javascript\" src=\"js/TaskNode.js\"></script>\n");
          out.write("\n");
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("\n");
          out.write("        var tree;\n");
          out.write("        var nodes = [];\n");
          out.write("        var nodeIndex;\n");
          out.write("\n");
          out.write("        function treeInit() {\n");
          out.write("            buildPermissionTaskNodeTree();\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        //handler for expanding all nodes\n");
          out.write("        YAHOO.util.Event.on(\"expand\", \"click\", function (e) {\n");
          out.write("            tree.expandAll();\n");
          out.write("            YAHOO.util.Event.preventDefault(e);\n");
          out.write("        });\n");
          out.write("\n");
          out.write("        //handler for collapsing all nodes\n");
          out.write("        YAHOO.util.Event.on(\"collapse\", \"click\", function (e) {\n");
          out.write("            tree.collapseAll();\n");
          out.write("            YAHOO.util.Event.preventDefault(e);\n");
          out.write("        });\n");
          out.write("\n");
          out.write("        //handler for checking all nodes\n");
          out.write("        YAHOO.util.Event.on(\"check\", \"click\", function (e) {\n");
          out.write("            checkAll();\n");
          out.write("            YAHOO.util.Event.preventDefault(e);\n");
          out.write("        });\n");
          out.write("\n");
          out.write("        //handler for unchecking all nodes\n");
          out.write("        YAHOO.util.Event.on(\"uncheck\", \"click\", function (e) {\n");
          out.write("            uncheckAll();\n");
          out.write("            YAHOO.util.Event.preventDefault(e);\n");
          out.write("        });\n");
          out.write("\n");
          out.write("\n");
          out.write("        YAHOO.util.Event.on(\"getchecked\", \"click\", function (e) {\n");
          out.write("            YAHOO.util.Event.preventDefault(e);\n");
          out.write("        });\n");
          out.write("\n");
          out.write("\n");
          out.write("        function buildPermissionTaskNodeTree() {\n");
          out.write("\n");
          out.write("            //instantiate the tree:\n");
          out.write("            tree = new YAHOO.widget.TreeView(\"treeDiv1\");\n");
          out.write("            tree.checked = true;\n");
          out.write("\n");
          out.write("\n");
          out.write("            ");
 printNodesOfTree(rootNode, "tree.getRoot()", 0, out); 
          out.write("\n");
          out.write("\n");
          out.write("            // Expand and collapse happen prior to the actual expand/collapse,\n");
          out.write("            // and can be used to cancel the operation\n");
          out.write("            tree.subscribe(\"expand\", function (node) {// return false to cancel the expand\n");
          out.write("            });\n");
          out.write("\n");
          out.write("            tree.subscribe(\"collapse\", function (node) {\n");
          out.write("            });\n");
          out.write("\n");
          out.write("            // Trees with TextNodes will fire an event for when the label is clicked:\n");
          out.write("            tree.subscribe(\"labelClick\", function (node) {\n");
          out.write("            });\n");
          out.write("\n");
          out.write("            // Trees with TaskNodes will fire an event for when a check box is clicked\n");
          out.write("            tree.subscribe(\"checkClick\", function (node) {\n");
          out.write("            });\n");
          out.write("\n");
          out.write("            tree.subscribe(\"clickEvent\", function (node) {\n");
          out.write("            });\n");
          out.write("\n");
          out.write("            //The tree is not created in the DOM until this method is called:\n");
          out.write("            tree.draw();\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        function checkAll() {\n");
          out.write("            var topNodes = tree.getRoot().children;\n");
          out.write("            for (var i = 0; i < topNodes.length; ++i) {\n");
          out.write("                topNodes[i].check();\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        function uncheckAll() {\n");
          out.write("            var topNodes = tree.getRoot().children;\n");
          out.write("            for (var i = 0; i < topNodes.length; ++i) {\n");
          out.write("                topNodes[i].uncheck();\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        // Gets the labels of all of the fully checked nodes\n");
          out.write("        // Could be updated to only return checked leaf nodes by evaluating\n");
          out.write("        // the children collection first.\n");
          out.write("        function getCheckedNodes(nodes) {\n");
          out.write("            nodes = nodes || tree.getRoot().children;\n");
          out.write("            checkedNodes = [];\n");
          out.write("            for (var i = 0, l = nodes.length; i < l; i = i + 1) {\n");
          out.write("                var n = nodes[i];\n");
          out.write("                //if (n.checkState > 0) { // if we were interested in the nodes that have some but not all children checked\n");
          out.write("                if (n.checkState === 2) {\n");
          out.write("                    checkedNodes.push(n.data.labelData); // just using label for simplicity\n");
          out.write("                }\n");
          out.write("\n");
          out.write("                if (n.hasChildren()) {\n");
          out.write("                    checkedNodes = checkedNodes.concat(getCheckedNodes(n.children));\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            return checkedNodes;\n");
          out.write("        }\n");
          out.write("\n");
          out.write("\n");
          out.write("        YAHOO.util.Event.onDOMReady(treeInit);\n");
          out.write("\n");
          out.write("\n");
          out.write("        function setFieldsOnSubmit() {\n");
          out.write("            var checkedNodes = getCheckedNodes();\n");
          out.write("            for (var i = 0, l = checkedNodes.length; i < l; i = i + 1) {\n");
          out.write("                var n = checkedNodes[i];\n");
          out.write("                var element = document.createElement(\"input\");\n");
          out.write("                element.setAttribute(\"type\", \"hidden\");\n");
          out.write("                element.setAttribute(\"name\", \"selectedPermissions\");\n");
          out.write("                element.setAttribute(\"value\", n);\n");
          out.write("                var span = document.getElementById(\"permissions\");\n");
          out.write("                span.appendChild(element);\n");
          out.write("            }\n");
          out.write("            return true;\n");
          out.write("        }\n");
          out.write("\n");
          out.write("    </script>\n");
          int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
        return;
      }
      _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
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

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /role/edit-permissions.jsp(141,12) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("permissions.of.the.role");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /role/edit-permissions.jsp(168,71) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f1.setKey("update");
    int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /role/edit-permissions.jsp(169,71) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f2.setKey("cancel");
    int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    return false;
  }
}