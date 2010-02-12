/**
 * Copyright (c) 2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial modeling finished using information provided by:
 * 	http://www.sonicspot.com/guide/wavefiles.html
 * 
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.riff.wav.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>wav</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class WavTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new WavTests("wav Tests");
		suite.addTestSuite(ChunkCueTest.class);
		suite.addTestSuite(ChunkDataTest.class);
		suite.addTestSuite(ChunkDataListTest.class);
		suite.addTestSuite(ChunkDataListTypeLabelTest.class);
		suite.addTestSuite(ChunkDataListTypeLabeledTextTest.class);
		suite.addTestSuite(ChunkDataListTypeNoteTest.class);
		suite.addTestSuite(ChunkFactTest.class);
		suite.addTestSuite(ChunkFormatTest.class);
		suite.addTestSuite(ChunkInstrumentTest.class);
		suite.addTestSuite(ChunkPlayListTest.class);
		suite.addTestSuite(ChunkSamplerTest.class);
		suite.addTestSuite(ChunkSilentTest.class);
		suite.addTestSuite(ChunkUnknownTest.class);
		suite.addTestSuite(ChunkWaveListTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WavTests(String name) {
		super(name);
	}

} //WavTests
