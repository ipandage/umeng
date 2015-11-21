package net.tatabang.push.exception;

/**
 * 调用接口抛出的异常
 * 
 * @author xingang
 * @date 2015年11月21日
 */
public class UmengException extends Exception {

	private static final long serialVersionUID = 7148145661883468514L;

	private String errorCode;
	private String errorMsg;

	public UmengException(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public UmengException(String errorMsg) {
		this.errorCode = "-1";
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	@Override
	public String getMessage() {
		return this.errorCode + "," + this.errorMsg;
	}
}
