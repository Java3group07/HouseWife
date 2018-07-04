package com.czxy.house.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/contract")
public class ContractController {
	//合同
	/**
	 * 上传合同
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping(path="/addContract.do")
	/*public String addContract(MultipartFile upload) throws Exception{
		upload.transferTo(new File("C:/Users/asus/workspace/maven/house_parent/house_web/src/main/webapp/img"));
		return "pages/contract";
	}*/
	
	public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{  
        
        String fileName = request.getSession().getServletContext().getRealPath("upload")+"/101.jpg";  
        
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));  
          
        String filename = "下载文件.jpg";  
        
        filename = URLEncoder.encode(filename,"UTF-8");  
        
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
            
        response.setContentType("multipart/form-data");   
        
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();  
    }  

}
