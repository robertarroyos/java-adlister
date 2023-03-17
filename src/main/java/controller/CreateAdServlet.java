package controller;

import dao.Ads;
import dao.DaoFactory;
import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
            .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adTitle = request.getParameter("title");
        String adDescription = request.getParameter("description");
        Ad ad = new Ad(
            1, // for now we'll hardcode the user id
            adTitle,
            adDescription
        );
        Ads adsDao = DaoFactory.getAdsDao();
        adsDao.insert(ad);
        response.sendRedirect("/ads");
    }
}
