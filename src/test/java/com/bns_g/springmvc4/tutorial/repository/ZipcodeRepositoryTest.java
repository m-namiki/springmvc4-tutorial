/**
 *
 */
package com.bns_g.springmvc4.tutorial.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.bns_g.springmvc4.tutorial.Application;
import com.bns_g.springmvc4.tutorial.config.CsvDataSetLoader;
import com.bns_g.springmvc4.tutorial.config.RepositoryTestConfig;
import com.bns_g.springmvc4.tutorial.entity.Zipcode;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

/**
 * {@link ZipcodeRepository}のテストケースです。
 *
 * @author m2-namiki
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Application.class, RepositoryTestConfig.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
@DatabaseSetup("/db/zipcode.csv")
@Transactional
public class ZipcodeRepositoryTest {

	@Autowired
	private ZipcodeRepository zipcodeRepository;

	@Test

	public void findAll() throws Exception {
		List<Zipcode> list = zipcodeRepository.findAll();
		assertThat(list.size()).isEqualTo(2290);
	}

}
