package com.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int count = 1;
        String storedName = null;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("username")) {
                    storedName = URLDecoder.decode(c.getValue(), "UTF-8");
                }

                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                    count++;
                }
            }
        }

        // if first visit, use input name
        if (storedName == null) {
            storedName = name;
        }

        // store cookies
        Cookie nameCookie = new Cookie("username",
                URLEncoder.encode(name, "UTF-8"));

        Cookie countCookie = new Cookie("visitCount", String.valueOf(count));

        nameCookie.setMaxAge(60 * 5);
        countCookie.setMaxAge(60 * 5);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // OUTPUT
        out.println("<html><body>");
        out.println("<h2>Welcome back " + storedName + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times</h3>");
        out.println("<h3>Cookie will expire within 1 minute<h3>");
        out.println("</body></html>");
    }
}
