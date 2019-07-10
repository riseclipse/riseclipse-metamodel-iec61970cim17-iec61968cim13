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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronousMachineTimeConstantReactanceItemProvider extends SynchronousMachineDetailedItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineTimeConstantReactanceItemProvider( AdapterFactory adapterFactory ) {
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

            addKsPropertyDescriptor( object );
            addModelTypePropertyDescriptor( object );
            addRotorTypePropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTpdoPropertyDescriptor( object );
            addTppdoPropertyDescriptor( object );
            addTppqoPropertyDescriptor( object );
            addTpqoPropertyDescriptor( object );
            addXDirectSubtransPropertyDescriptor( object );
            addXDirectSyncPropertyDescriptor( object );
            addXDirectTransPropertyDescriptor( object );
            addXQuadSubtransPropertyDescriptor( object );
            addXQuadSyncPropertyDescriptor( object );
            addXQuadTransPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SynchronousMachineTimeConstantReactance_ks_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachineTimeConstantReactance_ks_feature",
                                "_UI_SynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_Ks(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Model Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModelTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineTimeConstantReactance_modelType_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineTimeConstantReactance_modelType_feature",
                        "_UI_SynchronousMachineTimeConstantReactance_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_ModelType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rotor Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRotorTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineTimeConstantReactance_rotorType_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineTimeConstantReactance_rotorType_feature",
                        "_UI_SynchronousMachineTimeConstantReactance_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_RotorType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SynchronousMachineTimeConstantReactance_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachineTimeConstantReactance_tc_feature",
                                "_UI_SynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpdo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpdoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SynchronousMachineTimeConstantReactance_tpdo_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachineTimeConstantReactance_tpdo_feature",
                                "_UI_SynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_Tpdo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tppdo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTppdoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SynchronousMachineTimeConstantReactance_tppdo_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachineTimeConstantReactance_tppdo_feature",
                                "_UI_SynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_Tppdo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tppqo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTppqoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SynchronousMachineTimeConstantReactance_tppqo_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachineTimeConstantReactance_tppqo_feature",
                                "_UI_SynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_Tppqo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpqo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpqoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SynchronousMachineTimeConstantReactance_tpqo_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachineTimeConstantReactance_tpqo_feature",
                                "_UI_SynchronousMachineTimeConstantReactance_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_Tpqo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the XDirect Subtrans feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXDirectSubtransPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineTimeConstantReactance_xDirectSubtrans_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineTimeConstantReactance_xDirectSubtrans_feature",
                        "_UI_SynchronousMachineTimeConstantReactance_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_XDirectSubtrans(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the XDirect Sync feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXDirectSyncPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineTimeConstantReactance_xDirectSync_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineTimeConstantReactance_xDirectSync_feature",
                        "_UI_SynchronousMachineTimeConstantReactance_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_XDirectSync(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the XDirect Trans feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXDirectTransPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineTimeConstantReactance_xDirectTrans_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineTimeConstantReactance_xDirectTrans_feature",
                        "_UI_SynchronousMachineTimeConstantReactance_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_XDirectTrans(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the XQuad Subtrans feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXQuadSubtransPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineTimeConstantReactance_xQuadSubtrans_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineTimeConstantReactance_xQuadSubtrans_feature",
                        "_UI_SynchronousMachineTimeConstantReactance_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_XQuadSubtrans(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the XQuad Sync feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXQuadSyncPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineTimeConstantReactance_xQuadSync_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineTimeConstantReactance_xQuadSync_feature",
                        "_UI_SynchronousMachineTimeConstantReactance_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_XQuadSync(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the XQuad Trans feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXQuadTransPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineTimeConstantReactance_xQuadTrans_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineTimeConstantReactance_xQuadTrans_feature",
                        "_UI_SynchronousMachineTimeConstantReactance_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance_XQuadTrans(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns SynchronousMachineTimeConstantReactance.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object,
                getResourceLocator().getImage( "full/obj16/SynchronousMachineTimeConstantReactance" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SynchronousMachineTimeConstantReactance ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SynchronousMachineTimeConstantReactance_type" )
                : getString( "_UI_SynchronousMachineTimeConstantReactance_type" ) + " " + label;
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

        switch( notification.getFeatureID( SynchronousMachineTimeConstantReactance.class ) ) {
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__KS:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__MODEL_TYPE:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__ROTOR_TYPE:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TC:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPDO:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPDO:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPQO:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPQO:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SUBTRANS:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SYNC:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_TRANS:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SUBTRANS:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SYNC:
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_TRANS:
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
