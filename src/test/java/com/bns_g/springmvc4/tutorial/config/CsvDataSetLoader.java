/**
 *
 */
package com.bns_g.springmvc4.tutorial.config;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.csv.CsvURLDataSet;
import org.springframework.core.io.Resource;

import com.github.springtestdbunit.dataset.AbstractDataSetLoader;

/**
 * CSV形式のデータセットを読み込むためのクラスです。
 *
 *
 * @author m2-namiki
 *
 */
public class CsvDataSetLoader extends AbstractDataSetLoader {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.github.springtestdbunit.dataset.AbstractDataSetLoader#createDataSet(org.
	 * springframework.core.io.Resource)
	 */
	@Override
	protected IDataSet createDataSet(Resource resource) throws Exception {
		return new CsvURLDataSet(resource.getURL());
	}

}
