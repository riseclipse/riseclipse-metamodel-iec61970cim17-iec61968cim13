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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureEventItemProvider extends ActivityRecordItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FailureEventItemProvider( AdapterFactory adapterFactory ) {
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

            addBreakerFailureReasonPropertyDescriptor( object );
            addCorporateCodePropertyDescriptor( object );
            addFailureClassificationPropertyDescriptor( object );
            addFailureDateTimePropertyDescriptor( object );
            addFailureIsolationMethodPropertyDescriptor( object );
            addFailureModePropertyDescriptor( object );
            addFaultLocatingMethodPropertyDescriptor( object );
            addLocationPropertyDescriptor( object );
            addRootCausePropertyDescriptor( object );
            addTransformerFailureReasonPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Breaker Failure Reason feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBreakerFailureReasonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FailureEvent_breakerFailureReason_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_breakerFailureReason_feature",
                        "_UI_FailureEvent_type" ),
                CimPackage.eINSTANCE.getFailureEvent_BreakerFailureReason(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Corporate Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCorporateCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FailureEvent_corporateCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_corporateCode_feature",
                                "_UI_FailureEvent_type" ),
                        CimPackage.eINSTANCE.getFailureEvent_CorporateCode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Failure Classification feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFailureClassificationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FailureEvent_failureClassification_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_failureClassification_feature",
                        "_UI_FailureEvent_type" ),
                CimPackage.eINSTANCE.getFailureEvent_FailureClassification(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Failure Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFailureDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FailureEvent_failureDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_failureDateTime_feature",
                                "_UI_FailureEvent_type" ),
                        CimPackage.eINSTANCE.getFailureEvent_FailureDateTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Failure Isolation Method feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFailureIsolationMethodPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FailureEvent_failureIsolationMethod_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_failureIsolationMethod_feature",
                        "_UI_FailureEvent_type" ),
                CimPackage.eINSTANCE.getFailureEvent_FailureIsolationMethod(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Failure Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFailureModePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FailureEvent_failureMode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_failureMode_feature",
                                "_UI_FailureEvent_type" ),
                        CimPackage.eINSTANCE.getFailureEvent_FailureMode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fault Locating Method feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFaultLocatingMethodPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FailureEvent_faultLocatingMethod_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_faultLocatingMethod_feature",
                                "_UI_FailureEvent_type" ),
                        CimPackage.eINSTANCE.getFailureEvent_FaultLocatingMethod(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FailureEvent_location_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_location_feature",
                                "_UI_FailureEvent_type" ),
                        CimPackage.eINSTANCE.getFailureEvent_Location(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Root Cause feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRootCausePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FailureEvent_rootCause_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_rootCause_feature",
                                "_UI_FailureEvent_type" ),
                        CimPackage.eINSTANCE.getFailureEvent_RootCause(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Transformer Failure Reason feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransformerFailureReasonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FailureEvent_transformerFailureReason_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FailureEvent_transformerFailureReason_feature",
                        "_UI_FailureEvent_type" ),
                CimPackage.eINSTANCE.getFailureEvent_TransformerFailureReason(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns FailureEvent.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/FailureEvent" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( FailureEvent ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_FailureEvent_type" )
                : getString( "_UI_FailureEvent_type" ) + " " + label;
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

        switch( notification.getFeatureID( FailureEvent.class ) ) {
        case CimPackage.FAILURE_EVENT__BREAKER_FAILURE_REASON:
        case CimPackage.FAILURE_EVENT__CORPORATE_CODE:
        case CimPackage.FAILURE_EVENT__FAILURE_CLASSIFICATION:
        case CimPackage.FAILURE_EVENT__FAILURE_DATE_TIME:
        case CimPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
        case CimPackage.FAILURE_EVENT__FAILURE_MODE:
        case CimPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
        case CimPackage.FAILURE_EVENT__LOCATION:
        case CimPackage.FAILURE_EVENT__ROOT_CAUSE:
        case CimPackage.FAILURE_EVENT__TRANSFORMER_FAILURE_REASON:
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
