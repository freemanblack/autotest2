package hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("ALL")
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    private String home(){
        return "Hello World!";
    }

    public static void  main(String[] args) throws Exception{
        SpringApplication.run(SampleController.class,args);
    }


}
