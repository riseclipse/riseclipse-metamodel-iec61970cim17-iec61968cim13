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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilSteamSupply;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilSteamSupply} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FossilSteamSupplyItemProvider extends SteamSupplyItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FossilSteamSupplyItemProvider( AdapterFactory adapterFactory ) {
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

            addAuxPowerVersusFrequencyPropertyDescriptor( object );
            addAuxPowerVersusVoltagePropertyDescriptor( object );
            addBoilerControlModePropertyDescriptor( object );
            addControlErrorBiasPPropertyDescriptor( object );
            addControlICPropertyDescriptor( object );
            addControlPCPropertyDescriptor( object );
            addControlPEBPropertyDescriptor( object );
            addControlPEDPropertyDescriptor( object );
            addControlTCPropertyDescriptor( object );
            addFeedWaterIGPropertyDescriptor( object );
            addFeedWaterPGPropertyDescriptor( object );
            addFeedWaterTCPropertyDescriptor( object );
            addFuelDemandLimitPropertyDescriptor( object );
            addFuelSupplyDelayPropertyDescriptor( object );
            addFuelSupplyTCPropertyDescriptor( object );
            addMaxErrorRatePPropertyDescriptor( object );
            addMechPowerSensorLagPropertyDescriptor( object );
            addMinErrorRatePPropertyDescriptor( object );
            addPressureCtrlDGPropertyDescriptor( object );
            addPressureCtrlIGPropertyDescriptor( object );
            addPressureCtrlPGPropertyDescriptor( object );
            addPressureFeedbackPropertyDescriptor( object );
            addSuperHeater1CapacityPropertyDescriptor( object );
            addSuperHeater2CapacityPropertyDescriptor( object );
            addSuperHeaterPipePDPropertyDescriptor( object );
            addThrottlePressureSPPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aux Power Versus Frequency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxPowerVersusFrequencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_auxPowerVersusFrequency_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_auxPowerVersusFrequency_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_AuxPowerVersusFrequency(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Aux Power Versus Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxPowerVersusVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_auxPowerVersusVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_auxPowerVersusVoltage_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_AuxPowerVersusVoltage(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Boiler Control Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBoilerControlModePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_boilerControlMode_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_boilerControlMode_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_BoilerControlMode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Control Error Bias P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlErrorBiasPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_controlErrorBiasP_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_controlErrorBiasP_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_ControlErrorBiasP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Control IC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlICPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_controlIC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_controlIC_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_ControlIC(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Control PC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlPCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_controlPC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_controlPC_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_ControlPC(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Control PEB feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlPEBPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_controlPEB_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_controlPEB_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_ControlPEB(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Control PED feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlPEDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_controlPED_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_controlPED_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_ControlPED(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Control TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_controlTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_controlTC_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_ControlTC(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Feed Water IG feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeedWaterIGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_feedWaterIG_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_feedWaterIG_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_FeedWaterIG(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Feed Water PG feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeedWaterPGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_feedWaterPG_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_feedWaterPG_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_FeedWaterPG(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Feed Water TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeedWaterTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_feedWaterTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_feedWaterTC_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_FeedWaterTC(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Demand Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelDemandLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_fuelDemandLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_fuelDemandLimit_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_FuelDemandLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Supply Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelSupplyDelayPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_fuelSupplyDelay_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_fuelSupplyDelay_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_FuelSupplyDelay(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Supply TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelSupplyTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_fuelSupplyTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_fuelSupplyTC_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_FuelSupplyTC(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Max Error Rate P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxErrorRatePPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_maxErrorRateP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_maxErrorRateP_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_MaxErrorRateP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mech Power Sensor Lag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMechPowerSensorLagPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_mechPowerSensorLag_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_mechPowerSensorLag_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_MechPowerSensorLag(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Min Error Rate P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinErrorRatePPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_minErrorRateP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_minErrorRateP_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_MinErrorRateP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Ctrl DG feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureCtrlDGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_pressureCtrlDG_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_pressureCtrlDG_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_PressureCtrlDG(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Ctrl IG feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureCtrlIGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_pressureCtrlIG_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_pressureCtrlIG_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_PressureCtrlIG(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Ctrl PG feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureCtrlPGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_pressureCtrlPG_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilSteamSupply_pressureCtrlPG_feature",
                                "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_PressureCtrlPG(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Feedback feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureFeedbackPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_pressureFeedback_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_pressureFeedback_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_PressureFeedback(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Super Heater1 Capacity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSuperHeater1CapacityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_superHeater1Capacity_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_superHeater1Capacity_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_SuperHeater1Capacity(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Super Heater2 Capacity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSuperHeater2CapacityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_superHeater2Capacity_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_superHeater2Capacity_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_SuperHeater2Capacity(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Super Heater Pipe PD feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSuperHeaterPipePDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_superHeaterPipePD_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_superHeaterPipePD_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_SuperHeaterPipePD(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Throttle Pressure SP feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThrottlePressureSPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_FossilSteamSupply_throttlePressureSP_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FossilSteamSupply_throttlePressureSP_feature", "_UI_FossilSteamSupply_type" ),
                        CimPackage.eINSTANCE.getFossilSteamSupply_ThrottlePressureSP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns FossilSteamSupply.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/FossilSteamSupply" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( FossilSteamSupply ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_FossilSteamSupply_type" )
                : getString( "_UI_FossilSteamSupply_type" ) + " " + label;
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

        switch( notification.getFeatureID( FossilSteamSupply.class ) ) {
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
        case CimPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
        case CimPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
        case CimPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
        case CimPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
        case CimPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
        case CimPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
        case CimPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
        case CimPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
        case CimPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
        case CimPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
        case CimPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
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
