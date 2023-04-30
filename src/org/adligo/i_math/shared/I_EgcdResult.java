package org.adligo.i_math.shared;

import java.math.BigInteger;

/**
 * The result of a Extended GCD function; 
 * https://en.wikipedia.org/wiki/Extended_Euclidean_algorithm <br/>
 * <br/>
 * 
 * @author scott<br/>
 *         <br/>
 * 
 * <pre><code>
 * ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
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
public interface I_EgcdResult {

  /**
   * Get the Bézout coefficient corresponding to the coefficient A of the Extended GCD A function;
   * {@link https://en.wikipedia.org/wiki/Extended_Euclidean_algorithm}
   * @return
   */
  BigInteger getBca();
  
  /**
  * Get the Bézout coefficient corresponding to the coefficient A of the Extended GCD A function;
  * {@link https://en.wikipedia.org/wiki/Extended_Euclidean_algorithm}
  */
  BigInteger getBcb();
  
  /**
   * Get the result of the Greatest Common Divisor 
   * @return
   */
  BigInteger getResult();
}
