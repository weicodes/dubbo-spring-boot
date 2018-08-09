package com.wd.utils;

import javax.servlet.http.HttpServletRequest;

public class AppUtil {

	static String xff = "X-Forwarded-For";

	public static String getAppClientIp(HttpServletRequest request) {
		String appIp = "0.0.0.0";

		String xffIp = request.getHeader(xff);
		if (xffIp == null || "".equals(xffIp)) {
			appIp = request.getRemoteAddr();
		} else {
			appIp = xffIp.split(",")[0];
		}
		return appIp;
	}
}
