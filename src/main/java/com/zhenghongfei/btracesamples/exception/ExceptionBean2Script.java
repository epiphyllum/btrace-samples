package com.zhenghongfei.btracesamples.exception;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;

/**
 * �����ǰ�ȫģʽ������ֱ�ӵ��ô����Ӧ�ó�������ķ���,������������ͬʱ����
 * <p>
 * <li>bin/btrace.bat -Dcom.sun.btrace.unsafe=true
 * <li>@BTrace(unsafe=true)
 *
 * @author Hongfei
 */
@BTrace(unsafe = true)
public class ExceptionBean2Script {

	@OnMethod(clazz = "com.zhenghongfei.btracesamples.exception.ExceptionBean2",
			method = "traceException",
			location = @Location(Kind.CATCH))
	public static void traceCatch(Exception e) {
		e.printStackTrace();
		// e.printStackTrace(); ע�͵����д��룬�ٴ����нű��������ҵ���������쳣��Ϣ
	}
}