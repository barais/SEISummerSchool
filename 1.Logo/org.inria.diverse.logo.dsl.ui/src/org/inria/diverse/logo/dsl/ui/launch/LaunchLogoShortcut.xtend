package org.inria.diverse.logo.dsl.ui.launch

import com.google.inject.Inject
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.part.FileEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory
import org.inria.diverse.logo.dsl.logoDSL.LogoProgram
import org.inria.diverse.logo.dsl.ui.views.LogoView
import static extension org.inria.diverse.k3logo.LogoProgramAspect.*
import static extension org.inria.diverse.k3logo.graphical.TurtleAspect.*
import org.inria.diverse.k3logo.Context

/**
 * 
 * @author barais
 */
class LaunchLogoShortcut implements ILaunchShortcut {
	@Inject
	private IResourceForEditorInputFactory resourceFactory;
	
	override launch(ISelection selection, String mode) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override launch(IEditorPart editor, String mode) {
		val input = editor.editorInput
				
		if (editor instanceof XtextEditor && input instanceof FileEditorInput) {
			val resource = resourceFactory.createResource(input)
			resource.load(newHashMap())
			val program = resource.contents.head as LogoProgram
			var c = new Context
			c.turtle.canvas = canvas
			program.eval(c)
			//new LogoInterpreter(canvas).exec(program)
		}
	}
	
	def getCanvas() {
		LogoView.getInstance.getCanvas()
	}
	
}