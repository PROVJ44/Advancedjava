package com.factorial;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String numStr = request.getParameter("num");

        int num = 0;
        long fact = 1;

        if (numStr != null && !numStr.isEmpty()) {
            num = Integer.parseInt(numStr);

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        }

        // 🔥 SAME PAGE HTML WITH VALUE RETAINED
        out.println("<html><body>");
        out.println("<h2>Factorial Calculator</h2>");

        out.println("<form action='FactorialServlet' method='post'>");

        // 🔥 IMPORTANT FIX HERE
        out.println("Enter number: <input type='number' name='num' value='" + numStr + "' required>");

        out.println("<input type='submit' value='Calculate'>");
        out.println("</form>");

        if (numStr != null && !numStr.isEmpty()) {
            out.println("<h3>Factorial of " + num + " is: " + fact + "</h3>");
        }

        out.println("</body></html>");
    }
}