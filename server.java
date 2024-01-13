import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/excel")
public class server {

    @PostMapping("/analyze")
    public ResponseEntity<Map<String, String>> analyzeExcel(@RequestParam("file") MultipartFile file) {
        Map<String, String> result = new HashMap<>();

        try {
            Workbook workbook = new XSSFWorkbook(file.getInputStream());
            Sheet sheet = workbook.getSheetAt(0); 

            List<EmployeeShift> shifts = 
            for (EmployeeShift shift : shifts) {
                System.out.println("Employee: " + shift.getName() + ", Position: " + shift.getPosition());
            }

            workbook.close();

            result.put("status", "success");
            result.put("message", "Analysis completed successfully.");
            return ResponseEntity.ok(result);
        } catch (IOException e) {
            result.put("status", "error");
            result.put("message", "Error analyzing the Excel file.");
            return ResponseEntity.badRequest().body(result);
        }
    }

}

