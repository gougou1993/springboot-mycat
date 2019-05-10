package cn.wolfcode.mycat.advice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * CustomExceptionHandler
 */
@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void name(MaxUploadSizeExceededException e, HttpServletResponse resq) throws IOException {
        resq.setContentType("text/html;charset=utf-8");
        PrintWriter out = resq.getWriter();
        out.write("上传文件过大");
        out.flush();
        out.close();
    }
    
}