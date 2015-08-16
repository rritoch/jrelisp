package com.vnetpublishing.lisp.jrelisp;

import com.vnetpublishing.jrelisp.core.Dispatcher;
import com.vnetpublishing.lisp.clapi.ILispImpl;

public class Main {

	public static final String DISPATCHER_CLASS = "org.armedbear.lisp.CLDispatcher";
	
	public static ILispImpl impl;
	
	public static void main(String[] args) {
		Dispatcher d = new Dispatcher(DISPATCHER_CLASS);
		impl = d.dispatch(args);
	}
}
