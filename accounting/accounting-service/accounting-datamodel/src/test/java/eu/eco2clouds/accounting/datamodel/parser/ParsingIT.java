package eu.eco2clouds.accounting.datamodel.parser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import eu.eco2clouds.applicationProfile.datamodel.ApplicationProfile;
import eu.eco2clouds.applicationProfile.parser.Parser;
import eu.eco2clouds.accounting.util.ReadFile;

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
public class ParsingIT {

	@Test
	public void test() throws Exception {
		String ap = ReadFile.readFile("src/test/resources/application-profile.json");
		ApplicationProfile applicationProfileObject = Parser.getApplicationProfile(ap);
		
		assertEquals(2, applicationProfileObject.getExperimentDescriptor().getResourcesCompute().size());
	}
}
