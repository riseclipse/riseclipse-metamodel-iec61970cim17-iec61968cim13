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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemDynamics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcitationSystemDynamicsItemProvider extends DynamicsFunctionBlockItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcitationSystemDynamicsItemProvider( AdapterFactory adapterFactory ) {
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

            addPowerSystemStabilizerDynamicsPropertyDescriptor( object );
            addUnderexcitationLimiterDynamicsPropertyDescriptor( object );
            addPFVArControllerType1DynamicsPropertyDescriptor( object );
            addDiscontinuousExcitationControlDynamicsPropertyDescriptor( object );
            addPFVArControllerType2DynamicsPropertyDescriptor( object );
            addSynchronousMachineDynamicsPropertyDescriptor( object );
            addVoltageCompensatorDynamicsPropertyDescriptor( object );
            addOverexcitationLimiterDynamicsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Power System Stabilizer Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerSystemStabilizerDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExcitationSystemDynamics_PowerSystemStabilizerDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExcitationSystemDynamics_PowerSystemStabilizerDynamics_feature",
                        "_UI_ExcitationSystemDynamics_type" ),
                CimPackage.eINSTANCE.getExcitationSystemDynamics_PowerSystemStabilizerDynamics(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Underexcitation Limiter Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnderexcitationLimiterDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExcitationSystemDynamics_UnderexcitationLimiterDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExcitationSystemDynamics_UnderexcitationLimiterDynamics_feature",
                        "_UI_ExcitationSystemDynamics_type" ),
                CimPackage.eINSTANCE.getExcitationSystemDynamics_UnderexcitationLimiterDynamics(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the PFV Ar Controller Type1 Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPFVArControllerType1DynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExcitationSystemDynamics_PFVArControllerType1Dynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExcitationSystemDynamics_PFVArControllerType1Dynamics_feature",
                        "_UI_ExcitationSystemDynamics_type" ),
                CimPackage.eINSTANCE.getExcitationSystemDynamics_PFVArControllerType1Dynamics(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Discontinuous Excitation Control Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiscontinuousExcitationControlDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExcitationSystemDynamics_DiscontinuousExcitationControlDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExcitationSystemDynamics_DiscontinuousExcitationControlDynamics_feature",
                        "_UI_ExcitationSystemDynamics_type" ),
                CimPackage.eINSTANCE.getExcitationSystemDynamics_DiscontinuousExcitationControlDynamics(), true, false,
                true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the PFV Ar Controller Type2 Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPFVArControllerType2DynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExcitationSystemDynamics_PFVArControllerType2Dynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExcitationSystemDynamics_PFVArControllerType2Dynamics_feature",
                        "_UI_ExcitationSystemDynamics_type" ),
                CimPackage.eINSTANCE.getExcitationSystemDynamics_PFVArControllerType2Dynamics(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Synchronous Machine Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchronousMachineDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExcitationSystemDynamics_SynchronousMachineDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExcitationSystemDynamics_SynchronousMachineDynamics_feature",
                        "_UI_ExcitationSystemDynamics_type" ),
                CimPackage.eINSTANCE.getExcitationSystemDynamics_SynchronousMachineDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Compensator Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageCompensatorDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExcitationSystemDynamics_VoltageCompensatorDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExcitationSystemDynamics_VoltageCompensatorDynamics_feature",
                        "_UI_ExcitationSystemDynamics_type" ),
                CimPackage.eINSTANCE.getExcitationSystemDynamics_VoltageCompensatorDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Overexcitation Limiter Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOverexcitationLimiterDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExcitationSystemDynamics_OverexcitationLimiterDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExcitationSystemDynamics_OverexcitationLimiterDynamics_feature",
                        "_UI_ExcitationSystemDynamics_type" ),
                CimPackage.eINSTANCE.getExcitationSystemDynamics_OverexcitationLimiterDynamics(), true, false, true,
                null, null, null ) );
    }

    /**
     * This returns ExcitationSystemDynamics.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcitationSystemDynamics" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcitationSystemDynamics ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcitationSystemDynamics_type" )
                : getString( "_UI_ExcitationSystemDynamics_type" ) + " " + label;
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
