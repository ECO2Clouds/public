package eu.eco2clouds.api.bonfire.occi.datamodel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * Copyright 2014 ATOS SPAIN S.A. 
 * 
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author: David Garcia Perez. Atos Research and Innovation, Atos SPAIN SA
 * e-mail david.garciaperez@atos.net
 */
public class DiskTest {

	@Test
	public void pojoTest() {
		Disk disk = new Disk();
		disk.setId("0");
		Storage storage = new Storage();
		disk.setStorage(storage);
		disk.setTarget("xvda");
		disk.setType("OS");
		
		assertEquals("0", disk.getId());
		assertEquals(storage, disk.getStorage());
		assertEquals("xvda", disk.getTarget());
		assertEquals("OS", disk.getType());
	}
}
