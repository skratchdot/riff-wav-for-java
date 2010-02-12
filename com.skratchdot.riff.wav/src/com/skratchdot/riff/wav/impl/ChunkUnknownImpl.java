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
package com.skratchdot.riff.wav.impl;

import com.skratchdot.riff.wav.ChunkTypeID;
import com.skratchdot.riff.wav.ChunkUnknown;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Unknown</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChunkUnknownImpl extends ChunkImpl implements ChunkUnknown {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkUnknownImpl() {
		super();
	}

	public ChunkUnknownImpl(RIFFWave riffWave, WavRandomAccessFile in) {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.UNKNOWN;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.UNKNOWN_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_UNKNOWN;
	}

} //ChunkUnknownImpl
