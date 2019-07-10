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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteConnectDisconnectInfoItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteConnectDisconnectInfoItemProvider( AdapterFactory adapterFactory ) {
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

            addArmedTimeoutPropertyDescriptor( object );
            addCustomerVoltageLimitPropertyDescriptor( object );
            addEnergyLimitPropertyDescriptor( object );
            addEnergyUsageStartDateTimePropertyDescriptor( object );
            addEnergyUsageWarningPropertyDescriptor( object );
            addIsArmConnectPropertyDescriptor( object );
            addIsArmDisconnectPropertyDescriptor( object );
            addIsEnergyLimitingPropertyDescriptor( object );
            addNeedsPowerLimitCheckPropertyDescriptor( object );
            addNeedsVoltageLimitCheckPropertyDescriptor( object );
            addPowerLimitPropertyDescriptor( object );
            addUsePushbuttonPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Armed Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addArmedTimeoutPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_RemoteConnectDisconnectInfo_armedTimeout_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RemoteConnectDisconnectInfo_armedTimeout_feature",
                        "_UI_RemoteConnectDisconnectInfo_type" ),
                CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_ArmedTimeout(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Customer Voltage Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerVoltageLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_RemoteConnectDisconnectInfo_customerVoltageLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RemoteConnectDisconnectInfo_customerVoltageLimit_feature",
                                "_UI_RemoteConnectDisconnectInfo_type" ),
                        CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_CustomerVoltageLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Energy Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergyLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_RemoteConnectDisconnectInfo_energyLimit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RemoteConnectDisconnectInfo_energyLimit_feature",
                        "_UI_RemoteConnectDisconnectInfo_type" ),
                CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_EnergyLimit(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Energy Usage Start Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergyUsageStartDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_RemoteConnectDisconnectInfo_energyUsageStartDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RemoteConnectDisconnectInfo_energyUsageStartDateTime_feature",
                                "_UI_RemoteConnectDisconnectInfo_type" ),
                        CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_EnergyUsageStartDateTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Energy Usage Warning feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergyUsageWarningPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_RemoteConnectDisconnectInfo_energyUsageWarning_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RemoteConnectDisconnectInfo_energyUsageWarning_feature",
                                "_UI_RemoteConnectDisconnectInfo_type" ),
                        CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_EnergyUsageWarning(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Is Arm Connect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsArmConnectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_RemoteConnectDisconnectInfo_isArmConnect_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RemoteConnectDisconnectInfo_isArmConnect_feature",
                        "_UI_RemoteConnectDisconnectInfo_type" ),
                CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_IsArmConnect(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Is Arm Disconnect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsArmDisconnectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_RemoteConnectDisconnectInfo_isArmDisconnect_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RemoteConnectDisconnectInfo_isArmDisconnect_feature",
                                "_UI_RemoteConnectDisconnectInfo_type" ),
                        CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_IsArmDisconnect(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Is Energy Limiting feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsEnergyLimitingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_RemoteConnectDisconnectInfo_isEnergyLimiting_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RemoteConnectDisconnectInfo_isEnergyLimiting_feature",
                                "_UI_RemoteConnectDisconnectInfo_type" ),
                        CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_IsEnergyLimiting(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Needs Power Limit Check feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeedsPowerLimitCheckPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_RemoteConnectDisconnectInfo_needsPowerLimitCheck_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RemoteConnectDisconnectInfo_needsPowerLimitCheck_feature",
                                "_UI_RemoteConnectDisconnectInfo_type" ),
                        CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_NeedsPowerLimitCheck(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Needs Voltage Limit Check feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeedsVoltageLimitCheckPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_RemoteConnectDisconnectInfo_needsVoltageLimitCheck_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RemoteConnectDisconnectInfo_needsVoltageLimitCheck_feature",
                                "_UI_RemoteConnectDisconnectInfo_type" ),
                        CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_NeedsVoltageLimitCheck(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Power Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_RemoteConnectDisconnectInfo_powerLimit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RemoteConnectDisconnectInfo_powerLimit_feature",
                        "_UI_RemoteConnectDisconnectInfo_type" ),
                CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_PowerLimit(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Use Pushbutton feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsePushbuttonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_RemoteConnectDisconnectInfo_usePushbutton_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RemoteConnectDisconnectInfo_usePushbutton_feature",
                                "_UI_RemoteConnectDisconnectInfo_type" ),
                        CimPackage.eINSTANCE.getRemoteConnectDisconnectInfo_UsePushbutton(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns RemoteConnectDisconnectInfo.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/RemoteConnectDisconnectInfo" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        Float labelValue = ( ( RemoteConnectDisconnectInfo ) object ).getArmedTimeout();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? getString( "_UI_RemoteConnectDisconnectInfo_type" )
                : getString( "_UI_RemoteConnectDisconnectInfo_type" ) + " " + label;
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

        switch( notification.getFeatureID( RemoteConnectDisconnectInfo.class ) ) {
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
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

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Iec61970cim17v16_iec61968cim13v10EditPlugin.INSTANCE;
    }

}
