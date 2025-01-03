package com.blessingstone.ics;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HomeControllerTest
{
    @Autowired
    private MockMvc mockMvc;

    public void testHomePage() throws Exception
    {
	mockMvc.perform(get("/home"))
	.andExpect(status().isOk())
	.andExpect(view().name("home"))
	.andExpect((ResultMatcher) content()
		.string((containsString("Welcome to Spring Boot!"))));
    }
}
