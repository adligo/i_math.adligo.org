package org.adligo.i_math.shared;


/**
* This Exception should be used for any kind of error that occurs in this set of libraries. <br/>
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
public class MathException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MathException(String message) {
		super(message);
	}
	
	public MathException(String message, Throwable chain) {
		super(message, chain);
	}
}
