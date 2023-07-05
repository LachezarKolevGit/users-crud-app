package bg.proxiad.demo;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitConfigListener implements ServletContextListener {

  public static final String USERS_ATTR = "usersAttr";

    public InitConfigListener() {
        super();
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
   
    }

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    Map<Long, User> users = new HashMap<>();
    sce.getServletContext().setAttribute(USERS_ATTR, users);
  }
}
 