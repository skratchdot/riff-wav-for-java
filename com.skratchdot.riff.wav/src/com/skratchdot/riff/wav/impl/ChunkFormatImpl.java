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

import com.skratchdot.riff.wav.ChunkFormat;
import com.skratchdot.riff.wav.CompressionCode;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl#getCompressionCode <em>Compression Code</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl#getNumberOfChannels <em>Number Of Channels</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl#getAverageBytesPerSecond <em>Average Bytes Per Second</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl#getBlockAlign <em>Block Align</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl#getSignificantBitsPerSample <em>Significant Bits Per Sample</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl#getNumberOfExtraFormatBytes <em>Number Of Extra Format Bytes</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkFormatImpl#getExtraFormatBytes <em>Extra Format Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkFormatImpl extends ChunkImpl implements ChunkFormat {
	/**
	 * The default value of the '{@link #getCompressionCode() <em>Compression Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionCode()
	 * @generated
	 * @ordered
	 */
	protected static final CompressionCode COMPRESSION_CODE_EDEFAULT = CompressionCode.COMPRESSION_CODE_0;

	/**
	 * The cached value of the '{@link #getCompressionCode() <em>Compression Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionCode()
	 * @generated
	 * @ordered
	 */
	protected CompressionCode compressionCode = COMPRESSION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfChannels() <em>Number Of Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfChannels()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_CHANNELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfChannels() <em>Number Of Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfChannels()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfChannels = NUMBER_OF_CHANNELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long SAMPLE_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleRate()
	 * @generated
	 * @ordered
	 */
	protected Long sampleRate = SAMPLE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageBytesPerSecond() <em>Average Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_BYTES_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageBytesPerSecond() <em>Average Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Long averageBytesPerSecond = AVERAGE_BYTES_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockAlign() <em>Block Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BLOCK_ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockAlign() <em>Block Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockAlign()
	 * @generated
	 * @ordered
	 */
	protected Integer blockAlign = BLOCK_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignificantBitsPerSample() <em>Significant Bits Per Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantBitsPerSample()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIGNIFICANT_BITS_PER_SAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignificantBitsPerSample() <em>Significant Bits Per Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantBitsPerSample()
	 * @generated
	 * @ordered
	 */
	protected Integer significantBitsPerSample = SIGNIFICANT_BITS_PER_SAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfExtraFormatBytes() <em>Number Of Extra Format Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExtraFormatBytes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_EXTRA_FORMAT_BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfExtraFormatBytes() <em>Number Of Extra Format Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExtraFormatBytes()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfExtraFormatBytes = NUMBER_OF_EXTRA_FORMAT_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraFormatBytes() <em>Extra Format Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraFormatBytes()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] EXTRA_FORMAT_BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtraFormatBytes() <em>Extra Format Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraFormatBytes()
	 * @generated
	 * @ordered
	 */
	protected byte[] extraFormatBytes = EXTRA_FORMAT_BYTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionCode getCompressionCode() {
		return compressionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionCode(CompressionCode newCompressionCode) {
		CompressionCode oldCompressionCode = compressionCode;
		compressionCode = newCompressionCode == null ? COMPRESSION_CODE_EDEFAULT : newCompressionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_FORMAT__COMPRESSION_CODE, oldCompressionCode, compressionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfChannels() {
		return numberOfChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfChannels(Integer newNumberOfChannels) {
		Integer oldNumberOfChannels = numberOfChannels;
		numberOfChannels = newNumberOfChannels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_FORMAT__NUMBER_OF_CHANNELS, oldNumberOfChannels, numberOfChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSampleRate() {
		return sampleRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleRate(Long newSampleRate) {
		Long oldSampleRate = sampleRate;
		sampleRate = newSampleRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_FORMAT__SAMPLE_RATE, oldSampleRate, sampleRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAverageBytesPerSecond() {
		return averageBytesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageBytesPerSecond(Long newAverageBytesPerSecond) {
		Long oldAverageBytesPerSecond = averageBytesPerSecond;
		averageBytesPerSecond = newAverageBytesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND, oldAverageBytesPerSecond, averageBytesPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBlockAlign() {
		return blockAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockAlign(Integer newBlockAlign) {
		Integer oldBlockAlign = blockAlign;
		blockAlign = newBlockAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_FORMAT__BLOCK_ALIGN, oldBlockAlign, blockAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSignificantBitsPerSample() {
		return significantBitsPerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignificantBitsPerSample(Integer newSignificantBitsPerSample) {
		Integer oldSignificantBitsPerSample = significantBitsPerSample;
		significantBitsPerSample = newSignificantBitsPerSample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE, oldSignificantBitsPerSample, significantBitsPerSample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfExtraFormatBytes() {
		return numberOfExtraFormatBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfExtraFormatBytes(Integer newNumberOfExtraFormatBytes) {
		Integer oldNumberOfExtraFormatBytes = numberOfExtraFormatBytes;
		numberOfExtraFormatBytes = newNumberOfExtraFormatBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES, oldNumberOfExtraFormatBytes, numberOfExtraFormatBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getExtraFormatBytes() {
		return extraFormatBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraFormatBytes(byte[] newExtraFormatBytes) {
		byte[] oldExtraFormatBytes = extraFormatBytes;
		extraFormatBytes = newExtraFormatBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_FORMAT__EXTRA_FORMAT_BYTES, oldExtraFormatBytes, extraFormatBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_FORMAT__COMPRESSION_CODE:
				return getCompressionCode();
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_CHANNELS:
				return getNumberOfChannels();
			case WavPackage.CHUNK_FORMAT__SAMPLE_RATE:
				return getSampleRate();
			case WavPackage.CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND:
				return getAverageBytesPerSecond();
			case WavPackage.CHUNK_FORMAT__BLOCK_ALIGN:
				return getBlockAlign();
			case WavPackage.CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE:
				return getSignificantBitsPerSample();
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES:
				return getNumberOfExtraFormatBytes();
			case WavPackage.CHUNK_FORMAT__EXTRA_FORMAT_BYTES:
				return getExtraFormatBytes();
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
			case WavPackage.CHUNK_FORMAT__COMPRESSION_CODE:
				setCompressionCode((CompressionCode)newValue);
				return;
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_CHANNELS:
				setNumberOfChannels((Integer)newValue);
				return;
			case WavPackage.CHUNK_FORMAT__SAMPLE_RATE:
				setSampleRate((Long)newValue);
				return;
			case WavPackage.CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND:
				setAverageBytesPerSecond((Long)newValue);
				return;
			case WavPackage.CHUNK_FORMAT__BLOCK_ALIGN:
				setBlockAlign((Integer)newValue);
				return;
			case WavPackage.CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE:
				setSignificantBitsPerSample((Integer)newValue);
				return;
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES:
				setNumberOfExtraFormatBytes((Integer)newValue);
				return;
			case WavPackage.CHUNK_FORMAT__EXTRA_FORMAT_BYTES:
				setExtraFormatBytes((byte[])newValue);
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
			case WavPackage.CHUNK_FORMAT__COMPRESSION_CODE:
				setCompressionCode(COMPRESSION_CODE_EDEFAULT);
				return;
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_CHANNELS:
				setNumberOfChannels(NUMBER_OF_CHANNELS_EDEFAULT);
				return;
			case WavPackage.CHUNK_FORMAT__SAMPLE_RATE:
				setSampleRate(SAMPLE_RATE_EDEFAULT);
				return;
			case WavPackage.CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND:
				setAverageBytesPerSecond(AVERAGE_BYTES_PER_SECOND_EDEFAULT);
				return;
			case WavPackage.CHUNK_FORMAT__BLOCK_ALIGN:
				setBlockAlign(BLOCK_ALIGN_EDEFAULT);
				return;
			case WavPackage.CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE:
				setSignificantBitsPerSample(SIGNIFICANT_BITS_PER_SAMPLE_EDEFAULT);
				return;
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES:
				setNumberOfExtraFormatBytes(NUMBER_OF_EXTRA_FORMAT_BYTES_EDEFAULT);
				return;
			case WavPackage.CHUNK_FORMAT__EXTRA_FORMAT_BYTES:
				setExtraFormatBytes(EXTRA_FORMAT_BYTES_EDEFAULT);
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
			case WavPackage.CHUNK_FORMAT__COMPRESSION_CODE:
				return compressionCode != COMPRESSION_CODE_EDEFAULT;
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_CHANNELS:
				return NUMBER_OF_CHANNELS_EDEFAULT == null ? numberOfChannels != null : !NUMBER_OF_CHANNELS_EDEFAULT.equals(numberOfChannels);
			case WavPackage.CHUNK_FORMAT__SAMPLE_RATE:
				return SAMPLE_RATE_EDEFAULT == null ? sampleRate != null : !SAMPLE_RATE_EDEFAULT.equals(sampleRate);
			case WavPackage.CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND:
				return AVERAGE_BYTES_PER_SECOND_EDEFAULT == null ? averageBytesPerSecond != null : !AVERAGE_BYTES_PER_SECOND_EDEFAULT.equals(averageBytesPerSecond);
			case WavPackage.CHUNK_FORMAT__BLOCK_ALIGN:
				return BLOCK_ALIGN_EDEFAULT == null ? blockAlign != null : !BLOCK_ALIGN_EDEFAULT.equals(blockAlign);
			case WavPackage.CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE:
				return SIGNIFICANT_BITS_PER_SAMPLE_EDEFAULT == null ? significantBitsPerSample != null : !SIGNIFICANT_BITS_PER_SAMPLE_EDEFAULT.equals(significantBitsPerSample);
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES:
				return NUMBER_OF_EXTRA_FORMAT_BYTES_EDEFAULT == null ? numberOfExtraFormatBytes != null : !NUMBER_OF_EXTRA_FORMAT_BYTES_EDEFAULT.equals(numberOfExtraFormatBytes);
			case WavPackage.CHUNK_FORMAT__EXTRA_FORMAT_BYTES:
				return EXTRA_FORMAT_BYTES_EDEFAULT == null ? extraFormatBytes != null : !EXTRA_FORMAT_BYTES_EDEFAULT.equals(extraFormatBytes);
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
		result.append(" (compressionCode: ");
		result.append(compressionCode);
		result.append(", numberOfChannels: ");
		result.append(numberOfChannels);
		result.append(", sampleRate: ");
		result.append(sampleRate);
		result.append(", averageBytesPerSecond: ");
		result.append(averageBytesPerSecond);
		result.append(", blockAlign: ");
		result.append(blockAlign);
		result.append(", significantBitsPerSample: ");
		result.append(significantBitsPerSample);
		result.append(", numberOfExtraFormatBytes: ");
		result.append(numberOfExtraFormatBytes);
		result.append(", extraFormatBytes: ");
		result.append(extraFormatBytes);
		result.append(')');
		return result.toString();
	}

} //ChunkFormatImpl
