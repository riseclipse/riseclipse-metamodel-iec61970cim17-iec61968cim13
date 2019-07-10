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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PanDemandResponseItemProvider extends EndDeviceActionItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PanDemandResponseItemProvider( AdapterFactory adapterFactory ) {
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

            addAvgLoadAdjustmentPropertyDescriptor( object );
            addCancelControlModePropertyDescriptor( object );
            addCancelDateTimePropertyDescriptor( object );
            addCancelNowPropertyDescriptor( object );
            addCoolingOffsetPropertyDescriptor( object );
            addCoolingSetpointPropertyDescriptor( object );
            addCriticalityLevelPropertyDescriptor( object );
            addDutyCyclePropertyDescriptor( object );
            addEnrollmentGroupPropertyDescriptor( object );
            addHeatingOffsetPropertyDescriptor( object );
            addHeatingSetpointPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Avg Load Adjustment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAvgLoadAdjustmentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_avgLoadAdjustment_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PanDemandResponse_avgLoadAdjustment_feature", "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_AvgLoadAdjustment(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cancel Control Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCancelControlModePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_cancelControlMode_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PanDemandResponse_cancelControlMode_feature", "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_CancelControlMode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cancel Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCancelDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_cancelDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanDemandResponse_cancelDateTime_feature",
                                "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_CancelDateTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cancel Now feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCancelNowPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_cancelNow_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanDemandResponse_cancelNow_feature",
                                "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_CancelNow(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cooling Offset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoolingOffsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_coolingOffset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanDemandResponse_coolingOffset_feature",
                                "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_CoolingOffset(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cooling Setpoint feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoolingSetpointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_coolingSetpoint_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PanDemandResponse_coolingSetpoint_feature", "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_CoolingSetpoint(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Criticality Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCriticalityLevelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_criticalityLevel_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PanDemandResponse_criticalityLevel_feature", "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_CriticalityLevel(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Duty Cycle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDutyCyclePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_dutyCycle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanDemandResponse_dutyCycle_feature",
                                "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_DutyCycle(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Enrollment Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnrollmentGroupPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_enrollmentGroup_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PanDemandResponse_enrollmentGroup_feature", "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_EnrollmentGroup(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Heating Offset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeatingOffsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_heatingOffset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanDemandResponse_heatingOffset_feature",
                                "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_HeatingOffset(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Heating Setpoint feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeatingSetpointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PanDemandResponse_heatingSetpoint_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PanDemandResponse_heatingSetpoint_feature", "_UI_PanDemandResponse_type" ),
                        CimPackage.eINSTANCE.getPanDemandResponse_HeatingSetpoint(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( CimPackage.eINSTANCE.getPanDemandResponse_Appliance() );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns PanDemandResponse.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PanDemandResponse" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PanDemandResponse ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_PanDemandResponse_type" )
                : getString( "_UI_PanDemandResponse_type" ) + " " + label;
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

        switch( notification.getFeatureID( PanDemandResponse.class ) ) {
        case CimPackage.PAN_DEMAND_RESPONSE__AVG_LOAD_ADJUSTMENT:
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_CONTROL_MODE:
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_DATE_TIME:
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_NOW:
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_OFFSET:
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_SETPOINT:
        case CimPackage.PAN_DEMAND_RESPONSE__CRITICALITY_LEVEL:
        case CimPackage.PAN_DEMAND_RESPONSE__DUTY_CYCLE:
        case CimPackage.PAN_DEMAND_RESPONSE__ENROLLMENT_GROUP:
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_OFFSET:
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_SETPOINT:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
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

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getPanDemandResponse_Appliance(),
                CimFactory.eINSTANCE.createControlledAppliance() ) );
    }

}
