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

import com.skratchdot.riff.wav.ChunkUnknown;
import com.skratchdot.riff.wav.WavFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chunk Unknown</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkUnknown#write(com.skratchdot.riff.wav.RIFFWave, com.skratchdot.riff.wav.util.WavRandomAccessFile) <em>Write</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ChunkUnknownTest extends ChunkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChunkUnknownTest.class);
	}

	/**
	 * Constructs a new Chunk Unknown test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkUnknownTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Chunk Unknown test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChunkUnknown getFixture() {
		return (ChunkUnknown)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WavFactory.eINSTANCE.createChunkUnknown());
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

	/**
	 * Tests the '{@link com.skratchdot.riff.wav.ChunkUnknown#write(com.skratchdot.riff.wav.RIFFWave, com.skratchdot.riff.wav.util.WavRandomAccessFile) <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.ChunkUnknown#write(com.skratchdot.riff.wav.RIFFWave, com.skratchdot.riff.wav.util.WavRandomAccessFile)
	 * @generated
	 */
	public void testWrite__RIFFWave_WavRandomAccessFile() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ChunkUnknownTest
