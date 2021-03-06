package com.bymarcin.openglasses.surface;

import com.bymarcin.openglasses.surface.widgets.component.face.Dot;
import com.bymarcin.openglasses.surface.widgets.component.face.SquareWidget;
import com.bymarcin.openglasses.surface.widgets.component.face.TriangleWidget;
import com.bymarcin.openglasses.surface.widgets.component.world.Cube3d;
import com.bymarcin.openglasses.surface.widgets.component.world.Dot3d;
import com.bymarcin.openglasses.surface.widgets.component.world.FloatingText;
import com.bymarcin.openglasses.surface.widgets.component.world.Quad3d;
import com.bymarcin.openglasses.surface.widgets.component.world.Triangle3d;

public enum WidgetType {
	QUAD(SquareWidget.class),
	TRIANGLE(TriangleWidget.class),
	DOT(Dot.class),
	CUBE3D(Cube3d.class),
	FLOATINGTEXT(FloatingText.class),
	TRIANGLE3D(Triangle3d.class),
	QUAD3D(Quad3d.class),
	DOT3D(Dot3d.class)
	;
	
	Class<? extends Widget> clazz;
	private WidgetType(Class<? extends Widget> cl) {
		clazz = cl;
	}
	
	public Widget getNewInstance(){
		try {
			return this.clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
