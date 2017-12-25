/**
 *
 */
package com.bns_g.springmvc4.tutorial.web.zipcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bns_g.springmvc4.tutorial.web.common.AbstractTutorialController;
import com.bns_g.springmvc4.tutorial.web.zipcode.command.ZipcodeListCommand;

/**
 * 郵便番号情報一覧を制御するコントローラクラスです。
 *
 * @author m2-namiki
 *
 */
@Controller
public class ZipcodeListController extends AbstractTutorialController {

	// -------------------------------------------------------------------------------------------------
	// [Properties]

	// -------------------------------------------------------------------------------------------------
	// [public methods]

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

	/**
	 * 指定された検索条件を基に郵便番号情報を検索します。
	 *
	 * @param model
	 *            画面モデル
	 * @param command
	 *            郵便番号情報一覧画面の入出力情報
	 * @return 郵便番号情報一覧画面のパス
	 */
	@PostMapping("/zipcode_list")
	public String search(Model model, ZipcodeListCommand command) {
		return "zipcode_list";
	}

	/**
	 * 指定された郵便番号ファイルをアップロードして、DBに登録します。
	 *
	 * @param model
	 *            画面モデル
	 * @param command
	 *            郵便番号情報一覧画面の入出力情報
	 * @param errors
	 *            入力チェック結果
	 * @param attributes
	 *            リダイレクト用画面モデル
	 * @return 郵便番号情報一覧画面へのリダイレクトパス
	 */
	@PostMapping("/zipcode_upload")
	public String uploadFiles(Model model, ZipcodeListCommand command, Errors errors, RedirectAttributes attributes) {

		// // アップロードファイルが指定されていない場合はエラー
		// if (command.getUploadFile().isEmpty()) {
		// // TODO エラーメッセージを設定する
		// return redirect("zipcode_list");
		// }

		return redirect("zipcode_list");
	}
}
