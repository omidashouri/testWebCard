package ir.imi.testwebcard;

import ir.imi.testwebcard.domain.soap.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestWebCardApplicationTests {

    @Test
    void contextLoads() {

        EtsGeneralDataProviderService service = new EtsGeneralDataProviderService();

        // Get the SOAP interface
        EtsGeneralDataProviderServiceSoap soap = service.getEtsGeneralDataProviderServiceSoap();

        // Call the `getAllCurrentlyEmployees` method
        ArrayOfEmployeeDataModel employees = soap.getAllEmployees();

        // Process the result
        if (employees != null && employees.getEmployeeDataModel() != null) {
            for (EmployeeDataModel employee : employees.getEmployeeDataModel()) {
//                System.out.println("Employee ID: " + employee.getEmployeeId());
                System.out.println("Employee Name: " + employee.getFullName());
                // Add more fields if necessary
            }
        }
        System.out.println("salam");
    }
}
