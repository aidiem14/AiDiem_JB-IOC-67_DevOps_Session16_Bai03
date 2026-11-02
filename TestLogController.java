package com.example.devops_ss16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLogController {

    private static final Logger log =
            LoggerFactory.getLogger(TestLogController.class);

    @GetMapping("/test-error")
    public String testError() {

        try {
            // Cố tình tạo lỗi chia cho 0
            int result = 10 / 0;

            return "Result: " + result;

        } catch (Exception e) {

            // Ghi Exception kèm Stack Trace
            log.error("Test Exception for JSON Logging", e);

            return "Exception đã được ghi log thành công!";
        }
    }
}

