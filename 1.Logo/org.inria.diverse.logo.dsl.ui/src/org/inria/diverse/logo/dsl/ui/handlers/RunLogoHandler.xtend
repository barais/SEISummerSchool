package org.inria.diverse.logo.dsl.ui.handlers

import com.google.inject.Inject
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.ui.part.FileEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory
//import org.inria.diverse.logo.dsl.interpreter.LogoInterpreter
import org.inria.diverse.logo.dsl.logoDSL.LogoProgram
import org.inria.diverse.logo.dsl.ui.views.LogoView
import org.inria.diverse.k3logo.Context
import static extension org.inria.diverse.k3logo.LogoProgramAspect.*
import static extension org.inria.diverse.k3logo.graphical.TurtleAspect.*

/**
 * 
 * @author barais
 */
class RunLogoHandler extends AbstractHandler {
	@Inject
	private IResourceForEditorInputFactory resourceFactory;
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val editorPart = HandlerUtil.getActiveEditor(event);
		val input = editorPart.editorInput
		
		if (editorPart instanceof XtextEditor && input instanceof FileEditorInput) {
			val resource = resourceFactory.createResource(input)
			resource.load(newHashMap())
			val program = resource.contents.head as LogoProgram
			var c = new Context
			c.turtle.canvas = canvas
			program.eval(c)
			//			new LogoInterpreter(canvas).exec(program)
		}
		null
	}
	
	def getCanvas() {
		LogoView.getInstance.canvas
	}
	
}