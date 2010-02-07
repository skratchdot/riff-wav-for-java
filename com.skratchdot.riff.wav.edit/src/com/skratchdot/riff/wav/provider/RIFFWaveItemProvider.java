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


import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavFactory;
import com.skratchdot.riff.wav.WavPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.skratchdot.riff.wav.RIFFWave} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RIFFWaveItemProvider
	extends ItemProviderAdapter
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
	public RIFFWaveItemProvider(AdapterFactory adapterFactory) {
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

			addRiffTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Riff Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRiffTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RIFFWave_riffType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RIFFWave_riffType_feature", "_UI_RIFFWave_type"),
				 WavPackage.Literals.RIFF_WAVE__RIFF_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(WavPackage.Literals.RIFF_WAVE__HEADER_CHUNK);
			childrenFeatures.add(WavPackage.Literals.RIFF_WAVE__CHUNKS);
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
	 * This returns RIFFWave.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RIFFWave"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RIFFWave riffWave = (RIFFWave)object;
		return getString("_UI_RIFFWave_type") + " " + riffWave.getRiffType();
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

		switch (notification.getFeatureID(RIFFWave.class)) {
			case WavPackage.RIFF_WAVE__RIFF_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WavPackage.RIFF_WAVE__HEADER_CHUNK:
			case WavPackage.RIFF_WAVE__CHUNKS:
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
				(WavPackage.Literals.RIFF_WAVE__HEADER_CHUNK,
				 WavFactory.eINSTANCE.createChunkHeader()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkCue()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkData()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkDataList()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkDataListTypeLabel()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkDataListTypeLabeledText()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkDataListTypeNote()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkFact()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkFormat()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkHeader()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkInstrument()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkPlayList()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkSampler()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkSilent()));

		newChildDescriptors.add
			(createChildParameter
				(WavPackage.Literals.RIFF_WAVE__CHUNKS,
				 WavFactory.eINSTANCE.createChunkWaveList()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WavPackage.Literals.RIFF_WAVE__HEADER_CHUNK ||
			childFeature == WavPackage.Literals.RIFF_WAVE__CHUNKS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RIFFWAVEditPlugin.INSTANCE;
	}

}
