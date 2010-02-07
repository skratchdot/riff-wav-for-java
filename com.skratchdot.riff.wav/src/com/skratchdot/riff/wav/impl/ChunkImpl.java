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
import com.skratchdot.riff.wav.ChunkID;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkImpl#getChunkID <em>Chunk ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkImpl#getChunkDataSize <em>Chunk Data Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChunkImpl extends EObjectImpl implements Chunk {
	/**
	 * The default value of the '{@link #getChunkID() <em>Chunk ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkID()
	 * @generated
	 * @ordered
	 */
	protected static final ChunkID CHUNK_ID_EDEFAULT = ChunkID.UNKNOWN;

	/**
	 * The cached value of the '{@link #getChunkID() <em>Chunk ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkID()
	 * @generated
	 * @ordered
	 */
	protected ChunkID chunkID = CHUNK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChunkDataSize() <em>Chunk Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final long CHUNK_DATA_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChunkDataSize() <em>Chunk Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkDataSize()
	 * @generated
	 * @ordered
	 */
	protected long chunkDataSize = CHUNK_DATA_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkID getChunkID() {
		return chunkID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChunkID(ChunkID newChunkID) {
		ChunkID oldChunkID = chunkID;
		chunkID = newChunkID == null ? CHUNK_ID_EDEFAULT : newChunkID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK__CHUNK_ID, oldChunkID, chunkID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChunkDataSize() {
		return chunkDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChunkDataSize(long newChunkDataSize) {
		long oldChunkDataSize = chunkDataSize;
		chunkDataSize = newChunkDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK__CHUNK_DATA_SIZE, oldChunkDataSize, chunkDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK__CHUNK_ID:
				return getChunkID();
			case WavPackage.CHUNK__CHUNK_DATA_SIZE:
				return getChunkDataSize();
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
			case WavPackage.CHUNK__CHUNK_ID:
				setChunkID((ChunkID)newValue);
				return;
			case WavPackage.CHUNK__CHUNK_DATA_SIZE:
				setChunkDataSize((Long)newValue);
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
			case WavPackage.CHUNK__CHUNK_ID:
				setChunkID(CHUNK_ID_EDEFAULT);
				return;
			case WavPackage.CHUNK__CHUNK_DATA_SIZE:
				setChunkDataSize(CHUNK_DATA_SIZE_EDEFAULT);
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
			case WavPackage.CHUNK__CHUNK_ID:
				return chunkID != CHUNK_ID_EDEFAULT;
			case WavPackage.CHUNK__CHUNK_DATA_SIZE:
				return chunkDataSize != CHUNK_DATA_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (chunkID: ");
		result.append(chunkID);
		result.append(", chunkDataSize: ");
		result.append(chunkDataSize);
		result.append(')');
		return result.toString();
	}

} //ChunkImpl
