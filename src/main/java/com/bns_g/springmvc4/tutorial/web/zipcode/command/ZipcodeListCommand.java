/**
 *
 */
package com.bns_g.springmvc4.tutorial.web.zipcode.command;

import org.springframework.web.multipart.MultipartFile;

/**
 * 郵便番号情報一覧画面の入出力情報を保持するクラスです。
 *
 * @author m2-namiki
 *
 */
public class ZipcodeListCommand {

	// -------------------------------------------------------------------------------------------------
	// [Properties]

	/** アップロードするファイルです。 */
	private MultipartFile uploadFile;

	// -------------------------------------------------------------------------------------------------
	// [getter and setter methods]

	public MultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

}
