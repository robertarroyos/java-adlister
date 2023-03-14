package controllers;

import dao.Ads;
import dao.DaoFactory;
import dao.ListAdsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads")
public class AdsIndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getAdsDao();
        request.setAttribute("ads", adsDao.all());
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }



}
