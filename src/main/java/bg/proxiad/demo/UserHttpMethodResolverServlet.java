package bg.proxiad.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet(name = "MethodResolverServlet", value = "/resolve")
public class UserHttpMethodResolverServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user");
        String httpMethod = request.getParameter("method");

        if (httpMethod.equals("DELETE")){
            DeleteHttpRequestAdapter deleteRequest = new DeleteHttpRequestAdapter(request);
            dispatcher.forward(deleteRequest, response);
        } else if (httpMethod.equals("PUT")){
            PutHttpRequestAdapter putRequest = new PutHttpRequestAdapter(request);
            dispatcher.forward(putRequest, response);
        }

    }

}
