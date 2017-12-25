/**
 *
 */
package com.bns_g.springmvc4.tutorial.web.common;

/**
 * @author m2-namiki
 *
 */
public abstract class AbstractTutorialController {

	// -------------------------------------------------------------------------------------------------
	// [Properties]

	/** リダイレクト用のプレフィックスです。 */
	private static final String REDIRECT_PREFIX = "redirect:";

	// -------------------------------------------------------------------------------------------------
	// [protected methods]

	/**
	 * 指定されたパスにリダイレクト用のプレフィックスを追加します。
	 *
	 * @param path
	 *            パス
	 * @return リダイレクト用のプレフィックスが追加されたパス
	 */
	protected String redirect(String path) {
		return REDIRECT_PREFIX + path;
	}

}
