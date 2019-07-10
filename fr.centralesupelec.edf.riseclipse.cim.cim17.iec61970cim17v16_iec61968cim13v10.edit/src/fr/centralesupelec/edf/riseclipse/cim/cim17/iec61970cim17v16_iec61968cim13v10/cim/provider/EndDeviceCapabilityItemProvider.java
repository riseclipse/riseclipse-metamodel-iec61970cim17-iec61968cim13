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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability;

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
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EndDeviceCapabilityItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndDeviceCapabilityItemProvider( AdapterFactory adapterFactory ) {
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

            addAutonomousDstPropertyDescriptor( object );
            addCommunicationPropertyDescriptor( object );
            addConnectDisconnectPropertyDescriptor( object );
            addDemandResponsePropertyDescriptor( object );
            addElectricMeteringPropertyDescriptor( object );
            addGasMeteringPropertyDescriptor( object );
            addMetrologyPropertyDescriptor( object );
            addOnRequestReadPropertyDescriptor( object );
            addOutageHistoryPropertyDescriptor( object );
            addPressureCompensationPropertyDescriptor( object );
            addPricingInfoPropertyDescriptor( object );
            addPulseOutputPropertyDescriptor( object );
            addRelaysProgrammingPropertyDescriptor( object );
            addReverseFlowPropertyDescriptor( object );
            addSuperCompressibilityCompensationPropertyDescriptor( object );
            addTemperatureCompensationPropertyDescriptor( object );
            addTextMessagePropertyDescriptor( object );
            addWaterMeteringPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Autonomous Dst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAutonomousDstPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_autonomousDst_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_autonomousDst_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_AutonomousDst(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Communication feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommunicationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_communication_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_communication_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_Communication(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Connect Disconnect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectDisconnectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDeviceCapability_connectDisconnect_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_EndDeviceCapability_connectDisconnect_feature", "_UI_EndDeviceCapability_type" ),
                        CimPackage.eINSTANCE.getEndDeviceCapability_ConnectDisconnect(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Demand Response feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDemandResponsePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_demandResponse_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_demandResponse_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_DemandResponse(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Electric Metering feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addElectricMeteringPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDeviceCapability_electricMetering_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_EndDeviceCapability_electricMetering_feature", "_UI_EndDeviceCapability_type" ),
                        CimPackage.eINSTANCE.getEndDeviceCapability_ElectricMetering(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gas Metering feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGasMeteringPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_gasMetering_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_gasMetering_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_GasMetering(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Metrology feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMetrologyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_metrology_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_metrology_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_Metrology(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the On Request Read feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOnRequestReadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_onRequestRead_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_onRequestRead_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_OnRequestRead(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Outage History feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutageHistoryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_outageHistory_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_outageHistory_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_OutageHistory(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Compensation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureCompensationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_pressureCompensation_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_pressureCompensation_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_PressureCompensation(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pricing Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPricingInfoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_pricingInfo_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_pricingInfo_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_PricingInfo(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pulse Output feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPulseOutputPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_pulseOutput_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_pulseOutput_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_PulseOutput(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Relays Programming feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRelaysProgrammingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDeviceCapability_relaysProgramming_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_EndDeviceCapability_relaysProgramming_feature", "_UI_EndDeviceCapability_type" ),
                        CimPackage.eINSTANCE.getEndDeviceCapability_RelaysProgramming(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reverse Flow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReverseFlowPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_reverseFlow_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_reverseFlow_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_ReverseFlow(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Super Compressibility Compensation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSuperCompressibilityCompensationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_superCompressibilityCompensation_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_EndDeviceCapability_superCompressibilityCompensation_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_SuperCompressibilityCompensation(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Temperature Compensation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTemperatureCompensationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_temperatureCompensation_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_EndDeviceCapability_temperatureCompensation_feature", "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_TemperatureCompensation(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Text Message feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTextMessagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_textMessage_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_textMessage_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_TextMessage(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Water Metering feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWaterMeteringPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceCapability_waterMetering_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceCapability_waterMetering_feature",
                        "_UI_EndDeviceCapability_type" ),
                CimPackage.eINSTANCE.getEndDeviceCapability_WaterMetering(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns EndDeviceCapability.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/EndDeviceCapability" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        Boolean labelValue = ( ( EndDeviceCapability ) object ).getAutonomousDst();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? getString( "_UI_EndDeviceCapability_type" )
                : getString( "_UI_EndDeviceCapability_type" ) + " " + label;
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

        switch( notification.getFeatureID( EndDeviceCapability.class ) ) {
        case CimPackage.END_DEVICE_CAPABILITY__AUTONOMOUS_DST:
        case CimPackage.END_DEVICE_CAPABILITY__COMMUNICATION:
        case CimPackage.END_DEVICE_CAPABILITY__CONNECT_DISCONNECT:
        case CimPackage.END_DEVICE_CAPABILITY__DEMAND_RESPONSE:
        case CimPackage.END_DEVICE_CAPABILITY__ELECTRIC_METERING:
        case CimPackage.END_DEVICE_CAPABILITY__GAS_METERING:
        case CimPackage.END_DEVICE_CAPABILITY__METROLOGY:
        case CimPackage.END_DEVICE_CAPABILITY__ON_REQUEST_READ:
        case CimPackage.END_DEVICE_CAPABILITY__OUTAGE_HISTORY:
        case CimPackage.END_DEVICE_CAPABILITY__PRESSURE_COMPENSATION:
        case CimPackage.END_DEVICE_CAPABILITY__PRICING_INFO:
        case CimPackage.END_DEVICE_CAPABILITY__PULSE_OUTPUT:
        case CimPackage.END_DEVICE_CAPABILITY__RELAYS_PROGRAMMING:
        case CimPackage.END_DEVICE_CAPABILITY__REVERSE_FLOW:
        case CimPackage.END_DEVICE_CAPABILITY__SUPER_COMPRESSIBILITY_COMPENSATION:
        case CimPackage.END_DEVICE_CAPABILITY__TEMPERATURE_COMPENSATION:
        case CimPackage.END_DEVICE_CAPABILITY__TEXT_MESSAGE:
        case CimPackage.END_DEVICE_CAPABILITY__WATER_METERING:
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
