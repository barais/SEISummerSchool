package org.inria.diverse.k3logo.graphical

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.awt.Color
import kmLogo.VM.Point
import kmLogo.VM.Segment
import kmLogo.VM.Turtle
import kmLogo.VM.VMFactory
import org.swhite.tortue.TortueCanvas

import static java.awt.Color.*

import static extension org.inria.diverse.k3logo.graphical.PointAspect.*
import static extension org.inria.diverse.k3logo.graphical.SegmentAspect.*

@Aspect(className=Turtle)
class TurtleAspect {
	public TortueCanvas canvas

	def void reset() {
		_self.position = VMFactory.eINSTANCE.createPoint
		_self.position.x = 0
		_self.position.y = 0
		_self.heading = 0
		_self.penUp = true
		_self.drawings.clear		
		_self.canvas?.clear
	}

	def void setPenUp(boolean b) {
		if (b)
			_self.canvas?.penUp
		else
			_self.canvas?.penUp
		_self.penUp = b
	}

	def void rotate(int angle) {
		_self.heading = (_self.heading + angle) % (360)
		if (angle > 0)
			_self.canvas?.right(angle % 360)
		else
			_self.canvas?.left(-1 * angle % 360)

	}

	def void move(int dx, int dy) {
		var newPos = _self.position.getDelta(dx, dy)
		if (_self.penUp) {
			println("Turtle move to " + newPos.toTrace)
		} else {
			println("Turtle trace to " + newPos.toTrace)
			var trace = VMFactory.eINSTANCE.createSegment
			trace.make(_self.position, newPos)
			_self.drawings.add(trace)
		}
		_self.position = newPos
	}

	def void forward(int steps) {
		var radian = Math.toRadians(_self.heading.doubleValue)
		_self.move(_self.scale(steps, Math.sin(radian)), _self.scale(steps, Math.cos(radian)))
		_self.canvas?.forward(steps)
	}

	/*
	 * scale the "steps" by factor and round the result
	 */
	def int scale(int steps, double factor) {
		return ((steps * factor)).intValue
	}

	/*def void fontSize(int size) {
		// TODO 
	}*/

	def void fontStyle(int style) {
		_self.canvas?.fontStyle(style)
	}

	def void drawString(String s) {
		_self.canvas?.drawString(s)

	}

	def void setPenColor(Color color) {
		_self.canvas?.pencolor(_self.max(color.red, 255), _self.max(color.green, 255), _self.max(color.blue, 255),
			_self.max(color.alpha, 255))
	}

	def int max(Integer v, Integer max) {
		if(v > max) max else v
	}

	def void setCanevasColor(Color color) {
		_self.canvas?.canvascolor(_self.max(color.red, 255), _self.max(color.green, 255), _self.max(color.blue, 255))
	}

	def void setPenColor(String c) {
		_self.penColor = _self.toColorObject(c)

	}

	def void setCanevasColor(String c) {
		_self.canevasColor = _self.toColorObject(c)

	}

	def Color toColorObject(String colorName) {
		switch (colorName.toUpperCase) {
			case 'BLACK': BLACK
			case 'BLUE': BLUE
			case 'CYAN': CYAN
			case 'DARK GRAY': DARK_GRAY
			case 'GRAY': GRAY
			case 'GREEN': GREEN
			case 'LIGHTGRAY': LIGHT_GRAY
			case 'MAGENTA': MAGENTA
			case 'ORANGE': ORANGE
			case 'PINK': PINK
			case 'RED': RED
			case 'WHITE': WHITE
			case 'YELLOW': YELLOW
		}
	}

	def void home() {
		_self.position.x = 0
		_self.position.y = 0
		_self.heading = 0
		_self.canvas?.home
	}
}

@Aspect(className=Point)
class PointAspect {
	def Point getDelta(int dx, int dy) {
		val res = VMFactory.eINSTANCE.createPoint
		res.x = _self.x + dx
		res.y = _self.y + dy
		return res
	}

	def String toTrace() {
		return "[" + _self.x.toString + "," + _self.y.toString + "]"
	}
}

@Aspect(className=Segment)
class SegmentAspect {
	def void make(Point orig, Point dest) {
		_self.origin = orig
		_self.destination = dest
	}
}