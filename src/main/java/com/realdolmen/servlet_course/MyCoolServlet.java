package com.realdolmen.servlet_course;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(urlPatterns = "/hello.html")
public class MyCoolServlet extends HttpServlet {
    public MyCoolServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Swaggie da blooock" + (5 * 3) + " -> " + new Date());
        out.println(req.getParameter("name") + " Dit is de parameter, holy balls");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");

        resp.setContentType("text/html");
        resp.setHeader("myheader", "myvalue");

        PrintWriter out = resp.getWriter();
        out.println("Hello " + firstname + " " + lastname);
    }
}
