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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ICCPVirtualControlCenterItemProvider extends BilateralExchangeActorItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ICCPVirtualControlCenterItemProvider( AdapterFactory adapterFactory ) {
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

            addCallingPropertyDescriptor( object );
            addClientAndServerPropertyDescriptor( object );
            addMinimumUpdateIntervalPropertyDescriptor( object );
            addNameOfLocalICCPropertyDescriptor( object );
            addSupportForBlock1PropertyDescriptor( object );
            addSupportForBlock2PropertyDescriptor( object );
            addSupportForBlock3PropertyDescriptor( object );
            addSupportForBlock4PropertyDescriptor( object );
            addSupportForBlock5PropertyDescriptor( object );
            addSupportForDepriciatedBlock8PropertyDescriptor( object );
            addTransportSecurityRequirementPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Calling feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCallingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ICCPVirtualControlCenter_calling_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ICCPVirtualControlCenter_calling_feature",
                                "_UI_ICCPVirtualControlCenter_type" ),
                        CimPackage.eINSTANCE.getICCPVirtualControlCenter_Calling(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Client And Server feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClientAndServerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_clientAndServer_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ICCPVirtualControlCenter_clientAndServer_feature",
                        "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_ClientAndServer(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Minimum Update Interval feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinimumUpdateIntervalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ICCPVirtualControlCenter_minimumUpdateInterval_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ICCPVirtualControlCenter_minimumUpdateInterval_feature",
                                "_UI_ICCPVirtualControlCenter_type" ),
                        CimPackage.eINSTANCE.getICCPVirtualControlCenter_MinimumUpdateInterval(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Name Of Local ICC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNameOfLocalICCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_nameOfLocalICC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ICCPVirtualControlCenter_nameOfLocalICC_feature",
                        "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_NameOfLocalICC(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Support For Block1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportForBlock1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_supportForBlock1_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ICCPVirtualControlCenter_supportForBlock1_feature", "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_SupportForBlock1(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Support For Block2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportForBlock2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_supportForBlock2_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ICCPVirtualControlCenter_supportForBlock2_feature", "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_SupportForBlock2(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Support For Block3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportForBlock3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_supportForBlock3_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ICCPVirtualControlCenter_supportForBlock3_feature", "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_SupportForBlock3(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Support For Block4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportForBlock4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_supportForBlock4_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ICCPVirtualControlCenter_supportForBlock4_feature", "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_SupportForBlock4(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Support For Block5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportForBlock5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_supportForBlock5_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ICCPVirtualControlCenter_supportForBlock5_feature", "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_SupportForBlock5(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Support For Depriciated Block8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportForDepriciatedBlock8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_supportForDepriciatedBlock8_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ICCPVirtualControlCenter_supportForDepriciatedBlock8_feature",
                        "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_SupportForDepriciatedBlock8(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Transport Security Requirement feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransportSecurityRequirementPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ICCPVirtualControlCenter_TransportSecurityRequirement_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ICCPVirtualControlCenter_TransportSecurityRequirement_feature",
                        "_UI_ICCPVirtualControlCenter_type" ),
                CimPackage.eINSTANCE.getICCPVirtualControlCenter_TransportSecurityRequirement(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ICCPVirtualControlCenter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ICCPVirtualControlCenter" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ICCPVirtualControlCenter ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ICCPVirtualControlCenter_type" )
                : getString( "_UI_ICCPVirtualControlCenter_type" ) + " " + label;
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

        switch( notification.getFeatureID( ICCPVirtualControlCenter.class ) ) {
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CALLING:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CLIENT_AND_SERVER:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__MINIMUM_UPDATE_INTERVAL:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__NAME_OF_LOCAL_ICC:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK1:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK2:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK3:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK4:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK5:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_DEPRICIATED_BLOCK8:
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__TRANSPORT_SECURITY_REQUIREMENT:
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
