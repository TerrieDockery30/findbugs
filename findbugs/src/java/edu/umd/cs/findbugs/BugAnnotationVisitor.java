/*
 * FindBugs - Find bugs in Java programs
 * Copyright (C) 2003,2004 University of Maryland
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package edu.umd.cs.findbugs;

public interface BugAnnotationVisitor {
	public void visitClassAnnotation(IClassAnnotation classAnnotation);

	public void visitFieldAnnotation(IFieldAnnotation fieldAnnotation);

	public void visitMethodAnnotation(IMethodAnnotation methodAnnotation);

	public void visitIntAnnotation(IntAnnotation intAnnotation);

	public void visitStringAnnotation(StringAnnotation stringAnnotation);

	public void visitLocalVariableAnnotation(ILocalVariableAnnotation localVariableAnnotation);

	public void visitTypeAnnotation(ITypeAnnotation typeAnnotation);

	public void visitSourceLineAnnotation(ISourceLineAnnotation sourceLineAnnotation);
}

// vim:ts=4
