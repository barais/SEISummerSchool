/*
* generated by Xtext
*/
package org.inria.diverse.logo.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LogoDSLStandaloneSetup extends LogoDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new LogoDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
