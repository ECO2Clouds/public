/* 
 * Copyright 2014 Politecnico di Milano.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.

 *  @author: Pierluigi Plebani, Politecnico di Milano, Italy
 *  e-mail pierluigi.plebani@polimi.it

 */
package eu.eco2clouds.component;

/**
 * @author  plebani
 */
public class VMManagerFactory {
    
    /**
	 * @uml.property  name="vmManager"
	 * @uml.associationEnd  
	 */
    private static VMManager vmManager = null;

    public static VMManager getInstance() {

        if (vmManager == null) {

            vmManager = new VMManager();

        }
        return vmManager;

    }
    
}