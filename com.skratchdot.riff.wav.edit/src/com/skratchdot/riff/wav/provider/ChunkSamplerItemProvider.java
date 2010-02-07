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
package com.skratchdot.riff.wav.provider;


import com.skratchdot.riff.wav.ChunkID;
import com.skratchdot.riff.wav.ChunkSampler;
import com.skratchdot.riff.wav.WavFactory;
import com.skratchdot.riff.wav.WavPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.skratchdot.riff.wav.ChunkSampler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChunkSamplerItemProvider
	extends ChunkItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkSamplerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addManufacturerPropertyDescriptor(object);
			addProductPropertyDescriptor(object);
			addSamplePeriodPropertyDescriptor(object);
			addMidiUnityNotePropertyDescriptor(object);
			addMidiPitchFractionPropertyDescriptor(object);
			addSmpteFormatPropertyDescriptor(object);
			addSmpteOffsetPropertyDescriptor(object);
			addNumberOfSampleLoopsPropertyDescriptor(object);
			addSamplerDataSizePropertyDescriptor(object);
			addSamplerDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Manufacturer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManufacturerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_manufacturer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_manufacturer_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__MANUFACTURER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_product_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_product_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__PRODUCT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sample Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplePeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_samplePeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_samplePeriod_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__SAMPLE_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Midi Unity Note feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMidiUnityNotePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_midiUnityNote_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_midiUnityNote_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__MIDI_UNITY_NOTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Midi Pitch Fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMidiPitchFractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_midiPitchFraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_midiPitchFraction_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__MIDI_PITCH_FRACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smpte Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmpteFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_smpteFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_smpteFormat_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__SMPTE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smpte Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmpteOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_smpteOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_smpteOffset_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__SMPTE_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Sample Loops feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfSampleLoopsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_numberOfSampleLoops_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_numberOfSampleLoops_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sampler Data Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplerDataSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_samplerDataSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_samplerDataSize_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__SAMPLER_DATA_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sampler Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplerDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkSampler_samplerData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkSampler_samplerData_feature", "_UI_ChunkSampler_type"),
				 WavPackage.Literals.CHUNK_SAMPLER__SAMPLER_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WavPackage.Literals.CHUNK_SAMPLER__SAMPLE_LOOPS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ChunkSampler.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChunkSampler"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ChunkID labelValue = ((ChunkSampler)object).getChunkID();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ChunkSampler_type") :
			getString("_UI_ChunkSampler_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ChunkSampler.class)) {
			case WavPackage.CHUNK_SAMPLER__MANUFACTURER:
			case WavPackage.CHUNK_SAMPLER__PRODUCT:
			case WavPackage.CHUNK_SAMPLER__SAMPLE_PERIOD:
			case WavPackage.CHUNK_SAMPLER__MIDI_UNITY_NOTE:
			case WavPackage.CHUNK_SAMPLER__MIDI_PITCH_FRACTION:
			case WavPackage.CHUNK_SAMPLER__SMPTE_FORMAT:
			case WavPackage.CHUNK_SAMPLER__SMPTE_OFFSET:
			case WavPackage.CHUNK_SAMPLER__NUMBER_OF_SAMPLE_LOOPS:
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA_SIZE:
			case WavPackage.CHUNK_SAMPLER__SAMPLER_DATA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WavPackage.CHUNK_SAMPLER__SAMPLE_LOOPS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_SAMPLER__SAMPLE_LOOPS,
				 WavFactory.eINSTANCE.createSampleLoop()));
	}

}
