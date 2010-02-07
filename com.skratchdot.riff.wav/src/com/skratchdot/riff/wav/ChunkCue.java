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
package com.skratchdot.riff.wav;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Cue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkCue#getNumberOfCuePoints <em>Number Of Cue Points</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkCue#getCuePoints <em>Cue Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkCue()
 * @model
 * @generated
 */
public interface ChunkCue extends Chunk {
	/**
	 * Returns the value of the '<em><b>Number Of Cue Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Cue Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Cue Points</em>' attribute.
	 * @see #setNumberOfCuePoints(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkCue_NumberOfCuePoints()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getNumberOfCuePoints();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkCue#getNumberOfCuePoints <em>Number Of Cue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Cue Points</em>' attribute.
	 * @see #getNumberOfCuePoints()
	 * @generated
	 */
	void setNumberOfCuePoints(Long value);

	/**
	 * Returns the value of the '<em><b>Cue Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cue Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cue Points</em>' reference.
	 * @see #setCuePoints(CuePoint)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkCue_CuePoints()
	 * @model
	 * @generated
	 */
	CuePoint getCuePoints();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkCue#getCuePoints <em>Cue Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cue Points</em>' reference.
	 * @see #getCuePoints()
	 * @generated
	 */
	void setCuePoints(CuePoint value);

} // ChunkCue
