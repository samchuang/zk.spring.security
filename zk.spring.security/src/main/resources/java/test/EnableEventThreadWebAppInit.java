/* MyWebAppInit.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Nov 20, 2012 2:35:43 PM , Created by Sam
}}IS_NOTE

Copyright (C) 2012 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package test;

import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.util.WebAppInit;

/**
 * @author Sam
 *
 */
public class EnableEventThreadWebAppInit implements WebAppInit {


	public void init(WebApp wapp) throws Exception {
		wapp.getConfiguration().enableEventThread(true); 
	}

}
