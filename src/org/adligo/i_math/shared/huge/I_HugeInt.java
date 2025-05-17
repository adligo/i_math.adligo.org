package org.adligo.i_math.shared.huge;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
* This is a interface that represents a integer of unlimited size as may be backed by a RAM based data structure,
* or a external data structure (data on disk, or data obtained through a service).   <br/>
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

public interface I_HugeInt extends I_Hugeable {

    /**
     * Adds another I_HugeInt to this one and returns the result
     * 
     * @param other the I_HugeInt to add
     * @return a new I_HugeInt representing the sum
     */
    I_HugeInt add(I_HugeInt other);

    /**
     * This method performs the add operation passing the data to the buffer,
     * then it creates a new HugeInt by backing it with the data in the buffer.
     * @param other
     * @param buffer
     * @return
     */
    I_HugeInt add(I_HugeInt other, I_HugeIntBuffer buffer);
    
    /**
     * @return true if this number is in Ram, otherwise some of the number may be 
     * on disk or in a database etc.
     */
    boolean isInRam();
	/**
	 * @return true if this is zero or greater, false if it is a negative number
	 */
	boolean isPositive();

	/**
	 * returns true of the current value of this is greater than the long i being passed in.
	 * @param i
	 * @return
	 */
	boolean isGreaterThan(long i);
	
	/**
	 * returns a stream of the underlying data, from little to bigending
	 * @return a stream of BigIntegers, which will contain a null on termination.
	 *   The BigIntegers will be positive number between {@link BigInteger}.ZERO and {@link HugeConstants}.MAX_CHUNK
	 */
	Stream<BigInteger> toStream();
	
	/**
	 * returns a stream of the underlying data, from little to bigending when the littleToBig is true
	 * , otherwise from big to littlending. 
	 * @param littleToBig 
	 * @return
	 */
	Stream<BigInteger> toStream(boolean littleToBig);
}
