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
import com.skratchdot.riff.wav.ChunkHeader;
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIFF Wave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.RIFFWaveImpl#getHeaderChunk <em>Header Chunk</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.RIFFWaveImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.RIFFWaveImpl#getRiffType <em>Riff Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFFWaveImpl extends EObjectImpl implements RIFFWave {
	/**
	 * The cached value of the '{@link #getHeaderChunk() <em>Header Chunk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderChunk()
	 * @generated
	 * @ordered
	 */
	protected ChunkHeader headerChunk;

	/**
	 * The cached value of the '{@link #getChunks() <em>Chunks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunks()
	 * @generated
	 * @ordered
	 */
	protected EList<Chunk> chunks;

	/**
	 * The default value of the '{@link #getRiffType() <em>Riff Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiffType()
	 * @generated
	 * @ordered
	 */
	protected static final int RIFF_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRiffType() <em>Riff Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiffType()
	 * @generated
	 * @ordered
	 */
	protected int riffType = RIFF_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFFWaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.RIFF_WAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkHeader getHeaderChunk() {
		return headerChunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderChunk(ChunkHeader newHeaderChunk, NotificationChain msgs) {
		ChunkHeader oldHeaderChunk = headerChunk;
		headerChunk = newHeaderChunk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WavPackage.RIFF_WAVE__HEADER_CHUNK, oldHeaderChunk, newHeaderChunk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderChunk(ChunkHeader newHeaderChunk) {
		if (newHeaderChunk != headerChunk) {
			NotificationChain msgs = null;
			if (headerChunk != null)
				msgs = ((InternalEObject)headerChunk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WavPackage.RIFF_WAVE__HEADER_CHUNK, null, msgs);
			if (newHeaderChunk != null)
				msgs = ((InternalEObject)newHeaderChunk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WavPackage.RIFF_WAVE__HEADER_CHUNK, null, msgs);
			msgs = basicSetHeaderChunk(newHeaderChunk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.RIFF_WAVE__HEADER_CHUNK, newHeaderChunk, newHeaderChunk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chunk> getChunks() {
		if (chunks == null) {
			chunks = new EObjectContainmentEList<Chunk>(Chunk.class, this, WavPackage.RIFF_WAVE__CHUNKS);
		}
		return chunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRiffType() {
		return riffType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiffType(int newRiffType) {
		int oldRiffType = riffType;
		riffType = newRiffType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.RIFF_WAVE__RIFF_TYPE, oldRiffType, riffType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavPackage.RIFF_WAVE__HEADER_CHUNK:
				return basicSetHeaderChunk(null, msgs);
			case WavPackage.RIFF_WAVE__CHUNKS:
				return ((InternalEList<?>)getChunks()).basicRemove(otherEnd, msgs);
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
			case WavPackage.RIFF_WAVE__HEADER_CHUNK:
				return getHeaderChunk();
			case WavPackage.RIFF_WAVE__CHUNKS:
				return getChunks();
			case WavPackage.RIFF_WAVE__RIFF_TYPE:
				return getRiffType();
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
			case WavPackage.RIFF_WAVE__HEADER_CHUNK:
				setHeaderChunk((ChunkHeader)newValue);
				return;
			case WavPackage.RIFF_WAVE__CHUNKS:
				getChunks().clear();
				getChunks().addAll((Collection<? extends Chunk>)newValue);
				return;
			case WavPackage.RIFF_WAVE__RIFF_TYPE:
				setRiffType((Integer)newValue);
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
			case WavPackage.RIFF_WAVE__HEADER_CHUNK:
				setHeaderChunk((ChunkHeader)null);
				return;
			case WavPackage.RIFF_WAVE__CHUNKS:
				getChunks().clear();
				return;
			case WavPackage.RIFF_WAVE__RIFF_TYPE:
				setRiffType(RIFF_TYPE_EDEFAULT);
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
			case WavPackage.RIFF_WAVE__HEADER_CHUNK:
				return headerChunk != null;
			case WavPackage.RIFF_WAVE__CHUNKS:
				return chunks != null && !chunks.isEmpty();
			case WavPackage.RIFF_WAVE__RIFF_TYPE:
				return riffType != RIFF_TYPE_EDEFAULT;
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
		result.append(" (riffType: ");
		result.append(riffType);
		result.append(')');
		return result.toString();
	}

} //RIFFWaveImpl
