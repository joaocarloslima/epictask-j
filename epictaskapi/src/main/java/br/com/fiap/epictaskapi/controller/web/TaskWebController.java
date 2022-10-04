package br.com.fiap.epictaskapi.controller.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.service.TaskService;

@Controller
@RequestMapping("/task")
public class TaskWebController {


    @Autowired
    TaskService service;

    @GetMapping
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("task/index");
        mv.addObject("tasks", service.listAll());
        return mv;
    }

    @GetMapping("new")
    public String form(Task task){
        return "task/form";
    }

    @PostMapping
    public String create(@Valid Task task, BindingResult binding, RedirectAttributes redirect){
        if(binding.hasErrors()) return "task/form";
        service.save(task);
        redirect.addFlashAttribute("message", "Tarefa cadastrada com sucesso");
        return "redirect:/task";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect){
        service.deleteById(id);
        redirect.addFlashAttribute("message", "Tarefa apagada com sucesso");
        return "redirect:/task";
    }
    
}
