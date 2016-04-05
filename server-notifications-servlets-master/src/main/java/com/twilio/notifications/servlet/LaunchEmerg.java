package com.twilio.notifications.servlet;

import com.twilio.notifications.models.Clients;
import com.twilio.notifications.utils.Client;
import com.twilio.notifications.utils.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/emergency")
public class LaunchEmerg extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
            String number = "+17326640567";
	    String message = "Chris, Just checking in!";
            new Client().sendMessage(number, message);
    }
}