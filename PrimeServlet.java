package com.prime;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String numStr = request.getParameter("num");

        out.println("<html><body>");

        out.println("<h2>Prime Number Checker</h2>");

        // 🔥 FORM WITH VALUE RETAINED
        out.println("<form action='PrimeServlet' method='post'>");
        out.println("Enter number: <input type='number' name='num' value='" 
                    + (numStr != null ? numStr : "") + "' required>");
        out.println("<input type='submit' value='Check'>");
        out.println("</form>");

        if (numStr != null && !numStr.isEmpty()) {

            int num = Integer.parseInt(numStr);
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                out.println("<h3>" + num + " is a Prime Number</h3>");
            } else {
                out.println("<h3>" + num + " is NOT a Prime Number</h3>");
            }
        }

        out.println("</body></html>");
    }
}