/**
 *
 */
package com.bns_g.springmvc4.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bns_g.springmvc4.tutorial.entity.Zipcode;

/**
 * 郵便番号情報を操作するリポジトリインターフェースです。
 *
 * @author m2-namiki
 *
 */
public interface ZipcodeRepository extends JpaRepository<Zipcode, Integer>, JpaSpecificationExecutor<Zipcode> {

}
