package bg.proxiad.demo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private Map<Long, User> users;

    private static final String PARAM_NAME_FROM_HTML_FORM = "name";

    private static final String PARAM_ID_FROM_HTML_FORM = "id";

    public void init() {
    this.users = (Map<Long, User>) getServletContext().getAttribute(InitConfigListener.USERS_ATTR);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/getUsers.jsp");
        request.setAttribute("users", users);
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String newUsername = request.getParameter(PARAM_NAME_FROM_HTML_FORM);
        if (newUsername == null || newUsername.isEmpty()) {
            throw new IllegalArgumentException("Username can't be null or empty");
        }
        System.out.println(newUsername);
        boolean duplicateName = users.values()
                .stream()
                .anyMatch(user -> user.getName().equals(newUsername));

        System.out.println(duplicateName);
        if (duplicateName) {
            throw new IllegalArgumentException("User already exists");
        }
        User user = new User(newUsername);
        users.put(user.getId(), user);

        response.sendRedirect(request.getContextPath() + "/");
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userIdParam = request.getParameter(PARAM_ID_FROM_HTML_FORM);
        System.out.println(userIdParam);
        Long userId = Long.valueOf(userIdParam);
        if (!users.containsKey(Long.valueOf(userId))) {
            throw new IllegalArgumentException("User with that id does not exists");
        }
        users.remove(userId);
        response.sendRedirect(request.getContextPath() + "/");
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userIdParam = request.getParameter(PARAM_ID_FROM_HTML_FORM);
        Long userId = Long.valueOf(userIdParam);
        if (!users.containsKey(userId)) {
            throw new IllegalArgumentException("User with that id does not exists");
        }
        User user = users.get(userId);
        String newName = request.getParameter(PARAM_NAME_FROM_HTML_FORM);
        user.setName(newName);
        response.sendRedirect(request.getContextPath() + "/");
    }

    public void destroy() {
    }
}