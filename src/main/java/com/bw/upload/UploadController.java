package com.bw.upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@RequestMapping("upload")
	public String upload(MultipartFile myfile,Model model) throws IllegalStateException, IOException {
		
		//知道上传到哪?    111.jpg
		//获得服务器路径
		//String realPath = request.getSession().getServletContext().getRealPath("");
		 //指定上传的路径   
		String url="e:/pic/upload";
		
		//获得文件的名称
		String filename = myfile.getOriginalFilename();//fnjgnj1.111.jpg
		String uuid = UUID.randomUUID().toString();
		
		//创建新的文件 存放要上传的文件
		File file=new File(url+"/"+uuid+filename);//e:/pic/upload/111.jpg
		
		//上传
		myfile.transferTo(file);
		model.addAttribute("filename", uuid+filename);
		return "upload";
	}

}
