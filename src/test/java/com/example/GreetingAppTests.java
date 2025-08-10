package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(GreetingApp.class)
public class GreetingAppTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testShowForm() throws Exception {
        // Test the GET endpoint
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("greeting"));
    }

    @Test
    public void testGreetWithValidName() throws Exception {
        // Test POST with valid name
        String name = "John";
        mockMvc.perform(MockMvcRequestBuilders.post("/greet")
                .param("name", name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("greeting"))
                .andExpect(MockMvcResultMatchers.model().attribute("greeting", "Hi, " + name + "!"));
    }

    @Test
    public void testGreetWithEmptyName() throws Exception {
        // Test POST with empty name
        mockMvc.perform(MockMvcRequestBuilders.post("/greet")
                .param("name", ""))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("greeting"))
                .andExpect(MockMvcResultMatchers.model().attribute("greeting", "Please enter a name!"));
    }

    @Test
    public void testGreetWithWhitespaceName() throws Exception {
        // Test POST with whitespace name
        mockMvc.perform(MockMvcRequestBuilders.post("/greet")
                .param("name", "   "))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("greeting"))
                .andExpect(MockMvcResultMatchers.model().attribute("greeting", "Please enter a name!"));
    }

    @Test
    public void testGreetWithSpecialCharacters() throws Exception {
        // Test POST with name containing special characters
        String name = "John@123#$%";
        mockMvc.perform(MockMvcRequestBuilders.post("/greet")
                .param("name", name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("greeting"))
                .andExpect(MockMvcResultMatchers.model().attribute("greeting", "Hi, " + name + "!"));
    }

    @Test
    public void testGreetWithLongName() throws Exception {
        // Test POST with a very long name
        String longName = "ThisIsAVeryLongNameThatShouldStillWorkFineWithoutAnyIssues";
        mockMvc.perform(MockMvcRequestBuilders.post("/greet")
                .param("name", longName))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("greeting"))
                .andExpect(MockMvcResultMatchers.model().attribute("greeting", "Hi, " + longName + "!"));
    }
}
