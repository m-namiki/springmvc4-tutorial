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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bns_g.springmvc4.tutorial.entity.Zipcode;

/**
 * {@link ZipcodeRepository}のテストケースです。
 *
 * @author m2-namiki
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
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
