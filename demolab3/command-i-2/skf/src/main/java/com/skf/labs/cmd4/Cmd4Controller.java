package com.skf.labs.cmd4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Cmd4Controller {

  @GetMapping("/")
  public String index(Model model) throws IOException {

    return "index";
  }

  @PostMapping("/")
  public String home(@RequestParam(name = "ip") String ip, Model model)
      throws IOException, InterruptedException {
    
    ip = ip.replace("`", " ").replace(";", " ").replace("&"," ");
   
    System.out.println(ip);
    Process pb = new ProcessBuilder("/bin/sh", "-c",
        "ping -c1 " + ip + " > ./ping_output")
        .redirectErrorStream(true)
        .start();
    pb.waitFor(5, TimeUnit.SECONDS);

    BufferedReader br = new BufferedReader(new FileReader("./ping_output"));
    StringBuilder content = new StringBuilder();
            String line;
            while((line = br.readLine())!= null){
                content.append(line+"</br>");
            }
    model.addAttribute("read", content.toString());
    return "index";
  }
}
