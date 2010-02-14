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


import com.skratchdot.riff.wav.ChunkFormat;
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
 * This is the item provider adapter for a {@link com.skratchdot.riff.wav.ChunkFormat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChunkFormatItemProvider
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
	public ChunkFormatItemProvider(AdapterFactory adapterFactory) {
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

			addCompressionCodePropertyDescriptor(object);
			addNumberOfChannelsPropertyDescriptor(object);
			addSampleRatePropertyDescriptor(object);
			addAverageBytesPerSecondPropertyDescriptor(object);
			addBlockAlignPropertyDescriptor(object);
			addSignificantBitsPerSamplePropertyDescriptor(object);
			addNumberOfExtraFormatBytesPropertyDescriptor(object);
			addExtraFormatBytesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Compression Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressionCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkFormat_compressionCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkFormat_compressionCode_feature", "_UI_ChunkFormat_type"),
				 WavPackage.Literals.CHUNK_FORMAT__COMPRESSION_CODE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Channels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfChannelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkFormat_numberOfChannels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkFormat_numberOfChannels_feature", "_UI_ChunkFormat_type"),
				 WavPackage.Literals.CHUNK_FORMAT__NUMBER_OF_CHANNELS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sample Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSampleRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkFormat_sampleRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkFormat_sampleRate_feature", "_UI_ChunkFormat_type"),
				 WavPackage.Literals.CHUNK_FORMAT__SAMPLE_RATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Average Bytes Per Second feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAverageBytesPerSecondPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkFormat_averageBytesPerSecond_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkFormat_averageBytesPerSecond_feature", "_UI_ChunkFormat_type"),
				 WavPackage.Literals.CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Block Align feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockAlignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkFormat_blockAlign_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkFormat_blockAlign_feature", "_UI_ChunkFormat_type"),
				 WavPackage.Literals.CHUNK_FORMAT__BLOCK_ALIGN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Significant Bits Per Sample feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignificantBitsPerSamplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkFormat_significantBitsPerSample_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkFormat_significantBitsPerSample_feature", "_UI_ChunkFormat_type"),
				 WavPackage.Literals.CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Extra Format Bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfExtraFormatBytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkFormat_numberOfExtraFormatBytes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkFormat_numberOfExtraFormatBytes_feature", "_UI_ChunkFormat_type"),
				 WavPackage.Literals.CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extra Format Bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtraFormatBytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChunkFormat_extraFormatBytes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChunkFormat_extraFormatBytes_feature", "_UI_ChunkFormat_type"),
				 WavPackage.Literals.CHUNK_FORMAT__EXTRA_FORMAT_BYTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ChunkFormat.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChunkFormat"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ChunkFormat chunkFormat = (ChunkFormat)object;
		return getString("_UI_ChunkFormat_type") + " " + chunkFormat.getBlockAlignedSize();
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

		switch (notification.getFeatureID(ChunkFormat.class)) {
			case WavPackage.CHUNK_FORMAT__COMPRESSION_CODE:
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_CHANNELS:
			case WavPackage.CHUNK_FORMAT__SAMPLE_RATE:
			case WavPackage.CHUNK_FORMAT__AVERAGE_BYTES_PER_SECOND:
			case WavPackage.CHUNK_FORMAT__BLOCK_ALIGN:
			case WavPackage.CHUNK_FORMAT__SIGNIFICANT_BITS_PER_SAMPLE:
			case WavPackage.CHUNK_FORMAT__NUMBER_OF_EXTRA_FORMAT_BYTES:
			case WavPackage.CHUNK_FORMAT__EXTRA_FORMAT_BYTES:
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
