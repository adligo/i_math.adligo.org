package org.adligo.i_math.shared.huge;

import java.math.BigInteger;

/**
 * This class contains constants that are small enough to not overflow users memory, but large enough to make points.
 *
 * 
 * @author scott<br/>
 *         <br/>
 * 
 * <pre><code>
 * ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2025 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code><pre>
 */
public class HugeConstants {
	/**
	 * This is 8 * 6 * 8, which will optimize the chunk size for ten64 text encoding which encodes 6 bits per character,
	 * and regular old (48) bytes which encode for 8 bits per byte.  Or also 64 ten64 characters.
	 * However, I subtract one in order to get all f's from the toString(16) method.
	 */
	public static final BigInteger MAX_CHUNK = BigInteger.TWO.pow(384).subtract(BigInteger.ONE);
	/**
	 * This is the number of bytes currently in MAX_CHUNK, the two must be kept in sync.
	 * However we add one
	 */
	public static final int MAX_CHUNK_BYTES = 48;
	
	public static final BigInteger MIN_BYTE = BigInteger.valueOf(Byte.MIN_VALUE);
	public static final BigInteger MAX_BYTE = BigInteger.valueOf(Byte.MAX_VALUE);
	public static final BigInteger MIN_SHORT = BigInteger.valueOf(Short.MIN_VALUE);
	public static final BigInteger MAX_SHORT = BigInteger.valueOf(Short.MAX_VALUE);
	public static final BigInteger MIN_INT = BigInteger.valueOf(Integer.MIN_VALUE);
	public static final BigInteger MAX_INT = BigInteger.valueOf(Integer.MAX_VALUE);
	public static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
	public static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);
	
	public static void main(String [] args) {
		System.out.println(String.format("MAX_CHUNK is \t %,d",MAX_CHUNK));
		BigInteger MAX_CHUNK2 = BigInteger.TWO.pow(48);
		System.out.println(String.format("MAX_CHUNK2 is \t %,d",MAX_CHUNK2));
		//BigInteger MAX = BigInteger.TWO.pow(32).pow(Integer.MAX_VALUE);
		//last pow 10,000,000 (7 zeros) takes about 9 min on my AMD 16 core 3.40 GHz machine
		//last pow 100,000,000 (8 zeros) complains 'BigInteger would overflow supported range'
		BigInteger MAX = BigInteger.TWO.pow(32).pow(50000000);
		System.out.println(String.format("MAX is \t %,d",MAX));
	}
}
