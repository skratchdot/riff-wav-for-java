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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Chunk Type ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.WavPackage#getChunkTypeID()
 * @model
 * @generated
 */
public enum ChunkTypeID implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "Unknown Chunk"),

	/**
	 * The '<em><b>CUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUE_VALUE
	 * @generated
	 * @ordered
	 */
	CUE(1668637984, "CUE", "Cue Chunk - 'cue '"),

	/**
	 * The '<em><b>DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(1684108385, "DATA", "Data Chunk - 'data'"),

	/**
	 * The '<em><b>FACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACT_VALUE
	 * @generated
	 * @ordered
	 */
	FACT(1717658484, "FACT", "Fact Chunk - 'fact'"),

	/**
	 * The '<em><b>FORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	FORMAT(1718449184, "FORMAT", "Format Chunk - 'fmt '"),

	/**
	 * The '<em><b>INSTRUMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUMENT(1768846196, "INSTRUMENT", "Instrument Chunk - 'inst'"),

	/**
	 * The '<em><b>LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(1818321516, "LABEL", "Label Chunk - 'labl'"),

	/**
	 * The '<em><b>DATA LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_LIST(1818850164, "DATA_LIST", "Data List Chunk - 'list'"),

	/**
	 * The '<em><b>LABELED TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABELED_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	LABELED_TEXT(1819572340, "LABELED_TEXT", "Labeled Text Chunk - 'ltxt'"),

	/**
	 * The '<em><b>NOTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(1852798053, "NOTE", "Note Chunk - 'note'"),

	/**
	 * The '<em><b>PLAYLIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYLIST_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYLIST(1886155636, "PLAYLIST", "Playlist Chunk - 'plst'"),

	/**
	 * The '<em><b>SILENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENT_VALUE
	 * @generated
	 * @ordered
	 */
	SILENT(1936486004, "SILENT", "Silent Chunk - 'slnt'"),

	/**
	 * The '<em><b>SAMPLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLER_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLER(1936552044, "SAMPLER", "Sampler Chunk - 'smpl'"),

	/**
	 * The '<em><b>WAVE LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVE_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	WAVE_LIST(2002876012, "WAVE_LIST", "Wave List Chunk - 'wavl'");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model literal="Unknown Chunk"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>CUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUE
	 * @model literal="Cue Chunk - 'cue '"
	 * @generated
	 * @ordered
	 */
	public static final int CUE_VALUE = 1668637984;

	/**
	 * The '<em><b>DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model literal="Data Chunk - 'data'"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 1684108385;

	/**
	 * The '<em><b>FACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACT
	 * @model literal="Fact Chunk - 'fact'"
	 * @generated
	 * @ordered
	 */
	public static final int FACT_VALUE = 1717658484;

	/**
	 * The '<em><b>FORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORMAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMAT
	 * @model literal="Format Chunk - 'fmt '"
	 * @generated
	 * @ordered
	 */
	public static final int FORMAT_VALUE = 1718449184;

	/**
	 * The '<em><b>INSTRUMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSTRUMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTRUMENT
	 * @model literal="Instrument Chunk - 'inst'"
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUMENT_VALUE = 1768846196;

	/**
	 * The '<em><b>LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model literal="Label Chunk - 'labl'"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 1818321516;

	/**
	 * The '<em><b>DATA LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_LIST
	 * @model literal="Data List Chunk - 'list'"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_LIST_VALUE = 1818850164;

	/**
	 * The '<em><b>LABELED TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABELED TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABELED_TEXT
	 * @model literal="Labeled Text Chunk - 'ltxt'"
	 * @generated
	 * @ordered
	 */
	public static final int LABELED_TEXT_VALUE = 1819572340;

	/**
	 * The '<em><b>NOTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTE
	 * @model literal="Note Chunk - 'note'"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 1852798053;

	/**
	 * The '<em><b>PLAYLIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAYLIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYLIST
	 * @model literal="Playlist Chunk - 'plst'"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYLIST_VALUE = 1886155636;

	/**
	 * The '<em><b>SILENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SILENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SILENT
	 * @model literal="Silent Chunk - 'slnt'"
	 * @generated
	 * @ordered
	 */
	public static final int SILENT_VALUE = 1936486004;

	/**
	 * The '<em><b>SAMPLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAMPLER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLER
	 * @model literal="Sampler Chunk - 'smpl'"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLER_VALUE = 1936552044;

	/**
	 * The '<em><b>WAVE LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAVE LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAVE_LIST
	 * @model literal="Wave List Chunk - 'wavl'"
	 * @generated
	 * @ordered
	 */
	public static final int WAVE_LIST_VALUE = 2002876012;

	/**
	 * An array of all the '<em><b>Chunk Type ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChunkTypeID[] VALUES_ARRAY =
		new ChunkTypeID[] {
			UNKNOWN,
			CUE,
			DATA,
			FACT,
			FORMAT,
			INSTRUMENT,
			LABEL,
			DATA_LIST,
			LABELED_TEXT,
			NOTE,
			PLAYLIST,
			SILENT,
			SAMPLER,
			WAVE_LIST,
		};

	/**
	 * A public read-only list of all the '<em><b>Chunk Type ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChunkTypeID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Chunk Type ID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChunkTypeID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChunkTypeID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Chunk Type ID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChunkTypeID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChunkTypeID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Chunk Type ID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChunkTypeID get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case CUE_VALUE: return CUE;
			case DATA_VALUE: return DATA;
			case FACT_VALUE: return FACT;
			case FORMAT_VALUE: return FORMAT;
			case INSTRUMENT_VALUE: return INSTRUMENT;
			case LABEL_VALUE: return LABEL;
			case DATA_LIST_VALUE: return DATA_LIST;
			case LABELED_TEXT_VALUE: return LABELED_TEXT;
			case NOTE_VALUE: return NOTE;
			case PLAYLIST_VALUE: return PLAYLIST;
			case SILENT_VALUE: return SILENT;
			case SAMPLER_VALUE: return SAMPLER;
			case WAVE_LIST_VALUE: return WAVE_LIST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ChunkTypeID(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ChunkTypeID
