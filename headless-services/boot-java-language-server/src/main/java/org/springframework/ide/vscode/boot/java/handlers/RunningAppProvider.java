/*******************************************************************************
 * Copyright (c) 2017 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.vscode.boot.java.handlers;

import java.util.Collection;

import org.springframework.ide.vscode.commons.boot.app.cli.SpringBootApp;

public class RunningAppProvider {

	public static final RunningAppProvider DEFAULT = new RunningAppProvider();

	public Collection<SpringBootApp> getAllRunningSpringApps() throws Exception {
		return SpringBootApp.getAllRunningSpringApps().values();
	}

}
