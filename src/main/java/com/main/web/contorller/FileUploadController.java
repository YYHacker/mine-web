package com.main.web.contorller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/fileupload.do")
public class FileUploadController {
	
	@RequestMapping(value ="/upload")
	@ResponseBody
	public Object upload(@RequestParam("name") String name,@RequestParam("file") MultipartFile file){
		if(!file.isEmpty()){
			FileOutputStream out = null;
			try {
				byte[] b = file.getBytes();
				String fileName = file.getOriginalFilename();
				String subfixx = fileName.substring(fileName.indexOf("."));
				File f = new File("C:/Users/admin/Desktop/"+name+subfixx);
				 out = new FileOutputStream(f);
				out.write(b);
				out.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return "success";
	}
	
	@PostMapping(value = "/form")
    public String handleFormUpload(@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file) {
		if(!file.isEmpty()){
			FileOutputStream out = null;
			try {
				byte[] b = file.getBytes();
				String fileName = file.getOriginalFilename();
				String subfixx = fileName.substring(fileName.indexOf("."));
				File f = new File("C:/Users/admin/Desktop/"+name+subfixx);
				 out = new FileOutputStream(f);
				out.write(b);
				out.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return "success";
    }
}
