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

import com.skratchdot.riff.wav.Channel;
import com.skratchdot.riff.wav.ChunkData;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkDataImpl#getSampleDataOriginal <em>Sample Data Original</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkDataImpl extends ChunkImpl implements ChunkData {
	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected Channel channels;

	/**
	 * The default value of the '{@link #getSampleDataOriginal() <em>Sample Data Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleDataOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SAMPLE_DATA_ORIGINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSampleDataOriginal() <em>Sample Data Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleDataOriginal()
	 * @generated
	 * @ordered
	 */
	protected byte[] sampleDataOriginal = SAMPLE_DATA_ORIGINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getChannels() {
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannels(Channel newChannels, NotificationChain msgs) {
		Channel oldChannels = channels;
		channels = newChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA__CHANNELS, oldChannels, newChannels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannels(Channel newChannels) {
		if (newChannels != channels) {
			NotificationChain msgs = null;
			if (channels != null)
				msgs = ((InternalEObject)channels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WavPackage.CHUNK_DATA__CHANNELS, null, msgs);
			if (newChannels != null)
				msgs = ((InternalEObject)newChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WavPackage.CHUNK_DATA__CHANNELS, null, msgs);
			msgs = basicSetChannels(newChannels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA__CHANNELS, newChannels, newChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSampleDataOriginal() {
		return sampleDataOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleDataOriginal(byte[] newSampleDataOriginal) {
		byte[] oldSampleDataOriginal = sampleDataOriginal;
		sampleDataOriginal = newSampleDataOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL, oldSampleDataOriginal, sampleDataOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavPackage.CHUNK_DATA__CHANNELS:
				return basicSetChannels(null, msgs);
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
			case WavPackage.CHUNK_DATA__CHANNELS:
				return getChannels();
			case WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL:
				return getSampleDataOriginal();
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
			case WavPackage.CHUNK_DATA__CHANNELS:
				setChannels((Channel)newValue);
				return;
			case WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL:
				setSampleDataOriginal((byte[])newValue);
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
			case WavPackage.CHUNK_DATA__CHANNELS:
				setChannels((Channel)null);
				return;
			case WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL:
				setSampleDataOriginal(SAMPLE_DATA_ORIGINAL_EDEFAULT);
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
			case WavPackage.CHUNK_DATA__CHANNELS:
				return channels != null;
			case WavPackage.CHUNK_DATA__SAMPLE_DATA_ORIGINAL:
				return SAMPLE_DATA_ORIGINAL_EDEFAULT == null ? sampleDataOriginal != null : !SAMPLE_DATA_ORIGINAL_EDEFAULT.equals(sampleDataOriginal);
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
		result.append(" (sampleDataOriginal: ");
		result.append(sampleDataOriginal);
		result.append(')');
		return result.toString();
	}

} //ChunkDataImpl
