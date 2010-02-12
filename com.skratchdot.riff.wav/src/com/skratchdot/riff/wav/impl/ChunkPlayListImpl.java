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
import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.Segment;
import com.skratchdot.riff.wav.WavPackage;
import com.skratchdot.riff.wav.util.WavRandomAccessFile;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkPlayListImpl() {
		super();
	}

	public ChunkPlayListImpl(RIFFWave riffWave, WavRandomAccessFile in) {
		// TODO Auto-generated constructor stub
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
	public EList<Segment> getSegments() {
		if (segments == null) {
			segments = new EObjectResolvingEList<Segment>(Segment.class, this, WavPackage.CHUNK_PLAY_LIST__SEGMENTS);
		}
		return segments;
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
				return getSegments();
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
			case WavPackage.CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS:
				setNumberOfSegments((Long)newValue);
				return;
			case WavPackage.CHUNK_PLAY_LIST__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends Segment>)newValue);
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
				getSegments().clear();
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
				return segments != null && !segments.isEmpty();
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
