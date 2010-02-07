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
 * A representation of the model object '<em><b>RIFF Wave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getHeaderChunk <em>Header Chunk</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getChunks <em>Chunks</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getRiffType <em>Riff Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getRIFFWave()
 * @model
 * @generated
 */
public interface RIFFWave extends EObject {
	/**
	 * Returns the value of the '<em><b>Header Chunk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Chunk</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Chunk</em>' containment reference.
	 * @see #setHeaderChunk(ChunkHeader)
	 * @see com.skratchdot.riff.wav.WavPackage#getRIFFWave_HeaderChunk()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ChunkHeader getHeaderChunk();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.RIFFWave#getHeaderChunk <em>Header Chunk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Chunk</em>' containment reference.
	 * @see #getHeaderChunk()
	 * @generated
	 */
	void setHeaderChunk(ChunkHeader value);

	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunks</em>' containment reference.
	 * @see #setChunks(Chunk)
	 * @see com.skratchdot.riff.wav.WavPackage#getRIFFWave_Chunks()
	 * @model containment="true"
	 * @generated
	 */
	Chunk getChunks();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.RIFFWave#getChunks <em>Chunks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunks</em>' containment reference.
	 * @see #getChunks()
	 * @generated
	 */
	void setChunks(Chunk value);

	/**
	 * Returns the value of the '<em><b>Riff Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Riff Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riff Type</em>' attribute.
	 * @see #setRiffType(int)
	 * @see com.skratchdot.riff.wav.WavPackage#getRIFFWave_RiffType()
	 * @model
	 * @generated
	 */
	int getRiffType();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.RIFFWave#getRiffType <em>Riff Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Riff Type</em>' attribute.
	 * @see #getRiffType()
	 * @generated
	 */
	void setRiffType(int value);

} // RIFFWave
