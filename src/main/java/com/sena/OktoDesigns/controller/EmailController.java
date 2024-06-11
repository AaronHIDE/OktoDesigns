package com.sena.OktoDesigns.controller;

import com.sena.OktoDesigns.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail(@RequestParam("to") String to,
                                            @RequestParam("subject") String subject,
                                            @RequestParam("text") String text,
                                            @RequestPart("file") MultipartFile file) {
        try {
            emailService.sendMessageWithAttachment(to, subject, text, file);
            logger.info("Email enviado con éxito a: {}", to);
            return ResponseEntity.ok("Email enviado con éxito");
        } catch (Exception e) {
            logger.error("Error al enviar el email", e);
            return ResponseEntity.status(500).body("Error al enviar el email");
        }
    }
}
