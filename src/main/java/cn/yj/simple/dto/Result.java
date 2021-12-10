package cn.yj.simple.dto;

/**
 * 全局结果返回
 * @author yaojun
 *
 */
public class Result {

	// 0-成功，非0-失败
	private int code = 0;
	private String msg = "成功";
	private Object data;
	
	public Result(){
	}

	public Result(Object data){
		this.data = data;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
