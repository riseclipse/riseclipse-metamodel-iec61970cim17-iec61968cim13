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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer;

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
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerItemProvider extends OrganisationRoleItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomerItemProvider( AdapterFactory adapterFactory ) {
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

            addKindPropertyDescriptor( object );
            addLocalePropertyDescriptor( object );
            addPucNumberPropertyDescriptor( object );
            addSpecialNeedPropertyDescriptor( object );
            addCustomerAccountsPropertyDescriptor( object );
            addEndDevicesPropertyDescriptor( object );
            addWorksPropertyDescriptor( object );
            addCustomerAgreementsPropertyDescriptor( object );
            addTroubleTicketsPropertyDescriptor( object );
            addNotificationsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_kind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_kind_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_Kind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Locale feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocalePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_locale_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_locale_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_Locale(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Puc Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPucNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_pucNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_pucNumber_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_PucNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Special Need feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpecialNeedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_specialNeed_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_specialNeed_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_SpecialNeed(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customer Accounts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerAccountsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_CustomerAccounts_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_CustomerAccounts_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_CustomerAccounts(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Devices feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDevicesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_EndDevices_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_EndDevices_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_EndDevices(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Works feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWorksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_Works_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_Works_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_Works(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customer Agreements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerAgreementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_CustomerAgreements_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_CustomerAgreements_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_CustomerAgreements(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Trouble Tickets feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTroubleTicketsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_TroubleTickets_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_TroubleTickets_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_TroubleTickets(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Notifications feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNotificationsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Customer_Notifications_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Customer_Notifications_feature",
                                "_UI_Customer_type" ),
                        CimPackage.eINSTANCE.getCustomer_Notifications(), true, false, true, null, null, null ) );
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
            childrenFeatures.add( CimPackage.eINSTANCE.getCustomer_Priority() );
            childrenFeatures.add( CimPackage.eINSTANCE.getCustomer_Status() );
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
     * This returns Customer.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Customer" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Customer ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Customer_type" )
                : getString( "_UI_Customer_type" ) + " " + label;
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

        switch( notification.getFeatureID( Customer.class ) ) {
        case CimPackage.CUSTOMER__KIND:
        case CimPackage.CUSTOMER__LOCALE:
        case CimPackage.CUSTOMER__PUC_NUMBER:
        case CimPackage.CUSTOMER__SPECIAL_NEED:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.CUSTOMER__PRIORITY:
        case CimPackage.CUSTOMER__STATUS:
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

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getCustomer_Priority(),
                CimFactory.eINSTANCE.createPriority() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getCustomer_Status(),
                CimFactory.eINSTANCE.createStatus() ) );
    }

}
