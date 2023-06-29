package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.MyView;
import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

public interface ControllerV3 {

    ModelAndView process(Map<String, String> paramMap);

}
