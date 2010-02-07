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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.WavFactory
 * @model kind="package"
 * @generated
 */
public interface WavPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wav";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com/skratchdot/riff/wav/RIFFWave.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.skratchdot.riff.wav";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WavPackage eINSTANCE = com.skratchdot.riff.wav.impl.WavPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.RIFFWaveImpl <em>RIFF Wave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.RIFFWaveImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getRIFFWave()
	 * @generated
	 */
	int RIFF_WAVE = 0;

	/**
	 * The feature id for the '<em><b>Header Chunk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIFF_WAVE__HEADER_CHUNK = 0;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIFF_WAVE__CHUNKS = 1;

	/**
	 * The feature id for the '<em><b>Riff Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIFF_WAVE__RIFF_TYPE = 2;

	/**
	 * The number of structural features of the '<em>RIFF Wave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIFF_WAVE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChannelImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Sample Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__SAMPLE_DATA = 0;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkImpl <em>Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunk()
	 * @generated
	 */
	int CHUNK = 2;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__CHUNK_ID = 0;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__CHUNK_DATA_SIZE = 1;

	/**
	 * The number of structural features of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkCueImpl <em>Chunk Cue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkCueImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkCue()
	 * @generated
	 */
	int CHUNK_CUE = 3;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_CUE__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_CUE__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Number Of Cue Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_CUE__NUMBER_OF_CUE_POINTS = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cue Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_CUE__CUE_POINTS = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chunk Cue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_CUE_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkDataImpl <em>Chunk Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkDataImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkData()
	 * @generated
	 */
	int CHUNK_DATA = 4;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA__CHANNELS = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sample Data Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA__SAMPLE_DATA_ORIGINAL = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chunk Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListImpl <em>Chunk Data List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkDataListImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataList()
	 * @generated
	 */
	int CHUNK_DATA_LIST = 5;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST__TYPE_ID = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data List Chunks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST__DATA_LIST_CHUNKS = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chunk Data List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeImpl <em>Chunk Data List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkDataListTypeImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListType()
	 * @generated
	 */
	int CHUNK_DATA_LIST_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE__CUE_POINT_ID = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE__TEXT = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chunk Data List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabelImpl <em>Chunk Data List Type Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkDataListTypeLabelImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListTypeLabel()
	 * @generated
	 */
	int CHUNK_DATA_LIST_TYPE_LABEL = 7;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABEL__CHUNK_ID = CHUNK_DATA_LIST_TYPE__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABEL__CHUNK_DATA_SIZE = CHUNK_DATA_LIST_TYPE__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABEL__CUE_POINT_ID = CHUNK_DATA_LIST_TYPE__CUE_POINT_ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABEL__TEXT = CHUNK_DATA_LIST_TYPE__TEXT;

	/**
	 * The number of structural features of the '<em>Chunk Data List Type Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABEL_FEATURE_COUNT = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl <em>Chunk Data List Type Labeled Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListTypeLabeledText()
	 * @generated
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CHUNK_ID = CHUNK_DATA_LIST_TYPE__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CHUNK_DATA_SIZE = CHUNK_DATA_LIST_TYPE__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CUE_POINT_ID = CHUNK_DATA_LIST_TYPE__CUE_POINT_ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__TEXT = CHUNK_DATA_LIST_TYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Sample Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purpose ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Code Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Chunk Data List Type Labeled Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_LABELED_TEXT_FEATURE_COUNT = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeNoteImpl <em>Chunk Data List Type Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkDataListTypeNoteImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListTypeNote()
	 * @generated
	 */
	int CHUNK_DATA_LIST_TYPE_NOTE = 9;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_NOTE__CHUNK_ID = CHUNK_DATA_LIST_TYPE__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_NOTE__CHUNK_DATA_SIZE = CHUNK_DATA_LIST_TYPE__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_NOTE__CUE_POINT_ID = CHUNK_DATA_LIST_TYPE__CUE_POINT_ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_NOTE__TEXT = CHUNK_DATA_LIST_TYPE__TEXT;

	/**
	 * The number of structural features of the '<em>Chunk Data List Type Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_DATA_LIST_TYPE_NOTE_FEATURE_COUNT = CHUNK_DATA_LIST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkFactImpl <em>Chunk Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkFactImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkFact()
	 * @generated
	 */
	int CHUNK_FACT = 10;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FACT__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FACT__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Format Dependant Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FACT__FORMAT_DEPENDANT_DATA = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chunk Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FACT_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl <em>Chunk Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkFormatImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkFormat()
	 * @generated
	 */
	int CHUNK_FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Compression Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__COMPRESSION_CODE = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__NUMBER_OF_CHANNELS = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__SAMPLE_RATE = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Average Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND = CHUNK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Block Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__BLOCK_ALIGN = CHUNK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Significant Bits Per Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE = CHUNK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number Of Extra Format Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES = CHUNK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Extra Format Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT__EXTRA_FORMAT_BYTES = CHUNK_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Chunk Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FORMAT_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkHeaderImpl <em>Chunk Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkHeaderImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkHeader()
	 * @generated
	 */
	int CHUNK_HEADER = 12;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_HEADER__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_HEADER__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The number of structural features of the '<em>Chunk Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_HEADER_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl <em>Chunk Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkInstrumentImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkInstrument()
	 * @generated
	 */
	int CHUNK_INSTRUMENT = 13;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Unshifted Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__UNSHIFTED_NOTE = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fine Tune</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__FINE_TUNE = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__GAIN = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__LOW_NOTE = CHUNK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>High Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__HIGH_NOTE = CHUNK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Low Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__LOW_VELOCITY = CHUNK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>High Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT__HIGH_VELOCITY = CHUNK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Chunk Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_INSTRUMENT_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkPlayListImpl <em>Chunk Play List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkPlayListImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkPlayList()
	 * @generated
	 */
	int CHUNK_PLAY_LIST = 14;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_PLAY_LIST__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_PLAY_LIST__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Number Of Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_PLAY_LIST__SEGMENTS = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chunk Play List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_PLAY_LIST_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl <em>Chunk Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkSamplerImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkSampler()
	 * @generated
	 */
	int CHUNK_SAMPLER = 15;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__MANUFACTURER = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__PRODUCT = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sample Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__SAMPLE_PERIOD = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Midi Unity Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__MIDI_UNITY_NOTE = CHUNK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Midi Pitch Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__MIDI_PITCH_FRACTION = CHUNK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Smpte Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__SMPTE_FORMAT = CHUNK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Smpte Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__SMPTE_OFFSET = CHUNK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Number Of Sample Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS = CHUNK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sampler Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__SAMPLER_DATA_SIZE = CHUNK_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sampler Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__SAMPLER_DATA = CHUNK_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sample Loops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER__SAMPLE_LOOPS = CHUNK_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Chunk Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SAMPLER_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkSilentImpl <em>Chunk Silent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkSilentImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkSilent()
	 * @generated
	 */
	int CHUNK_SILENT = 16;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SILENT__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SILENT__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Number Of Silent Samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SILENT__NUMBER_OF_SILENT_SAMPLES = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chunk Silent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_SILENT_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.ChunkWaveListImpl <em>Chunk Wave List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.ChunkWaveListImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkWaveList()
	 * @generated
	 */
	int CHUNK_WAVE_LIST = 17;

	/**
	 * The feature id for the '<em><b>Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_WAVE_LIST__CHUNK_ID = CHUNK__CHUNK_ID;

	/**
	 * The feature id for the '<em><b>Chunk Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_WAVE_LIST__CHUNK_DATA_SIZE = CHUNK__CHUNK_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Alternating Silent And Data Chunks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chunk Wave List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_WAVE_LIST_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.CuePointImpl <em>Cue Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.CuePointImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getCuePoint()
	 * @generated
	 */
	int CUE_POINT = 18;

	/**
	 * The feature id for the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_POINT__CUE_POINT_ID = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_POINT__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Data Chunk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_POINT__DATA_CHUNK_ID = 2;

	/**
	 * The feature id for the '<em><b>Chunk Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_POINT__CHUNK_START = 3;

	/**
	 * The feature id for the '<em><b>Block Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_POINT__BLOCK_START = 4;

	/**
	 * The feature id for the '<em><b>Sample Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_POINT__SAMPLE_OFFSET = 5;

	/**
	 * The number of structural features of the '<em>Cue Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_POINT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.SampleDataImpl <em>Sample Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.SampleDataImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleData()
	 * @generated
	 */
	int SAMPLE_DATA = 19;

	/**
	 * The number of structural features of the '<em>Sample Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.SampleData8BitImpl <em>Sample Data8 Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.SampleData8BitImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleData8Bit()
	 * @generated
	 */
	int SAMPLE_DATA8_BIT = 20;

	/**
	 * The feature id for the '<em><b>Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA8_BIT__SAMPLE = SAMPLE_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sample Data8 Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA8_BIT_FEATURE_COUNT = SAMPLE_DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.SampleData16BitImpl <em>Sample Data16 Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.SampleData16BitImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleData16Bit()
	 * @generated
	 */
	int SAMPLE_DATA16_BIT = 21;

	/**
	 * The feature id for the '<em><b>Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA16_BIT__SAMPLE = SAMPLE_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sample Data16 Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA16_BIT_FEATURE_COUNT = SAMPLE_DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.SampleLoopImpl <em>Sample Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.SampleLoopImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleLoop()
	 * @generated
	 */
	int SAMPLE_LOOP = 22;

	/**
	 * The feature id for the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_LOOP__CUE_POINT_ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_LOOP__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_LOOP__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_LOOP__END = 3;

	/**
	 * The feature id for the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_LOOP__FRACTION = 4;

	/**
	 * The feature id for the '<em><b>Play Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_LOOP__PLAY_COUNT = 5;

	/**
	 * The number of structural features of the '<em>Sample Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_LOOP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.impl.SegmentImpl
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 23;

	/**
	 * The feature id for the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__CUE_POINT_ID = 0;

	/**
	 * The feature id for the '<em><b>Length In Samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__LENGTH_IN_SAMPLES = 1;

	/**
	 * The feature id for the '<em><b>Number Of Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NUMBER_OF_REPEATS = 2;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.ChunkDataListTypeID <em>Chunk Data List Type ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeID
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListTypeID()
	 * @generated
	 */
	int CHUNK_DATA_LIST_TYPE_ID = 24;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.ChunkID <em>Chunk ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.ChunkID
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkID()
	 * @generated
	 */
	int CHUNK_ID = 25;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.CompressionCode <em>Compression Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.CompressionCode
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getCompressionCode()
	 * @generated
	 */
	int COMPRESSION_CODE = 26;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.SampleLoopType <em>Sample Loop Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.SampleLoopType
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleLoopType()
	 * @generated
	 */
	int SAMPLE_LOOP_TYPE = 27;

	/**
	 * The meta object id for the '{@link com.skratchdot.riff.wav.SMPTEFormat <em>SMPTE Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.skratchdot.riff.wav.SMPTEFormat
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSMPTEFormat()
	 * @generated
	 */
	int SMPTE_FORMAT = 28;

	/**
	 * The meta object id for the '<em>Unsigned Short</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getUnsignedShort()
	 * @generated
	 */
	int UNSIGNED_SHORT = 29;

	/**
	 * The meta object id for the '<em>Unsigned Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getUnsignedInt()
	 * @generated
	 */
	int UNSIGNED_INT = 30;

	/**
	 * The meta object id for the '<em>Unsupported Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getUnsupportedType()
	 * @generated
	 */
	int UNSUPPORTED_TYPE = 31;


	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.RIFFWave <em>RIFF Wave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RIFF Wave</em>'.
	 * @see com.skratchdot.riff.wav.RIFFWave
	 * @generated
	 */
	EClass getRIFFWave();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.riff.wav.RIFFWave#getHeaderChunk <em>Header Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Chunk</em>'.
	 * @see com.skratchdot.riff.wav.RIFFWave#getHeaderChunk()
	 * @see #getRIFFWave()
	 * @generated
	 */
	EReference getRIFFWave_HeaderChunk();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.riff.wav.RIFFWave#getChunks <em>Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chunks</em>'.
	 * @see com.skratchdot.riff.wav.RIFFWave#getChunks()
	 * @see #getRIFFWave()
	 * @generated
	 */
	EReference getRIFFWave_Chunks();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.RIFFWave#getRiffType <em>Riff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Riff Type</em>'.
	 * @see com.skratchdot.riff.wav.RIFFWave#getRiffType()
	 * @see #getRIFFWave()
	 * @generated
	 */
	EAttribute getRIFFWave_RiffType();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see com.skratchdot.riff.wav.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.riff.wav.Channel#getSampleData <em>Sample Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sample Data</em>'.
	 * @see com.skratchdot.riff.wav.Channel#getSampleData()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_SampleData();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk</em>'.
	 * @see com.skratchdot.riff.wav.Chunk
	 * @generated
	 */
	EClass getChunk();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.Chunk#getChunkID <em>Chunk ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chunk ID</em>'.
	 * @see com.skratchdot.riff.wav.Chunk#getChunkID()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_ChunkID();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.Chunk#getChunkDataSize <em>Chunk Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chunk Data Size</em>'.
	 * @see com.skratchdot.riff.wav.Chunk#getChunkDataSize()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_ChunkDataSize();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkCue <em>Chunk Cue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Cue</em>'.
	 * @see com.skratchdot.riff.wav.ChunkCue
	 * @generated
	 */
	EClass getChunkCue();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkCue#getNumberOfCuePoints <em>Number Of Cue Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cue Points</em>'.
	 * @see com.skratchdot.riff.wav.ChunkCue#getNumberOfCuePoints()
	 * @see #getChunkCue()
	 * @generated
	 */
	EAttribute getChunkCue_NumberOfCuePoints();

	/**
	 * Returns the meta object for the reference '{@link com.skratchdot.riff.wav.ChunkCue#getCuePoints <em>Cue Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cue Points</em>'.
	 * @see com.skratchdot.riff.wav.ChunkCue#getCuePoints()
	 * @see #getChunkCue()
	 * @generated
	 */
	EReference getChunkCue_CuePoints();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkData <em>Chunk Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Data</em>'.
	 * @see com.skratchdot.riff.wav.ChunkData
	 * @generated
	 */
	EClass getChunkData();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.riff.wav.ChunkData#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channels</em>'.
	 * @see com.skratchdot.riff.wav.ChunkData#getChannels()
	 * @see #getChunkData()
	 * @generated
	 */
	EReference getChunkData_Channels();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkData#getSampleDataOriginal <em>Sample Data Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Data Original</em>'.
	 * @see com.skratchdot.riff.wav.ChunkData#getSampleDataOriginal()
	 * @see #getChunkData()
	 * @generated
	 */
	EAttribute getChunkData_SampleDataOriginal();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkDataList <em>Chunk Data List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Data List</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataList
	 * @generated
	 */
	EClass getChunkDataList();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataList#getTypeID <em>Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type ID</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataList#getTypeID()
	 * @see #getChunkDataList()
	 * @generated
	 */
	EAttribute getChunkDataList_TypeID();

	/**
	 * Returns the meta object for the reference '{@link com.skratchdot.riff.wav.ChunkDataList#getDataListChunks <em>Data List Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data List Chunks</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataList#getDataListChunks()
	 * @see #getChunkDataList()
	 * @generated
	 */
	EReference getChunkDataList_DataListChunks();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkDataListType <em>Chunk Data List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Data List Type</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListType
	 * @generated
	 */
	EClass getChunkDataListType();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataListType#getCuePointID <em>Cue Point ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cue Point ID</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListType#getCuePointID()
	 * @see #getChunkDataListType()
	 * @generated
	 */
	EAttribute getChunkDataListType_CuePointID();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataListType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListType#getText()
	 * @see #getChunkDataListType()
	 * @generated
	 */
	EAttribute getChunkDataListType_Text();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabel <em>Chunk Data List Type Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Data List Type Label</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabel
	 * @generated
	 */
	EClass getChunkDataListTypeLabel();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText <em>Chunk Data List Type Labeled Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Data List Type Labeled Text</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabeledText
	 * @generated
	 */
	EClass getChunkDataListTypeLabeledText();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getSampleLength <em>Sample Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Length</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getSampleLength()
	 * @see #getChunkDataListTypeLabeledText()
	 * @generated
	 */
	EAttribute getChunkDataListTypeLabeledText_SampleLength();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getPurposeID <em>Purpose ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose ID</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getPurposeID()
	 * @see #getChunkDataListTypeLabeledText()
	 * @generated
	 */
	EAttribute getChunkDataListTypeLabeledText_PurposeID();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getCountry()
	 * @see #getChunkDataListTypeLabeledText()
	 * @generated
	 */
	EAttribute getChunkDataListTypeLabeledText_Country();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getLanguage()
	 * @see #getChunkDataListTypeLabeledText()
	 * @generated
	 */
	EAttribute getChunkDataListTypeLabeledText_Language();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getDialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialect</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getDialect()
	 * @see #getChunkDataListTypeLabeledText()
	 * @generated
	 */
	EAttribute getChunkDataListTypeLabeledText_Dialect();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getCodePage <em>Code Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Page</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeLabeledText#getCodePage()
	 * @see #getChunkDataListTypeLabeledText()
	 * @generated
	 */
	EAttribute getChunkDataListTypeLabeledText_CodePage();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkDataListTypeNote <em>Chunk Data List Type Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Data List Type Note</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeNote
	 * @generated
	 */
	EClass getChunkDataListTypeNote();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkFact <em>Chunk Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Fact</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFact
	 * @generated
	 */
	EClass getChunkFact();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFact#getFormatDependantData <em>Format Dependant Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Dependant Data</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFact#getFormatDependantData()
	 * @see #getChunkFact()
	 * @generated
	 */
	EAttribute getChunkFact_FormatDependantData();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkFormat <em>Chunk Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Format</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat
	 * @generated
	 */
	EClass getChunkFormat();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFormat#getCompressionCode <em>Compression Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compression Code</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat#getCompressionCode()
	 * @see #getChunkFormat()
	 * @generated
	 */
	EAttribute getChunkFormat_CompressionCode();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFormat#getNumberOfChannels <em>Number Of Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Channels</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat#getNumberOfChannels()
	 * @see #getChunkFormat()
	 * @generated
	 */
	EAttribute getChunkFormat_NumberOfChannels();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFormat#getSampleRate <em>Sample Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Rate</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat#getSampleRate()
	 * @see #getChunkFormat()
	 * @generated
	 */
	EAttribute getChunkFormat_SampleRate();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFormat#getAverageBytesPerSecond <em>Average Bytes Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Bytes Per Second</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat#getAverageBytesPerSecond()
	 * @see #getChunkFormat()
	 * @generated
	 */
	EAttribute getChunkFormat_AverageBytesPerSecond();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFormat#getBlockAlign <em>Block Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Align</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat#getBlockAlign()
	 * @see #getChunkFormat()
	 * @generated
	 */
	EAttribute getChunkFormat_BlockAlign();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFormat#getSignificantBitsPerSample <em>Significant Bits Per Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Bits Per Sample</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat#getSignificantBitsPerSample()
	 * @see #getChunkFormat()
	 * @generated
	 */
	EAttribute getChunkFormat_SignificantBitsPerSample();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFormat#getNumberOfExtraFormatBytes <em>Number Of Extra Format Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Extra Format Bytes</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat#getNumberOfExtraFormatBytes()
	 * @see #getChunkFormat()
	 * @generated
	 */
	EAttribute getChunkFormat_NumberOfExtraFormatBytes();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkFormat#getExtraFormatBytes <em>Extra Format Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Format Bytes</em>'.
	 * @see com.skratchdot.riff.wav.ChunkFormat#getExtraFormatBytes()
	 * @see #getChunkFormat()
	 * @generated
	 */
	EAttribute getChunkFormat_ExtraFormatBytes();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkHeader <em>Chunk Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Header</em>'.
	 * @see com.skratchdot.riff.wav.ChunkHeader
	 * @generated
	 */
	EClass getChunkHeader();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkInstrument <em>Chunk Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Instrument</em>'.
	 * @see com.skratchdot.riff.wav.ChunkInstrument
	 * @generated
	 */
	EClass getChunkInstrument();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkInstrument#getUnshiftedNote <em>Unshifted Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unshifted Note</em>'.
	 * @see com.skratchdot.riff.wav.ChunkInstrument#getUnshiftedNote()
	 * @see #getChunkInstrument()
	 * @generated
	 */
	EAttribute getChunkInstrument_UnshiftedNote();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkInstrument#getFineTune <em>Fine Tune</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fine Tune</em>'.
	 * @see com.skratchdot.riff.wav.ChunkInstrument#getFineTune()
	 * @see #getChunkInstrument()
	 * @generated
	 */
	EAttribute getChunkInstrument_FineTune();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkInstrument#getGain <em>Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gain</em>'.
	 * @see com.skratchdot.riff.wav.ChunkInstrument#getGain()
	 * @see #getChunkInstrument()
	 * @generated
	 */
	EAttribute getChunkInstrument_Gain();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkInstrument#getLowNote <em>Low Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Note</em>'.
	 * @see com.skratchdot.riff.wav.ChunkInstrument#getLowNote()
	 * @see #getChunkInstrument()
	 * @generated
	 */
	EAttribute getChunkInstrument_LowNote();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkInstrument#getHighNote <em>High Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Note</em>'.
	 * @see com.skratchdot.riff.wav.ChunkInstrument#getHighNote()
	 * @see #getChunkInstrument()
	 * @generated
	 */
	EAttribute getChunkInstrument_HighNote();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkInstrument#getLowVelocity <em>Low Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Velocity</em>'.
	 * @see com.skratchdot.riff.wav.ChunkInstrument#getLowVelocity()
	 * @see #getChunkInstrument()
	 * @generated
	 */
	EAttribute getChunkInstrument_LowVelocity();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkInstrument#getHighVelocity <em>High Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Velocity</em>'.
	 * @see com.skratchdot.riff.wav.ChunkInstrument#getHighVelocity()
	 * @see #getChunkInstrument()
	 * @generated
	 */
	EAttribute getChunkInstrument_HighVelocity();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkPlayList <em>Chunk Play List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Play List</em>'.
	 * @see com.skratchdot.riff.wav.ChunkPlayList
	 * @generated
	 */
	EClass getChunkPlayList();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkPlayList#getNumberOfSegments <em>Number Of Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Segments</em>'.
	 * @see com.skratchdot.riff.wav.ChunkPlayList#getNumberOfSegments()
	 * @see #getChunkPlayList()
	 * @generated
	 */
	EAttribute getChunkPlayList_NumberOfSegments();

	/**
	 * Returns the meta object for the reference '{@link com.skratchdot.riff.wav.ChunkPlayList#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segments</em>'.
	 * @see com.skratchdot.riff.wav.ChunkPlayList#getSegments()
	 * @see #getChunkPlayList()
	 * @generated
	 */
	EReference getChunkPlayList_Segments();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkSampler <em>Chunk Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Sampler</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler
	 * @generated
	 */
	EClass getChunkSampler();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getManufacturer()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getProduct()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_Product();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getSamplePeriod <em>Sample Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Period</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getSamplePeriod()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_SamplePeriod();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getMidiUnityNote <em>Midi Unity Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Unity Note</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getMidiUnityNote()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_MidiUnityNote();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getMidiPitchFraction <em>Midi Pitch Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Pitch Fraction</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getMidiPitchFraction()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_MidiPitchFraction();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getSmpteFormat <em>Smpte Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smpte Format</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getSmpteFormat()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_SmpteFormat();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getSmpteOffset <em>Smpte Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smpte Offset</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getSmpteOffset()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_SmpteOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getNumberOfSampleLoops <em>Number Of Sample Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Sample Loops</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getNumberOfSampleLoops()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_NumberOfSampleLoops();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getSamplerDataSize <em>Sampler Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampler Data Size</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getSamplerDataSize()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_SamplerDataSize();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSampler#getSamplerData <em>Sampler Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampler Data</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getSamplerData()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EAttribute getChunkSampler_SamplerData();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.riff.wav.ChunkSampler#getSampleLoops <em>Sample Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sample Loops</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSampler#getSampleLoops()
	 * @see #getChunkSampler()
	 * @generated
	 */
	EReference getChunkSampler_SampleLoops();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkSilent <em>Chunk Silent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Silent</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSilent
	 * @generated
	 */
	EClass getChunkSilent();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.ChunkSilent#getNumberOfSilentSamples <em>Number Of Silent Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Silent Samples</em>'.
	 * @see com.skratchdot.riff.wav.ChunkSilent#getNumberOfSilentSamples()
	 * @see #getChunkSilent()
	 * @generated
	 */
	EAttribute getChunkSilent_NumberOfSilentSamples();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.ChunkWaveList <em>Chunk Wave List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk Wave List</em>'.
	 * @see com.skratchdot.riff.wav.ChunkWaveList
	 * @generated
	 */
	EClass getChunkWaveList();

	/**
	 * Returns the meta object for the containment reference '{@link com.skratchdot.riff.wav.ChunkWaveList#getAlternatingSilentAndDataChunks <em>Alternating Silent And Data Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternating Silent And Data Chunks</em>'.
	 * @see com.skratchdot.riff.wav.ChunkWaveList#getAlternatingSilentAndDataChunks()
	 * @see #getChunkWaveList()
	 * @generated
	 */
	EReference getChunkWaveList_AlternatingSilentAndDataChunks();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.CuePoint <em>Cue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cue Point</em>'.
	 * @see com.skratchdot.riff.wav.CuePoint
	 * @generated
	 */
	EClass getCuePoint();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.CuePoint#getCuePointID <em>Cue Point ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cue Point ID</em>'.
	 * @see com.skratchdot.riff.wav.CuePoint#getCuePointID()
	 * @see #getCuePoint()
	 * @generated
	 */
	EAttribute getCuePoint_CuePointID();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.CuePoint#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see com.skratchdot.riff.wav.CuePoint#getPosition()
	 * @see #getCuePoint()
	 * @generated
	 */
	EAttribute getCuePoint_Position();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.CuePoint#getDataChunkID <em>Data Chunk ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Chunk ID</em>'.
	 * @see com.skratchdot.riff.wav.CuePoint#getDataChunkID()
	 * @see #getCuePoint()
	 * @generated
	 */
	EAttribute getCuePoint_DataChunkID();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.CuePoint#getChunkStart <em>Chunk Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chunk Start</em>'.
	 * @see com.skratchdot.riff.wav.CuePoint#getChunkStart()
	 * @see #getCuePoint()
	 * @generated
	 */
	EAttribute getCuePoint_ChunkStart();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.CuePoint#getBlockStart <em>Block Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Start</em>'.
	 * @see com.skratchdot.riff.wav.CuePoint#getBlockStart()
	 * @see #getCuePoint()
	 * @generated
	 */
	EAttribute getCuePoint_BlockStart();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.CuePoint#getSampleOffset <em>Sample Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Offset</em>'.
	 * @see com.skratchdot.riff.wav.CuePoint#getSampleOffset()
	 * @see #getCuePoint()
	 * @generated
	 */
	EAttribute getCuePoint_SampleOffset();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.SampleData <em>Sample Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Data</em>'.
	 * @see com.skratchdot.riff.wav.SampleData
	 * @generated
	 */
	EClass getSampleData();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.SampleData8Bit <em>Sample Data8 Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Data8 Bit</em>'.
	 * @see com.skratchdot.riff.wav.SampleData8Bit
	 * @generated
	 */
	EClass getSampleData8Bit();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.SampleData8Bit#getSample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample</em>'.
	 * @see com.skratchdot.riff.wav.SampleData8Bit#getSample()
	 * @see #getSampleData8Bit()
	 * @generated
	 */
	EAttribute getSampleData8Bit_Sample();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.SampleData16Bit <em>Sample Data16 Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Data16 Bit</em>'.
	 * @see com.skratchdot.riff.wav.SampleData16Bit
	 * @generated
	 */
	EClass getSampleData16Bit();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.SampleData16Bit#getSample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample</em>'.
	 * @see com.skratchdot.riff.wav.SampleData16Bit#getSample()
	 * @see #getSampleData16Bit()
	 * @generated
	 */
	EAttribute getSampleData16Bit_Sample();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.SampleLoop <em>Sample Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Loop</em>'.
	 * @see com.skratchdot.riff.wav.SampleLoop
	 * @generated
	 */
	EClass getSampleLoop();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.SampleLoop#getCuePointID <em>Cue Point ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cue Point ID</em>'.
	 * @see com.skratchdot.riff.wav.SampleLoop#getCuePointID()
	 * @see #getSampleLoop()
	 * @generated
	 */
	EAttribute getSampleLoop_CuePointID();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.SampleLoop#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.skratchdot.riff.wav.SampleLoop#getType()
	 * @see #getSampleLoop()
	 * @generated
	 */
	EAttribute getSampleLoop_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.SampleLoop#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.skratchdot.riff.wav.SampleLoop#getStart()
	 * @see #getSampleLoop()
	 * @generated
	 */
	EAttribute getSampleLoop_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.SampleLoop#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.skratchdot.riff.wav.SampleLoop#getEnd()
	 * @see #getSampleLoop()
	 * @generated
	 */
	EAttribute getSampleLoop_End();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.SampleLoop#getFraction <em>Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction</em>'.
	 * @see com.skratchdot.riff.wav.SampleLoop#getFraction()
	 * @see #getSampleLoop()
	 * @generated
	 */
	EAttribute getSampleLoop_Fraction();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.SampleLoop#getPlayCount <em>Play Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Count</em>'.
	 * @see com.skratchdot.riff.wav.SampleLoop#getPlayCount()
	 * @see #getSampleLoop()
	 * @generated
	 */
	EAttribute getSampleLoop_PlayCount();

	/**
	 * Returns the meta object for class '{@link com.skratchdot.riff.wav.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see com.skratchdot.riff.wav.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.Segment#getCuePointID <em>Cue Point ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cue Point ID</em>'.
	 * @see com.skratchdot.riff.wav.Segment#getCuePointID()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_CuePointID();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.Segment#getLengthInSamples <em>Length In Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length In Samples</em>'.
	 * @see com.skratchdot.riff.wav.Segment#getLengthInSamples()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_LengthInSamples();

	/**
	 * Returns the meta object for the attribute '{@link com.skratchdot.riff.wav.Segment#getNumberOfRepeats <em>Number Of Repeats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Repeats</em>'.
	 * @see com.skratchdot.riff.wav.Segment#getNumberOfRepeats()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_NumberOfRepeats();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.riff.wav.ChunkDataListTypeID <em>Chunk Data List Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chunk Data List Type ID</em>'.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeID
	 * @generated
	 */
	EEnum getChunkDataListTypeID();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.riff.wav.ChunkID <em>Chunk ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chunk ID</em>'.
	 * @see com.skratchdot.riff.wav.ChunkID
	 * @generated
	 */
	EEnum getChunkID();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.riff.wav.CompressionCode <em>Compression Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compression Code</em>'.
	 * @see com.skratchdot.riff.wav.CompressionCode
	 * @generated
	 */
	EEnum getCompressionCode();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.riff.wav.SampleLoopType <em>Sample Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sample Loop Type</em>'.
	 * @see com.skratchdot.riff.wav.SampleLoopType
	 * @generated
	 */
	EEnum getSampleLoopType();

	/**
	 * Returns the meta object for enum '{@link com.skratchdot.riff.wav.SMPTEFormat <em>SMPTE Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SMPTE Format</em>'.
	 * @see com.skratchdot.riff.wav.SMPTEFormat
	 * @generated
	 */
	EEnum getSMPTEFormat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Unsigned Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsigned Short</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getUnsignedShort();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsigned Int</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getUnsignedInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Unsupported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsupported Type</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getUnsupportedType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WavFactory getWavFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.RIFFWaveImpl <em>RIFF Wave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.RIFFWaveImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getRIFFWave()
		 * @generated
		 */
		EClass RIFF_WAVE = eINSTANCE.getRIFFWave();

		/**
		 * The meta object literal for the '<em><b>Header Chunk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIFF_WAVE__HEADER_CHUNK = eINSTANCE.getRIFFWave_HeaderChunk();

		/**
		 * The meta object literal for the '<em><b>Chunks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIFF_WAVE__CHUNKS = eINSTANCE.getRIFFWave_Chunks();

		/**
		 * The meta object literal for the '<em><b>Riff Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIFF_WAVE__RIFF_TYPE = eINSTANCE.getRIFFWave_RiffType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChannelImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Sample Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__SAMPLE_DATA = eINSTANCE.getChannel_SampleData();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkImpl <em>Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunk()
		 * @generated
		 */
		EClass CHUNK = eINSTANCE.getChunk();

		/**
		 * The meta object literal for the '<em><b>Chunk ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__CHUNK_ID = eINSTANCE.getChunk_ChunkID();

		/**
		 * The meta object literal for the '<em><b>Chunk Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__CHUNK_DATA_SIZE = eINSTANCE.getChunk_ChunkDataSize();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkCueImpl <em>Chunk Cue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkCueImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkCue()
		 * @generated
		 */
		EClass CHUNK_CUE = eINSTANCE.getChunkCue();

		/**
		 * The meta object literal for the '<em><b>Number Of Cue Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_CUE__NUMBER_OF_CUE_POINTS = eINSTANCE.getChunkCue_NumberOfCuePoints();

		/**
		 * The meta object literal for the '<em><b>Cue Points</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK_CUE__CUE_POINTS = eINSTANCE.getChunkCue_CuePoints();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkDataImpl <em>Chunk Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkDataImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkData()
		 * @generated
		 */
		EClass CHUNK_DATA = eINSTANCE.getChunkData();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK_DATA__CHANNELS = eINSTANCE.getChunkData_Channels();

		/**
		 * The meta object literal for the '<em><b>Sample Data Original</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA__SAMPLE_DATA_ORIGINAL = eINSTANCE.getChunkData_SampleDataOriginal();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListImpl <em>Chunk Data List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkDataListImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataList()
		 * @generated
		 */
		EClass CHUNK_DATA_LIST = eINSTANCE.getChunkDataList();

		/**
		 * The meta object literal for the '<em><b>Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST__TYPE_ID = eINSTANCE.getChunkDataList_TypeID();

		/**
		 * The meta object literal for the '<em><b>Data List Chunks</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK_DATA_LIST__DATA_LIST_CHUNKS = eINSTANCE.getChunkDataList_DataListChunks();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeImpl <em>Chunk Data List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkDataListTypeImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListType()
		 * @generated
		 */
		EClass CHUNK_DATA_LIST_TYPE = eINSTANCE.getChunkDataListType();

		/**
		 * The meta object literal for the '<em><b>Cue Point ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST_TYPE__CUE_POINT_ID = eINSTANCE.getChunkDataListType_CuePointID();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST_TYPE__TEXT = eINSTANCE.getChunkDataListType_Text();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabelImpl <em>Chunk Data List Type Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkDataListTypeLabelImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListTypeLabel()
		 * @generated
		 */
		EClass CHUNK_DATA_LIST_TYPE_LABEL = eINSTANCE.getChunkDataListTypeLabel();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl <em>Chunk Data List Type Labeled Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkDataListTypeLabeledTextImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListTypeLabeledText()
		 * @generated
		 */
		EClass CHUNK_DATA_LIST_TYPE_LABELED_TEXT = eINSTANCE.getChunkDataListTypeLabeledText();

		/**
		 * The meta object literal for the '<em><b>Sample Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH = eINSTANCE.getChunkDataListTypeLabeledText_SampleLength();

		/**
		 * The meta object literal for the '<em><b>Purpose ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID = eINSTANCE.getChunkDataListTypeLabeledText_PurposeID();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY = eINSTANCE.getChunkDataListTypeLabeledText_Country();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE = eINSTANCE.getChunkDataListTypeLabeledText_Language();

		/**
		 * The meta object literal for the '<em><b>Dialect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT = eINSTANCE.getChunkDataListTypeLabeledText_Dialect();

		/**
		 * The meta object literal for the '<em><b>Code Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE = eINSTANCE.getChunkDataListTypeLabeledText_CodePage();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkDataListTypeNoteImpl <em>Chunk Data List Type Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkDataListTypeNoteImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListTypeNote()
		 * @generated
		 */
		EClass CHUNK_DATA_LIST_TYPE_NOTE = eINSTANCE.getChunkDataListTypeNote();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkFactImpl <em>Chunk Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkFactImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkFact()
		 * @generated
		 */
		EClass CHUNK_FACT = eINSTANCE.getChunkFact();

		/**
		 * The meta object literal for the '<em><b>Format Dependant Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FACT__FORMAT_DEPENDANT_DATA = eINSTANCE.getChunkFact_FormatDependantData();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl <em>Chunk Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkFormatImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkFormat()
		 * @generated
		 */
		EClass CHUNK_FORMAT = eINSTANCE.getChunkFormat();

		/**
		 * The meta object literal for the '<em><b>Compression Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FORMAT__COMPRESSION_CODE = eINSTANCE.getChunkFormat_CompressionCode();

		/**
		 * The meta object literal for the '<em><b>Number Of Channels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FORMAT__NUMBER_OF_CHANNELS = eINSTANCE.getChunkFormat_NumberOfChannels();

		/**
		 * The meta object literal for the '<em><b>Sample Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FORMAT__SAMPLE_RATE = eINSTANCE.getChunkFormat_SampleRate();

		/**
		 * The meta object literal for the '<em><b>Average Bytes Per Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND = eINSTANCE.getChunkFormat_AverageBytesPerSecond();

		/**
		 * The meta object literal for the '<em><b>Block Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FORMAT__BLOCK_ALIGN = eINSTANCE.getChunkFormat_BlockAlign();

		/**
		 * The meta object literal for the '<em><b>Significant Bits Per Sample</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE = eINSTANCE.getChunkFormat_SignificantBitsPerSample();

		/**
		 * The meta object literal for the '<em><b>Number Of Extra Format Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES = eINSTANCE.getChunkFormat_NumberOfExtraFormatBytes();

		/**
		 * The meta object literal for the '<em><b>Extra Format Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_FORMAT__EXTRA_FORMAT_BYTES = eINSTANCE.getChunkFormat_ExtraFormatBytes();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkHeaderImpl <em>Chunk Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkHeaderImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkHeader()
		 * @generated
		 */
		EClass CHUNK_HEADER = eINSTANCE.getChunkHeader();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkInstrumentImpl <em>Chunk Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkInstrumentImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkInstrument()
		 * @generated
		 */
		EClass CHUNK_INSTRUMENT = eINSTANCE.getChunkInstrument();

		/**
		 * The meta object literal for the '<em><b>Unshifted Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_INSTRUMENT__UNSHIFTED_NOTE = eINSTANCE.getChunkInstrument_UnshiftedNote();

		/**
		 * The meta object literal for the '<em><b>Fine Tune</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_INSTRUMENT__FINE_TUNE = eINSTANCE.getChunkInstrument_FineTune();

		/**
		 * The meta object literal for the '<em><b>Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_INSTRUMENT__GAIN = eINSTANCE.getChunkInstrument_Gain();

		/**
		 * The meta object literal for the '<em><b>Low Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_INSTRUMENT__LOW_NOTE = eINSTANCE.getChunkInstrument_LowNote();

		/**
		 * The meta object literal for the '<em><b>High Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_INSTRUMENT__HIGH_NOTE = eINSTANCE.getChunkInstrument_HighNote();

		/**
		 * The meta object literal for the '<em><b>Low Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_INSTRUMENT__LOW_VELOCITY = eINSTANCE.getChunkInstrument_LowVelocity();

		/**
		 * The meta object literal for the '<em><b>High Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_INSTRUMENT__HIGH_VELOCITY = eINSTANCE.getChunkInstrument_HighVelocity();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkPlayListImpl <em>Chunk Play List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkPlayListImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkPlayList()
		 * @generated
		 */
		EClass CHUNK_PLAY_LIST = eINSTANCE.getChunkPlayList();

		/**
		 * The meta object literal for the '<em><b>Number Of Segments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_PLAY_LIST__NUMBER_OF_SEGMENTS = eINSTANCE.getChunkPlayList_NumberOfSegments();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK_PLAY_LIST__SEGMENTS = eINSTANCE.getChunkPlayList_Segments();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl <em>Chunk Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkSamplerImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkSampler()
		 * @generated
		 */
		EClass CHUNK_SAMPLER = eINSTANCE.getChunkSampler();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__MANUFACTURER = eINSTANCE.getChunkSampler_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__PRODUCT = eINSTANCE.getChunkSampler_Product();

		/**
		 * The meta object literal for the '<em><b>Sample Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__SAMPLE_PERIOD = eINSTANCE.getChunkSampler_SamplePeriod();

		/**
		 * The meta object literal for the '<em><b>Midi Unity Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__MIDI_UNITY_NOTE = eINSTANCE.getChunkSampler_MidiUnityNote();

		/**
		 * The meta object literal for the '<em><b>Midi Pitch Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__MIDI_PITCH_FRACTION = eINSTANCE.getChunkSampler_MidiPitchFraction();

		/**
		 * The meta object literal for the '<em><b>Smpte Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__SMPTE_FORMAT = eINSTANCE.getChunkSampler_SmpteFormat();

		/**
		 * The meta object literal for the '<em><b>Smpte Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__SMPTE_OFFSET = eINSTANCE.getChunkSampler_SmpteOffset();

		/**
		 * The meta object literal for the '<em><b>Number Of Sample Loops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS = eINSTANCE.getChunkSampler_NumberOfSampleLoops();

		/**
		 * The meta object literal for the '<em><b>Sampler Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__SAMPLER_DATA_SIZE = eINSTANCE.getChunkSampler_SamplerDataSize();

		/**
		 * The meta object literal for the '<em><b>Sampler Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SAMPLER__SAMPLER_DATA = eINSTANCE.getChunkSampler_SamplerData();

		/**
		 * The meta object literal for the '<em><b>Sample Loops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK_SAMPLER__SAMPLE_LOOPS = eINSTANCE.getChunkSampler_SampleLoops();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkSilentImpl <em>Chunk Silent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkSilentImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkSilent()
		 * @generated
		 */
		EClass CHUNK_SILENT = eINSTANCE.getChunkSilent();

		/**
		 * The meta object literal for the '<em><b>Number Of Silent Samples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK_SILENT__NUMBER_OF_SILENT_SAMPLES = eINSTANCE.getChunkSilent_NumberOfSilentSamples();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.ChunkWaveListImpl <em>Chunk Wave List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.ChunkWaveListImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkWaveList()
		 * @generated
		 */
		EClass CHUNK_WAVE_LIST = eINSTANCE.getChunkWaveList();

		/**
		 * The meta object literal for the '<em><b>Alternating Silent And Data Chunks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS = eINSTANCE.getChunkWaveList_AlternatingSilentAndDataChunks();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.CuePointImpl <em>Cue Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.CuePointImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getCuePoint()
		 * @generated
		 */
		EClass CUE_POINT = eINSTANCE.getCuePoint();

		/**
		 * The meta object literal for the '<em><b>Cue Point ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUE_POINT__CUE_POINT_ID = eINSTANCE.getCuePoint_CuePointID();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUE_POINT__POSITION = eINSTANCE.getCuePoint_Position();

		/**
		 * The meta object literal for the '<em><b>Data Chunk ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUE_POINT__DATA_CHUNK_ID = eINSTANCE.getCuePoint_DataChunkID();

		/**
		 * The meta object literal for the '<em><b>Chunk Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUE_POINT__CHUNK_START = eINSTANCE.getCuePoint_ChunkStart();

		/**
		 * The meta object literal for the '<em><b>Block Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUE_POINT__BLOCK_START = eINSTANCE.getCuePoint_BlockStart();

		/**
		 * The meta object literal for the '<em><b>Sample Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUE_POINT__SAMPLE_OFFSET = eINSTANCE.getCuePoint_SampleOffset();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.SampleDataImpl <em>Sample Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.SampleDataImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleData()
		 * @generated
		 */
		EClass SAMPLE_DATA = eINSTANCE.getSampleData();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.SampleData8BitImpl <em>Sample Data8 Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.SampleData8BitImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleData8Bit()
		 * @generated
		 */
		EClass SAMPLE_DATA8_BIT = eINSTANCE.getSampleData8Bit();

		/**
		 * The meta object literal for the '<em><b>Sample</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_DATA8_BIT__SAMPLE = eINSTANCE.getSampleData8Bit_Sample();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.SampleData16BitImpl <em>Sample Data16 Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.SampleData16BitImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleData16Bit()
		 * @generated
		 */
		EClass SAMPLE_DATA16_BIT = eINSTANCE.getSampleData16Bit();

		/**
		 * The meta object literal for the '<em><b>Sample</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_DATA16_BIT__SAMPLE = eINSTANCE.getSampleData16Bit_Sample();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.SampleLoopImpl <em>Sample Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.SampleLoopImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleLoop()
		 * @generated
		 */
		EClass SAMPLE_LOOP = eINSTANCE.getSampleLoop();

		/**
		 * The meta object literal for the '<em><b>Cue Point ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_LOOP__CUE_POINT_ID = eINSTANCE.getSampleLoop_CuePointID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_LOOP__TYPE = eINSTANCE.getSampleLoop_Type();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_LOOP__START = eINSTANCE.getSampleLoop_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_LOOP__END = eINSTANCE.getSampleLoop_End();

		/**
		 * The meta object literal for the '<em><b>Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_LOOP__FRACTION = eINSTANCE.getSampleLoop_Fraction();

		/**
		 * The meta object literal for the '<em><b>Play Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_LOOP__PLAY_COUNT = eINSTANCE.getSampleLoop_PlayCount();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.impl.SegmentImpl
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Cue Point ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__CUE_POINT_ID = eINSTANCE.getSegment_CuePointID();

		/**
		 * The meta object literal for the '<em><b>Length In Samples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__LENGTH_IN_SAMPLES = eINSTANCE.getSegment_LengthInSamples();

		/**
		 * The meta object literal for the '<em><b>Number Of Repeats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__NUMBER_OF_REPEATS = eINSTANCE.getSegment_NumberOfRepeats();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.ChunkDataListTypeID <em>Chunk Data List Type ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.ChunkDataListTypeID
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkDataListTypeID()
		 * @generated
		 */
		EEnum CHUNK_DATA_LIST_TYPE_ID = eINSTANCE.getChunkDataListTypeID();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.ChunkID <em>Chunk ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.ChunkID
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getChunkID()
		 * @generated
		 */
		EEnum CHUNK_ID = eINSTANCE.getChunkID();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.CompressionCode <em>Compression Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.CompressionCode
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getCompressionCode()
		 * @generated
		 */
		EEnum COMPRESSION_CODE = eINSTANCE.getCompressionCode();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.SampleLoopType <em>Sample Loop Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.SampleLoopType
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSampleLoopType()
		 * @generated
		 */
		EEnum SAMPLE_LOOP_TYPE = eINSTANCE.getSampleLoopType();

		/**
		 * The meta object literal for the '{@link com.skratchdot.riff.wav.SMPTEFormat <em>SMPTE Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.skratchdot.riff.wav.SMPTEFormat
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getSMPTEFormat()
		 * @generated
		 */
		EEnum SMPTE_FORMAT = eINSTANCE.getSMPTEFormat();

		/**
		 * The meta object literal for the '<em>Unsigned Short</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getUnsignedShort()
		 * @generated
		 */
		EDataType UNSIGNED_SHORT = eINSTANCE.getUnsignedShort();

		/**
		 * The meta object literal for the '<em>Unsigned Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getUnsignedInt()
		 * @generated
		 */
		EDataType UNSIGNED_INT = eINSTANCE.getUnsignedInt();

		/**
		 * The meta object literal for the '<em>Unsupported Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see com.skratchdot.riff.wav.impl.WavPackageImpl#getUnsupportedType()
		 * @generated
		 */
		EDataType UNSUPPORTED_TYPE = eINSTANCE.getUnsupportedType();

	}

} //WavPackage
