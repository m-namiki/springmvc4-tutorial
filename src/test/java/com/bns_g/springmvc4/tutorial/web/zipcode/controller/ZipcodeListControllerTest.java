/**
 *
 */
package com.bns_g.springmvc4.tutorial.web.zipcode.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author m2-namiki
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class ZipcodeListControllerTest {

	@Autowired
	private WebApplicationContext context;

	private MockMvc mockMvc;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void index() throws Exception {
		mockMvc.perform(get("/zipcode_list")).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void search() throws Exception {
		mockMvc.perform(post("/zipcode_list")).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void upload() throws Exception {
		mockMvc.perform(post("/zipcode_upload")).andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrlPattern("**/zipcode_list"));
	}
}
