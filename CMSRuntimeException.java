package com.xsk.cms.utils;

/**
 * 
 * @ClassName: CMSRuntimeException
 * @Description: 自定义异常
 * @author: xsk
 * @date: 2019年7月12日 下午3:47:13
 */
public class CMSRuntimeException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	public CMSRuntimeException() {
		super();
	}

	public CMSRuntimeException(String message) {
		super(message);
	}

}
