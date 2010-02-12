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

import com.skratchdot.riff.wav.ChunkCue;
import com.skratchdot.riff.wav.CuePoint;
import com.skratchdot.riff.wav.RIFFWave;
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
 * An implementation of the model object '<em><b>Chunk Cue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkCueImpl#getNumberOfCuePoints <em>Number Of Cue Points</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkCueImpl#getCuePoints <em>Cue Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkCueImpl extends ChunkImpl implements ChunkCue {
	/**
	 * The default value of the '{@link #getNumberOfCuePoints() <em>Number Of Cue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCuePoints()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_CUE_POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfCuePoints() <em>Number Of Cue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCuePoints()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfCuePoints = NUMBER_OF_CUE_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCuePoints() <em>Cue Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<CuePoint> cuePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkCueImpl() {
		super();
	}

	public ChunkCueImpl(RIFFWave riffWave, WavRandomAccessFile in) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_CUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getNumberOfCuePoints() {
		return numberOfCuePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCuePoints(Long newNumberOfCuePoints) {
		Long oldNumberOfCuePoints = numberOfCuePoints;
		numberOfCuePoints = newNumberOfCuePoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_CUE__NUMBER_OF_CUE_POINTS, oldNumberOfCuePoints, numberOfCuePoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CuePoint> getCuePoints() {
		if (cuePoints == null) {
			cuePoints = new EObjectResolvingEList<CuePoint>(CuePoint.class, this, WavPackage.CHUNK_CUE__CUE_POINTS);
		}
		return cuePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_CUE__NUMBER_OF_CUE_POINTS:
				return getNumberOfCuePoints();
			case WavPackage.CHUNK_CUE__CUE_POINTS:
				return getCuePoints();
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
			case WavPackage.CHUNK_CUE__NUMBER_OF_CUE_POINTS:
				setNumberOfCuePoints((Long)newValue);
				return;
			case WavPackage.CHUNK_CUE__CUE_POINTS:
				getCuePoints().clear();
				getCuePoints().addAll((Collection<? extends CuePoint>)newValue);
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
			case WavPackage.CHUNK_CUE__NUMBER_OF_CUE_POINTS:
				setNumberOfCuePoints(NUMBER_OF_CUE_POINTS_EDEFAULT);
				return;
			case WavPackage.CHUNK_CUE__CUE_POINTS:
				getCuePoints().clear();
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
			case WavPackage.CHUNK_CUE__NUMBER_OF_CUE_POINTS:
				return NUMBER_OF_CUE_POINTS_EDEFAULT == null ? numberOfCuePoints != null : !NUMBER_OF_CUE_POINTS_EDEFAULT.equals(numberOfCuePoints);
			case WavPackage.CHUNK_CUE__CUE_POINTS:
				return cuePoints != null && !cuePoints.isEmpty();
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
		result.append(" (numberOfCuePoints: ");
		result.append(numberOfCuePoints);
		result.append(')');
		return result.toString();
	}

} //ChunkCueImpl
