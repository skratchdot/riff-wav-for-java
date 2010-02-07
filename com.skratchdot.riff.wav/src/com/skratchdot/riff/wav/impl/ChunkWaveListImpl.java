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
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The cached value of the '{@link #getAlternatingSilentAndDataChunks() <em>Alternating Silent And Data Chunks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatingSilentAndDataChunks()
	 * @generated
	 * @ordered
	 */
	protected Chunk alternatingSilentAndDataChunks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkWaveListImpl() {
		super();
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
	public Chunk getAlternatingSilentAndDataChunks() {
		return alternatingSilentAndDataChunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternatingSilentAndDataChunks(Chunk newAlternatingSilentAndDataChunks, NotificationChain msgs) {
		Chunk oldAlternatingSilentAndDataChunks = alternatingSilentAndDataChunks;
		alternatingSilentAndDataChunks = newAlternatingSilentAndDataChunks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS, oldAlternatingSilentAndDataChunks, newAlternatingSilentAndDataChunks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternatingSilentAndDataChunks(Chunk newAlternatingSilentAndDataChunks) {
		if (newAlternatingSilentAndDataChunks != alternatingSilentAndDataChunks) {
			NotificationChain msgs = null;
			if (alternatingSilentAndDataChunks != null)
				msgs = ((InternalEObject)alternatingSilentAndDataChunks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS, null, msgs);
			if (newAlternatingSilentAndDataChunks != null)
				msgs = ((InternalEObject)newAlternatingSilentAndDataChunks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS, null, msgs);
			msgs = basicSetAlternatingSilentAndDataChunks(newAlternatingSilentAndDataChunks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS, newAlternatingSilentAndDataChunks, newAlternatingSilentAndDataChunks));
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
				return basicSetAlternatingSilentAndDataChunks(null, msgs);
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
				setAlternatingSilentAndDataChunks((Chunk)newValue);
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
				setAlternatingSilentAndDataChunks((Chunk)null);
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
				return alternatingSilentAndDataChunks != null;
		}
		return super.eIsSet(featureID);
	}

} //ChunkWaveListImpl
