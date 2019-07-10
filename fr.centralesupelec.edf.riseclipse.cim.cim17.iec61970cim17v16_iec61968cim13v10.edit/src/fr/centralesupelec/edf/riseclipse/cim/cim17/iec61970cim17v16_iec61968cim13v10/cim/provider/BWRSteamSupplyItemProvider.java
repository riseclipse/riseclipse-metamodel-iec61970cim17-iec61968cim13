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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BWRSteamSupply;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BWRSteamSupply} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BWRSteamSupplyItemProvider extends SteamSupplyItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BWRSteamSupplyItemProvider( AdapterFactory adapterFactory ) {
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

            addHighPowerLimitPropertyDescriptor( object );
            addInCoreThermalTCPropertyDescriptor( object );
            addIntegralGainPropertyDescriptor( object );
            addLowerLimitPropertyDescriptor( object );
            addLowPowerLimitPropertyDescriptor( object );
            addPressureLimitPropertyDescriptor( object );
            addPressureSetpointGAPropertyDescriptor( object );
            addPressureSetpointTC1PropertyDescriptor( object );
            addPressureSetpointTC2PropertyDescriptor( object );
            addProportionalGainPropertyDescriptor( object );
            addRfAux1PropertyDescriptor( object );
            addRfAux2PropertyDescriptor( object );
            addRfAux3PropertyDescriptor( object );
            addRfAux4PropertyDescriptor( object );
            addRfAux5PropertyDescriptor( object );
            addRfAux6PropertyDescriptor( object );
            addRfAux7PropertyDescriptor( object );
            addRfAux8PropertyDescriptor( object );
            addRodPatternPropertyDescriptor( object );
            addRodPatternConstantPropertyDescriptor( object );
            addUpperLimitPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the High Power Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHighPowerLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_highPowerLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_highPowerLimit_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_HighPowerLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the In Core Thermal TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInCoreThermalTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_inCoreThermalTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_inCoreThermalTC_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_InCoreThermalTC(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Integral Gain feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntegralGainPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_integralGain_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_integralGain_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_IntegralGain(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Lower Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowerLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_lowerLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_lowerLimit_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_LowerLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Low Power Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowPowerLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_lowPowerLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_lowPowerLimit_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_LowPowerLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_pressureLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_pressureLimit_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_PressureLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Setpoint GA feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureSetpointGAPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_pressureSetpointGA_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_BWRSteamSupply_pressureSetpointGA_feature", "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_PressureSetpointGA(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Setpoint TC1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureSetpointTC1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_pressureSetpointTC1_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_BWRSteamSupply_pressureSetpointTC1_feature", "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_PressureSetpointTC1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pressure Setpoint TC2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureSetpointTC2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_pressureSetpointTC2_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_BWRSteamSupply_pressureSetpointTC2_feature", "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_PressureSetpointTC2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Proportional Gain feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProportionalGainPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_proportionalGain_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_proportionalGain_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_ProportionalGain(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rf Aux1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfAux1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rfAux1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rfAux1_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RfAux1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rf Aux2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfAux2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rfAux2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rfAux2_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RfAux2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rf Aux3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfAux3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rfAux3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rfAux3_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RfAux3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rf Aux4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfAux4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rfAux4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rfAux4_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RfAux4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rf Aux5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfAux5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rfAux5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rfAux5_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RfAux5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rf Aux6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfAux6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rfAux6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rfAux6_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RfAux6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rf Aux7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfAux7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rfAux7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rfAux7_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RfAux7(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rf Aux8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRfAux8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rfAux8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rfAux8_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RfAux8(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rod Pattern feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRodPatternPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rodPattern_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_rodPattern_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RodPattern(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rod Pattern Constant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRodPatternConstantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_rodPatternConstant_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_BWRSteamSupply_rodPatternConstant_feature", "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_RodPatternConstant(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Upper Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpperLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BWRSteamSupply_upperLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BWRSteamSupply_upperLimit_feature",
                                "_UI_BWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getBWRSteamSupply_UpperLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns BWRSteamSupply.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/BWRSteamSupply" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( BWRSteamSupply ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_BWRSteamSupply_type" )
                : getString( "_UI_BWRSteamSupply_type" ) + " " + label;
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

        switch( notification.getFeatureID( BWRSteamSupply.class ) ) {
        case CimPackage.BWR_STEAM_SUPPLY__HIGH_POWER_LIMIT:
        case CimPackage.BWR_STEAM_SUPPLY__IN_CORE_THERMAL_TC:
        case CimPackage.BWR_STEAM_SUPPLY__INTEGRAL_GAIN:
        case CimPackage.BWR_STEAM_SUPPLY__LOWER_LIMIT:
        case CimPackage.BWR_STEAM_SUPPLY__LOW_POWER_LIMIT:
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_LIMIT:
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_GA:
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC1:
        case CimPackage.BWR_STEAM_SUPPLY__PRESSURE_SETPOINT_TC2:
        case CimPackage.BWR_STEAM_SUPPLY__PROPORTIONAL_GAIN:
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX1:
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX2:
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX3:
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX4:
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX5:
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX6:
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX7:
        case CimPackage.BWR_STEAM_SUPPLY__RF_AUX8:
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN:
        case CimPackage.BWR_STEAM_SUPPLY__ROD_PATTERN_CONSTANT:
        case CimPackage.BWR_STEAM_SUPPLY__UPPER_LIMIT:
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
