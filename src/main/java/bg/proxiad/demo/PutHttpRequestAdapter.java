package bg.proxiad.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class PutHttpRequestAdapter extends HttpServletRequestWrapper {


    public PutHttpRequestAdapter(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getMethod() {
        return "PUT";
    }
}
