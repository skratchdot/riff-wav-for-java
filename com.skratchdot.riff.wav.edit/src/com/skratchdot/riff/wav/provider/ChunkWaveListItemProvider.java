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


import com.skratchdot.riff.wav.ChunkWaveList;
import com.skratchdot.riff.wav.WavFactory;
import com.skratchdot.riff.wav.WavPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.skratchdot.riff.wav.ChunkWaveList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChunkWaveListItemProvider
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
	public ChunkWaveListItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS);
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
	 * This returns ChunkWaveList.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChunkWaveList"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ChunkWaveList chunkWaveList = (ChunkWaveList)object;
		return getString("_UI_ChunkWaveList_type") + " " + chunkWaveList.getBlockAlignedSize();
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

		switch (notification.getFeatureID(ChunkWaveList.class)) {
			case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
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
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkCue()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkData()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkDataList()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkDataListTypeLabel()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkDataListTypeLabeledText()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkDataListTypeNote()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkFact()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkFormat()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkInstrument()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkPlayList()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkSampler()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkSilent()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkUnknown()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS,
				 WavFactory.eINSTANCE.createChunkWaveList()));
	}

}
