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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteInputSignalItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteInputSignalItemProvider( AdapterFactory adapterFactory ) {
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

            addRemoteSignalTypePropertyDescriptor( object );
            addVoltageCompensatorDynamicsPropertyDescriptor( object );
            addPowerSystemStabilizerDynamicsPropertyDescriptor( object );
            addWindTurbineType3or4DynamicsPropertyDescriptor( object );
            addTerminalPropertyDescriptor( object );
            addPFVArControllerType1DynamicsPropertyDescriptor( object );
            addWindPlantDynamicsPropertyDescriptor( object );
            addDiscontinuousExcitationControlDynamicsPropertyDescriptor( object );
            addUnderexcitationLimiterDynamicsPropertyDescriptor( object );
            addWindTurbineType1or2DynamicsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Remote Signal Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteSignalTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RemoteInputSignal_remoteSignalType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RemoteInputSignal_remoteSignalType_feature",
                        "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_RemoteSignalType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                getString( "_UI_RemoteInputSignal_VoltageCompensatorDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RemoteInputSignal_VoltageCompensatorDynamics_feature", "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_VoltageCompensatorDynamics(), true, false, true, null, null,
                null ) );
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
                getString( "_UI_RemoteInputSignal_PowerSystemStabilizerDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RemoteInputSignal_PowerSystemStabilizerDynamics_feature", "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_PowerSystemStabilizerDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3or4 Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3or4DynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RemoteInputSignal_WindTurbineType3or4Dynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RemoteInputSignal_WindTurbineType3or4Dynamics_feature", "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_WindTurbineType3or4Dynamics(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_RemoteInputSignal_Terminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_RemoteInputSignal_Terminal_feature",
                                "_UI_RemoteInputSignal_type" ),
                        CimPackage.eINSTANCE.getRemoteInputSignal_Terminal(), true, false, true, null, null, null ) );
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
                getString( "_UI_RemoteInputSignal_PFVArControllerType1Dynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RemoteInputSignal_PFVArControllerType1Dynamics_feature", "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_PFVArControllerType1Dynamics(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Plant Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPlantDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RemoteInputSignal_WindPlantDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RemoteInputSignal_WindPlantDynamics_feature",
                        "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_WindPlantDynamics(), true, false, true, null, null, null ) );
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
                getString( "_UI_RemoteInputSignal_DiscontinuousExcitationControlDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RemoteInputSignal_DiscontinuousExcitationControlDynamics_feature",
                        "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_DiscontinuousExcitationControlDynamics(), true, false, true,
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
                getString( "_UI_RemoteInputSignal_UnderexcitationLimiterDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RemoteInputSignal_UnderexcitationLimiterDynamics_feature", "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_UnderexcitationLimiterDynamics(), true, false, true, null,
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
                getString( "_UI_RemoteInputSignal_WindTurbineType1or2Dynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RemoteInputSignal_WindTurbineType1or2Dynamics_feature", "_UI_RemoteInputSignal_type" ),
                CimPackage.eINSTANCE.getRemoteInputSignal_WindTurbineType1or2Dynamics(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns RemoteInputSignal.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/RemoteInputSignal" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( RemoteInputSignal ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_RemoteInputSignal_type" )
                : getString( "_UI_RemoteInputSignal_type" ) + " " + label;
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

        switch( notification.getFeatureID( RemoteInputSignal.class ) ) {
        case CimPackage.REMOTE_INPUT_SIGNAL__REMOTE_SIGNAL_TYPE:
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
