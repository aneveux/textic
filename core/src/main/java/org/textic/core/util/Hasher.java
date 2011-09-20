package org.textic.core.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hasher {

	private static String hex(byte[] data) {
		StringBuffer buffer = new StringBuffer();
		for (byte b : data) {
			int halfbyte = (b >>> 4) & 0x0F;
			int two_halfs = 0;
			do {
				if ((0 <= halfbyte) && (halfbyte <= 9))
					buffer.append('0' + halfbyte);
				else
					buffer.append('a' + (halfbyte - 10));
				halfbyte = b & 0x0F;
			} while (two_halfs++ < 1);
		}
		return buffer.toString();
	}

	public static String sha1(String text) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {
		MessageDigest md;
		md = MessageDigest.getInstance("SHA-1");
		byte[] sha1hash = new byte[40];
		md.update(text.getBytes("iso-8859-1"), 0, text.length());
		sha1hash = md.digest();
		return hex(sha1hash);
	}

}
