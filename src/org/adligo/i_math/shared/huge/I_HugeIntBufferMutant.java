package org.adligo.i_math.shared.huge;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
* This is a interface that represents a integer of unlimited size as may be backed by a external data structure (data on disk, or data obtained through a service). 
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
public interface I_HugeIntBufferMutant extends I_HugeIntBuffer {

	/**
	 * @param stream
	 * @param smallToBig this is true for addition, subtraction, multiplication, and false for division 
	 *   which for HugeInts will likely take two parts (1 buffer large to small, 2 reverses the buffer to create a HugeInt)
	 */
	void write(Stream<BigInteger> stream, boolean smallToBig);
}
