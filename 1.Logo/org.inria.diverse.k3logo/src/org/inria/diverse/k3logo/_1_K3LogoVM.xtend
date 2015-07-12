package org.inria.diverse.k3logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import kmLogo.VM.Point
import kmLogo.VM.Turtle
import kmLogo.VM.VMFactory

import static extension org.inria.diverse.k3logo.TurtleAspect.*
import static extension org.inria.diverse.k3logo.PointAspect.*
import static extension org.inria.diverse.k3logo.SegmentAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import java.awt.Color

class K3LogoVM {
	
}

	@Aspect(className=Turtle)
	class TurtleAspect
	{
		def void reset() {
			_self.position = VMFactory.eINSTANCE.createPoint
			_self.position.x = 0
			_self.position.y = 0
			_self.heading = 0
			_self.penUp = true
			_self.drawings.clear
		}
				
		def void setPenUp(boolean b) {
			_self.penUp = b
		}
		
		def void rotate(int angle )  {
			_self.heading = (_self.heading + angle)%(360)
		}
	
		def void move(int dx , int dy )  {
			var newPos = _self.position.getDelta(dx,dy)
			if (_self.penUp) {
				println("Turtle move to "+ newPos.toTrace)
				}
			else{
				println("Turtle trace to "+ newPos.toTrace)
				var trace = VMFactory.eINSTANCE.createSegment
				trace.make(_self.position,newPos)
				_self.drawings.add(trace)
			}
			_self.position = newPos
		}
			
		def void forward(int steps )  {
		    var radian  = Math.toRadians(_self.heading.doubleValue) 
			_self.move(_self.scale(steps,Math.sin(radian)), _self.scale(steps,Math.cos(radian)))
		}
		/*
		* scale the "steps" by factor and round the result
		*/
		def int scale(int steps , double factor )  {
			return ((steps * factor)).intValue
		}
		/*def void fontSize(int size){
			//TODO	
		}*/
		def void fontStyle(int style){
			println("Change font style to "+ style)
						
		}
		
		def void drawString(String s){
			println("Draw String:  "+ s)
		}
		
		def void setPenColor(Color c){
			println("Change Pen Color:  "+ c)
			
		}
		def void setCanevasColor(Color c){
			println("Change Canevas Color:  "+ c)
			
		}
		def void setPenColor(String c){
			println("Change Pen Color:  "+ c)
			
		}
		def void setCanevasColor(String c){
			println("Change Canevas Color:  "+ c)
			
		}
		
		
		
	}
	@Aspect(className=Point)
	class PointAspect
	{
		def Point getDelta(int dx , int dy ) {
			val res =  VMFactory.eINSTANCE.createPoint
			res.x = _self.x + dx
			res.y = _self.y + dy			
			return res
		}
		 def String toTrace()  {
			return  "[" + _self.x.toString + "," + _self.y.toString + "]"
		}
	}
	
	@Aspect(className=kmLogo.VM.Segment)
	class SegmentAspect
	{
		def void make (Point orig , Point dest) {
			_self.origin = orig
			_self.destination = dest
		}
	}