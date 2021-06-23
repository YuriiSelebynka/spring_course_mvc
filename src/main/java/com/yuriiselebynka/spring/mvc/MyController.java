package com.yuriiselebynka.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Petrov");
//        emp.setSalary(500);
//        model.addAttribute("employee", emp);
        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

//    @RequestMapping(path = "/showDetails", method = RequestMethod.GET)
    @PostMapping("/showDetails")
    public String showEmpDetails(
            @Valid @ModelAttribute("employee") Employee emp
            , BindingResult bindingResult) {

//        System.out.println("surname length = " + emp.getSurname().length());

            if (bindingResult.hasErrors()) {
                return "ask-emp-details-view";
            }
            else {
                return "show-emp-details-view";
            }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(
//            @RequestParam("employeeName") String empName
//            , Model model) {

//        String name = emp.getName();
//        emp.setName("Mr. " + name);
//
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//
//        int salary = emp.getSalary();
//        emp.setSalary(salary * 10);

//        empName = "Mr. " + empName + "!";
//        model.addAttribute("nameAttribute", empName);


    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", " - udemy instructor");
//        return "show-emp-details-view";
//    }


}
