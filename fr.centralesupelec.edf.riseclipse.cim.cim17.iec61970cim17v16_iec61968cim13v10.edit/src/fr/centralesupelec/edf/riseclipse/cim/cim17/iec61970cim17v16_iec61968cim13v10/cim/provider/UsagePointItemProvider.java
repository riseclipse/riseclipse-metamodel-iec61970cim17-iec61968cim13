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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UsagePointItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsagePointItemProvider( AdapterFactory adapterFactory ) {
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

            addAmiBillingReadyPropertyDescriptor( object );
            addCheckBillingPropertyDescriptor( object );
            addConnectionStatePropertyDescriptor( object );
            addEstimatedLoadPropertyDescriptor( object );
            addGroundedPropertyDescriptor( object );
            addIsSdpPropertyDescriptor( object );
            addIsVirtualPropertyDescriptor( object );
            addMinimalUsageExpectedPropertyDescriptor( object );
            addNominalServiceVoltagePropertyDescriptor( object );
            addOutageRegionPropertyDescriptor( object );
            addPhaseCodePropertyDescriptor( object );
            addRatedCurrentPropertyDescriptor( object );
            addRatedPowerPropertyDescriptor( object );
            addReadCyclePropertyDescriptor( object );
            addReadRoutePropertyDescriptor( object );
            addServiceDeliveryRemarkPropertyDescriptor( object );
            addServicePriorityPropertyDescriptor( object );
            addUsagePointLocationPropertyDescriptor( object );
            addCustomerAgreementPropertyDescriptor( object );
            addMeterReadingsPropertyDescriptor( object );
            addEquipmentsPropertyDescriptor( object );
            addPricingStructuresPropertyDescriptor( object );
            addMeterServiceWorkTasksPropertyDescriptor( object );
            addServiceLocationPropertyDescriptor( object );
            addServiceCategoryPropertyDescriptor( object );
            addServiceSupplierPropertyDescriptor( object );
            addServiceMultipliersPropertyDescriptor( object );
            addEndDeviceControlsPropertyDescriptor( object );
            addOutagesPropertyDescriptor( object );
            addEndDevicesPropertyDescriptor( object );
            addConfigurationEventsPropertyDescriptor( object );
            addUsagePointGroupsPropertyDescriptor( object );
            addEndDeviceEventsPropertyDescriptor( object );
            addMetrologyRequirementsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ami Billing Ready feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAmiBillingReadyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_amiBillingReady_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_amiBillingReady_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_AmiBillingReady(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Check Billing feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCheckBillingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_checkBilling_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_checkBilling_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_CheckBilling(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Connection State feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionStatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_connectionState_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_connectionState_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ConnectionState(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Estimated Load feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEstimatedLoadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_estimatedLoad_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_estimatedLoad_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_EstimatedLoad(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Grounded feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroundedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_grounded_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_grounded_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_Grounded(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Is Sdp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSdpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_isSdp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_isSdp_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_IsSdp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_isVirtual_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_isVirtual_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_IsVirtual(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Minimal Usage Expected feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinimalUsageExpectedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_minimalUsageExpected_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_minimalUsageExpected_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_MinimalUsageExpected(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Nominal Service Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalServiceVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_nominalServiceVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_nominalServiceVoltage_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_NominalServiceVoltage(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Outage Region feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutageRegionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_outageRegion_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_outageRegion_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_OutageRegion(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Phase Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhaseCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_phaseCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_phaseCode_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_PhaseCode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_ratedCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_ratedCurrent_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_RatedCurrent(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_ratedPower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_ratedPower_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_RatedPower(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Read Cycle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadCyclePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_readCycle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_readCycle_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ReadCycle(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Read Route feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadRoutePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_readRoute_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_readRoute_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ReadRoute(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Delivery Remark feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceDeliveryRemarkPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_serviceDeliveryRemark_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_serviceDeliveryRemark_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ServiceDeliveryRemark(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Priority feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServicePriorityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_servicePriority_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_servicePriority_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ServicePriority(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Usage Point Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointLocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_UsagePointLocation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_UsagePointLocation_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_UsagePointLocation(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Customer Agreement feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerAgreementPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_CustomerAgreement_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_CustomerAgreement_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_CustomerAgreement(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Meter Readings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeterReadingsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_MeterReadings_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_MeterReadings_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_MeterReadings(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Equipments feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEquipmentsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_Equipments_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_Equipments_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_Equipments(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pricing Structures feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPricingStructuresPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_PricingStructures_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_PricingStructures_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_PricingStructures(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Meter Service Work Tasks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeterServiceWorkTasksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_MeterServiceWorkTasks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_MeterServiceWorkTasks_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_MeterServiceWorkTasks(),
                        true,
                        false,
                        true,
                        null,
                        null,
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
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_ServiceLocation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_ServiceLocation_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ServiceLocation(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Category feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceCategoryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_ServiceCategory_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_ServiceCategory_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ServiceCategory(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Supplier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceSupplierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_ServiceSupplier_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_ServiceSupplier_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ServiceSupplier(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Multipliers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceMultipliersPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_ServiceMultipliers_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_ServiceMultipliers_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ServiceMultipliers(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_EndDeviceControls_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_EndDeviceControls_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_EndDeviceControls(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Outages feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutagesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_Outages_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_Outages_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_Outages(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_EndDevices_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_EndDevices_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_EndDevices(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Configuration Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfigurationEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_ConfigurationEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_ConfigurationEvents_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_ConfigurationEvents(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Usage Point Groups feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointGroupsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_UsagePointGroups_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_UsagePointGroups_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_UsagePointGroups(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_EndDeviceEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_EndDeviceEvents_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_EndDeviceEvents(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Metrology Requirements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMetrologyRequirementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_UsagePoint_MetrologyRequirements_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UsagePoint_MetrologyRequirements_feature",
                                "_UI_UsagePoint_type" ),
                        CimPackage.eINSTANCE.getUsagePoint_MetrologyRequirements(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns UsagePoint.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/UsagePoint" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( UsagePoint ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_UsagePoint_type" )
                : getString( "_UI_UsagePoint_type" ) + " " + label;
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

        switch( notification.getFeatureID( UsagePoint.class ) ) {
        case CimPackage.USAGE_POINT__AMI_BILLING_READY:
        case CimPackage.USAGE_POINT__CHECK_BILLING:
        case CimPackage.USAGE_POINT__CONNECTION_STATE:
        case CimPackage.USAGE_POINT__ESTIMATED_LOAD:
        case CimPackage.USAGE_POINT__GROUNDED:
        case CimPackage.USAGE_POINT__IS_SDP:
        case CimPackage.USAGE_POINT__IS_VIRTUAL:
        case CimPackage.USAGE_POINT__MINIMAL_USAGE_EXPECTED:
        case CimPackage.USAGE_POINT__NOMINAL_SERVICE_VOLTAGE:
        case CimPackage.USAGE_POINT__OUTAGE_REGION:
        case CimPackage.USAGE_POINT__PHASE_CODE:
        case CimPackage.USAGE_POINT__RATED_CURRENT:
        case CimPackage.USAGE_POINT__RATED_POWER:
        case CimPackage.USAGE_POINT__READ_CYCLE:
        case CimPackage.USAGE_POINT__READ_ROUTE:
        case CimPackage.USAGE_POINT__SERVICE_DELIVERY_REMARK:
        case CimPackage.USAGE_POINT__SERVICE_PRIORITY:
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
