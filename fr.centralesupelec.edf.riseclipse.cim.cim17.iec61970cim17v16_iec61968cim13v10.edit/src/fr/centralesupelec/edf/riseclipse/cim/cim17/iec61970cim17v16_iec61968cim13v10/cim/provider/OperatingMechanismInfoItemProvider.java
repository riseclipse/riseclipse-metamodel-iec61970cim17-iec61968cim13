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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingMechanismInfoItemProvider extends AssetInfoItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperatingMechanismInfoItemProvider( AdapterFactory adapterFactory ) {
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

            addCloseAmpsPropertyDescriptor( object );
            addCloseVoltagePropertyDescriptor( object );
            addMechanismKindPropertyDescriptor( object );
            addMotorRunCurrentPropertyDescriptor( object );
            addMotorStartCurrentPropertyDescriptor( object );
            addMotorVoltagePropertyDescriptor( object );
            addTripAmpsPropertyDescriptor( object );
            addTripVoltagePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Close Amps feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCloseAmpsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_OperatingMechanismInfo_closeAmps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OperatingMechanismInfo_closeAmps_feature",
                                "_UI_OperatingMechanismInfo_type" ),
                        CimPackage.eINSTANCE.getOperatingMechanismInfo_CloseAmps(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Close Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCloseVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_OperatingMechanismInfo_closeVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_OperatingMechanismInfo_closeVoltage_feature", "_UI_OperatingMechanismInfo_type" ),
                        CimPackage.eINSTANCE.getOperatingMechanismInfo_CloseVoltage(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mechanism Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMechanismKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_OperatingMechanismInfo_mechanismKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_OperatingMechanismInfo_mechanismKind_feature", "_UI_OperatingMechanismInfo_type" ),
                        CimPackage.eINSTANCE.getOperatingMechanismInfo_MechanismKind(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Motor Run Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMotorRunCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_OperatingMechanismInfo_motorRunCurrent_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_OperatingMechanismInfo_motorRunCurrent_feature",
                        "_UI_OperatingMechanismInfo_type" ),
                CimPackage.eINSTANCE.getOperatingMechanismInfo_MotorRunCurrent(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Motor Start Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMotorStartCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_OperatingMechanismInfo_motorStartCurrent_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_OperatingMechanismInfo_motorStartCurrent_feature",
                        "_UI_OperatingMechanismInfo_type" ),
                CimPackage.eINSTANCE.getOperatingMechanismInfo_MotorStartCurrent(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Motor Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMotorVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_OperatingMechanismInfo_motorVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_OperatingMechanismInfo_motorVoltage_feature", "_UI_OperatingMechanismInfo_type" ),
                        CimPackage.eINSTANCE.getOperatingMechanismInfo_MotorVoltage(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Trip Amps feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTripAmpsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_OperatingMechanismInfo_tripAmps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OperatingMechanismInfo_tripAmps_feature",
                                "_UI_OperatingMechanismInfo_type" ),
                        CimPackage.eINSTANCE.getOperatingMechanismInfo_TripAmps(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Trip Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTripVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_OperatingMechanismInfo_tripVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_OperatingMechanismInfo_tripVoltage_feature", "_UI_OperatingMechanismInfo_type" ),
                        CimPackage.eINSTANCE.getOperatingMechanismInfo_TripVoltage(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns OperatingMechanismInfo.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/OperatingMechanismInfo" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( OperatingMechanismInfo ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_OperatingMechanismInfo_type" )
                : getString( "_UI_OperatingMechanismInfo_type" ) + " " + label;
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

        switch( notification.getFeatureID( OperatingMechanismInfo.class ) ) {
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_AMPS:
        case CimPackage.OPERATING_MECHANISM_INFO__CLOSE_VOLTAGE:
        case CimPackage.OPERATING_MECHANISM_INFO__MECHANISM_KIND:
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_RUN_CURRENT:
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_START_CURRENT:
        case CimPackage.OPERATING_MECHANISM_INFO__MOTOR_VOLTAGE:
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_AMPS:
        case CimPackage.OPERATING_MECHANISM_INFO__TRIP_VOLTAGE:
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
