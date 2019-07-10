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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerNotificationItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomerNotificationItemProvider( AdapterFactory adapterFactory ) {
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

            addContactTypePropertyDescriptor( object );
            addContactValuePropertyDescriptor( object );
            addEarliestDateTimeToCallPropertyDescriptor( object );
            addLatestDateTimeToCallPropertyDescriptor( object );
            addTriggerPropertyDescriptor( object );
            addTroubleTicketsPropertyDescriptor( object );
            addCustomerPropertyDescriptor( object );
            addIncidentPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Contact Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContactTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CustomerNotification_contactType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CustomerNotification_contactType_feature",
                        "_UI_CustomerNotification_type" ),
                CimPackage.eINSTANCE.getCustomerNotification_ContactType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Contact Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContactValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CustomerNotification_contactValue_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CustomerNotification_contactValue_feature",
                        "_UI_CustomerNotification_type" ),
                CimPackage.eINSTANCE.getCustomerNotification_ContactValue(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Earliest Date Time To Call feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEarliestDateTimeToCallPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CustomerNotification_earliestDateTimeToCall_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_CustomerNotification_earliestDateTimeToCall_feature", "_UI_CustomerNotification_type" ),
                CimPackage.eINSTANCE.getCustomerNotification_EarliestDateTimeToCall(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Latest Date Time To Call feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLatestDateTimeToCallPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CustomerNotification_latestDateTimeToCall_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_CustomerNotification_latestDateTimeToCall_feature", "_UI_CustomerNotification_type" ),
                CimPackage.eINSTANCE.getCustomerNotification_LatestDateTimeToCall(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Trigger feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CustomerNotification_trigger_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CustomerNotification_trigger_feature",
                        "_UI_CustomerNotification_type" ),
                CimPackage.eINSTANCE.getCustomerNotification_Trigger(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Trouble Tickets feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTroubleTicketsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CustomerNotification_TroubleTickets_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CustomerNotification_TroubleTickets_feature",
                        "_UI_CustomerNotification_type" ),
                CimPackage.eINSTANCE.getCustomerNotification_TroubleTickets(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CustomerNotification_Customer_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CustomerNotification_Customer_feature",
                        "_UI_CustomerNotification_type" ),
                CimPackage.eINSTANCE.getCustomerNotification_Customer(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Incident feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncidentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CustomerNotification_Incident_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CustomerNotification_Incident_feature",
                        "_UI_CustomerNotification_type" ),
                CimPackage.eINSTANCE.getCustomerNotification_Incident(), true, false, true, null, null, null ) );
    }

    /**
     * This returns CustomerNotification.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/CustomerNotification" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( CustomerNotification ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_CustomerNotification_type" )
                : getString( "_UI_CustomerNotification_type" ) + " " + label;
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

        switch( notification.getFeatureID( CustomerNotification.class ) ) {
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_TYPE:
        case CimPackage.CUSTOMER_NOTIFICATION__CONTACT_VALUE:
        case CimPackage.CUSTOMER_NOTIFICATION__EARLIEST_DATE_TIME_TO_CALL:
        case CimPackage.CUSTOMER_NOTIFICATION__LATEST_DATE_TIME_TO_CALL:
        case CimPackage.CUSTOMER_NOTIFICATION__TRIGGER:
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
