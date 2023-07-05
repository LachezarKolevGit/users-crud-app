package bg.proxiad.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class DeleteHttpRequestAdapter extends HttpServletRequestWrapper {

    public DeleteHttpRequestAdapter(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getMethod() {
        return "DELETE";
    }
}
