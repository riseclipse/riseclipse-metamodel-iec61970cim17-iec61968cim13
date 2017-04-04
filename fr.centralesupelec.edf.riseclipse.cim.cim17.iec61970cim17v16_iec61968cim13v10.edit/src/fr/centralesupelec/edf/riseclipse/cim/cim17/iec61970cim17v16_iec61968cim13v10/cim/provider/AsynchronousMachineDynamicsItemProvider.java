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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchronousMachineDynamicsItemProvider extends RotatingMachineDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineDynamicsItemProvider( AdapterFactory adapterFactory ) {
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

            addTurbineGovernorDynamicsPropertyDescriptor( object );
            addWindTurbineType1or2DynamicsPropertyDescriptor( object );
            addMechanicalLoadDynamicsPropertyDescriptor( object );
            addAsynchronousMachinePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                getString( "_UI_AsynchronousMachineDynamics_TurbineGovernorDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AsynchronousMachineDynamics_TurbineGovernorDynamics_feature",
                        "_UI_AsynchronousMachineDynamics_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachineDynamics_TurbineGovernorDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type1or2 Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType1or2DynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachineDynamics_WindTurbineType1or2Dynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AsynchronousMachineDynamics_WindTurbineType1or2Dynamics_feature",
                        "_UI_AsynchronousMachineDynamics_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachineDynamics_WindTurbineType1or2Dynamics(), true, false, true,
                null, null, null ) );
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
                getString( "_UI_AsynchronousMachineDynamics_MechanicalLoadDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AsynchronousMachineDynamics_MechanicalLoadDynamics_feature",
                        "_UI_AsynchronousMachineDynamics_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachineDynamics_MechanicalLoadDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Asynchronous Machine feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsynchronousMachinePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachineDynamics_AsynchronousMachine_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AsynchronousMachineDynamics_AsynchronousMachine_feature",
                        "_UI_AsynchronousMachineDynamics_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachineDynamics_AsynchronousMachine(), true, false, true, null,
                null, null ) );
    }

    /**
     * This returns AsynchronousMachineDynamics.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AsynchronousMachineDynamics" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( AsynchronousMachineDynamics ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_AsynchronousMachineDynamics_type" )
                : getString( "_UI_AsynchronousMachineDynamics_type" ) + " " + label;
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
