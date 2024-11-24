package projectcoffe.cofffeDemo.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import projectcoffe.cofffeDemo.dto.HachuList;
import projectcoffe.cofffeDemo.dto.User;
import projectcoffe.cofffeDemo.dto.Zaiko;

@Controller
public class LoginController{
	HachuList hcl =  new HachuList();
	Zaiko zaiko = new Zaiko();
	@GetMapping("/login")
	public String login() {
		return "views/CofeShopProject/index.html";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute User user) {
		System.out.println("username: " + user.getUsername());
		System.out.println("password: " + user.getPassword());
		
		return "views/CofeShopProject/login.html";
	}
	@GetMapping("/hacchukakunin")
	public String hacchukakunin(HttpServletRequest req, @RequestParam(name="cf1" , required = false) int cf1
								,@RequestParam(name="cf2" , required = false) int cf2,
								@RequestParam(name="cf3" , required = false) int cf3,@RequestParam(name="cf4" , required = false) int cf4,
								@RequestParam(name="cf5" , required = false) int cf5,@RequestParam(name="cf6" , required = false) int cf6,
								@RequestParam(name="milk" , required = false) int milk,@RequestParam(name="hukuro" , required = false) int hukuro,@RequestParam(name="tisshu" , required = false) int tisshu
								) throws IOException {
						
		hcl.setCf1(cf1);
		hcl.setCf2(cf2);
		hcl.setCf3(cf3);
		hcl.setCf4(cf4);
		hcl.setCf5(cf5);
		hcl.setCf6(cf6);
		hcl.setMilk(milk);
		hcl.setHukuro(hukuro);
		hcl.setTisshu(tisshu);
		zaiko.zaikohuyashi(hcl);
		req.setAttribute("hcl", hcl);
		req.setAttribute("zaiko", zaiko);
		String fileName = "kanri.txt";
		BufferedReader abc =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter fWrite = new BufferedWriter(new FileWriter("kanri.txt"));
		if(hcl.getCf1() != 0) {
		fWrite.write("コーヒー種類A " + hcl.getCf1() + " 在庫 " + zaiko.getZaikoCf1());
		}
		System.out.println("cf1 " + hcl.getCf1() + "  cf2 " + hcl.getCf2() + "  cf3 " + hcl.getCf3() + "  cf4 " + hcl.getCf4()+"  cf5 " + hcl.getCf5()+
				"  cf6 " + hcl.getCf6()+ "  milk " + hcl.getMilk()+ "  hukuro " + hcl.getHukuro()+ "  tsshu " + hcl.getTisshu());
		System.out.println("cf1: " + zaiko.getZaikoCf1() + "cf2: " + zaiko.getZaikoCf2());
		return "views/CofeShopProject/login.html";
	}
	
}
