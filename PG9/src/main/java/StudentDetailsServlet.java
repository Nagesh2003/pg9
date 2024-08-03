import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class StudentDetailsServlet extends HttpServlet {
public StudentDetailsServlet() {
super();
// TODO Auto-generated constructor stub
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.setContentType("text/html");
// Get student details from the request
String name = request.getParameter("name");
String usn = request.getParameter("usn");
int totalMarks = Integer.parseInt(request.getParameter("totalMarks"));
// Generate student details message
String detailsMessage = "Student Name: " + name + "<br>" + "USN: " + usn + "<br>"+ "Total Marks: " + totalMarks;
// Write student details message to the response
response.getWriter().println("<html><body>");
response.getWriter().println("<h1>Student Details</h1>");
response.getWriter().println("<p>" + detailsMessage + "</p>");
response.getWriter().println("</body></html>");
}
}