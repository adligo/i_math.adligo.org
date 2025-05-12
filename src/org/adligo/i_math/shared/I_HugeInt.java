package org.adligo.i_math.shared;

import java.math.BigInteger;

/*
* This is a interface that represents a integer of unlimited size as it is backed by a linked list of IntArrayLinks. Each IntArrayLink will contain up to 8 ints.  <br/>
* <br/>
* 
* @author scott<br/>
*         <br/>
* 
* <pre><code>
* ---------------- Apache LICENSE-2.0 --------------------------
*
* Copyright 2023 Adligo Inc
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

public interface I_HugeInt {

    /**
     * Adds another I_HugeInt to this one and returns the result
     * 
     * @param other the I_HugeInt to add
     * @return a new I_HugeInt representing the sum
     */
    I_HugeInt add(I_HugeInt other);
    
	
	/**
	 * @return true if the int is less than 7 bits / 1 byte
	 */
	boolean isByte();
	/**
	 * @return true if the int is less than 15 bits / 2 byte
	 */
	boolean isShort();
	/**
	 * @return true if the int is less than 31 bits / 4 byte
	 */
	boolean isInt();
	/**
	 * @return true if the int is less than 63 bits / 6 byte
	 */
	boolean isLong();
	/**
	 * @return true if the int will fit in a <{@link BigInteger}>
	 */
	boolean isBig();
	
	/**
	 * @return true if this is zero or greater, false if it is a negative number
	 */
	boolean isPositive();
	
	/**
	 * 
	 * @return a byte representing this number
	 */
	byte toByte();
	
	/**
	 * 
	 * @return a short representing this number
	 */
	short toShort();
	
	/**
	 * 
	 * @return a int representing this number
	 */
	int toInt();
	
	/**
	 * 
	 * @return a long representing this number
	 */
	long toLong();
	
	/**
	 * 
	 * @return a <{@link BigInteger}> representing this number
	 */
	BigInteger toBig();
	
	
}
