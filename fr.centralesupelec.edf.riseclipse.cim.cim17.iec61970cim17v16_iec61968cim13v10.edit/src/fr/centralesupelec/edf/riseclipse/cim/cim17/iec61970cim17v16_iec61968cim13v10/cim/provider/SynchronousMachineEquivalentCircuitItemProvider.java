/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronousMachineEquivalentCircuitItemProvider extends SynchronousMachineDetailedItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineEquivalentCircuitItemProvider( AdapterFactory adapterFactory ) {
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

            addR1dPropertyDescriptor( object );
            addR1qPropertyDescriptor( object );
            addR2qPropertyDescriptor( object );
            addRfdPropertyDescriptor( object );
            addX1dPropertyDescriptor( object );
            addX1qPropertyDescriptor( object );
            addX2qPropertyDescriptor( object );
            addXadPropertyDescriptor( object );
            addXaqPropertyDescriptor( object );
            addXf1dPropertyDescriptor( object );
            addXfdPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the R1d feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR1dPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_r1d_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_r1d_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_R1d(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R1q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR1qPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_r1q_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_r1q_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_R1q(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R2q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR2qPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_r2q_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_r2q_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_R2q(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rfd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_rfd_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_rfd_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_Rfd(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X1d feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX1dPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_x1d_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_x1d_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_X1d(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X1q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX1qPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_x1q_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_x1q_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_X1q(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X2q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX2qPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_x2q_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_x2q_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_X2q(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xad feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_xad_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_xad_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_Xad(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xaq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXaqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_xaq_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_xaq_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_Xaq(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xf1d feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXf1dPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_xf1d_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_xf1d_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_Xf1d(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xfd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXfdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineEquivalentCircuit_xfd_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachineEquivalentCircuit_xfd_feature",
                        "_UI_SynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit_Xfd(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns SynchronousMachineEquivalentCircuit.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object,
                getResourceLocator().getImage( "full/obj16/SynchronousMachineEquivalentCircuit" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SynchronousMachineEquivalentCircuit ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SynchronousMachineEquivalentCircuit_type" )
                : getString( "_UI_SynchronousMachineEquivalentCircuit_type" ) + " " + label;
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

        switch( notification.getFeatureID( SynchronousMachineEquivalentCircuit.class ) ) {
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1D:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1Q:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R2Q:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RFD:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1D:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1Q:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X2Q:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAD:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAQ:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XF1D:
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XFD:
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
