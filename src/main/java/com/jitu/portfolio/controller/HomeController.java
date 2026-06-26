package com.jitu.portfolio.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jitu.portfolio.model.Project;
import com.jitu.portfolio.model.Skill;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Personal Details
        model.addAttribute("name", "JITENDRA KUMAR");
        model.addAttribute("role", "Java Developer | Spring Boot | ");

        // Updated Skills List based on your profile
        List<Skill> skills = List.of(
            new Skill("Java", 90),
            new Skill("DSA", 70),
            new Skill("Html",60),
            new Skill("CSS",50),
            new Skill("Spring Boot", 80),
            new Skill("JavaScript", 30),
            new Skill("MySQL", 80)
        );

        // Your 5 Specific Projects
        		List<Project> projects = List.of(
        			    new Project(
        			        "OneHire",
        			        "Home service booking platform with admin & user modules",
        			        "Spring Boot, Thymeleaf, MySQL",
        			        "https://github.com/jitendrakr0550/onehire",
        			        "/images/onehire.png" // Service/Work related photo
        			    ),
        			    new Project(
        			        "Voice Assistant",
        			        "Voice controlled assistant for opening apps and automation",
        			        "Java, Python, AI",
        			        "https://github.com/jitendrakr0550/voice-assistant",
        			        "/images/voiceAssistent.png" // AI/Robot related photo
        			    ),
        			    new Project(
        			        "Online Voting System",
        			        "Secure online voting system with admin panel",
        			        "Spring Boot, MySQL",
        			        "https://github.com/jitendrakr0550/online-voting",
        			        "/images/voting.png"// Voting/Law related photo
        			    ),
        			    new Project(
        			        "Feedback System",
        			        "Student & employee feedback management system",
        			        "Java, Spring, MySQL",
        			        "https://github.com/jitendrakr0550/feedback-system",
        			        "/images/feedbackSystem.png" // Feedback/Business photo
        			    ),
        			    new Project(
            			        "Smart Resume Builder",
            			        "Dynamic resume generation and styling tool",
            			        "Java, Spring, MySQL,Html,CSS",
            			        "https://github.com/jitendrakr0550/feedback-system",
            			        "/images/resume.png" // Feedback/Business photo
            			    ),
        			    
        			    
        			    new Project(
        			        "Portfolio Website",
        			        "Animated personal portfolio website",
        			        "HTML, CSS, JavaScript",
        			        "https://github.com/jitendrakr0550/portfolio",
        			        "/images/portfolio.png" // Portfolio/Laptop photo
        			    )
        			);
        	model.addAttribute("projects", projects);
        	model.addAttribute("skills", skills);
        return "index";
    }
}