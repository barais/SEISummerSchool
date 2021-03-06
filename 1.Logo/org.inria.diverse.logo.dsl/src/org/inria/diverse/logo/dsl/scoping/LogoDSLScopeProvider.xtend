/*
 * generated by Xtext
 */
package org.inria.diverse.logo.dsl.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.inria.diverse.logo.dsl.logoDSL.TO
import org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 */
class LogoDSLScopeProvider extends AbstractDeclarativeScopeProvider {
	
	def scope_VARIABLE_REF_toVar(VARIABLE_REF ref, EReference ereference) {
		val scope = delegateGetScope(ref, ereference)
		var container = ref.eContainer
		while( container != null) {
			if (container instanceof TO)
				return new SimpleScope(scope, (container as TO).parameters.map[p| EObjectDescription.create(p.name, p) ])
			else 
				container = container.eContainer
		}
		return scope
	}

}
