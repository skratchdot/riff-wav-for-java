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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.Chunk#getChunkDataSize <em>Chunk Data Size</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.Chunk#getChunkID <em>Chunk ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.Chunk#getChunkTypeID <em>Chunk Type ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunk()
 * @model abstract="true"
 * @generated
 */
public interface Chunk extends EObject {
	/**
	 * Returns the value of the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk Data Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk Data Size</em>' attribute.
	 * @see #setChunkDataSize(long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunk_ChunkDataSize()
	 * @model
	 * @generated
	 */
	long getChunkDataSize();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.Chunk#getChunkDataSize <em>Chunk Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk Data Size</em>' attribute.
	 * @see #getChunkDataSize()
	 * @generated
	 */
	void setChunkDataSize(long value);

	/**
	 * Returns the value of the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk ID</em>' attribute.
	 * @see #setChunkID(int)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunk_ChunkID()
	 * @model
	 * @generated
	 */
	int getChunkID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.Chunk#getChunkID <em>Chunk ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk ID</em>' attribute.
	 * @see #getChunkID()
	 * @generated
	 */
	void setChunkID(int value);

	/**
	 * Returns the value of the '<em><b>Chunk Type ID</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.riff.wav.ChunkTypeID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk Type ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk Type ID</em>' attribute.
	 * @see com.skratchdot.riff.wav.ChunkTypeID
	 * @see #setChunkTypeID(ChunkTypeID)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunk_ChunkTypeID()
	 * @model
	 * @generated
	 */
	ChunkTypeID getChunkTypeID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.Chunk#getChunkTypeID <em>Chunk Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk Type ID</em>' attribute.
	 * @see com.skratchdot.riff.wav.ChunkTypeID
	 * @see #getChunkTypeID()
	 * @generated
	 */
	void setChunkTypeID(ChunkTypeID value);

} // Chunk
