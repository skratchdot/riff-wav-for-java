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


import com.skratchdot.riff.wav.ChunkDataListTypeLabeledText;
import com.skratchdot.riff.wav.WavPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
 * This is the item provider adapter for a {@link com.skratchdot.riff.wav.ChunkDataListTypeLabeledText} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChunkDataListTypeLabeledTextItemProvider
	extends ChunkDataListTypeItemProvider
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
	public ChunkDataListTypeLabeledTextItemProvider(AdapterFactory adapterFactory) {
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

			addSampleLengthPropertyDescriptor(object);
			addPurposeIDPropertyDescriptor(object);
			addCountryPropertyDescriptor(object);
			addLanguagePropertyDescriptor(object);
			addDialectPropertyDescriptor(object);
			addCodePagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sample Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSampleLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkDataListTypeLabeledText_sampleLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkDataListTypeLabeledText_sampleLength_feature", "_UI_ChunkDataListTypeLabeledText_type"),
				 WavPackage.Literals.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Purpose ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposeIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkDataListTypeLabeledText_purposeID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkDataListTypeLabeledText_purposeID_feature", "_UI_ChunkDataListTypeLabeledText_type"),
				 WavPackage.Literals.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Country feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkDataListTypeLabeledText_country_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkDataListTypeLabeledText_country_feature", "_UI_ChunkDataListTypeLabeledText_type"),
				 WavPackage.Literals.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkDataListTypeLabeledText_language_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkDataListTypeLabeledText_language_feature", "_UI_ChunkDataListTypeLabeledText_type"),
				 WavPackage.Literals.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dialect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDialectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkDataListTypeLabeledText_dialect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkDataListTypeLabeledText_dialect_feature", "_UI_ChunkDataListTypeLabeledText_type"),
				 WavPackage.Literals.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkDataListTypeLabeledText_codePage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkDataListTypeLabeledText_codePage_feature", "_UI_ChunkDataListTypeLabeledText_type"),
				 WavPackage.Literals.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ChunkDataListTypeLabeledText.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChunkDataListTypeLabeledText"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ChunkDataListTypeLabeledText chunkDataListTypeLabeledText = (ChunkDataListTypeLabeledText)object;
		return getString("_UI_ChunkDataListTypeLabeledText_type") + " " + chunkDataListTypeLabeledText.getBlockAlignedSize();
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

		switch (notification.getFeatureID(ChunkDataListTypeLabeledText.class)) {
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__SAMPLE_LENGTH:
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__PURPOSE_ID:
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__COUNTRY:
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__LANGUAGE:
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__DIALECT:
			case WavPackage.CHUNK_DATA_LIST_TYPE_LABELED_TEXT__CODE_PAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
