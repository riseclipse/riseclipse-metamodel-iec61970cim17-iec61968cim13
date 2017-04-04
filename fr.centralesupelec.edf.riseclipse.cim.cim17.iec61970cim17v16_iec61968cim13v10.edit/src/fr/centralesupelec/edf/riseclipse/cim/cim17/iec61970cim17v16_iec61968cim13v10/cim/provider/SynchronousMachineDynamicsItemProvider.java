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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronousMachineDynamicsItemProvider extends RotatingMachineDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineDynamicsItemProvider( AdapterFactory adapterFactory ) {
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

            addExcitationSystemDynamicsPropertyDescriptor( object );
            addMechanicalLoadDynamicsPropertyDescriptor( object );
            addTurbineGovernorDynamicsPropertyDescriptor( object );
            addSynchronousMachinePropertyDescriptor( object );
            addGenICompensationForGenJPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Excitation System Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExcitationSystemDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineDynamics_ExcitationSystemDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineDynamics_ExcitationSystemDynamics_feature",
                        "_UI_SynchronousMachineDynamics_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineDynamics_ExcitationSystemDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Mechanical Load Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMechanicalLoadDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineDynamics_MechanicalLoadDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineDynamics_MechanicalLoadDynamics_feature",
                        "_UI_SynchronousMachineDynamics_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineDynamics_MechanicalLoadDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Turbine Governor Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTurbineGovernorDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineDynamics_TurbineGovernorDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineDynamics_TurbineGovernorDynamics_feature",
                        "_UI_SynchronousMachineDynamics_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineDynamics_TurbineGovernorDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Synchronous Machine feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchronousMachinePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SynchronousMachineDynamics_SynchronousMachine_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachineDynamics_SynchronousMachine_feature",
                                "_UI_SynchronousMachineDynamics_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachineDynamics_SynchronousMachine(), true, false, true,
                        null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gen ICompensation For Gen J feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenICompensationForGenJPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SynchronousMachineDynamics_GenICompensationForGenJ_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachineDynamics_GenICompensationForGenJ_feature",
                        "_UI_SynchronousMachineDynamics_type" ),
                CimPackage.eINSTANCE.getSynchronousMachineDynamics_GenICompensationForGenJ(), true, false, true, null,
                null, null ) );
    }

    /**
     * This returns SynchronousMachineDynamics.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SynchronousMachineDynamics" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SynchronousMachineDynamics ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SynchronousMachineDynamics_type" )
                : getString( "_UI_SynchronousMachineDynamics_type" ) + " " + label;
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
