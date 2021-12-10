package com.project.employeecrud.service.employeeCalc;

import com.project.employeecrud.model.Employee;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class EmployeeCalculations {

    public String createUserName(Employee employee){
        String firstName = employee.getFirstName().toLowerCase().substring(0, 3);
        String lastName = employee.getLastName().toLowerCase().substring(0, 3);
        String phone = employee.getPhoneNumber().toString().substring(0, 3);
        String join = String.join("-", firstName, lastName, phone);
        return join;
    }

    public String generatePass(Employee employee){
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance

        for (int i = 0; i < 8; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }
}
