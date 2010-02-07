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

import com.skratchdot.riff.wav.ChunkDataListTypeLabeledText;
import com.skratchdot.riff.wav.WavFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chunk Data List Type Labeled Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChunkDataListTypeLabeledTextTest extends ChunkDataListTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChunkDataListTypeLabeledTextTest.class);
	}

	/**
	 * Constructs a new Chunk Data List Type Labeled Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListTypeLabeledTextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Chunk Data List Type Labeled Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChunkDataListTypeLabeledText getFixture() {
		return (ChunkDataListTypeLabeledText)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WavFactory.eINSTANCE.createChunkDataListTypeLabeledText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ChunkDataListTypeLabeledTextTest
