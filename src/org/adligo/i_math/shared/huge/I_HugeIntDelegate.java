package org.adligo.i_math.shared.huge;

import org.adligo.i_math.shared.IntType;

/**
 * This interface represents the backing of a HugeInt since there are multiple backings. <br/>
 * <br/>
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
public interface I_HugeIntDelegate {
	/**
	 * @return true if this is a DoublyLinkedList 
	 */
	boolean isList();
	
	/**
	 * @return the type of the backing delegate
	 */
	IntType getType();
}
