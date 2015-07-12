package org.inria.diverse.k3logo

import java.awt.Dimension
import javax.swing.JFrame
import org.swhite.tortue.CustomTortueCanvas
import static extension org.inria.diverse.k3logo.graphical.TurtleAspect.*


class SecondSimilator extends K3LogoInterpreter {

	def static void main(String[] args) {
		new SecondSimilator().run(args)
	}
	
	
	override def void init(){
	 	super.init()
	 	
		// Suppess if you use the standard printer
		val f = new JFrame
		f.size = new Dimension(600, 600)
		context.turtle.canvas = new CustomTortueCanvas()
		context.turtle.canvas.size = new Dimension(600, 600)
		context.turtle.canvas.visible = true
		f.add(context.turtle.canvas)
		f.visible = true
		// Suppess if you use the standard printer
	 }
	
}