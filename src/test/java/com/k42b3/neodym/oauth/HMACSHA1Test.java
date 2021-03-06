/**
 * neodym
 * A java library to access the REST API of amun
 * 
 * Copyright (c) 2011-2013 Christoph Kappestein <k42b3.x@gmail.com>
 * 
 * This file is part of neodym. neodym is free software: you can 
 * redistribute it and/or modify it under the terms of the GNU 
 * General Public License as published by the Free Software Foundation, 
 * either version 3 of the License, or at any later version.
 * 
 * neodym is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with neodym. If not, see <http://www.gnu.org/licenses/>.
 */

package com.k42b3.neodym.oauth;

import junit.framework.TestCase;

/**
 * HttpTest
 *
 * @author  Christoph Kappestein <k42b3.x@gmail.com>
 * @license http://www.gnu.org/licenses/gpl.html GPLv3
 * @link    https://github.com/k42b3/neodym
 */
public class HMACSHA1Test extends TestCase
{
	public void testBuild() throws Exception
	{
		HMACSHA1 sig = new HMACSHA1();
		String baseString = "foobar";
		String consumerSecret = "kd94hf93k423kf44";
		String tokenSecret = "pfkkdhi9sl3r4s00";

		String signature = sig.build(baseString, consumerSecret, tokenSecret);
		
		assertEquals("tps9L4s72ZSCdizKQwre8rG6yPE=", signature);
	}
}
