package com.zhenghongfei.btracesamples.exception;

/**
 * ʹ��Btrace��ӡҵ��������׳����쳣��Ϣ
 *
 * @author Hongfei
 */
public class ExceptionBean3 {

	@SuppressWarnings("null")
	public void traceException() {
		try {
			String i = null;
			i.toString();
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static void main(String[] args) throws Exception {
		ExceptionBean3 object = new ExceptionBean3();
		while (true) {
			try {
				object.traceException();
			} catch (Exception e) {
			}
		}
	}
}