/**
 *
 */
package com.bns_g.springmvc4.tutorial.web.zipcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 郵便番号情報一覧を制御するコントローラクラスです。
 *
 * @author m2-namiki
 *
 */
@Controller
public class ZipcodeListController {

	/**
	 * 郵便番号情報一覧画面の初期表示処理です。
	 *
	 * @param model
	 *            画面モデル
	 * @return 郵便番号情報一覧画面のパス
	 */
	@GetMapping("/zipcode_list")
	public String index(Model model) {
		return "zipcode_list";
	}

}
