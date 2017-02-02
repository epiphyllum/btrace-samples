package com.zhenghongfei.btracesamples.exception;

/**
 * ʹ��Btrace��ӡҵ��������쳣����û����Ϣ��
 * <p>
 * <li>JDK5��6��7�쳣����Ϊ��20707
 * <li>JDK8�쳣����Ϊ��115717
 */
public class ExceptionBean1 {

	@SuppressWarnings("null")
	public void traceException() {
		try {
			String o = null;
			o.toString();
		} catch (Exception e) {
			if (e.getStackTrace().length == 0) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		ExceptionBean1 object = new ExceptionBean1();
		while (true) {
			object.traceException();
		}
	}
}