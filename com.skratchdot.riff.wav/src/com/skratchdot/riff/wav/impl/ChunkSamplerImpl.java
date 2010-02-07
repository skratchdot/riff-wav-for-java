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

import com.skratchdot.riff.wav.ChunkSampler;
import com.skratchdot.riff.wav.SampleLoop;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSamplePeriod <em>Sample Period</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getMidiUnityNote <em>Midi Unity Note</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getMidiPitchFraction <em>Midi Pitch Fraction</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSmpteFormat <em>Smpte Format</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSmpteOffset <em>Smpte Offset</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getNumberOfSampleLoops <em>Number Of Sample Loops</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSamplerDataSize <em>Sampler Data Size</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSamplerData <em>Sampler Data</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSamplerImpl#getSampleLoops <em>Sample Loops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkSamplerImpl extends ChunkImpl implements ChunkSampler {
	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final Long MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Long manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Long product = PRODUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplePeriod() <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Long SAMPLE_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplePeriod() <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplePeriod()
	 * @generated
	 * @ordered
	 */
	protected Long samplePeriod = SAMPLE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiUnityNote() <em>Midi Unity Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiUnityNote()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIDI_UNITY_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiUnityNote() <em>Midi Unity Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiUnityNote()
	 * @generated
	 * @ordered
	 */
	protected Long midiUnityNote = MIDI_UNITY_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiPitchFraction() <em>Midi Pitch Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiPitchFraction()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIDI_PITCH_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiPitchFraction() <em>Midi Pitch Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiPitchFraction()
	 * @generated
	 * @ordered
	 */
	protected Long midiPitchFraction = MIDI_PITCH_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmpteFormat() <em>Smpte Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpteFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Long SMPTE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmpteFormat() <em>Smpte Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpteFormat()
	 * @generated
	 * @ordered
	 */
	protected Long smpteFormat = SMPTE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmpteOffset() <em>Smpte Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpteOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Long SMPTE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmpteOffset() <em>Smpte Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpteOffset()
	 * @generated
	 * @ordered
	 */
	protected Long smpteOffset = SMPTE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSampleLoops() <em>Number Of Sample Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSampleLoops()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_SAMPLE_LOOPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfSampleLoops() <em>Number Of Sample Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSampleLoops()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfSampleLoops = NUMBER_OF_SAMPLE_LOOPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplerDataSize() <em>Sampler Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SAMPLER_DATA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplerDataSize() <em>Sampler Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerDataSize()
	 * @generated
	 * @ordered
	 */
	protected Long samplerDataSize = SAMPLER_DATA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplerData() <em>Sampler Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SAMPLER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplerData() <em>Sampler Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerData()
	 * @generated
	 * @ordered
	 */
	protected byte[] samplerData = SAMPLER_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSampleLoops() <em>Sample Loops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleLoops()
	 * @generated
	 * @ordered
	 */
	protected SampleLoop sampleLoops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkSamplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_SAMPLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Long newManufacturer) {
		Long oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Long newProduct) {
		Long oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSamplePeriod() {
		return samplePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplePeriod(Long newSamplePeriod) {
		Long oldSamplePeriod = samplePeriod;
		samplePeriod = newSamplePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD, oldSamplePeriod, samplePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMidiUnityNote() {
		return midiUnityNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiUnityNote(Long newMidiUnityNote) {
		Long oldMidiUnityNote = midiUnityNote;
		midiUnityNote = newMidiUnityNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE, oldMidiUnityNote, midiUnityNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMidiPitchFraction() {
		return midiPitchFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiPitchFraction(Long newMidiPitchFraction) {
		Long oldMidiPitchFraction = midiPitchFraction;
		midiPitchFraction = newMidiPitchFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION, oldMidiPitchFraction, midiPitchFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSmpteFormat() {
		return smpteFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmpteFormat(Long newSmpteFormat) {
		Long oldSmpteFormat = smpteFormat;
		smpteFormat = newSmpteFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT, oldSmpteFormat, smpteFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSmpteOffset() {
		return smpteOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmpteOffset(Long newSmpteOffset) {
		Long oldSmpteOffset = smpteOffset;
		smpteOffset = newSmpteOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET, oldSmpteOffset, smpteOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getNumberOfSampleLoops() {
		return numberOfSampleLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSampleLoops(Long newNumberOfSampleLoops) {
		Long oldNumberOfSampleLoops = numberOfSampleLoops;
		numberOfSampleLoops = newNumberOfSampleLoops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS, oldNumberOfSampleLoops, numberOfSampleLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSamplerDataSize() {
		return samplerDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplerDataSize(Long newSamplerDataSize) {
		Long oldSamplerDataSize = samplerDataSize;
		samplerDataSize = newSamplerDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SAMPLER_DATA_SIZE, oldSamplerDataSize, samplerDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSamplerData() {
		return samplerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplerData(byte[] newSamplerData) {
		byte[] oldSamplerData = samplerData;
		samplerData = newSamplerData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SAMPLER_DATA, oldSamplerData, samplerData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleLoop getSampleLoops() {
		return sampleLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSampleLoops(SampleLoop newSampleLoops, NotificationChain msgs) {
		SampleLoop oldSampleLoops = sampleLoops;
		sampleLoops = newSampleLoops;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS, oldSampleLoops, newSampleLoops);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleLoops(SampleLoop newSampleLoops) {
		if (newSampleLoops != sampleLoops) {
			NotificationChain msgs = null;
			if (sampleLoops != null)
				msgs = ((InternalEObject)sampleLoops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS, null, msgs);
			if (newSampleLoops != null)
				msgs = ((InternalEObject)newSampleLoops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS, null, msgs);
			msgs = basicSetSampleLoops(newSampleLoops, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS, newSampleLoops, newSampleLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				return basicSetSampleLoops(null, msgs);
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
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
				return getManufacturer();
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
				return getProduct();
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
				return getSamplePeriod();
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
				return getMidiUnityNote();
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
				return getMidiPitchFraction();
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
				return getSmpteFormat();
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
				return getSmpteOffset();
			case WavPackage.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS:
				return getNumberOfSampleLoops();
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA_SIZE:
				return getSamplerDataSize();
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				return getSamplerData();
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				return getSampleLoops();
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
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
				setManufacturer((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
				setProduct((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
				setSamplePeriod((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
				setMidiUnityNote((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
				setMidiPitchFraction((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
				setSmpteFormat((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
				setSmpteOffset((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS:
				setNumberOfSampleLoops((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA_SIZE:
				setSamplerDataSize((Long)newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				setSamplerData((byte[])newValue);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				setSampleLoops((SampleLoop)newValue);
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
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
				setProduct(PRODUCT_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
				setSamplePeriod(SAMPLE_PERIOD_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
				setMidiUnityNote(MIDI_UNITY_NOTE_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
				setMidiPitchFraction(MIDI_PITCH_FRACTION_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
				setSmpteFormat(SMPTE_FORMAT_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
				setSmpteOffset(SMPTE_OFFSET_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS:
				setNumberOfSampleLoops(NUMBER_OF_SAMPLE_LOOPS_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA_SIZE:
				setSamplerDataSize(SAMPLER_DATA_SIZE_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				setSamplerData(SAMPLER_DATA_EDEFAULT);
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				setSampleLoops((SampleLoop)null);
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
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
				return PRODUCT_EDEFAULT == null ? product != null : !PRODUCT_EDEFAULT.equals(product);
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
				return SAMPLE_PERIOD_EDEFAULT == null ? samplePeriod != null : !SAMPLE_PERIOD_EDEFAULT.equals(samplePeriod);
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
				return MIDI_UNITY_NOTE_EDEFAULT == null ? midiUnityNote != null : !MIDI_UNITY_NOTE_EDEFAULT.equals(midiUnityNote);
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
				return MIDI_PITCH_FRACTION_EDEFAULT == null ? midiPitchFraction != null : !MIDI_PITCH_FRACTION_EDEFAULT.equals(midiPitchFraction);
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
				return SMPTE_FORMAT_EDEFAULT == null ? smpteFormat != null : !SMPTE_FORMAT_EDEFAULT.equals(smpteFormat);
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
				return SMPTE_OFFSET_EDEFAULT == null ? smpteOffset != null : !SMPTE_OFFSET_EDEFAULT.equals(smpteOffset);
			case WavPackage.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS:
				return NUMBER_OF_SAMPLE_LOOPS_EDEFAULT == null ? numberOfSampleLoops != null : !NUMBER_OF_SAMPLE_LOOPS_EDEFAULT.equals(numberOfSampleLoops);
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA_SIZE:
				return SAMPLER_DATA_SIZE_EDEFAULT == null ? samplerDataSize != null : !SAMPLER_DATA_SIZE_EDEFAULT.equals(samplerDataSize);
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				return SAMPLER_DATA_EDEFAULT == null ? samplerData != null : !SAMPLER_DATA_EDEFAULT.equals(samplerData);
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				return sampleLoops != null;
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
		result.append(" (manufacturer: ");
		result.append(manufacturer);
		result.append(", product: ");
		result.append(product);
		result.append(", samplePeriod: ");
		result.append(samplePeriod);
		result.append(", midiUnityNote: ");
		result.append(midiUnityNote);
		result.append(", midiPitchFraction: ");
		result.append(midiPitchFraction);
		result.append(", smpteFormat: ");
		result.append(smpteFormat);
		result.append(", smpteOffset: ");
		result.append(smpteOffset);
		result.append(", numberOfSampleLoops: ");
		result.append(numberOfSampleLoops);
		result.append(", samplerDataSize: ");
		result.append(samplerDataSize);
		result.append(", samplerData: ");
		result.append(samplerData);
		result.append(')');
		return result.toString();
	}

} //ChunkSamplerImpl
