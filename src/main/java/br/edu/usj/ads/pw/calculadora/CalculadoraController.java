package br.edu.usj.ads.pw.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalculadoraController {
    
    @PostMapping(value="calcular")
    public ModelAndView postCalcular(@RequestParam String operando1, @RequestParam String operando2, @RequestParam String operador) {
        Double operando1Double = Double.valueOf(operando1);
        Double operando2Double = Double.valueOf(operando2);

        Double resultado = null;

        if ("+".equals(operador)) {
            resultado = operando1Double + operando2Double;
        }

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("resultado", resultado);
        return modelAndView;
    }
    
}
