package com.zhenghongfei.btracesamples.exception;

/**
 * ʹ��Btrace��ӡҵ�������δ������쳣��Ϣ
 * @author Hongfei
 */
public class ExceptionBean2 {

	@SuppressWarnings("null")
	public void traceException() {
		try {
			String i = null;
			i.toString();
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) throws Exception {
		ExceptionBean2 object = new ExceptionBean2();
		while (true) {
			object.traceException();
		}
	}
}