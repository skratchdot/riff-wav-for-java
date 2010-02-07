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

import com.skratchdot.riff.wav.ChunkDataList;
import com.skratchdot.riff.wav.ChunkDataListType;
import com.skratchdot.riff.wav.ChunkDataListTypeID;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Data List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListImpl#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataListImpl#getDataListChunks <em>Data List Chunks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkDataListImpl extends ChunkImpl implements ChunkDataList {
	/**
	 * The default value of the '{@link #getTypeID() <em>Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final ChunkDataListTypeID TYPE_ID_EDEFAULT = ChunkDataListTypeID.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTypeID() <em>Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeID()
	 * @generated
	 * @ordered
	 */
	protected ChunkDataListTypeID typeID = TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataListChunks() <em>Data List Chunks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataListChunks()
	 * @generated
	 * @ordered
	 */
	protected ChunkDataListType dataListChunks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkDataListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_DATA_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListTypeID getTypeID() {
		return typeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeID(ChunkDataListTypeID newTypeID) {
		ChunkDataListTypeID oldTypeID = typeID;
		typeID = newTypeID == null ? TYPE_ID_EDEFAULT : newTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST__TYPE_ID, oldTypeID, typeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListType getDataListChunks() {
		if (dataListChunks != null && dataListChunks.eIsProxy()) {
			InternalEObject oldDataListChunks = (InternalEObject)dataListChunks;
			dataListChunks = (ChunkDataListType)eResolveProxy(oldDataListChunks);
			if (dataListChunks != oldDataListChunks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS, oldDataListChunks, dataListChunks));
			}
		}
		return dataListChunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkDataListType basicGetDataListChunks() {
		return dataListChunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataListChunks(ChunkDataListType newDataListChunks) {
		ChunkDataListType oldDataListChunks = dataListChunks;
		dataListChunks = newDataListChunks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS, oldDataListChunks, dataListChunks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_DATA_LIST__TYPE_ID:
				return getTypeID();
			case WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS:
				if (resolve) return getDataListChunks();
				return basicGetDataListChunks();
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
			case WavPackage.CHUNK_DATA_LIST__TYPE_ID:
				setTypeID((ChunkDataListTypeID)newValue);
				return;
			case WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS:
				setDataListChunks((ChunkDataListType)newValue);
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
			case WavPackage.CHUNK_DATA_LIST__TYPE_ID:
				setTypeID(TYPE_ID_EDEFAULT);
				return;
			case WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS:
				setDataListChunks((ChunkDataListType)null);
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
			case WavPackage.CHUNK_DATA_LIST__TYPE_ID:
				return typeID != TYPE_ID_EDEFAULT;
			case WavPackage.CHUNK_DATA_LIST__DATA_LIST_CHUNKS:
				return dataListChunks != null;
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
		result.append(" (typeID: ");
		result.append(typeID);
		result.append(')');
		return result.toString();
	}

} //ChunkDataListImpl
