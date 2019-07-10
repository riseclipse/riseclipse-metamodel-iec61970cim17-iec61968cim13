/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineTimeConstantReactance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchronousMachineTimeConstantReactanceItemProvider extends AsynchronousMachineDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineTimeConstantReactanceItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addTpoPropertyDescriptor( object );
            addTppoPropertyDescriptor( object );
            addXpPropertyDescriptor( object );
            addXppPropertyDescriptor( object );
            addXsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Tpo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachineTimeConstantReactance_tpo_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachineTimeConstantReactance_tpo_feature",
                                "_UI_AsynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachineTimeConstantReactance_Tpo(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tppo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTppoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachineTimeConstantReactance_tppo_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachineTimeConstantReactance_tppo_feature",
                                "_UI_AsynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachineTimeConstantReactance_Tppo(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Xp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachineTimeConstantReactance_xp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachineTimeConstantReactance_xp_feature",
                                "_UI_AsynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachineTimeConstantReactance_Xp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Xpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachineTimeConstantReactance_xpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachineTimeConstantReactance_xpp_feature",
                                "_UI_AsynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachineTimeConstantReactance_Xpp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Xs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachineTimeConstantReactance_xs_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachineTimeConstantReactance_xs_feature",
                                "_UI_AsynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachineTimeConstantReactance_Xs(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns AsynchronousMachineTimeConstantReactance.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object,
                getResourceLocator().getImage( "full/obj16/AsynchronousMachineTimeConstantReactance" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( AsynchronousMachineTimeConstantReactance ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_AsynchronousMachineTimeConstantReactance_type" )
                : getString( "_UI_AsynchronousMachineTimeConstantReactance_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( AsynchronousMachineTimeConstantReactance.class ) ) {
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPO:
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPO:
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XP:
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XPP:
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XS:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
