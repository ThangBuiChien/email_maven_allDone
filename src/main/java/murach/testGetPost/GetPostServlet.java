package murach.testGetPost;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/getpost")

public class GetPostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");        
        PrintWriter out = response.getWriter();        
        try {
            out.println("<link rel=\"stylesheet\" href=\"styles/main.css\" type=\"text/css\"/>\n" +
"");
            out.println("<h1>test Servlet Post</h1>");
            out.println("<form action=\"abc\" method=\"get\">\n" +
"                    <input type=\"hidden\" name=\"action\" value=\"join\">\n" +
"                    <input type=\"submit\" value=\"Return to email list\">\n" +
"                    </form>");
            out.println("<a class = \"returnHome\" href=\"https://thangmainpage-f659678d7b24.herokuapp.com/#listEx\"><i class=\"fa-solid fa-house\"></i> &#127968 Back To Main Page</a>\n" +
"");
            

                    
        } finally {
            out.close();
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");        
        PrintWriter out = response.getWriter();        
        try {
            out.println("<link rel=\"stylesheet\" href=\"styles/main.css\" type=\"text/css\"/>\n" +
"");
            out.println("<h1>test Servlet Get</h1>");
            out.println("<form action=\"abc\" method=\"get\">\n" +
"                    <input type=\"hidden\" name=\"action\" value=\"join\">\n" +
"                    <input type=\"submit\" value=\"Return to email app\">\n" +
"                    </form>");
            out.println("<a class = \"returnHome\" href=\"https://thangmainpage-f659678d7b24.herokuapp.com/#listEx\"><i class=\"fa-solid fa-house\"></i> &#127968 Back To Main Page</a>\n" +
"");
        } finally {
            out.close();
        }
    }
}