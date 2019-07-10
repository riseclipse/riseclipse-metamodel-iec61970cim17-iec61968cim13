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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchOperationSummaryItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchOperationSummaryItemProvider( AdapterFactory adapterFactory ) {
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

            addLifetimeFaultOperationsPropertyDescriptor( object );
            addLifetimeMotorStartsPropertyDescriptor( object );
            addLifetimeTotalOperationsPropertyDescriptor( object );
            addMostRecentFaultOperationDatePropertyDescriptor( object );
            addMostRecentMotorStartDatePropertyDescriptor( object );
            addMostRecentOperationDatePropertyDescriptor( object );
            addBreakerPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Lifetime Fault Operations feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLifetimeFaultOperationsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchOperationSummary_lifetimeFaultOperations_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SwitchOperationSummary_lifetimeFaultOperations_feature",
                                "_UI_SwitchOperationSummary_type" ),
                        CimPackage.eINSTANCE.getSwitchOperationSummary_LifetimeFaultOperations(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lifetime Motor Starts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLifetimeMotorStartsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchOperationSummary_lifetimeMotorStarts_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SwitchOperationSummary_lifetimeMotorStarts_feature", "_UI_SwitchOperationSummary_type" ),
                CimPackage.eINSTANCE.getSwitchOperationSummary_LifetimeMotorStarts(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lifetime Total Operations feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLifetimeTotalOperationsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchOperationSummary_lifetimeTotalOperations_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SwitchOperationSummary_lifetimeTotalOperations_feature",
                                "_UI_SwitchOperationSummary_type" ),
                        CimPackage.eINSTANCE.getSwitchOperationSummary_LifetimeTotalOperations(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Most Recent Fault Operation Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMostRecentFaultOperationDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchOperationSummary_mostRecentFaultOperationDate_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SwitchOperationSummary_mostRecentFaultOperationDate_feature",
                        "_UI_SwitchOperationSummary_type" ),
                CimPackage.eINSTANCE.getSwitchOperationSummary_MostRecentFaultOperationDate(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Most Recent Motor Start Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMostRecentMotorStartDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchOperationSummary_mostRecentMotorStartDate_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SwitchOperationSummary_mostRecentMotorStartDate_feature",
                        "_UI_SwitchOperationSummary_type" ),
                CimPackage.eINSTANCE.getSwitchOperationSummary_MostRecentMotorStartDate(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Most Recent Operation Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMostRecentOperationDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchOperationSummary_mostRecentOperationDate_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SwitchOperationSummary_mostRecentOperationDate_feature",
                                "_UI_SwitchOperationSummary_type" ),
                        CimPackage.eINSTANCE.getSwitchOperationSummary_MostRecentOperationDate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Breaker feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBreakerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchOperationSummary_Breaker_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchOperationSummary_Breaker_feature",
                        "_UI_SwitchOperationSummary_type" ),
                CimPackage.eINSTANCE.getSwitchOperationSummary_Breaker(), true, false, true, null, null, null ) );
    }

    /**
     * This returns SwitchOperationSummary.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SwitchOperationSummary" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SwitchOperationSummary ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SwitchOperationSummary_type" )
                : getString( "_UI_SwitchOperationSummary_type" ) + " " + label;
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

        switch( notification.getFeatureID( SwitchOperationSummary.class ) ) {
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_FAULT_OPERATIONS:
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_MOTOR_STARTS:
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_TOTAL_OPERATIONS:
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_FAULT_OPERATION_DATE:
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_MOTOR_START_DATE:
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_OPERATION_DATE:
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
