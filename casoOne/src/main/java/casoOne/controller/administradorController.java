package casoOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@Controller
@RequestMapping("/administrador")
public class administradorController {

        @GetMapping
        public String home(){
            return "administrador/home";
        }
}
