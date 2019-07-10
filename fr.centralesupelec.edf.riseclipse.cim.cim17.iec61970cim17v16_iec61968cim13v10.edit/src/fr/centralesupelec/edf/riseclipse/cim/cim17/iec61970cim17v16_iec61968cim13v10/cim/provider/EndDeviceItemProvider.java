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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EndDeviceItemProvider extends AssetContainerItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndDeviceItemProvider( AdapterFactory adapterFactory ) {
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

            addAmrSystemPropertyDescriptor( object );
            addInstallCodePropertyDescriptor( object );
            addIsPanPropertyDescriptor( object );
            addIsSmartInverterPropertyDescriptor( object );
            addIsVirtualPropertyDescriptor( object );
            addTimeZoneOffsetPropertyDescriptor( object );
            addEndDeviceInfoPropertyDescriptor( object );
            addEndDeviceGroupsPropertyDescriptor( object );
            addEndDeviceFunctionsPropertyDescriptor( object );
            addOtherCapabilityPropertyDescriptor( object );
            addCustomerPropertyDescriptor( object );
            addUsagePointPropertyDescriptor( object );
            addEndDeviceEventsPropertyDescriptor( object );
            addEndDeviceControlsPropertyDescriptor( object );
            addDispatchablePowerCapabilityPropertyDescriptor( object );
            addServiceLocationPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Amr System feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAmrSystemPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_amrSystem_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_amrSystem_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_AmrSystem(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Install Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInstallCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_installCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_installCode_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_InstallCode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Pan feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsPanPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_isPan_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_isPan_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_IsPan(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Smart Inverter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSmartInverterPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_isSmartInverter_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_isSmartInverter_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_IsSmartInverter(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Virtual feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsVirtualPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_isVirtual_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_isVirtual_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_IsVirtual(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Time Zone Offset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeZoneOffsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_timeZoneOffset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_timeZoneOffset_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_TimeZoneOffset(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceInfoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_EndDeviceInfo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_EndDeviceInfo_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_EndDeviceInfo(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Groups feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceGroupsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_EndDeviceGroups_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_EndDeviceGroups_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_EndDeviceGroups(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Functions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceFunctionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_EndDeviceFunctions_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_EndDeviceFunctions_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_EndDeviceFunctions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Other Capability feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOtherCapabilityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_OtherCapability_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_OtherCapability_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_OtherCapability(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_Customer_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_Customer_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_Customer(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Usage Point feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_UsagePoint_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_UsagePoint_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_UsagePoint(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_EndDeviceEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_EndDeviceEvents_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_EndDeviceEvents(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Controls feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceControlsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_EndDeviceControls_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_EndDeviceControls_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_EndDeviceControls(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dispatchable Power Capability feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDispatchablePowerCapabilityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDevice_DispatchablePowerCapability_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_DispatchablePowerCapability_feature",
                        "_UI_EndDevice_type" ),
                CimPackage.eINSTANCE.getEndDevice_DispatchablePowerCapability(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Service Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceLocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDevice_ServiceLocation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDevice_ServiceLocation_feature",
                                "_UI_EndDevice_type" ),
                        CimPackage.eINSTANCE.getEndDevice_ServiceLocation(), true, false, true, null, null, null ) );
    }

    /**
     * This returns EndDevice.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/EndDevice" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( EndDevice ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_EndDevice_type" )
                : getString( "_UI_EndDevice_type" ) + " " + label;
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

        switch( notification.getFeatureID( EndDevice.class ) ) {
        case CimPackage.END_DEVICE__AMR_SYSTEM:
        case CimPackage.END_DEVICE__INSTALL_CODE:
        case CimPackage.END_DEVICE__IS_PAN:
        case CimPackage.END_DEVICE__IS_SMART_INVERTER:
        case CimPackage.END_DEVICE__IS_VIRTUAL:
        case CimPackage.END_DEVICE__TIME_ZONE_OFFSET:
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
