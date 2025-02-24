package Controler;

import DTO.EmployeeDTO;
import DTO.LoginDTO;
import Service.EmployeeService;
import Service.LoginMesage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Service.EmployeeImpl;
@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeImpl employeeImpl;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginMesage loginResponse =  employeeImpl.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}
