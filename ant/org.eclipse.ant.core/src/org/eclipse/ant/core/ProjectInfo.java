/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ant.core;

import org.eclipse.ant.internal.core.IAntCoreConstants;

/**
 * Represents information about a project within an Ant build file. Clients may not instantiate or subclass this class.
 * 
 * @since 2.1
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @noextend This class is not intended to be subclassed by clients.
 */
public class ProjectInfo {

	private String name = null;
	private String description = null;

	/**
	 * Create a project information
	 * 
	 * @param name
	 *            project name
	 * @param description
	 *            a brief explanation of the project's purpose or <code>null</code> if not specified
	 * @since 3.3
	 */
	public ProjectInfo(String name, String description) {
		this.name = name == null ? IAntCoreConstants.EMPTY_STRING : name;
		this.description = description;
	}

	/**
	 * Returns the project name.
	 * 
	 * @return the project name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the project description or <code>null</code> if no description is provided.
	 * 
	 * @return the project description or <code>null</code> if none
	 */
	public String getDescription() {
		return description;
	}
}
