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

import com.skratchdot.riff.wav.ChunkPlayList;
import com.skratchdot.riff.wav.Segment;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Play List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkPlayListImpl#getNumberOfSegments <em>Number Of Segments</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkPlayListImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkPlayListImpl extends ChunkImpl implements ChunkPlayList {
	/**
	 * The default value of the '{@link #getNumberOfSegments() <em>Number Of Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSegments()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_SEGMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfSegments() <em>Number Of Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSegments()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfSegments = NUMBER_OF_SEGMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected Segment segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkPlayListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_PLAY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getNumberOfSegments() {
		return numberOfSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSegments(Long newNumberOfSegments) {
		Long oldNumberOfSegments = numberOfSegments;
		numberOfSegments = newNumberOfSegments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS, oldNumberOfSegments, numberOfSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment getSegments() {
		if (segments != null && segments.eIsProxy()) {
			InternalEObject oldSegments = (InternalEObject)segments;
			segments = (Segment)eResolveProxy(oldSegments);
			if (segments != oldSegments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WavPackage.CHUNK_PLAY_LIST__SEGMENTS, oldSegments, segments));
			}
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment basicGetSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegments(Segment newSegments) {
		Segment oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_PLAY_LIST__SEGMENTS, oldSegments, segments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS:
				return getNumberOfSegments();
			case WavPackage.CHUNK_PLAY_LIST__SEGMENTS:
				if (resolve) return getSegments();
				return basicGetSegments();
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
			case WavPackage.CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS:
				setNumberOfSegments((Long)newValue);
				return;
			case WavPackage.CHUNK_PLAY_LIST__SEGMENTS:
				setSegments((Segment)newValue);
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
			case WavPackage.CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS:
				setNumberOfSegments(NUMBER_OF_SEGMENTS_EDEFAULT);
				return;
			case WavPackage.CHUNK_PLAY_LIST__SEGMENTS:
				setSegments((Segment)null);
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
			case WavPackage.CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS:
				return NUMBER_OF_SEGMENTS_EDEFAULT == null ? numberOfSegments != null : !NUMBER_OF_SEGMENTS_EDEFAULT.equals(numberOfSegments);
			case WavPackage.CHUNK_PLAY_LIST__SEGMENTS:
				return segments != null;
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
		result.append(" (numberOfSegments: ");
		result.append(numberOfSegments);
		result.append(')');
		return result.toString();
	}

} //ChunkPlayListImpl
