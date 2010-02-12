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

import com.skratchdot.riff.wav.Chunk;
import com.skratchdot.riff.wav.ChunkWaveList;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Wave List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkWaveListImpl#getAlternatingSilentAndDataChunks <em>Alternating Silent And Data Chunks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkWaveListImpl extends ChunkImpl implements ChunkWaveList {
	/**
	 * The cached value of the '{@link #getAlternatingSilentAndDataChunks() <em>Alternating Silent And Data Chunks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatingSilentAndDataChunks()
	 * @generated
	 * @ordered
	 */
	protected EList<Chunk> alternatingSilentAndDataChunks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkWaveListImpl() {
		super();
	}

	public ChunkWaveListImpl(RIFFWave riffWave, WavRandomAccessFile in) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_WAVE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chunk> getAlternatingSilentAndDataChunks() {
		if (alternatingSilentAndDataChunks == null) {
			alternatingSilentAndDataChunks = new EObjectContainmentEList<Chunk>(Chunk.class, this, WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS);
		}
		return alternatingSilentAndDataChunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				return ((InternalEList<?>)getAlternatingSilentAndDataChunks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				return getAlternatingSilentAndDataChunks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				getAlternatingSilentAndDataChunks().clear();
				getAlternatingSilentAndDataChunks().addAll((Collection<? extends Chunk>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				getAlternatingSilentAndDataChunks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				return alternatingSilentAndDataChunks != null && !alternatingSilentAndDataChunks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChunkWaveListImpl
