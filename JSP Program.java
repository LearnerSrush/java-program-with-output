//7a. Build a Session Management using JSP program set with one minute session expiry time to get your name through text box and press submit to display the message by greeting Hello your name!. Check the expiry of the session after one minute

Java Server Pages
JavaServer Pages (JSP) is a server-side technology that allows you to create dynamic web content by
combining HTML with Java code. It's part of the Java EE (Enterprise Edition) platform and was designed
to make it easier for developers to build web applications.
Key aspects of JSP:
Dynamic Content Generation
1. JSP pages can generate dynamic content based on user input, database data, or other variables
2. Content changes based on programming logic and conditions
HTML with Java
 JSP lets you write regular HTML code and embed Java code within it
 Special tags (<%...%>) are used to include Java code in the page
3. Behind the Scenes
 When a JSP page is requested, it's automatically converted into a servlet
 The server compiles and executes the Java code, then sends the resulting HTML to the client's
browser
4. Common Uses
 Creating dynamic web pages
 Building user interfaces for web applications
 Displaying database results
 Handling form submissions
 Session management
5. Advantages
 Simpler than pure servlets for creating web pages
 Separates presentation from business logic
 Reusable components
 Easy integration with existing Java code

JSP Tags:
Scriptlet Tags <% ... %>
Contains Java code executed during request processing
Example:
<% String name = "John"; %>
Declaration Tags <%! ... %>
Declares methods or fields at class level
<%! int count = 0; %>
<%! public int increment() { return ++count; } %>
Expression Tags <%= ... %>
Outputs values directly to the page
Welcome, <%= name %>!
Directive Tags <%@ ... %>
Page-level instructions
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
Action Tags jsp:...
Predefined functionality
<jsp:include page="header.jsp" />

JSP Implicit Objects:
request - HttpServletRequest object
response - HttpServletResponse object
session - HttpSession object
application - ServletContext object
out - JspWriter for output
pageContext - PageContext object
config - ServletConfig object
page - Reference to the servlet instance
exception - Exception object (in error pages)

Variables:
Local Variables (declared in scriptlets)
jspCopy<%
int x = 10;
String message = "Hello";
%>
Instance Variables (declared in declarations)
<%!
private int counter = 0;
private String title = "My Page";
%>
Control Statements:
If-Else:
<% if (user.isLoggedIn()) { %>
Welcome back!
<% } else { %>
Please log in.
<% } %>
Switch:
<%
switch(userType) {
case "admin": %>
<h1>Admin Panel</h1>
<% break;
case "user": %>
<h1>User Dashboard</h1>
<% break;
} %>
Loops:
For Loop:
<% for(int i = 0; i < 5; i++) { %>
<p>Item <%= i %></p>
<% } %>

While Loop:
<%
int i = 0;
while(i < items.size()) { %>
<li><%= items.get(i) %></li>
<% i++; } %>
Enhanced For Loop:
<% for(String item : itemList) { %>
<div><%= item %></div>
<% } %>
Methods:
Instance Methods:
<%!
public String formatDate(Date date) {
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
return sdf.format(date);
}
%>
Using Methods:
<p>Today's date: <%= formatDate(new Date()) %></p>

Session Management using JSP
index.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="welcome.jsp">
Please Enter your name : <input type="text" name="uname"><br/>
<input type="submit" value="Start the session"><br/>
</form>
</body>
</html>

The name which is entered by user in the index page is displayed on the welcome.jsp page and it saves
the same variable in the session object so that it can be retrieved on any page till the session becomes
inactive.
welcome.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("uname");
out.print("Welcome!"+name);
out.print("<br>Session has started ... "+name);
session.setAttribute("user",name);
out.print("<br>your name has been stored in session object");
session.setMaxInactiveInterval(60);
out.print("<br>One minute is set for the session expiry");
out.print("<br>Kindly press the following link to check it<br>");
%>
<a href="second.jsp">Display the value</a>
</body>
</html>
In second.jsp page, the value of variable is retrieved from the session and displayed.
second.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>designation

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Display the session value on this page</h1>
<%
String name=(String)session.getAttribute("user");
if(name==null)
out.print("Sorry the session has ended");
else
out.print("Hello "+name);
%>
</body>
</html>
